package ejercicio2;

import static org.junit.Assert.*;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import ejercicio2.cachelist.NodeCachingLinkedList;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assume.*;

@RunWith(Theories.class)
public class NodeCachingLinkedListTests {

	@Theory
	public void addElement(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));
		assertThat("verificando que el elemento es contenido en la lista", list.contains(new Integer(4)), is(true)); // Assert
	}

	@Theory
	public void removeElement(@NCLLGenerator(min=0,max=3) NodeCachingLinkedList list) {
		list.add(new Integer(4));

		list.remove(new Integer(4));
		assertThat("verificando que el elemento es removido de la lisra", list.contains(new Integer(4)), is(false)); // Assert
	}
}
