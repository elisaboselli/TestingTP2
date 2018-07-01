package randoopTests.nodeterministic_new;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitChromosomeTestND20 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test001");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test002");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test003");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = gen3.getClass();
        java.lang.Class<?> wildcardClass5 = gen3.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test005");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitChromosome3.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test007");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        java.lang.Class<?> wildcardClass4 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test008");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test009");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test010");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test011");
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
            System.out.format("%n%s%n", "BitChromosomeTestND20.test012");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test013");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(chromosome2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test014");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '4');
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test015");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray6 = bitChromosome3.getChromosomeSlice(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test017");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray6 = bitChromosome3.getChromosomeSlice((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test021");
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
        chromosome22.setFitness((double) (short) -1);
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
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test031");
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test034");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        java.lang.Class<?> wildcardClass4 = bitVector1.getClass();
        java.lang.Class<?> wildcardClass5 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test035");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        java.lang.Class<?> wildcardClass3 = bitVector1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test037");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        chromosome3.setFitness((double) 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test039");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test040");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(0);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test042");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass9 = bitChromosome8.getClass();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test045");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector21.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitVector21.generateGen(100);
        java.lang.Class<?> wildcardClass26 = gen25.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray27 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen15, gen19, gen25 };
        try {
            bitChromosome9.setChromosomeSlice(genArray27, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen23);
        org.junit.Assert.assertNotNull(gen25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genArray27);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test046");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector7.generateGen(100);
        try {
            bitChromosome3.setGen(gen11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test047");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test048");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = chromosome4.getGeneticType();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test049");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test050");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome3.getChromosomeSlice((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test051");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass11 = bitVector10.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitVector10.generateChromosome();
        int int13 = bitChromosome3.compareTo(chromosome12);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(chromosome12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test052");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        double double3 = chromosome2.getFitness();
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test053");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome8.getGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test054");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (short) 0);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test055");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test056");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        try {
            bitChromosome3.mutateGen((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test057");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        double double5 = chromosome4.getFitness();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test058");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        double double10 = bitChromosome9.getFitness();
        try {
            bitChromosome9.mutateGen((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test059");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome6.getChromosomeSlice((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test060");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 10L);
        chromosome6.setFitness((double) 1);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test061");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass8 = bitChromosome7.getClass();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test062");
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
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitChromosome8.getGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test063");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test064");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray19 = bitChromosome16.getChromosomeSlice((int) '4', 10);
        try {
            bitChromosome7.setChromosomeSlice(genArray19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(chromosome15);
        org.junit.Assert.assertNotNull(genArray19);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test065");
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
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray23 = bitChromosome19.getChromosomeSlice((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test066");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        bitChromosome3.setFitness((double) 10.0f);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome11.copyChromosome();
        int int15 = bitChromosome3.compareTo(chromosome14);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome3.getChromosomeSlice((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test067");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = chromosome4.getGeneticType();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test068");
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
        java.lang.Class<?> wildcardClass27 = chromosome22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test069");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        java.lang.Class<?> wildcardClass4 = gen3.getClass();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test070");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome3.getChromosomeSlice((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test071");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test072");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        java.lang.Class<?> wildcardClass7 = bitChromosome3.getClass();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test073");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = chromosome5.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(geneticType6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test074");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        int int9 = bitChromosome8.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray12 = bitChromosome8.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        java.lang.Class<?> wildcardClass27 = gen26.getClass();
        java.lang.Class<?> wildcardClass28 = gen26.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray29 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen16, gen20, gen26 };
        bitChromosome8.setChromosomeSlice(genArray29, 1);
        try {
            bitChromosome3.setChromosomeSlice(genArray29, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(genArray12);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(gen20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(genArray29);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test075");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome24 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector23);
        int int25 = bitChromosome24.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray28 = bitChromosome24.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector34 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector34.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector38 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen40 = bitVector38.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen42 = bitVector38.generateGen(100);
        java.lang.Class<?> wildcardClass43 = gen42.getClass();
        java.lang.Class<?> wildcardClass44 = gen42.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray45 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen32, gen36, gen42 };
        bitChromosome24.setChromosomeSlice(genArray45, 1);
        try {
            bitChromosome19.setChromosomeSlice(genArray45, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(geneticType18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(genArray28);
        org.junit.Assert.assertNotNull(gen32);
        org.junit.Assert.assertNotNull(gen36);
        org.junit.Assert.assertNotNull(gen40);
        org.junit.Assert.assertNotNull(gen42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(genArray45);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test076");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(geneticType6);
        org.junit.Assert.assertNotNull(genItor7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test077");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome3.getChromosomeSlice((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test078");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test079");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector2.generateChromosome();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test080");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 100);
        double double9 = chromosome6.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector11.generateChromosome();
        int int15 = chromosome6.compareTo(chromosome14);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test081");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test082");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome8.setFitness((double) (byte) -1);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test083");
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
        double double17 = chromosome13.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test084");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        chromosome4.setFitness((double) 1L);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test085");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        double double11 = bitChromosome9.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome9.getGen((int) (short) 1);
        try {
            bitChromosome3.setGen(gen13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test086");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        double double13 = bitChromosome11.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitChromosome11.getGen((int) (short) 1);
        bitChromosome7.setGen(gen15, (int) ' ');
        int int18 = bitChromosome7.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test087");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        double double16 = bitChromosome14.getFitness();
        boolean boolean17 = bitChromosome9.equals(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector19.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitVector19.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector19.generateGen(0);
        try {
            bitChromosome14.setGen(gen24, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(genItor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(chromosome22);
        org.junit.Assert.assertNotNull(gen24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test088");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test089");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        int int8 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        java.lang.Class<?> wildcardClass15 = gen14.getClass();
        java.lang.Class<?> wildcardClass16 = gen14.getClass();
        java.lang.Class<?> wildcardClass17 = gen14.getClass();
        bitChromosome3.setGen(gen14, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(gen14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test090");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double6 = bitChromosome5.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test091");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome5.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(geneticType6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test092");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        bitChromosome3.setFitness((double) 10.0f);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome11.copyChromosome();
        int int15 = bitChromosome3.compareTo(chromosome14);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        bitChromosome19.setFitness((double) (short) 0);
        int int23 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray26 = bitChromosome19.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        try {
            bitChromosome3.setChromosomeSlice(genArray26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(genArray26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test093");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test094");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test095");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome6.getGeneticType();
        chromosome6.setFitness((double) 10.0f);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test096");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
        org.junit.Assert.assertNotNull(geneticType6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test097");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome9.getGen((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(genItor10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test098");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        try {
            bitChromosome3.mutateGen((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test099");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test100");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(genItor10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test101");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) 100);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test102");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome8.getGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(genArray11);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test103");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        bitChromosome9.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome9.getGen(0);
        try {
            bitChromosome5.setGen(gen14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertNotNull(gen14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test104");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        int int14 = bitChromosome9.length();
        boolean boolean15 = bitChromosome5.equals(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        double double21 = bitChromosome19.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitChromosome19.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome19.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector26.generateGen((int) '4');
        bitChromosome19.setGen(gen28, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector33 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome34 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector33);
        int int35 = bitChromosome34.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray38 = bitChromosome34.getChromosomeSlice(10, 0);
        int int39 = bitChromosome34.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitVector41.generateGen(100);
        java.lang.Class<?> wildcardClass46 = gen45.getClass();
        java.lang.Class<?> wildcardClass47 = gen45.getClass();
        java.lang.Class<?> wildcardClass48 = gen45.getClass();
        bitChromosome34.setGen(gen45, 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray51 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen28, gen45 };
        try {
            bitChromosome5.setChromosomeSlice(genArray51, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(genItor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(gen23);
        org.junit.Assert.assertNotNull(geneticType24);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(genArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(gen43);
        org.junit.Assert.assertNotNull(gen45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(genArray51);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test105");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        java.lang.Class<?> wildcardClass6 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test106");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        java.lang.Class<?> wildcardClass8 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        int int13 = bitChromosome12.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome12.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector26.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitVector26.generateGen(100);
        java.lang.Class<?> wildcardClass31 = gen30.getClass();
        java.lang.Class<?> wildcardClass32 = gen30.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray33 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen20, gen24, gen30 };
        bitChromosome12.setChromosomeSlice(genArray33, 1);
        try {
            bitChromosome3.setChromosomeSlice(genArray33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(genArray16);
        org.junit.Assert.assertNotNull(gen20);
        org.junit.Assert.assertNotNull(gen24);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(gen30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(genArray33);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test107");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(genItor6);
        org.junit.Assert.assertNotNull(genItor7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test108");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test109");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        try {
            bitChromosome3.mutateGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test110");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        try {
            ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) -1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test111");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test112");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome7.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test113");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test114");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitVector7.generateChromosome();
        int int11 = bitChromosome3.compareTo(chromosome10);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(chromosome10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test115");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        int int14 = bitChromosome13.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome13.getChromosomeSlice(10, 0);
        try {
            bitChromosome9.setChromosomeSlice(genArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(genArray17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test116");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int7 = bitChromosome6.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test117");
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
        int int21 = bitChromosome19.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
        org.junit.Assert.assertNotNull(chromosome14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(geneticType18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test118");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test119");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test120");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test121");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome14.getChromosomeSlice((int) '4', 10);
        try {
            bitChromosome5.setChromosomeSlice(genArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertNotNull(genArray17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test122");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test123");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test124");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        int int9 = bitChromosome3.length();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test125");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen((int) (short) 0);
        try {
            bitChromosome3.setGen(gen12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test126");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        double double10 = bitChromosome9.getFitness();
        int int11 = bitChromosome9.length();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test127");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(chromosome2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test128");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        bitChromosome3.setFitness((double) 10.0f);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome3.getGen((int) (byte) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test129");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            bitChromosome3.mutateGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test130");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        bitChromosome11.setFitness((double) (short) 0);
        int int15 = bitChromosome11.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome11.iterator();
        int int17 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray20 = bitChromosome3.getChromosomeSlice((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(genItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test131");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = chromosome13.getGeneticType();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(gen10);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(chromosome13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(geneticType17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test132");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) '4');
        bitChromosome4.setGen(gen8, (int) (short) 1);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(gen8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test133");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.mutateGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(geneticType8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test134");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        double double9 = chromosome8.getFitness();
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test135");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test136");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        chromosome4.setFitness((double) (byte) 1);
        double double7 = chromosome4.getFitness();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test137");
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
            bitChromosome19.mutateGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test138");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen(1);
        try {
            bitChromosome7.setGen(gen11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test139");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test140");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test141");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen(100);
        java.lang.Class<?> wildcardClass22 = gen21.getClass();
        java.lang.Class<?> wildcardClass23 = gen21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray24 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen11, gen15, gen21 };
        bitChromosome3.setChromosomeSlice(genArray24, 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome28 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen15);
        org.junit.Assert.assertNotNull(gen19);
        org.junit.Assert.assertNotNull(gen21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genArray24);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test142");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen(1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test143");
        try {
            ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The length of the BitVector data type must be greater than 0");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test144");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test145");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome7.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome7.iterator();
        boolean boolean11 = bitChromosome3.equals(bitChromosome7);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test146");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        bitChromosome3.setFitness(1.0d);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertNotNull(genItor6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test147");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        chromosome6.setFitness((double) 100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome12.iterator();
        bitChromosome12.setFitness((double) (short) 0);
        int int16 = bitChromosome12.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome12);
        double double18 = bitChromosome17.getFitness();
        int int19 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome17);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(genItor13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test148");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) (byte) 100);
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test149");
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
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitChromosome8.getGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test150");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome6.getGeneticType();
        double double9 = chromosome6.getFitness();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(gen5);
        org.junit.Assert.assertNotNull(chromosome6);
        org.junit.Assert.assertNotNull(geneticType7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test151");
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
            bitChromosome3.mutateGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(genArray13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test152");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass8 = bitChromosome7.getClass();
        org.junit.Assert.assertNotNull(gen4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test153");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome10.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector20.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen(100);
        java.lang.Class<?> wildcardClass29 = gen28.getClass();
        java.lang.Class<?> wildcardClass30 = gen28.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen18, gen22, gen28 };
        bitChromosome10.setChromosomeSlice(genArray31, 1);
        try {
            bitChromosome3.setChromosomeSlice(genArray31, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(geneticType5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(genArray14);
        org.junit.Assert.assertNotNull(gen18);
        org.junit.Assert.assertNotNull(gen22);
        org.junit.Assert.assertNotNull(gen26);
        org.junit.Assert.assertNotNull(gen28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(genArray31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test154");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        org.junit.Assert.assertNotNull(gen3);
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(gen6);
        org.junit.Assert.assertNotNull(chromosome7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test155");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome3.getGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(chromosome4);
        org.junit.Assert.assertNotNull(genItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(genItor7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test156");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome5.getGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(gen4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test157");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome13);
        int int16 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        try {
            bitChromosome13.mutateGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(genItor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test158");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome3.iterator();
        double double10 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test159");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) 10);
        org.junit.Assert.assertNotNull(gen3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test160");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        try {
            ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome6.getChromosomeSlice((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test161");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        double double5 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '4');
        bitChromosome3.setGen(gen12, 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome3.getChromosomeSlice(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(gen7);
        org.junit.Assert.assertNotNull(geneticType8);
        org.junit.Assert.assertNotNull(gen12);
        org.junit.Assert.assertNotNull(genArray17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test162");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass9 = genItor8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNotNull(genItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test163");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double5 = bitChromosome4.getFitness();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test164");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = chromosome3.getGeneticType();
        org.junit.Assert.assertNotNull(chromosome2);
        org.junit.Assert.assertNotNull(chromosome3);
        org.junit.Assert.assertNotNull(geneticType4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitChromosomeTestND20.test165");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        try {
            bitChromosome3.setGen(gen13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genItor4);
        org.junit.Assert.assertNotNull(chromosome7);
        org.junit.Assert.assertNotNull(gen11);
        org.junit.Assert.assertNotNull(gen13);
    }
}

