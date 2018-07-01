package randoopTests.determinisitic_rand;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitChromosomeTestD0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test001");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test002");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = gen3.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test003");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) -1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test004");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test005");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test006");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitVector16.generateChromosome();
        int int18 = chromosome6.compareTo(chromosome17);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chromosome17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test007");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) -1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test008");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test009");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test010");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) 1);
        try {
            bitChromosome3.mutateGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gen8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test011");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitChromosome3.getGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test012");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        boolean boolean16 = chromosome13.equals((java.lang.Object) (-1));
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = chromosome13.getGeneticType();
        chromosome13.setFitness((double) (short) 10);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(geneticType17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test013");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int8 = bitChromosome3.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test014");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        bitChromosome3.setFitness((double) (short) -1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector27 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome28 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector27);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector34 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector34.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen38 = bitVector34.generateGen(100);
        java.lang.Class<?> wildcardClass39 = gen38.getClass();
        java.lang.Class<?> wildcardClass40 = gen38.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector42 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen44 = bitVector42.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen46 = bitVector42.generateGen(100);
        java.lang.Class<?> wildcardClass47 = gen46.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray56 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen32, gen38, gen46, gen53 };
        bitChromosome28.setChromosomeSlice(genArray56, (int) (byte) 1);
        try {
            bitChromosome3.setChromosomeSlice(genArray56, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gen32);
        org.junit.Assert.assertNotNull(gen36);
        org.junit.Assert.assertNotNull(gen38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(gen44);
        org.junit.Assert.assertNotNull(gen46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(genArray56);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test015");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test016");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            bitChromosome7.mutateGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test017");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        java.lang.Class<?> wildcardClass14 = gen13.getClass();
        java.lang.Class<?> wildcardClass15 = gen13.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        java.lang.Class<?> wildcardClass22 = gen21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        java.lang.Class<?> wildcardClass30 = gen28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen7, gen13, gen21, gen28 };
        bitChromosome3.setChromosomeSlice(genArray31, (int) (byte) 1);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen35 = bitChromosome3.getGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(genArray31);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test018");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome19.getChromosomeSlice((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test019");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test020");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        java.lang.Class<?> wildcardClass14 = gen13.getClass();
        java.lang.Class<?> wildcardClass15 = gen13.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        java.lang.Class<?> wildcardClass22 = gen21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        java.lang.Class<?> wildcardClass30 = gen28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen7, gen13, gen21, gen28 };
        bitChromosome3.setChromosomeSlice(genArray31, (int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome35 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass36 = chromosome35.getClass();
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(genArray31);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertNotNull(chromosome35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test021");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        boolean boolean8 = chromosome6.equals((java.lang.Object) (short) 100);
        chromosome6.setFitness((double) (short) 0);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test022");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '4');
        java.lang.Class<?> wildcardClass14 = bitVector11.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector11.generateGen((-1));
        try {
            bitChromosome3.setGen(gen16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(chromosome9);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(gen16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test023");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test024");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector28 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitVector28.generateGen((int) '4');
        java.lang.Class<?> wildcardClass31 = bitVector28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector28.generateGen((-1));
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector35 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen37 = bitVector35.generateGen((int) '#');
        java.lang.Class<?> wildcardClass38 = gen37.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray39 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen26, gen33, gen37 };
        try {
            bitChromosome3.setChromosomeSlice(genArray39, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(gen37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(genArray39);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test025");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(gen4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test026");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        try {
            bitChromosome3.setGen(gen10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test027");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test028");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        java.lang.Class<?> wildcardClass14 = gen13.getClass();
        java.lang.Class<?> wildcardClass15 = gen13.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        java.lang.Class<?> wildcardClass22 = gen21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        java.lang.Class<?> wildcardClass30 = gen28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen7, gen13, gen21, gen28 };
        bitChromosome3.setChromosomeSlice(genArray31, (int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome35 = bitChromosome3.copyChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen37 = bitChromosome3.getGen((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(genArray31);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertNotNull(chromosome35);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test029");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        int int23 = bitChromosome3.length();
        int int24 = bitChromosome3.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test030");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray12 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen11 };
        try {
            bitChromosome3.setChromosomeSlice(genArray12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(genArray12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test031");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome10.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome10.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome10.iterator();
        boolean boolean14 = bitChromosome3.equals((java.lang.Object) genItor13);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertNotNull(genItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test032");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        java.lang.Class<?> wildcardClass14 = gen13.getClass();
        try {
            bitChromosome3.setGen(gen13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test033");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray25 = bitChromosome3.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(genArray25);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test034");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        java.lang.Class<?> wildcardClass14 = gen13.getClass();
        java.lang.Class<?> wildcardClass15 = gen13.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        java.lang.Class<?> wildcardClass22 = gen21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        java.lang.Class<?> wildcardClass30 = gen28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen7, gen13, gen21, gen28 };
        bitChromosome3.setChromosomeSlice(genArray31, (int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector36 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome37 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector36);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector39 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen41 = bitVector39.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector43 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector43.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen47 = bitVector43.generateGen(100);
        java.lang.Class<?> wildcardClass48 = gen47.getClass();
        java.lang.Class<?> wildcardClass49 = gen47.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector51 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector51.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen55 = bitVector51.generateGen(100);
        java.lang.Class<?> wildcardClass56 = gen55.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector58 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen60 = bitVector58.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen62 = bitVector58.generateGen(100);
        java.lang.Class<?> wildcardClass63 = gen62.getClass();
        java.lang.Class<?> wildcardClass64 = gen62.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray65 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen41, gen47, gen55, gen62 };
        bitChromosome37.setChromosomeSlice(genArray65, (int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome68 = bitChromosome37.copyChromosome();
        boolean boolean69 = bitChromosome3.equals((java.lang.Object) chromosome68);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(genArray31);
        org.junit.Assert.assertNotNull(gen41);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(gen47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(gen55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(gen60);
        org.junit.Assert.assertNotNull(gen62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(genArray65);
        org.junit.Assert.assertNotNull(chromosome68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test035");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test036");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome9.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = bitChromosome9.getGeneticType();
        boolean boolean15 = bitChromosome3.equals((java.lang.Object) bitChromosome9);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome3.getGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertNotNull(geneticType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test037");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        java.lang.Class<?> wildcardClass13 = gen12.getClass();
        bitChromosome3.setGen(gen12, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome19.iterator();
        double double22 = bitChromosome19.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        bitChromosome19.setGen(gen28, 0);
        try {
            bitChromosome3.setGen(gen28, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(genItor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test038");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test039");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test040");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) 1);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test041");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        try {
            bitChromosome19.mutateGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test042");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector41.generateGen(100);
        java.lang.Class<?> wildcardClass46 = gen45.getClass();
        java.lang.Class<?> wildcardClass47 = gen45.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector58 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome59 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector58);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor60 = bitChromosome59.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor61 = bitChromosome59.iterator();
        double double62 = bitChromosome59.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector64 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen66 = bitVector64.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen68 = bitVector64.generateGen(100);
        java.lang.Class<?> wildcardClass69 = gen68.getClass();
        bitChromosome59.setGen(gen68, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector73 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen75 = bitVector73.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector77 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen79 = bitVector77.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray80 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen45, gen53, gen68, gen75, gen79 };
        bitChromosome19.setChromosomeSlice(genArray80, 0);
        double double83 = bitChromosome19.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(gen43);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(genItor60);
        org.junit.Assert.assertNotNull(genItor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(gen66);
        org.junit.Assert.assertNotNull(gen68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(gen75);
        org.junit.Assert.assertNotNull(gen79);
        org.junit.Assert.assertNotNull(genArray80);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test043");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome9.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = bitChromosome9.getGeneticType();
        boolean boolean15 = bitChromosome3.equals((java.lang.Object) bitChromosome9);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome3.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertNotNull(geneticType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test044");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome7.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test045");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        bitChromosome3.setFitness((double) 10);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test046");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test047");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector16.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome21 = bitVector16.generateChromosome();
        int int22 = chromosome14.compareTo(chromosome21);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType23 = chromosome21.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector26);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor28 = bitChromosome27.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector30.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome35 = bitVector30.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector37 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen39 = bitVector37.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen41 = bitVector37.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome42 = bitVector37.generateChromosome();
        int int43 = chromosome35.compareTo(chromosome42);
        boolean boolean45 = chromosome35.equals((java.lang.Object) (byte) 100);
        int int46 = bitChromosome27.compareTo(chromosome35);
        boolean boolean47 = chromosome21.equals((java.lang.Object) bitChromosome27);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector57 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen59 = bitVector57.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen61 = bitVector57.generateGen(100);
        java.lang.Class<?> wildcardClass62 = gen61.getClass();
        java.lang.Class<?> wildcardClass63 = gen61.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector66 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome67 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector66);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor68 = bitChromosome67.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor69 = bitChromosome67.iterator();
        double double70 = bitChromosome67.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector72 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen74 = bitVector72.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen76 = bitVector72.generateGen(100);
        java.lang.Class<?> wildcardClass77 = gen76.getClass();
        bitChromosome67.setGen(gen76, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector81 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen83 = bitVector81.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector85 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen87 = bitVector85.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray88 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen53, gen61, gen76, gen83, gen87 };
        bitChromosome27.setChromosomeSlice(genArray88, 0);
        bitChromosome3.setChromosomeSlice(genArray88, (int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector94 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen96 = bitVector94.generateGen(10);
        try {
            bitChromosome3.setGen(gen96, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertNotNull(gen18);
        org.junit.Assert.assertNotNull(gen20);
        org.junit.Assert.assertNotNull(chromosome21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(geneticType23);
        org.junit.Assert.assertNotNull(genItor28);
        org.junit.Assert.assertNotNull(gen32);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(chromosome35);
        org.junit.Assert.assertNotNull(gen39);
        org.junit.Assert.assertNotNull(gen41);
        org.junit.Assert.assertNotNull(chromosome42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(gen59);
        org.junit.Assert.assertNotNull(gen61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(genItor68);
        org.junit.Assert.assertNotNull(genItor69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(gen74);
        org.junit.Assert.assertNotNull(gen76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(gen83);
        org.junit.Assert.assertNotNull(gen87);
        org.junit.Assert.assertNotNull(genArray88);
        org.junit.Assert.assertNotNull(gen96);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test048");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        try {
            bitChromosome3.mutateGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(geneticType9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test049");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) (short) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(chromosome9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test050");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test051");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen42 = bitChromosome19.getGen((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test052");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        java.lang.Class<?> wildcardClass9 = bitChromosome7.getClass();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test053");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor43 = bitChromosome42.iterator();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(genItor43);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test054");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        int int7 = bitChromosome3.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test055");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass7 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test056");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector2.generateGen(0);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test057");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        int int8 = bitChromosome7.length();
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test058");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test059");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen(10);
        try {
            bitChromosome8.setGen(gen12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(gen12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test060");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        try {
            bitChromosome7.setGen(gen11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test061");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass3 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) (short) 0);
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test062");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector5.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitVector5.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector12.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector12.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitVector12.generateChromosome();
        int int18 = chromosome10.compareTo(chromosome17);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = chromosome17.getGeneticType();
        java.lang.Class<?> wildcardClass20 = chromosome17.getClass();
        int int21 = bitChromosome3.compareTo(chromosome17);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(chromosome10);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(chromosome17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test063");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        double double10 = chromosome9.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(chromosome9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test064");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome43 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome42);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitChromosome43.getGen((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test065");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test066");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test067");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        bitChromosome19.setFitness((double) (short) 0);
        java.lang.Class<?> wildcardClass45 = bitChromosome19.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test068");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor23 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(genItor23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test069");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome7.getGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test070");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        boolean boolean17 = chromosome15.equals((java.lang.Object) (short) 100);
        chromosome15.setFitness((double) (byte) 1);
        int int20 = bitChromosome3.compareTo(chromosome15);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome24 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector23);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor25 = bitChromosome24.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor26 = bitChromosome24.iterator();
        double double27 = bitChromosome24.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome28 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome24);
        int int29 = chromosome15.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome24);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(genItor25);
        org.junit.Assert.assertNotNull(genItor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test071");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector15.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector15.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome20 = bitVector15.generateChromosome();
        int int21 = chromosome13.compareTo(chromosome20);
        java.lang.Class<?> wildcardClass22 = chromosome20.getClass();
        boolean boolean23 = bitChromosome3.equals((java.lang.Object) chromosome20);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector26);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor28 = bitChromosome27.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector30.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome35 = bitVector30.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector37 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen39 = bitVector37.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen41 = bitVector37.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome42 = bitVector37.generateChromosome();
        int int43 = chromosome35.compareTo(chromosome42);
        boolean boolean45 = chromosome35.equals((java.lang.Object) (byte) 100);
        int int46 = bitChromosome27.compareTo(chromosome35);
        int int47 = chromosome20.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome27);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome48 = bitChromosome27.copyChromosome();
        double double49 = bitChromosome27.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(chromosome20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(genItor28);
        org.junit.Assert.assertNotNull(gen32);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(chromosome35);
        org.junit.Assert.assertNotNull(gen39);
        org.junit.Assert.assertNotNull(gen41);
        org.junit.Assert.assertNotNull(chromosome42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chromosome48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test072");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        bitChromosome19.setFitness((double) 10.0f);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test073");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        bitChromosome42.setFitness((double) (short) -1);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test074");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(geneticType7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test075");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector26.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitVector26.generateGen(100);
        java.lang.Class<?> wildcardClass31 = gen30.getClass();
        java.lang.Class<?> wildcardClass32 = gen30.getClass();
        try {
            bitChromosome3.setGen(gen30, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(geneticType24);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(gen30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test076");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        try {
            bitChromosome3.mutateGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test077");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray24 = bitChromosome8.getChromosomeSlice((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test078");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome43 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome42);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome44 = bitChromosome42.copyChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(chromosome44);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test079");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass7 = genItor6.getClass();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test080");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test081");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        bitChromosome19.setFitness((double) (short) 0);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen46 = bitChromosome19.getGen((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test082");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(chromosome9);
        org.junit.Assert.assertNotNull(geneticType10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test083");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        int int8 = bitChromosome3.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test084");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector25.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen29 = bitVector25.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome30 = bitVector25.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome37 = bitVector32.generateChromosome();
        int int38 = chromosome30.compareTo(chromosome37);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType39 = chromosome37.getGeneticType();
        int int40 = bitChromosome3.compareTo(chromosome37);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen42 = bitChromosome3.getGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(gen27);
        org.junit.Assert.assertNotNull(gen29);
        org.junit.Assert.assertNotNull(chromosome30);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(gen36);
        org.junit.Assert.assertNotNull(chromosome37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(geneticType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test085");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        bitChromosome3.setFitness((double) (short) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome25 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chromosome25);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test086");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        bitChromosome3.setFitness((double) (short) -1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitChromosome3.getGen(1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(gen26);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test087");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        java.lang.Class<?> wildcardClass5 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test088");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (short) -1);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test089");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome3.getGeneticType();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitChromosome3.getGen(32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(geneticType24);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test090");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        bitChromosome3.setFitness((double) 10L);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(geneticType9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test091");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector25.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen29 = bitVector25.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome30 = bitVector25.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome37 = bitVector32.generateChromosome();
        int int38 = chromosome30.compareTo(chromosome37);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType39 = chromosome37.getGeneticType();
        int int40 = bitChromosome3.compareTo(chromosome37);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType41 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(gen27);
        org.junit.Assert.assertNotNull(gen29);
        org.junit.Assert.assertNotNull(chromosome30);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(gen36);
        org.junit.Assert.assertNotNull(chromosome37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(geneticType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(geneticType41);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test092");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome12.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector16);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome17.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome17.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector22);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor24 = bitChromosome23.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor25 = bitChromosome23.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor26 = bitChromosome23.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome23);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType28 = bitChromosome23.getGeneticType();
        boolean boolean29 = bitChromosome17.equals((java.lang.Object) bitChromosome23);
        int int30 = bitChromosome12.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome17);
        bitChromosome12.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType33 = bitChromosome12.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray36 = bitChromosome12.getChromosomeSlice((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = genArray36.getClass();
        bitChromosome3.setChromosomeSlice(genArray36, (int) (short) -1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertNotNull(genItor18);
        org.junit.Assert.assertNotNull(genItor19);
        org.junit.Assert.assertNotNull(genItor24);
        org.junit.Assert.assertNotNull(genItor25);
        org.junit.Assert.assertNotNull(genItor26);
        org.junit.Assert.assertNotNull(geneticType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(geneticType33);
        org.junit.Assert.assertNotNull(genArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test093");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        double double23 = bitChromosome3.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test094");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        java.lang.Class<?> wildcardClass15 = chromosome13.getClass();
        double double16 = chromosome13.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test095");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome11.iterator();
        int int14 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitChromosome11.getGen((int) (byte) 1);
        bitChromosome3.setGen(gen16, (int) (short) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertNotNull(genItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(gen16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test096");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome3.getGeneticType();
        java.lang.Class<?> wildcardClass25 = bitChromosome3.getClass();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(geneticType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test097");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector6.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector6.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        int int19 = chromosome11.compareTo(chromosome18);
        boolean boolean21 = chromosome11.equals((java.lang.Object) (byte) 100);
        int int22 = bitChromosome3.compareTo(chromosome11);
        int int23 = bitChromosome3.length();
        java.lang.Class<?> wildcardClass24 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(chromosome18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test098");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector41.generateGen(100);
        java.lang.Class<?> wildcardClass46 = gen45.getClass();
        java.lang.Class<?> wildcardClass47 = gen45.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector58 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome59 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector58);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor60 = bitChromosome59.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor61 = bitChromosome59.iterator();
        double double62 = bitChromosome59.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector64 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen66 = bitVector64.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen68 = bitVector64.generateGen(100);
        java.lang.Class<?> wildcardClass69 = gen68.getClass();
        bitChromosome59.setGen(gen68, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector73 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen75 = bitVector73.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector77 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen79 = bitVector77.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray80 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen45, gen53, gen68, gen75, gen79 };
        bitChromosome19.setChromosomeSlice(genArray80, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor83 = bitChromosome19.iterator();
        java.lang.Class<?> wildcardClass84 = bitChromosome19.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(gen43);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(genItor60);
        org.junit.Assert.assertNotNull(genItor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(gen66);
        org.junit.Assert.assertNotNull(gen68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(gen75);
        org.junit.Assert.assertNotNull(gen79);
        org.junit.Assert.assertNotNull(genArray80);
        org.junit.Assert.assertNotNull(genItor83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test099");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitChromosome22.getGen(32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test100");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector25.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen29 = bitVector25.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome30 = bitVector25.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome37 = bitVector32.generateChromosome();
        int int38 = chromosome30.compareTo(chromosome37);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType39 = chromosome37.getGeneticType();
        int int40 = bitChromosome3.compareTo(chromosome37);
        double double41 = bitChromosome3.getFitness();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(gen27);
        org.junit.Assert.assertNotNull(gen29);
        org.junit.Assert.assertNotNull(chromosome30);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(gen36);
        org.junit.Assert.assertNotNull(chromosome37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(geneticType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test101");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        double double42 = bitChromosome19.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test102");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test103");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test104");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        chromosome6.setFitness(1.0d);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test105");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test106");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        int int10 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector24);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor26 = bitChromosome25.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor27 = bitChromosome25.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor28 = bitChromosome25.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome29 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome25);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType30 = bitChromosome25.getGeneticType();
        boolean boolean31 = bitChromosome19.equals((java.lang.Object) bitChromosome25);
        int int32 = bitChromosome14.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome19);
        bitChromosome14.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType35 = bitChromosome14.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray38 = bitChromosome14.getChromosomeSlice((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass39 = genArray38.getClass();
        bitChromosome3.setChromosomeSlice(genArray38, 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(chromosome9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(genItor21);
        org.junit.Assert.assertNotNull(genItor26);
        org.junit.Assert.assertNotNull(genItor27);
        org.junit.Assert.assertNotNull(genItor28);
        org.junit.Assert.assertNotNull(geneticType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(geneticType35);
        org.junit.Assert.assertNotNull(genArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test107");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome43 = bitChromosome42.copyChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(chromosome43);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test108");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        java.lang.Class<?> wildcardClass40 = chromosome13.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test109");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test110");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test111");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector1.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(chromosome9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test112");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '4');
        java.lang.Class<?> wildcardClass9 = bitVector6.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector6.generateGen((-1));
        try {
            bitChromosome3.setGen(gen11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test113");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector2.generateGen((int) (short) 1);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test114");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        bitChromosome7.setFitness((double) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome7.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector12.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector12.generateGen((int) (short) -1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector12.generateGen((int) (short) 0);
        try {
            bitChromosome7.setGen(gen17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome10);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test115");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        boolean boolean17 = chromosome15.equals((java.lang.Object) (short) 100);
        chromosome15.setFitness((double) (byte) 1);
        int int20 = bitChromosome3.compareTo(chromosome15);
        double double21 = chromosome15.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test116");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test117");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 10);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test118");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) (byte) 0);
        bitChromosome3.setGen(gen10, (int) (short) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(gen10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test119");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome3.getGeneticType();
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(geneticType24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test120");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double8 = bitChromosome7.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test121");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = chromosome4.getGeneticType();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test122");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome7.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test123");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector2.generateGen((int) (short) -1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector2.generateGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '#', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test124");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test125");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        double double10 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome3.getGen((int) (byte) 1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gen12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test126");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test127");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        int int10 = bitChromosome3.length();
        try {
            bitChromosome3.mutateGen((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(geneticType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test128");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome14.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = bitChromosome14.getGeneticType();
        boolean boolean20 = bitChromosome8.equals((java.lang.Object) bitChromosome14);
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome3.mutateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray27 = bitChromosome3.getChromosomeSlice((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertNotNull(geneticType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(geneticType24);
        org.junit.Assert.assertNotNull(genArray27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test129");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 100);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test130");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome9.getGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test131");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray12 = bitChromosome3.getChromosomeSlice((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genArray12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test132");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome43 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome42);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome44 = bitChromosome43.copyChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(chromosome44);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test133");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome4.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome4.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome4.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome4);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome4.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, geneticType9);
        boolean boolean12 = bitChromosome10.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor7);
        org.junit.Assert.assertNotNull(geneticType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test134");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector41.generateGen(100);
        java.lang.Class<?> wildcardClass46 = gen45.getClass();
        java.lang.Class<?> wildcardClass47 = gen45.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector58 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome59 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector58);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor60 = bitChromosome59.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor61 = bitChromosome59.iterator();
        double double62 = bitChromosome59.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector64 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen66 = bitVector64.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen68 = bitVector64.generateGen(100);
        java.lang.Class<?> wildcardClass69 = gen68.getClass();
        bitChromosome59.setGen(gen68, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector73 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen75 = bitVector73.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector77 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen79 = bitVector77.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray80 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen45, gen53, gen68, gen75, gen79 };
        bitChromosome19.setChromosomeSlice(genArray80, 0);
        bitChromosome19.setFitness((double) (-1.0f));
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray87 = bitChromosome19.getChromosomeSlice((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(gen43);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(genItor60);
        org.junit.Assert.assertNotNull(genItor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(gen66);
        org.junit.Assert.assertNotNull(gen68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(gen75);
        org.junit.Assert.assertNotNull(gen79);
        org.junit.Assert.assertNotNull(genArray80);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test135");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitChromosome10.copyChromosome();
        boolean boolean12 = bitChromosome3.equals((java.lang.Object) chromosome11);
        bitChromosome3.setFitness((double) 0.0f);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test136");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test137");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        int int41 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        bitChromosome19.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome45 = bitChromosome19.copyChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(chromosome45);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test138");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) 'a');
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test139");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) (byte) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test140");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) '#');
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test141");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        int int40 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector42 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen44 = bitVector42.generateGen(10);
        bitChromosome19.setGen(gen44, (int) (byte) 1);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(gen44);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test142");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector16.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome21 = bitVector16.generateChromosome();
        int int22 = chromosome14.compareTo(chromosome21);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType23 = chromosome21.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector26);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor28 = bitChromosome27.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector30.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome35 = bitVector30.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector37 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen39 = bitVector37.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen41 = bitVector37.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome42 = bitVector37.generateChromosome();
        int int43 = chromosome35.compareTo(chromosome42);
        boolean boolean45 = chromosome35.equals((java.lang.Object) (byte) 100);
        int int46 = bitChromosome27.compareTo(chromosome35);
        boolean boolean47 = chromosome21.equals((java.lang.Object) bitChromosome27);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector57 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen59 = bitVector57.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen61 = bitVector57.generateGen(100);
        java.lang.Class<?> wildcardClass62 = gen61.getClass();
        java.lang.Class<?> wildcardClass63 = gen61.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector66 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome67 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector66);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor68 = bitChromosome67.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor69 = bitChromosome67.iterator();
        double double70 = bitChromosome67.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector72 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen74 = bitVector72.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen76 = bitVector72.generateGen(100);
        java.lang.Class<?> wildcardClass77 = gen76.getClass();
        bitChromosome67.setGen(gen76, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector81 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen83 = bitVector81.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector85 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen87 = bitVector85.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray88 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen53, gen61, gen76, gen83, gen87 };
        bitChromosome27.setChromosomeSlice(genArray88, 0);
        bitChromosome3.setChromosomeSlice(genArray88, (int) (byte) 1);
        bitChromosome3.mutateGen((int) (short) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertNotNull(gen18);
        org.junit.Assert.assertNotNull(gen20);
        org.junit.Assert.assertNotNull(chromosome21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(geneticType23);
        org.junit.Assert.assertNotNull(genItor28);
        org.junit.Assert.assertNotNull(gen32);
        org.junit.Assert.assertNotNull(gen34);
        org.junit.Assert.assertNotNull(chromosome35);
        org.junit.Assert.assertNotNull(gen39);
        org.junit.Assert.assertNotNull(gen41);
        org.junit.Assert.assertNotNull(chromosome42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(gen59);
        org.junit.Assert.assertNotNull(gen61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(genItor68);
        org.junit.Assert.assertNotNull(genItor69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(gen74);
        org.junit.Assert.assertNotNull(gen76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(gen83);
        org.junit.Assert.assertNotNull(gen87);
        org.junit.Assert.assertNotNull(genArray88);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test143");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        int int14 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        int int35 = chromosome27.compareTo(chromosome34);
        boolean boolean37 = chromosome27.equals((java.lang.Object) (byte) 100);
        int int38 = bitChromosome19.compareTo(chromosome27);
        boolean boolean39 = chromosome13.equals((java.lang.Object) bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector41.generateGen(100);
        java.lang.Class<?> wildcardClass46 = gen45.getClass();
        java.lang.Class<?> wildcardClass47 = gen45.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector49 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen51 = bitVector49.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen53 = bitVector49.generateGen(100);
        java.lang.Class<?> wildcardClass54 = gen53.getClass();
        java.lang.Class<?> wildcardClass55 = gen53.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector58 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome59 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector58);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor60 = bitChromosome59.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor61 = bitChromosome59.iterator();
        double double62 = bitChromosome59.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector64 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen66 = bitVector64.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen68 = bitVector64.generateGen(100);
        java.lang.Class<?> wildcardClass69 = gen68.getClass();
        bitChromosome59.setGen(gen68, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector73 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen75 = bitVector73.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector77 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen79 = bitVector77.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray80 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen45, gen53, gen68, gen75, gen79 };
        bitChromosome19.setChromosomeSlice(genArray80, 0);
        bitChromosome19.setFitness((double) (-1.0f));
        bitChromosome19.setFitness((double) (byte) -1);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(geneticType15);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(chromosome27);
        org.junit.Assert.assertNotNull(gen31);
        org.junit.Assert.assertNotNull(gen33);
        org.junit.Assert.assertNotNull(chromosome34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(gen43);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(gen51);
        org.junit.Assert.assertNotNull(gen53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(genItor60);
        org.junit.Assert.assertNotNull(genItor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(gen66);
        org.junit.Assert.assertNotNull(gen68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(gen75);
        org.junit.Assert.assertNotNull(gen79);
        org.junit.Assert.assertNotNull(genArray80);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test144");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        boolean boolean16 = chromosome14.equals((java.lang.Object) (short) 100);
        chromosome14.setFitness((double) (byte) 1);
        boolean boolean19 = bitChromosome7.equals((java.lang.Object) chromosome14);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test145");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestD0.test146");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        int int9 = bitChromosome8.length();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }
}

