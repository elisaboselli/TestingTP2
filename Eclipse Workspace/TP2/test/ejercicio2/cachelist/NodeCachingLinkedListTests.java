package ejercicio2.cachelist;

import static org.junit.Assert.*;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.lang.reflect.*;

import ejercicio2.cachelist.NodeCachingLinkedList;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.CoreMatchers.nullValue;


import static org.junit.Assume.*;

@RunWith(Theories.class)
public class NodeCachingLinkedListTests {
	//Se chequea q se agrega un elemento a la lista y el modCount(no hay elementos con el mismo valor en la lista)
	@Theory
	public void addElement(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Chequeo modCount con Reflexion
		Field f = list.getClass().getDeclaredField("modCount");
		f.setAccessible(true);
		int l = (int) f.get(list);
		list.add(new Integer(4));
		int l2 = (int) f.get(list);
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(4)), is(true)); // Assert
		assertThat("verificando que el elemento es contenido en la lista", l, is(l2-1)); // Assert

	}
	
	//Se chequea en Add Size y Cache Size ademas de que si el elemento se agrega correctamente (podria haber otro elemento con el mismo valor)
	@Theory
	public void addElementCheckCacheSize(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//Chequeo size con Reflexion
		Field f = list.getClass().getDeclaredField("size");
		f.setAccessible(true);
		int oldSize = (int) f.get(list);
		int oldCache = list.cacheSize;
		list.add(new Integer(3));
		int newSize = (int) f.get(list);
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(3)), is(true)); // Assert
		assertThat("verificando que se el size de la lista", newSize, is(oldSize+1)); // Assert
		assertThat("verificando que si se utilizo la cache en caso de ser posible", list.cacheSize, is(oldCache==0? oldCache : oldCache-1)); // Assert
	}
	
	//Se cheque remove con la lista cache full (es decir el elemento removido no se agrega a cache)
	@Theory
	public void removeElementCacheFull(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));
		list.maximumCacheSize = list.cacheSize;
		int oldCacheSize = list.cacheSize;
		list.remove(new Integer(4));
		assertThat("verificando que el elemento es removido de la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el la Cache esta llena", list.isCacheFull(), is(true));
		assertThat("verificando que el elemento es removido de la lista", list.cacheSize, is(oldCacheSize)); // Assert

	}
	
	//Se chequea remove con la lista cache con espacio
	@Theory
	public void removeElementCheckCacheSize (@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));
		list.maximumCacheSize = list.cacheSize + 1;
		int oldCacheSize = list.cacheSize;
		list.remove(new Integer(4));
		assertThat("verificando que el elemento es removido de la lisra", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento es removido de la lista", list.cacheSize, is(oldCacheSize+1)); // Assert
		assertThat("verificando que el elemento Eliminado quedo primero en la cache con valor null", list.firstCachedNode.value, is(nullValue())); // Assert
	}
	
	//se chequea remove con elemento no presente
	@Theory
	public void removeElementNotPresent(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		int oldCacheSize = list.cacheSize;
		boolean result = list.remove(new Integer(4));
		assertThat("verificando que el elemento no se encontro en la lista", result, is(false)); // Assert
		assertThat("verificando que el elemento es removido de la lista", list.cacheSize, is(oldCacheSize)); // Assert
	}
	
	//se chequea en el remove dismuniye el size de la listta
	@Theory
	public void removeElementCheckSize(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		Field size;
		int cacheOld=0,oldSize=0,newSize=0;
		try {
			size = list.getClass().getDeclaredField("size");
			size.setAccessible(true);
			Integer obj = new Integer(4);
			list.add(obj);
			oldSize = (int) size.get(list);
			cacheOld = list.cacheSize;
			list.remove(new Integer(4));
			newSize = (int) size.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es removido de la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento Eliminado fue agregado a la cache", list.cacheSize, is(cacheOld+1)); // Assert
		assertThat("verificando que el size es restado", newSize, is(oldSize-1)); // Assert
	}
	
	//se chequea en el remove aumente el modCount
	@Theory
	public void removeElementMC(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		Field mC;
		int cacheOld=0,oldMC=0,newMC = 0;
		try {
			mC = list.getClass().getDeclaredField("modCount");
			mC.setAccessible(true);
			Integer obj = new Integer(4);
			list.add(obj);
			oldMC = (int) mC.get(list);
			cacheOld = list.cacheSize;
			list.remove(new Integer(4));
			newMC= (int) mC.get(list);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat("verificando que el elemento es removido de la lista", list.contains(new Integer(4)), is(false)); // Assert
		assertThat("verificando que el elemento Eliminado fue agregado a la cache", list.cacheSize, is(cacheOld+1)); // Assert
		assertThat("verificando que modCount es modificado", newMC, is(oldMC+1)); // Assert
	}

}
