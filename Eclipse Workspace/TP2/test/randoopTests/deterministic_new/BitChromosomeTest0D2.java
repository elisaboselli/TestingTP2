package randoopTests.deterministic_new;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitChromosomeTest0D2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test001");
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
            System.out.format("%n%s%n", "BitChromosomeTest0.test002");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) -1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test003");
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
            System.out.format("%n%s%n", "BitChromosomeTest0.test004");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitChromosome3.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test005");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen(10);
        try {
            bitChromosome3.setGen(gen7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test006");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        java.lang.Class<?> wildcardClass4 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test007");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test008");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome7.getGen((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test009");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome3.getChromosomeSlice((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test010");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray12 = bitChromosome7.getChromosomeSlice(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test011");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            bitChromosome7.mutateGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test012");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test013");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray6 = bitChromosome3.getChromosomeSlice(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test014");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome6.getGeneticType();
        java.lang.Class<?> wildcardClass9 = geneticType8.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test015");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray6 = bitChromosome3.getChromosomeSlice((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test016");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        try {
            bitChromosome3.setChromosomeSlice(genArray13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test017");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen((int) '#');
        java.lang.Class<?> wildcardClass10 = gen9.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector12.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector12.generateGen(100);
        java.lang.Class<?> wildcardClass17 = gen16.getClass();
        java.lang.Class<?> wildcardClass18 = gen16.getClass();
        java.lang.Class<?> wildcardClass19 = gen16.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector21.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray24 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen9, gen16, gen23 };
        try {
            bitChromosome3.setChromosomeSlice(genArray24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(gen23);
        org.junit.Assert.assertNotNull(genArray24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test018");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 100);
        double double9 = chromosome6.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test019");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector8.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector20.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray23 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen14, gen18, gen22 };
        try {
            bitChromosome3.setChromosomeSlice(genArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(gen18);
        org.junit.Assert.assertNotNull(gen22);
        org.junit.Assert.assertNotNull(genArray23);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test020");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        try {
            bitChromosome3.mutateGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test021");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test022");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector2.generateGen((int) (byte) 0);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(gen8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test023");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector5 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector5.generateGen((int) '#');
        try {
            bitChromosome3.setGen(gen7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test024");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test025");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            bitChromosome3.mutateGen((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test026");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen((int) (byte) 100);
        try {
            bitChromosome9.setGen(gen15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(gen15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test027");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        try {
            bitChromosome3.mutateGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test028");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitVector17.generateChromosome();
        chromosome22.setFitness((double) 10L);
        int int25 = chromosome15.compareTo(chromosome22);
        int int26 = chromosome6.compareTo(chromosome22);
        double double27 = chromosome6.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(chromosome22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test029");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome10.getChromosomeSlice(10, 0);
        try {
            bitChromosome3.setChromosomeSlice(genArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(genArray14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test030");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        try {
            bitChromosome3.mutateGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test031");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        chromosome14.setFitness((double) 10L);
        int int17 = chromosome7.compareTo(chromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType18 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 10, geneticType18);
        int int20 = bitChromosome19.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(geneticType18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test032");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome9.getChromosomeSlice((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test033");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        chromosome3.setFitness((double) 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test034");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray12 = bitChromosome3.getChromosomeSlice((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test035");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector7.generateGen(100);
        java.lang.Class<?> wildcardClass12 = gen11.getClass();
        try {
            bitChromosome3.setGen(gen11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test036");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test037");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test038");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray13, (int) (short) 10);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome3.getGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test039");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        java.lang.Class<?> wildcardClass13 = gen12.getClass();
        try {
            bitChromosome3.setGen(gen12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test040");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test041");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test042");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test043");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome3.getChromosomeSlice((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test044");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        java.lang.Class<?> wildcardClass6 = gen5.getClass();
        java.lang.Class<?> wildcardClass7 = gen5.getClass();
        java.lang.Class<?> wildcardClass8 = gen5.getClass();
        java.lang.Class<?> wildcardClass9 = gen5.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test045");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test046");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType8);
        try {
            bitChromosome9.mutateGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test047");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test048");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector12.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector12.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitVector12.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray21 = bitChromosome18.getChromosomeSlice((int) '4', 10);
        try {
            bitChromosome3.setChromosomeSlice(genArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(chromosome17);
        org.junit.Assert.assertNotNull(genArray21);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test049");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        double double12 = bitChromosome8.getFitness();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray15 = bitChromosome8.getChromosomeSlice((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(genArray11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test050");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        bitChromosome8.setFitness((double) (short) 0);
        int int12 = bitChromosome8.length();
        int int13 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        double double14 = bitChromosome8.getFitness();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome8.getChromosomeSlice(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test051");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen(0);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test052");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) 1.0f);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test053");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome3.getGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test054");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) 1);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test055");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        try {
            bitChromosome7.mutateGen((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test056");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        int int8 = bitChromosome3.length();
        java.lang.Class<?> wildcardClass9 = bitChromosome3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test057");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test058");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = bitVector1.getClass();
        java.lang.Class<?> wildcardClass5 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test059");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test060");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector1.generateGen((int) (short) 100);
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(gen8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test061");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        java.lang.Class<?> wildcardClass12 = bitChromosome8.getClass();
        int int13 = bitChromosome8.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(genArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test062");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome9.getChromosomeSlice((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test063");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test064");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = chromosome4.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = chromosome4.getGeneticType();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
        org.junit.Assert.assertNotNull(geneticType6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test065");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        chromosome5.setFitness((double) 1L);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test066");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector10.generateGen((int) '4');
        try {
            bitChromosome3.setGen(gen13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test067");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test068");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector7.generateGen((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = gen11.getClass();
        try {
            bitChromosome3.setGen(gen11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test069");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test070");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector1.generateGen(1);
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(gen4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test071");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome10.iterator();
        int int12 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome10.copyChromosome();
        boolean boolean14 = bitChromosome3.equals(bitChromosome10);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome3.getChromosomeSlice(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test072");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome8.getFitness();
        java.lang.Class<?> wildcardClass10 = bitChromosome8.getClass();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome8.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector14.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitVector14.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType20 = chromosome19.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType20);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor22 = bitChromosome21.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray25 = bitChromosome21.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        try {
            bitChromosome8.setChromosomeSlice(genArray25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(gen18);
        org.junit.Assert.assertNotNull(chromosome19);
        org.junit.Assert.assertNotNull(geneticType20);
        org.junit.Assert.assertNotNull(genItor22);
        org.junit.Assert.assertNotNull(genArray25);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test073");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        bitChromosome3.setFitness((double) 1.0f);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test074");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test075");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        java.lang.Class<?> wildcardClass6 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test076");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test077");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass6 = chromosome5.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test078");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test079");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector14.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector14.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector14.generateGen((int) '#');
        try {
            bitChromosome12.setGen(gen19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(genArray11);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(gen19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test080");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome10.iterator();
        bitChromosome10.setFitness((double) (short) 0);
        int int14 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome10.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        try {
            bitChromosome3.setChromosomeSlice(genArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(geneticType6);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(genArray17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test081");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray13, (int) (short) 10);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome3.getGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test082");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) -1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test083");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test084");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        java.lang.Class<?> wildcardClass13 = gen12.getClass();
        java.lang.Class<?> wildcardClass14 = gen12.getClass();
        bitChromosome3.setGen(gen12, 0);
        try {
            bitChromosome3.mutateGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test085");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome4.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome4.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome4.getGeneticType();
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) -1, geneticType7);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(geneticType7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test086");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        java.lang.Class<?> wildcardClass4 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome5.getGen((int) '4');
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome5.iterator();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test087");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = gen3.getClass();
        java.lang.Class<?> wildcardClass5 = gen3.getClass();
        java.lang.Class<?> wildcardClass6 = gen3.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test088");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        int int9 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(chromosome10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test089");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, 10);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(genArray10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test090");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector1.generateGen((-1));
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(gen9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test091");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitVector17.generateChromosome();
        chromosome22.setFitness((double) 10L);
        int int25 = chromosome15.compareTo(chromosome22);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType26 = chromosome15.getGeneticType();
        int int27 = chromosome6.compareTo(chromosome15);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(chromosome22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(geneticType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test092");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome3.getChromosomeSlice((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test093");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '4');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test094");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome5.getChromosomeSlice((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test095");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitVector17.generateChromosome();
        chromosome22.setFitness((double) 10L);
        int int25 = chromosome15.compareTo(chromosome22);
        int int26 = chromosome6.compareTo(chromosome22);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType27 = chromosome22.getGeneticType();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(chromosome22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(geneticType27);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test096");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        java.lang.Class<?> wildcardClass3 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test097");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test098");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome9.copyChromosome();
        try {
            bitChromosome9.mutateGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genArray13);
        org.junit.Assert.assertNotNull(chromosome14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test099");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass9 = bitChromosome8.getClass();
        int int10 = bitChromosome8.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test100");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        bitChromosome3.setFitness((double) (short) 10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test101");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass3 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test102");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome11.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        try {
            bitChromosome3.setChromosomeSlice(genArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genArray14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test103");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector2.generateChromosome();
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test104");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        bitChromosome3.setFitness((double) (byte) 1);
        double double9 = bitChromosome3.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test105");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test106");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        try {
            bitChromosome3.mutateGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genArray10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test107");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome12.iterator();
        int int14 = bitChromosome12.length();
        boolean boolean15 = bitChromosome3.equals(bitChromosome12);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector18.generateGen(100);
        try {
            bitChromosome3.setGen(gen21, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(gen21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test108");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(geneticType9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test109");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test110");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector1.generateGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(gen4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test111");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray13, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType16 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
        org.junit.Assert.assertNotNull(geneticType16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test112");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test113");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test114");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        chromosome14.setFitness((double) 10L);
        int int17 = chromosome7.compareTo(chromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType18 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 10, geneticType18);
        try {
            bitChromosome19.mutateGen((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(geneticType18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test115");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector1.generateGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) 'a');
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test116");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector15);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome16.iterator();
        bitChromosome16.setFitness((double) (short) 0);
        int int20 = bitChromosome16.length();
        int int21 = bitChromosome11.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome16);
        double double22 = bitChromosome16.getFitness();
        boolean boolean23 = bitChromosome3.equals(bitChromosome16);
        try {
            bitChromosome3.mutateGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertNotNull(genItor17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test117");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome3.setChromosomeSlice(genArray7, (int) (short) 10);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genArray7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test118");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        bitChromosome14.setFitness((double) (short) 0);
        int int18 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray21 = bitChromosome14.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        try {
            bitChromosome3.setChromosomeSlice(genArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(genArray21);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test119");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome3.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(chromosome8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test120");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome3.getFitness();
        bitChromosome3.mutateGen((int) (byte) 1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test121");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        try {
            bitChromosome3.setGen(gen10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test122");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test123");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome15.iterator();
        bitChromosome15.setFitness((double) (short) 0);
        int int19 = bitChromosome15.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray22 = bitChromosome15.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome15);
        boolean boolean24 = bitChromosome3.equals(bitChromosome15);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genArray10);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(genArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test124");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        bitChromosome8.setFitness((double) (short) 0);
        int int12 = bitChromosome8.length();
        int int13 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome3.getChromosomeSlice((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test125");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        chromosome14.setFitness((double) 10L);
        int int17 = chromosome7.compareTo(chromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType18 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', geneticType18);
        java.lang.Class<?> wildcardClass20 = bitChromosome19.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray23 = bitChromosome19.getChromosomeSlice(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(geneticType18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(genArray23);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test126");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((-1));
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test127");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        double double9 = chromosome8.getFitness();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test128");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (short) -1, 0);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(genItor7);
        org.junit.Assert.assertNotNull(genArray10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test129");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(geneticType6);
        org.junit.Assert.assertNotNull(genItor7);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test130");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test131");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        bitChromosome4.mutateGen((int) (short) 0);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test132");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 0, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test133");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) (short) 1);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test134");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(genArray10);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(genItor12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test135");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = gen7.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test136");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome3.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genArray8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test137");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome11.copyChromosome();
        boolean boolean15 = bitChromosome3.equals(bitChromosome11);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test138");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (short) 0);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test139");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome15.getChromosomeSlice((int) '4', 10);
        try {
            bitChromosome3.setChromosomeSlice(genArray18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertNotNull(genArray18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test140");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        chromosome13.setFitness((double) 10L);
        int int16 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector19);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome20.iterator();
        bitChromosome20.setFitness((double) (short) 0);
        int int24 = bitChromosome20.length();
        int int25 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome20);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitChromosome20.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(genItor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test141");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome13);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome15.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        boolean boolean19 = bitChromosome3.equals(bitChromosome15);
        try {
            bitChromosome15.mutateGen((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor14);
        org.junit.Assert.assertNotNull(genArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test142");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test143");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(chromosome11);
        org.junit.Assert.assertNotNull(chromosome12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test144");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test145");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        chromosome13.setFitness((double) 10L);
        int int16 = chromosome6.compareTo(chromosome13);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector19);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome20.iterator();
        bitChromosome20.setFitness((double) (short) 0);
        int int24 = bitChromosome20.length();
        int int25 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome20);
        double double26 = bitChromosome20.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(genItor21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTest0.test146");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        try {
            bitChromosome3.mutateGen((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(chromosome6);
    }
}

