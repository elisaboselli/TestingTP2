package randoopTests.nodeterministic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorNDTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        double double10 = bitChromosome9.getFitness();
        int int11 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome9.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        int int14 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome6", (chromosome5.compareTo(bitChromosome6) == 0) == chromosome5.equals(bitChromosome6));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int8 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector6.generateChromosome();
        int int9 = bitChromosome3.compareTo(chromosome8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) (short) 100);
        bitChromosome3.setGen(gen11, (int) '4');
        java.lang.Class<?> wildcardClass14 = gen11.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome7", (bitChromosome3.compareTo(bitChromosome7) == 0) == bitChromosome3.equals(bitChromosome7));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        double double11 = bitChromosome10.getFitness();
        int int12 = bitChromosome10.length();
        int int13 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome10);
        bitChromosome10.setFitness((double) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) (short) 100);
        bitChromosome3.setGen(gen11, (int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitChromosome3.getGen((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome14", (bitChromosome7.compareTo(chromosome14) == 0) == bitChromosome7.equals(chromosome14));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass8 = chromosome7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome6", (bitChromosome3.compareTo(bitChromosome6) == 0) == bitChromosome3.equals(bitChromosome6));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome6", (chromosome5.compareTo(bitChromosome6) == 0) == chromosome5.equals(bitChromosome6));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        double double11 = bitChromosome10.getFitness();
        int int12 = bitChromosome10.length();
        int int13 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome10);
        chromosome6.setFitness((double) (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome10", (bitChromosome3.compareTo(bitChromosome10) == 0) == bitChromosome3.equals(bitChromosome10));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int7 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome6", (chromosome5.compareTo(bitChromosome6) == 0) == chromosome5.equals(bitChromosome6));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector6.generateChromosome();
        int int9 = bitChromosome3.compareTo(chromosome8);
        double double10 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector2.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome11.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) (short) 100);
        bitChromosome11.setGen(gen19, (int) '4');
        bitChromosome3.setGen(gen19, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome11", (chromosome6.compareTo(bitChromosome11) == 0) == chromosome6.equals(bitChromosome11));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        double double11 = bitChromosome10.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome10.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) (short) 100);
        bitChromosome10.setGen(gen18, (int) '4');
        int int21 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome14", (chromosome6.compareTo(bitChromosome14) == 0) == chromosome6.equals(bitChromosome14));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        double double16 = bitChromosome15.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitChromosome15.getGen((int) (short) 0);
        bitChromosome10.setGen(gen18, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray23 = bitChromosome10.getChromosomeSlice((int) 'a', (int) (byte) 0);
        bitChromosome6.setChromosomeSlice(genArray23, (int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        double double10 = bitChromosome9.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome9.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector15.generateGen((int) (short) 100);
        bitChromosome9.setGen(gen17, (int) '4');
        bitChromosome3.setGen(gen17, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome9 and bitChromosome13", (bitChromosome9.compareTo(bitChromosome13) == 0) == bitChromosome9.equals(bitChromosome13));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome6.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector2.generateGen(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double8 = bitChromosome7.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome7.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome7.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome9", (bitChromosome3.compareTo(chromosome9) == 0) == bitChromosome3.equals(chromosome9));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome10.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) (short) 100);
        bitChromosome10.setGen(gen16, 0);
        bitChromosome3.setGen(gen16, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome10", (bitChromosome6.compareTo(bitChromosome10) == 0) == bitChromosome6.equals(bitChromosome10));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector10.generateChromosome();
        int int15 = bitChromosome7.compareTo(chromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome13", (chromosome5.compareTo(bitChromosome13) == 0) == chromosome5.equals(bitChromosome13));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        double double10 = bitChromosome9.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome9.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector15.generateGen((int) (short) 100);
        bitChromosome9.setGen(gen17, (int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome20 = bitChromosome9.copyChromosome();
        int int21 = bitChromosome3.compareTo(chromosome20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (short) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome3.getChromosomeSlice((int) 'a', (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (byte) 100);
        bitChromosome3.setGen(gen20, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome26 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector25);
        double double27 = bitChromosome26.getFitness();
        int int28 = bitChromosome26.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome29 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome26);
        int int30 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and bitChromosome26", (bitChromosome8.compareTo(bitChromosome26) == 0) == bitChromosome8.equals(bitChromosome26));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        int int13 = bitChromosome12.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome12.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) (short) 100);
        bitChromosome12.setGen(gen18, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen((int) (byte) 0);
        bitChromosome12.setGen(gen26, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitChromosome12.getGen((int) '4');
        double double31 = bitChromosome12.getFitness();
        int int32 = bitChromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome14", (bitChromosome3.compareTo(chromosome14) == 0) == bitChromosome3.equals(chromosome14));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (short) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome3.getChromosomeSlice((int) 'a', (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector19);
        double double21 = bitChromosome20.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitChromosome20.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome24 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome20);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector26.generateGen((int) (short) 100);
        bitChromosome20.setGen(gen28, (int) '4');
        bitChromosome3.setGen(gen28, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and bitChromosome20", (bitChromosome8.compareTo(bitChromosome20) == 0) == bitChromosome8.equals(bitChromosome20));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.setFitness((double) 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector3.generateChromosome();
        java.lang.Class<?> wildcardClass7 = bitVector3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome8", (chromosome6.compareTo(bitChromosome8) == 0) == chromosome6.equals(bitChromosome8));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen((int) '#');
        bitChromosome6.setGen(gen12, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        double double8 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass13 = bitVector12.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) (byte) -1);
        bitChromosome14.setGen(gen18, (int) (short) 10);
        bitChromosome9.setGen(gen18, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        double double15 = bitChromosome14.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome14.getGen((int) (short) 0);
        bitChromosome9.setGen(gen17, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray22 = bitChromosome9.getChromosomeSlice((int) 'a', (int) (byte) 0);
        bitChromosome3.setChromosomeSlice(genArray22, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome9 and bitChromosome14", (bitChromosome9.compareTo(bitChromosome14) == 0) == bitChromosome9.equals(bitChromosome14));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (short) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome3.getChromosomeSlice((int) 'a', (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector19);
        int int21 = bitChromosome20.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitChromosome20.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (short) 100);
        bitChromosome20.setGen(gen26, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector30.generateGen((int) (byte) 0);
        bitChromosome20.setGen(gen34, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector38 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen40 = bitVector38.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen42 = bitVector38.generateGen((int) '#');
        bitChromosome20.setGen(gen42, (int) (byte) 10);
        int int45 = bitChromosome20.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray48 = bitChromosome20.getChromosomeSlice(1, 1);
        bitChromosome3.setChromosomeSlice(genArray48, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and bitChromosome20", (bitChromosome8.compareTo(bitChromosome20) == 0) == bitChromosome8.equals(bitChromosome20));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) (short) 100);
        bitChromosome3.setGen(gen11, (int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome3.copyChromosome();
        double double15 = chromosome14.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome7", (bitChromosome3.compareTo(bitChromosome7) == 0) == bitChromosome3.equals(bitChromosome7));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        double double8 = bitChromosome7.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome7.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        bitChromosome10.mutateGen((int) 'a');
        int int13 = bitChromosome10.length();
        int int14 = chromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome2 and bitChromosome7", (chromosome2.compareTo(bitChromosome7) == 0) == chromosome2.equals(bitChromosome7));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector2.generateGen((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome6", (bitChromosome5.compareTo(chromosome6) == 0) == bitChromosome5.equals(chromosome6));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        int int8 = bitChromosome7.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome6", (bitChromosome3.compareTo(bitChromosome6) == 0) == bitChromosome3.equals(bitChromosome6));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) 100L);
        int int8 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        double double13 = bitChromosome12.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome12.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome12);
        int int16 = bitChromosome12.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitChromosome12.copyChromosome();
        int int18 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome15 and chromosome17", (bitChromosome15.compareTo(chromosome17) == 0) == bitChromosome15.equals(chromosome17));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) 'a');
        int int9 = bitChromosome6.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        bitChromosome6.setChromosomeSlice(genArray42, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome10", (bitChromosome3.compareTo(bitChromosome10) == 0) == bitChromosome3.equals(bitChromosome10));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        int int13 = bitChromosome12.length();
        java.lang.Class<?> wildcardClass14 = bitChromosome12.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome12.getChromosomeSlice((int) (byte) 0, (int) '4');
        bitChromosome8.setChromosomeSlice(genArray17, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome6", (bitChromosome3.compareTo(bitChromosome6) == 0) == bitChromosome3.equals(bitChromosome6));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome6.getGeneticType();
        int int10 = bitChromosome6.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        double double15 = bitChromosome14.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome14.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitChromosome18.getGen((int) (byte) 10);
        bitChromosome6.setGen(gen20, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome14", (bitChromosome3.compareTo(bitChromosome14) == 0) == bitChromosome3.equals(bitChromosome14));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        double double11 = bitChromosome10.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome10.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome10);
        int int14 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome10);
        int int16 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome10", (chromosome5.compareTo(bitChromosome10) == 0) == chromosome5.equals(bitChromosome10));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome6.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = bitChromosome6.getGeneticType();
        bitChromosome6.setFitness((double) 0L);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass16 = bitVector15.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector15);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector19.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome22 = bitVector19.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType23 = chromosome22.getGeneticType();
        int int24 = bitChromosome17.compareTo(chromosome22);
        int int25 = bitChromosome6.compareTo(chromosome22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome17", (bitChromosome3.compareTo(bitChromosome17) == 0) == bitChromosome3.equals(bitChromosome17));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        bitChromosome3.mutateGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome3.copyChromosome();
        int int11 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and chromosome10", (chromosome6.compareTo(chromosome10) == 0) == chromosome6.equals(chromosome10));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        double double10 = bitChromosome9.getFitness();
        int int11 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome12);
        int int14 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome9 and bitChromosome13", (bitChromosome9.compareTo(bitChromosome13) == 0) == bitChromosome9.equals(bitChromosome13));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) (byte) -1);
        bitChromosome4.setGen(gen8, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        int int43 = bitChromosome4.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        int int44 = bitChromosome14.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and chromosome16", (bitChromosome4.compareTo(chromosome16) == 0) == bitChromosome4.equals(chromosome16));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) 100L);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        int int13 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome11.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        int int16 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome14 and bitChromosome15", (chromosome14.compareTo(bitChromosome15) == 0) == chromosome14.equals(bitChromosome15));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) (byte) -1);
        bitChromosome4.setGen(gen8, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        int int43 = bitChromosome4.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        double double44 = bitChromosome4.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome14 and chromosome16", (bitChromosome14.compareTo(chromosome16) == 0) == bitChromosome14.equals(chromosome16));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        double double11 = bitChromosome10.getFitness();
        int int12 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome10.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome10);
        int int15 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome10", (chromosome6.compareTo(bitChromosome10) == 0) == chromosome6.equals(bitChromosome10));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) 'a');
        int int9 = bitChromosome6.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        double double11 = bitChromosome6.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome10", (bitChromosome3.compareTo(bitChromosome10) == 0) == bitChromosome3.equals(bitChromosome10));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome7", (chromosome5.compareTo(chromosome7) == 0) == chromosome5.equals(chromosome7));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        double double13 = bitChromosome12.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome12.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome12.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType16 = bitChromosome12.getGeneticType();
        bitChromosome12.mutateGen((int) (short) 0);
        int int19 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and chromosome15", (bitChromosome6.compareTo(chromosome15) == 0) == bitChromosome6.equals(chromosome15));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome6.mutateGen((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) (byte) -1);
        bitChromosome4.setGen(gen8, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        int int43 = bitChromosome4.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome44 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome14 and chromosome16", (bitChromosome14.compareTo(chromosome16) == 0) == bitChromosome14.equals(chromosome16));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector6.generateChromosome();
        int int9 = bitChromosome3.compareTo(chromosome8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome3.getGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector15);
        double double17 = bitChromosome16.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitChromosome16.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector21.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitVector21.generateGen((int) (byte) 0);
        bitChromosome16.setGen(gen25, (int) '4');
        bitChromosome3.setGen(gen25, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome16", (bitChromosome6.compareTo(bitChromosome16) == 0) == bitChromosome6.equals(bitChromosome16));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass5 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector2.generateGen(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome7.getGen((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome8", (bitChromosome3.compareTo(bitChromosome8) == 0) == bitChromosome3.equals(bitChromosome8));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome8", (bitChromosome3.compareTo(bitChromosome8) == 0) == bitChromosome3.equals(bitChromosome8));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector2.generateGen(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        java.lang.Class<?> wildcardClass8 = genItor7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        bitChromosome14.mutateGen((int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = bitChromosome14.getGeneticType();
        int int18 = bitChromosome14.length();
        int int19 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome7", (chromosome5.compareTo(chromosome7) == 0) == chromosome5.equals(chromosome7));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector11.generateChromosome();
        int int14 = bitChromosome9.compareTo(chromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome7.getGen((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        int int14 = bitChromosome13.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector17);
        double double19 = bitChromosome18.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitChromosome18.getGen((int) (short) 0);
        bitChromosome13.setGen(gen21, (int) (byte) 10);
        int int24 = bitChromosome7.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome18", (bitChromosome3.compareTo(bitChromosome18) == 0) == bitChromosome3.equals(bitChromosome18));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) 100L);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome3.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        double double16 = bitChromosome15.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor17 = bitChromosome15.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome15);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray21 = bitChromosome15.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitChromosome15.getGen((int) '#');
        bitChromosome3.setGen(gen23, (int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome15 and bitChromosome18", (bitChromosome15.compareTo(bitChromosome18) == 0) == bitChromosome15.equals(bitChromosome18));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        chromosome7.setFitness((double) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome8", (chromosome6.compareTo(bitChromosome8) == 0) == chromosome6.equals(bitChromosome8));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector2.generateGen((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome8.getGen((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome6", (bitChromosome3.compareTo(bitChromosome6) == 0) == bitChromosome3.equals(bitChromosome6));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome9", (chromosome6.compareTo(bitChromosome9) == 0) == chromosome6.equals(bitChromosome9));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        double double8 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int10 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome9", (chromosome6.compareTo(bitChromosome9) == 0) == chromosome6.equals(bitChromosome9));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        double double9 = bitChromosome8.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome7", (bitChromosome3.compareTo(bitChromosome7) == 0) == bitChromosome3.equals(bitChromosome7));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        double double8 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome9.mutateGen(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector6.generateChromosome();
        int int9 = bitChromosome3.compareTo(chromosome8);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double8 = bitChromosome7.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome7.copyChromosome();
        int int10 = bitChromosome7.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome9", (bitChromosome3.compareTo(chromosome9) == 0) == bitChromosome3.equals(chromosome9));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector2.generateGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitVector2.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome9", (bitChromosome5.compareTo(chromosome9) == 0) == bitChromosome5.equals(chromosome9));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector3.generateGen((int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome7", (bitChromosome6.compareTo(bitChromosome7) == 0) == bitChromosome6.equals(bitChromosome7));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        bitChromosome5.setFitness((double) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass11 = bitVector10.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) (byte) -1);
        bitChromosome12.setGen(gen16, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector21);
        int int23 = bitChromosome22.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome24 = bitChromosome22.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector26.generateGen((int) (short) 100);
        bitChromosome22.setGen(gen28, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) (byte) 0);
        bitChromosome22.setGen(gen36, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector40 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen42 = bitVector40.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen44 = bitVector40.generateGen((int) '#');
        bitChromosome22.setGen(gen44, (int) (byte) 10);
        int int47 = bitChromosome22.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray50 = bitChromosome22.getChromosomeSlice(1, 1);
        int int51 = bitChromosome12.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome22);
        int int52 = bitChromosome5.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome22 and chromosome24", (bitChromosome22.compareTo(chromosome24) == 0) == bitChromosome22.equals(chromosome24));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome2 and chromosome3", (chromosome2.compareTo(chromosome3) == 0) == chromosome2.equals(chromosome3));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector2.generateGen(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome6", (bitChromosome5.compareTo(chromosome6) == 0) == bitChromosome5.equals(chromosome6));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        double double6 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome3.getGen(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome7", (chromosome5.compareTo(chromosome7) == 0) == chromosome5.equals(chromosome7));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector10.generateGen((int) (byte) 100);
        bitChromosome3.setGen(gen13, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and chromosome11", (chromosome6.compareTo(chromosome11) == 0) == chromosome6.equals(chromosome11));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome3.getGen((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome7", (bitChromosome6.compareTo(bitChromosome7) == 0) == bitChromosome6.equals(bitChromosome7));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector2.generateChromosome();
        java.lang.Class<?> wildcardClass6 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector2.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        double double8 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double10 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome9", (chromosome6.compareTo(bitChromosome9) == 0) == chromosome6.equals(bitChromosome9));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome10.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) (short) 100);
        bitChromosome10.setGen(gen16, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector20.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector20.generateGen((int) (byte) 0);
        bitChromosome10.setGen(gen24, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector28 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitVector28.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector28.generateGen((int) '#');
        bitChromosome10.setGen(gen32, (int) (byte) 10);
        int int35 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray38 = bitChromosome10.getChromosomeSlice(1, 1);
        bitChromosome3.setChromosomeSlice(genArray38, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome10 and chromosome12", (bitChromosome10.compareTo(chromosome12) == 0) == bitChromosome10.equals(chromosome12));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and chromosome8", (bitChromosome6.compareTo(chromosome8) == 0) == bitChromosome6.equals(chromosome8));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (short) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 10);
        int int14 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome3.copyChromosome();
        double double16 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and chromosome15", (bitChromosome8.compareTo(chromosome15) == 0) == bitChromosome8.equals(chromosome15));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen((int) '#');
        bitChromosome3.setGen(gen15, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray20 = bitChromosome3.getChromosomeSlice((int) (short) 1, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome21", (bitChromosome6.compareTo(bitChromosome21) == 0) == bitChromosome6.equals(bitChromosome21));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen((int) (short) 0);
        bitChromosome3.setGen(gen11, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray16 = bitChromosome3.getChromosomeSlice((int) 'a', (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (byte) 100);
        bitChromosome3.setGen(gen20, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome26 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector25);
        int int27 = bitChromosome26.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome28 = bitChromosome26.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector30.generateGen((int) (short) 100);
        bitChromosome26.setGen(gen32, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector36 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen38 = bitVector36.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen40 = bitVector36.generateGen((int) (byte) 0);
        bitChromosome26.setGen(gen40, (int) ' ');
        bitChromosome26.setFitness((double) (-1L));
        double double45 = bitChromosome26.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome46 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome26);
        int int47 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and chromosome28", (bitChromosome8.compareTo(chromosome28) == 0) == bitChromosome8.equals(chromosome28));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        int int14 = bitChromosome13.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome13.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) (short) 100);
        bitChromosome13.setGen(gen19, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitVector23.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector23.generateGen((int) (byte) 0);
        bitChromosome13.setGen(gen27, (int) ' ');
        bitChromosome13.setFitness((double) (-1L));
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor32 = bitChromosome13.iterator();
        int int33 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome15", (bitChromosome7.compareTo(chromosome15) == 0) == bitChromosome7.equals(chromosome15));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) 'a', 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome3.getChromosomeSlice((int) (byte) 1, (int) 'a');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        double double20 = bitChromosome19.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome19.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        int int23 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome24 = bitChromosome19.copyChromosome();
        int int25 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome15", (chromosome5.compareTo(chromosome15) == 0) == chromosome5.equals(chromosome15));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        int int15 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome11.copyChromosome();
        int int17 = chromosome7.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome6", (bitChromosome3.compareTo(bitChromosome6) == 0) == bitChromosome3.equals(bitChromosome6));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome11.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector19.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector19.generateGen((int) '#');
        bitChromosome11.setGen(gen23, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray28 = bitChromosome11.getChromosomeSlice((int) (byte) 0, (int) (short) 0);
        bitChromosome7.setChromosomeSlice(genArray28, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome14", (bitChromosome11.compareTo(bitChromosome14) == 0) == bitChromosome11.equals(bitChromosome14));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        int int5 = bitChromosome3.length();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome10.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome10.getGen((int) (byte) 1);
        bitChromosome3.setGen(gen14, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome10 and chromosome12", (bitChromosome10.compareTo(chromosome12) == 0) == bitChromosome10.equals(chromosome12));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector12.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitVector12.generateChromosome();
        int int17 = bitChromosome9.compareTo(chromosome16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.setFitness((double) 100L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome7", (chromosome6.compareTo(bitChromosome7) == 0) == chromosome6.equals(bitChromosome7));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) 10.0f);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        bitChromosome3.mutateGen((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome3.mutateGen((int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome12 and bitChromosome13", (bitChromosome12.compareTo(bitChromosome13) == 0) == bitChromosome12.equals(bitChromosome13));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass5 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector1.generateGen((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) (short) 100);
        bitChromosome3.setGen(gen11, (int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome14", (bitChromosome7.compareTo(chromosome14) == 0) == bitChromosome7.equals(chromosome14));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen((int) '#');
        bitChromosome3.setGen(gen15, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector20);
        int int22 = bitChromosome21.length();
        java.lang.Class<?> wildcardClass23 = bitChromosome21.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray26 = bitChromosome21.getChromosomeSlice((int) (byte) 0, (int) '4');
        bitChromosome3.setChromosomeSlice(genArray26, (int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and bitChromosome21", (bitChromosome6.compareTo(bitChromosome21) == 0) == bitChromosome6.equals(bitChromosome21));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) (byte) -1);
        bitChromosome4.setGen(gen8, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        int int43 = bitChromosome4.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        java.lang.Class<?> wildcardClass44 = bitChromosome4.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome14 and chromosome16", (bitChromosome14.compareTo(chromosome16) == 0) == bitChromosome14.equals(chromosome16));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.lang.Class<?> wildcardClass12 = bitVector8.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector8.generateGen((int) (byte) 1);
        bitChromosome3.setGen(gen14, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome11", (chromosome5.compareTo(bitChromosome11) == 0) == chromosome5.equals(bitChromosome11));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome13.setChromosomeSlice(genArray14, (int) '4');
        double double17 = bitChromosome13.getFitness();
        int int18 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome12", (bitChromosome3.compareTo(bitChromosome12) == 0) == bitChromosome3.equals(bitChromosome12));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double8 = bitChromosome7.getFitness();
        double double9 = bitChromosome7.getFitness();
        bitChromosome7.mutateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) (byte) -1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitVector14.generateChromosome();
        java.lang.Class<?> wildcardClass18 = bitVector14.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        int int20 = bitChromosome7.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome17", (bitChromosome3.compareTo(chromosome17) == 0) == bitChromosome3.equals(chromosome17));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitVector6.generateGen((int) (byte) -1);
        bitChromosome4.setGen(gen8, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome14.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) (short) 100);
        bitChromosome14.setGen(gen20, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector24 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector24.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen28 = bitVector24.generateGen((int) (byte) 0);
        bitChromosome14.setGen(gen28, (int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector32 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen34 = bitVector32.generateGen((int) (short) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen36 = bitVector32.generateGen((int) '#');
        bitChromosome14.setGen(gen36, (int) (byte) 10);
        int int39 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome14.getChromosomeSlice(1, 1);
        int int43 = bitChromosome4.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen45 = bitChromosome14.getGen((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and chromosome16", (bitChromosome4.compareTo(chromosome16) == 0) == bitChromosome4.equals(chromosome16));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome3.getChromosomeSlice((int) '#', (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        double double14 = bitChromosome13.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome13.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = bitChromosome13.getGeneticType();
        double double18 = bitChromosome13.getFitness();
        int int19 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome6 and chromosome16", (bitChromosome6.compareTo(chromosome16) == 0) == bitChromosome6.equals(chromosome16));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        double double14 = bitChromosome13.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome13.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome13.iterator();
        bitChromosome13.setFitness((double) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitChromosome13.copyChromosome();
        int int20 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome9 and chromosome19", (chromosome9.compareTo(chromosome19) == 0) == chromosome9.equals(chromosome19));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome6", (bitChromosome5.compareTo(chromosome6) == 0) == bitChromosome5.equals(chromosome6));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass6 = bitChromosome3.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        double double12 = bitChromosome11.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome11.getGen((int) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome15.getGen((int) (byte) 10);
        int int18 = chromosome7.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        double double4 = bitChromosome3.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        double double14 = bitChromosome13.getFitness();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome13.iterator();
        bitChromosome13.setFitness((double) 100L);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray21 = bitChromosome13.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray21, (-1));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome9", (chromosome6.compareTo(bitChromosome9) == 0) == chromosome6.equals(bitChromosome9));
    }
}

