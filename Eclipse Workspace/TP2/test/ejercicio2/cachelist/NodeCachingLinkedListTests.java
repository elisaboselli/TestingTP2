package ejercicio2.cachelist;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import java.lang.reflect.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.CoreMatchers.nullValue;

@RunWith(Theories.class)
public class NodeCachingLinkedListTests {
	
	/* Se realiza un add de un elemento a la lista y se chequea que:
	* el add se realiza correctamente
	* la lista contiene el elemento agregado
	* modifica el modCount
	*/
	@Theory
	public void addElement(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Chequeo modCount con Reflexion
		boolean add = false;
		int oldMC = 0, newMC = 0;
		try {
			Field field = list.getClass().getDeclaredField("modCount");
			field.setAccessible(true);
			oldMC = (int) field.get(list);
			add = list.add(new Integer(4));
			newMC = (int) field.get(list);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			fail("Error usando reflexion: " + e); // Assert
			e.printStackTrace();
		} 
		assertThat("verificando que el elemento es agregado correctamente", add, is(true)); // Assert
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(4)), is(true)); // Assert
		assertThat("verificando que el modCount es modificado", newMC, is(oldMC+1)); // Assert

	}
	
	/* Se realiza un add de un elemento a la lista con el cache no vacio y se chequea que:
	* la lista  contiene el elemento agregado
	* el size de la lista aumenta
	* el size de cache disminuye
	*/
	@Theory
	public void addElementCheckCacheSize(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		//Chequeo size con Reflexion
		assumeTrue(list.cacheSize>0);
		Field field;
		int newSize = 0, oldSize=0, oldCache=0;
		try {
			field = list.getClass().getDeclaredField("size");
			field.setAccessible(true);
			oldSize = (int) field.get(list);
			oldCache = list.cacheSize;
			list.add(new Integer(3));
			newSize = (int) field.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			fail("Error usando reflexion: " + e); // Assert
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(3)), is(true)); // Assert
		assertThat("verificando que se el size de la lista aumenta", newSize, is(oldSize+1)); // Assert
		assertThat("verificando que se utlizo un nodo de la lista cache", list.cacheSize, is(oldCache-1)); // Assert
	}
	
	/* Se realiza un add de un elemento a la lista con el cache  vacio y se chequea que:
	* la lista  contiene el elemento agregado
	* el size de la lista aumenta
	* el size de cache se mantiene igual ya que estaba vacio
	*/	
	@Theory
	public void addElementCheckCacheSizeEmptyCache(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		assumeTrue(list.cacheSize==0);
		//Chequeo size con Reflexion
		Field field;
		int newSize = 0, oldSize=0, oldCache=0;
		try {
			field = list.getClass().getDeclaredField("size");
			field.setAccessible(true);
			oldSize = (int) field.get(list);
			oldCache = list.cacheSize;
			list.add(new Integer(3));
			newSize = (int) field.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			fail("Error usando reflexion: " + e); // Assert
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(3)), is(true)); // Assert
		assertThat("verificando que se disminuye el size de la lista", newSize, is(oldSize+1)); // Assert
		assertThat("verificando que la cache se mantiene igual", list.cacheSize, is(oldCache)); // Assert
	}
	
	/* Se realiza un remove de una elemento que pertence a la lista con la lista cache llena y se chequea que:
	* la lista no contiene el elemento eliminado
	* la Cache esta lleno
	* el size del cache sigue igual
	*/	
	@Theory
	public void removeElementCacheFull(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));
		list.maximumCacheSize = list.cacheSize;
		int oldCacheSize = list.cacheSize;
		list.remove(new Integer(4));
		assertThat("verificando que el elemento no es mas contenido en la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que la Cache esta llena", list.isCacheFull(), is(true));
		assertThat("verificando que la Cache se mantiene igual", list.cacheSize, is(oldCacheSize)); // Assert

	}
	
	/* Se realiza un remove de una elemento que pertence a la lista con la lista cache no llena y se chequea que:
	* la lista no contiene el elemento eliminado
	* el sizeCache aumenta
	* el primer elemento de la lista cache (elemento eliminado) es null
	*/
	@Theory
	public void removeElementCheckCacheSize (@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));
		list.maximumCacheSize = list.cacheSize + 1;
		int oldCacheSize = list.cacheSize;
		list.remove(new Integer(4));
		assertThat("verificando que el elemento no es mas contenido en la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento es agregado al cache", list.cacheSize, is(oldCacheSize+1)); // Assert
		assertThat("verificando que el elemento Eliminado quedo primero en la cache con valor null", list.firstCachedNode.value, is(nullValue())); // Assert
	}
	
	/* Se realiza un remove de una elemento que no pertence a la lista y se chequea que:
	* el remove no se realiza
	* la lista cache no es modificada
	*/
	@Theory
	public void removeElementNotPresent(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		int oldCacheSize = list.cacheSize;
		boolean result = list.remove(new Integer(4));
		assertThat("verificando que no se elimino ningun elemento", result, is(false)); // Assert
		assertThat("verificando que la lista cahce sigue igual", list.cacheSize, is(oldCacheSize)); // Assert
	}
	
	/* Se realiza un remove de una elemento que pertence a la lista y se chequea que:
	* el remove se realiza correctamente
	* la lista no contiene el elemento eliminado
	* el sizeCache aumenta
	* el size de la lista disminuye 
	*/
	@Theory
	public void removeElementCheckSize(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		Field size;
		int cacheOld=0,oldSize=0,newSize=0;
		boolean removeOK=false;
		try {
			size = list.getClass().getDeclaredField("size");
			size.setAccessible(true);
			Integer obj = new Integer(4);
			list.add(obj);
			oldSize = (int) size.get(list);
			cacheOld = list.cacheSize;
			removeOK = list.remove(new Integer(4));
			newSize = (int) size.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			fail("Error usando reflexion: " + e); // Assert
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es removido de la lista", removeOK, is(true)); // Assert
		assertThat("verificando que el elemento no es mas contenido en la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento Eliminado fue agregado a la cache", list.cacheSize, is(cacheOld+1)); // Assert
		assertThat("verificando que el size de la lista disminuye", newSize, is(oldSize-1)); // Assert
	}
	
	/* Se realiza un remove de una elemento que pertence a la lista y se chequea que:
	* el remove se realiza correctamente
	* la lista no contiene el elemento eliminado
	* el sizeCache aumenta
	* modifica el modCount
	*/
	@Theory
	public void removeElementMC(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		Field mC;
		int cacheOld=0,oldMC=0,newMC = 0;
		boolean removeOK=false;
		try {
			mC = list.getClass().getDeclaredField("modCount");
			mC.setAccessible(true);
			Integer obj = new Integer(4);
			list.add(obj);
			oldMC = (int) mC.get(list);
			cacheOld = list.cacheSize;
			removeOK = list.remove(new Integer(4));
			newMC= (int) mC.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			fail("Error usando reflexion: " + e); // Assert
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es removido de la lista", removeOK, is(true)); // Assert
		assertThat("verificando que el elemento no es mas contenido en la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento eliminado fue agregado a la cache", list.cacheSize, is(cacheOld+1)); // Assert
		assertThat("verificando que modCount es modificado", newMC, is(oldMC+1)); // Assert
	}

}
