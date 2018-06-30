package ejercicio2;
import ejercicio2.cachelist.NodeCachingLinkedList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
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
	        	number = random.nextInt((maxRange - minRange) + 2) + minRange;
	        	ncll = (NodeCachingLinkedList) s;
	        	if (number<maxRange) {
	        		ncll.add(new Integer(number));
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