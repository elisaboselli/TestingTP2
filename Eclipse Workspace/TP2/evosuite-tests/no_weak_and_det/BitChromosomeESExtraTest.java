package no_weak_and_det;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;

import org.junit.Test;

import ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome;
import ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector;
import ejercicio1.es.unileon.rnag.cubiga.gen.Gen;

public class BitChromosomeESExtraTest {
	
	@Test
	public void test01(){
		int qty = 3;
		int fit = 5;
		
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome1 = new BitChromosome(qty,bitVector);
		chromosome1.setFitness(fit);
		BitChromosome chromosome2 = new BitChromosome(chromosome1);
		
		assertTrue(chromosome1.getFitness() == chromosome2.getFitness());
		assertTrue(chromosome1.length()==chromosome2.length());
		
		Iterator<Gen> it1 = chromosome1.iterator();
		Iterator<Gen> it2 = chromosome2.iterator();
		
		while(it1.hasNext()) {
			Gen gen1 = (Gen)it1.next();
			Gen gen2 = (Gen)it2.next();
			assertEquals(gen1.getValue(),gen2.getValue());
		}
	}

	@Test
	public void test02() {
		int qty = 3;
		//int seed = 7;
		int count = 0;
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome = new BitChromosome(qty,bitVector);
		//Random rand = new Random(seed);
		Iterator<Gen> it = chromosome.iterator();
		while(it.hasNext()) {
			//Gen gen = (Gen)it.next();
			//String val = rand.nextBoolean() ? "true" : "false";
			//assertEquals(gen.getValue(), val);
			it.next();
			count++;
		}
		assertEquals(qty, count);
	}
	
	@Test
	public void test03(){
		int qty = 3;
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome = new BitChromosome(qty,bitVector);
		try {
			chromosome.getChromosomeSlice(3, 4);
			fail();
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "Index to be retrieved for this chromosome is out of bounds");
		}
	}
	
	@Test
	public void test04(){
		int qty = 3;
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome = new BitChromosome(qty,bitVector);
		try {
			chromosome.setChromosomeSlice(chromosome.getChromosomeSlice(0, 2),5);
			fail();
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "The selected slice does not fit in the position of the chromosome");
		}
	}
	
	/*@Test
	public void test057(){
		int qty = 6;
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome = new BitChromosome(qty,bitVector);
		
		Iterator<Gen> it = chromosome.iterator();
		String chr = "[";
		while(it.hasNext()) {
			Gen gen = (Gen)it.next();
			chr += gen.getValue() + ", ";
		}
		chr += "]";
		Gen[] genArray = chromosome.getChromosomeSlice(0, qty);
	}*/
	
	@Test
	public void test05(){
		int qty = 6;
		int count = 0;
        BitVector bitVector = new BitVector(qty);
		BitChromosome chromosome = new BitChromosome(qty,bitVector);
		Gen[] genArray = chromosome.getChromosomeSlice(1, 5);
		Iterator<Gen> it = chromosome.iterator();
		it.next();
		while(it.hasNext()){
			Gen gen1 = it.next();
			Gen gen2 = genArray[count];
			count++;
			assertEquals(gen1.toString(), gen2.toString());
		}
	}
}