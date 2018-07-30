package ejercicio2.cachelist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.experimental.theories.PotentialAssignment;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;

import java.io.IOException;



public class NCLLSupplier extends ParameterSupplier {
	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		NCLLGenerator annotation= sig.getAnnotation(NCLLGenerator.class);
		Random random = new Random();
		int minRange = annotation.min();
		int maxRange = annotation.max();
		int number;
		NodeCachingLinkedList ncll;
	    try {
			List<PotentialAssignment> values = new ArrayList<PotentialAssignment>();
	        Collection<Object> nclls = Deserializer.deserialize("./korat/ej2.txt");
	        int i=0;
	        for (Object s : nclls) {
	        	i++;
	        	ncll = (NodeCachingLinkedList) s;
	    		LinkedListNode firstNode = ncll.getNode(0, true);
	    		//LinkedListNode node;
	    		for (LinkedListNode node = firstNode; node.next != firstNode; node = node.next) {	
		        	number = random.nextInt((maxRange - minRange) + 1) + minRange;
		        	node.setValue(new Integer(number));

	    		}
	        	values.add(PotentialAssignment.forValue(("lista "+i),ncll));
	        }
			return values;

	      } catch (IOException e) {
	        e.printStackTrace();
	        return null;
	      }
	}
	

}