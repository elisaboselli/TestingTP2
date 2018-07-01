package randoopTests.deterministic_new;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0D2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitChromosome8.copyChromosome();
        boolean boolean10 = bitChromosome3.equals(bitChromosome8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome9", (chromosome4.compareTo(chromosome9) == 0) == chromosome4.equals(chromosome9));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome7.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome7.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome7.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome7", (chromosome4.compareTo(bitChromosome7) == 0) == chromosome4.equals(bitChromosome7));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome11.copyChromosome();
        boolean boolean14 = bitChromosome3.equals(bitChromosome11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome7", (chromosome4.compareTo(bitChromosome7) == 0) == chromosome4.equals(bitChromosome7));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome7.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int8 = bitChromosome7.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector28 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen30 = bitVector28.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen32 = bitVector28.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome33 = bitVector28.generateChromosome();
        double double34 = chromosome33.getFitness();
        int int35 = chromosome22.compareTo(chromosome33);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector38 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome39 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector38);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome40 = bitChromosome39.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor41 = bitChromosome39.iterator();
        int int42 = bitChromosome39.length();
        int int43 = chromosome33.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome15 and chromosome40", (chromosome15.compareTo(chromosome40) == 0) == chromosome15.equals(chromosome40));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int8 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome7", (chromosome4.compareTo(bitChromosome7) == 0) == chromosome4.equals(bitChromosome7));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitChromosome10.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome10.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome10.iterator();
        boolean boolean14 = bitChromosome3.equals(bitChromosome10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        int int10 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome7 and chromosome8", (bitChromosome7.compareTo(chromosome8) == 0) == bitChromosome7.equals(chromosome8));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome12.copyChromosome();
        int int14 = bitChromosome8.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome13", (bitChromosome3.compareTo(chromosome13) == 0) == bitChromosome3.equals(chromosome13));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        double double10 = bitChromosome7.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome5", (chromosome4.compareTo(chromosome5) == 0) == chromosome4.equals(chromosome5));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.lang.Class<?> wildcardClass7 = bitChromosome6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome13.copyChromosome();
        int int15 = bitChromosome9.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        boolean boolean16 = bitChromosome3.equals(bitChromosome9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome13 and chromosome14", (bitChromosome13.compareTo(chromosome14) == 0) == bitChromosome13.equals(chromosome14));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector3.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector3.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome8 and bitChromosome9", (chromosome8.compareTo(bitChromosome9) == 0) == chromosome8.equals(bitChromosome9));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome8.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        bitChromosome5.setChromosomeSlice(genArray13, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome9", (bitChromosome3.compareTo(bitChromosome9) == 0) == bitChromosome3.equals(bitChromosome9));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome10.iterator();
        bitChromosome10.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitChromosome10.getGen(0);
        bitChromosome3.setGen(gen15, (int) (short) 1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome3", bitChromosome3.repOK());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double7 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome6", (chromosome4.compareTo(bitChromosome6) == 0) == chromosome4.equals(bitChromosome6));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen(100);
        bitChromosome3.setGen(gen13, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome7", (chromosome4.compareTo(chromosome7) == 0) == chromosome4.equals(chromosome7));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        int int11 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        int int16 = bitChromosome15.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray19 = bitChromosome15.getChromosomeSlice(10, 0);
        bitChromosome9.setChromosomeSlice(genArray19, (int) (short) 10);
        bitChromosome3.setChromosomeSlice(genArray19, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome9 and bitChromosome15", (bitChromosome9.compareTo(bitChromosome15) == 0) == bitChromosome9.equals(bitChromosome15));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        int int7 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome3", bitChromosome3.repOK());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) 10L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome7", (chromosome4.compareTo(chromosome7) == 0) == chromosome4.equals(chromosome7));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        java.lang.Class<?> wildcardClass7 = bitChromosome3.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        double double10 = bitChromosome9.getFitness();
        bitChromosome9.mutateGen((int) (short) 0);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome9", bitChromosome9.repOK());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome9.getChromosomeSlice((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.lang.Class<?> wildcardClass15 = bitChromosome14.getClass();
        int int16 = chromosome5.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome13", (bitChromosome3.compareTo(chromosome13) == 0) == bitChromosome3.equals(chromosome13));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double8 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome7", (chromosome4.compareTo(bitChromosome7) == 0) == chromosome4.equals(bitChromosome7));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome3 and chromosome4", (chromosome3.compareTo(chromosome4) == 0) == chromosome3.equals(chromosome4));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome4.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome4.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome4.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(1, geneticType7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and chromosome6", (bitChromosome4.compareTo(chromosome6) == 0) == bitChromosome4.equals(chromosome6));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome5.iterator();
        java.lang.Class<?> wildcardClass7 = genItor6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome5", (bitChromosome3.compareTo(bitChromosome5) == 0) == bitChromosome3.equals(bitChromosome5));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome12.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome8", (chromosome7.compareTo(bitChromosome8) == 0) == chromosome7.equals(bitChromosome8));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome14);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray19 = bitChromosome16.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        bitChromosome9.setChromosomeSlice(genArray19, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome14", (chromosome7.compareTo(bitChromosome14) == 0) == chromosome7.equals(bitChromosome14));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector20);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor22 = bitChromosome21.iterator();
        int int23 = bitChromosome21.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector26 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector26);
        int int28 = bitChromosome27.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray31 = bitChromosome27.getChromosomeSlice(10, 0);
        bitChromosome21.setChromosomeSlice(genArray31, (int) (short) 10);
        bitChromosome14.setChromosomeSlice(genArray31, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome9", (chromosome7.compareTo(bitChromosome9) == 0) == chromosome7.equals(bitChromosome9));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray19 = bitChromosome16.getChromosomeSlice((int) '4', 10);
        bitChromosome3.setChromosomeSlice(genArray19, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome15", (chromosome4.compareTo(chromosome15) == 0) == chromosome4.equals(chromosome15));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        int int21 = bitChromosome19.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome20", (chromosome7.compareTo(bitChromosome20) == 0) == chromosome7.equals(bitChromosome20));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = chromosome16.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType17);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome18.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector22);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor24 = bitChromosome23.iterator();
        double double25 = bitChromosome23.getFitness();
        boolean boolean26 = bitChromosome18.equals(bitChromosome23);
        boolean boolean27 = bitChromosome3.equals(bitChromosome18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome16 and bitChromosome23", (chromosome16.compareTo(bitChromosome23) == 0) == chromosome16.equals(bitChromosome23));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitChromosome9.copyChromosome();
        int int12 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome11", (chromosome5.compareTo(chromosome11) == 0) == chromosome5.equals(chromosome11));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = chromosome16.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType17);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome18.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector22);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor24 = bitChromosome23.iterator();
        double double25 = bitChromosome23.getFitness();
        boolean boolean26 = bitChromosome18.equals(bitChromosome23);
        int int27 = bitChromosome8.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector15 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector15.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector15.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome20 = bitVector15.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector15);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray24 = bitChromosome21.getChromosomeSlice((int) '4', 10);
        bitChromosome8.setChromosomeSlice(genArray24, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome12", (chromosome7.compareTo(bitChromosome12) == 0) == chromosome7.equals(bitChromosome12));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.mutateGen((int) (short) 1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome3", bitChromosome3.repOK());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome7.setFitness((double) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome8.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome12", (chromosome7.compareTo(bitChromosome12) == 0) == chromosome7.equals(bitChromosome12));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome12.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome8", (bitChromosome3.compareTo(bitChromosome8) == 0) == bitChromosome3.equals(bitChromosome8));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome7.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitChromosome3.getGen((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome16", (bitChromosome11.compareTo(bitChromosome16) == 0) == bitChromosome11.equals(bitChromosome16));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        bitChromosome3.setFitness((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome16", (bitChromosome11.compareTo(bitChromosome16) == 0) == bitChromosome11.equals(bitChromosome16));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome8.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome8);
        bitChromosome8.mutateGen((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome12", (chromosome7.compareTo(bitChromosome12) == 0) == chromosome7.equals(bitChromosome12));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector17);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome18.iterator();
        bitChromosome18.setFitness((double) (short) 0);
        int int22 = bitChromosome18.length();
        int int23 = bitChromosome13.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome18);
        boolean boolean24 = bitChromosome9.equals(bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome18", (chromosome7.compareTo(bitChromosome18) == 0) == chromosome7.equals(bitChromosome18));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = bitChromosome16.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome11", (bitChromosome3.compareTo(bitChromosome11) == 0) == bitChromosome3.equals(bitChromosome11));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(1, geneticType9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor15 = bitChromosome14.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        bitChromosome19.setFitness((double) (short) 0);
        int int23 = bitChromosome19.length();
        int int24 = bitChromosome14.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome19);
        double double25 = bitChromosome19.getFitness();
        boolean boolean26 = bitChromosome10.equals(bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome14", (chromosome7.compareTo(bitChromosome14) == 0) == chromosome7.equals(bitChromosome14));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        bitChromosome9.setFitness((double) 100.0f);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome14", (chromosome7.compareTo(bitChromosome14) == 0) == chromosome7.equals(bitChromosome14));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        double double11 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen(1);
        bitChromosome3.setGen(gen15, (int) (short) 1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome3", bitChromosome3.repOK());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome10.iterator();
        bitChromosome10.setFitness((double) (short) 0);
        int int14 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        int int21 = bitChromosome19.length();
        boolean boolean22 = bitChromosome10.equals(bitChromosome19);
        boolean boolean23 = bitChromosome3.equals(bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome6", (chromosome5.compareTo(chromosome6) == 0) == chromosome5.equals(chromosome6));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass3 = bitVector2.getClass();
        java.lang.Class<?> wildcardClass4 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector7.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector7.generateGen(100);
        java.lang.Class<?> wildcardClass12 = gen11.getClass();
        java.lang.Class<?> wildcardClass13 = gen11.getClass();
        bitChromosome5.setGen(gen11, (int) (short) 0);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome5", bitChromosome5.repOK());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome6.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        bitChromosome9.setFitness((double) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome14", (chromosome7.compareTo(bitChromosome14) == 0) == chromosome7.equals(bitChromosome14));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitVector13.generateChromosome();
        chromosome18.setFitness((double) 100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector22 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen24 = bitVector22.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen26 = bitVector22.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome27 = bitVector22.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector29.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome34 = bitVector29.generateChromosome();
        chromosome34.setFitness((double) 10L);
        int int37 = chromosome27.compareTo(chromosome34);
        int int38 = chromosome18.compareTo(chromosome34);
        chromosome34.setFitness((double) (short) -1);
        int int41 = bitChromosome3.compareTo(chromosome34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome3.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and bitChromosome12", (bitChromosome8.compareTo(bitChromosome12) == 0) == bitChromosome8.equals(bitChromosome12));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector14.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector14.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitVector14.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType20 = chromosome19.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType20);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor22 = bitChromosome21.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray25 = bitChromosome21.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        bitChromosome9.setChromosomeSlice(genArray25, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector21.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitVector21.generateGen(100);
        java.lang.Class<?> wildcardClass26 = gen25.getClass();
        java.lang.Class<?> wildcardClass27 = gen25.getClass();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector30 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome31 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector30);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen33 = bitVector30.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector36 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome37 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector36);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen39 = bitVector36.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector41 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen43 = bitVector41.generateGen(0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray44 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen19, gen25, gen33, gen39, gen43 };
        bitChromosome12.setChromosomeSlice(genArray44, 1);
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome12", bitChromosome12.repOK());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome15.iterator();
        int int17 = bitChromosome15.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome15.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector21);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor23 = bitChromosome22.iterator();
        int int24 = bitChromosome22.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome25 = bitChromosome22.copyChromosome();
        boolean boolean26 = bitChromosome15.equals(bitChromosome22);
        boolean boolean27 = bitChromosome9.equals(bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitVector10.generateChromosome();
        java.lang.Class<?> wildcardClass12 = bitVector10.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen((-1));
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        boolean boolean16 = bitChromosome3.equals(bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome11", (chromosome4.compareTo(chromosome11) == 0) == chromosome4.equals(chromosome11));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome6.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int8 = bitChromosome7.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        bitChromosome3.setFitness((double) (short) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        int int9 = bitChromosome8.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        bitChromosome8.setFitness((double) (short) 0);
        int int12 = bitChromosome8.length();
        int int13 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen18 = bitVector16.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector16.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome21 = bitVector16.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType22 = chromosome21.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType22);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor24 = bitChromosome23.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray27 = bitChromosome23.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        bitChromosome3.setChromosomeSlice(genArray27, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and chromosome21", (bitChromosome8.compareTo(chromosome21) == 0) == bitChromosome8.equals(chromosome21));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome9.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass13 = bitVector12.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector12.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector12.generateChromosome();
        chromosome15.setFitness((double) (byte) 1);
        int int18 = bitChromosome9.compareTo(chromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and chromosome10", (chromosome7.compareTo(chromosome10) == 0) == chromosome7.equals(chromosome10));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome21 = bitChromosome20.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome19", (chromosome7.compareTo(bitChromosome19) == 0) == chromosome7.equals(bitChromosome19));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome3.getChromosomeSlice((int) (byte) 0, (int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector13.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen17 = bitVector13.generateGen((int) (byte) 0);
        bitChromosome11.setGen(gen17, 1);
        java.lang.Class<?> wildcardClass20 = gen17.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome11", (bitChromosome3.compareTo(bitChromosome11) == 0) == bitChromosome3.equals(bitChromosome11));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector16);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome17.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitChromosome17.copyChromosome();
        boolean boolean20 = bitChromosome9.equals(bitChromosome17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and chromosome19", (chromosome7.compareTo(chromosome19) == 0) == chromosome7.equals(chromosome19));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        int int15 = bitChromosome10.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome13", (bitChromosome3.compareTo(chromosome13) == 0) == bitChromosome3.equals(chromosome13));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome6", (chromosome5.compareTo(chromosome6) == 0) == chromosome5.equals(chromosome6));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector17);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome18.iterator();
        int int20 = bitChromosome18.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome24 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector23);
        int int25 = bitChromosome24.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray28 = bitChromosome24.getChromosomeSlice(10, 0);
        bitChromosome18.setChromosomeSlice(genArray28, (int) (short) 10);
        bitChromosome10.setChromosomeSlice(genArray28, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome13", (bitChromosome3.compareTo(chromosome13) == 0) == bitChromosome3.equals(chromosome13));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector18.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome23 = bitVector18.generateChromosome();
        chromosome23.setFitness((double) 10L);
        int int26 = chromosome16.compareTo(chromosome23);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType27 = chromosome16.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome28 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', geneticType27);
        boolean boolean29 = bitChromosome3.equals(bitChromosome28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome16", (chromosome4.compareTo(chromosome16) == 0) == chromosome4.equals(chromosome16));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = chromosome7.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType8);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor10 = bitChromosome9.iterator();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice((int) (short) 0, (int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome9.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector17);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor19 = bitChromosome18.iterator();
        int int20 = bitChromosome18.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome24 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector23);
        int int25 = bitChromosome24.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray28 = bitChromosome24.getChromosomeSlice(10, 0);
        bitChromosome18.setChromosomeSlice(genArray28, (int) (short) 10);
        bitChromosome9.setChromosomeSlice(genArray28, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and chromosome14", (chromosome7.compareTo(chromosome14) == 0) == chromosome7.equals(chromosome14));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome8.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass12 = bitVector11.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector11.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = chromosome14.getGeneticType();
        int int16 = bitChromosome8.compareTo(chromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome13", (bitChromosome3.compareTo(chromosome13) == 0) == bitChromosome3.equals(chromosome13));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        java.lang.Class<?> wildcardClass10 = bitChromosome7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen11 = bitVector9.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector9.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitVector9.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome15.getChromosomeSlice((int) '4', 10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome15);
        int int20 = chromosome6.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome14 and bitChromosome19", (chromosome14.compareTo(bitChromosome19) == 0) == chromosome14.equals(bitChromosome19));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        chromosome7.setFitness(1.0d);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen10 = bitVector8.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector8.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector8.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = chromosome13.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType14);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome15.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector19);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor21 = bitChromosome20.iterator();
        double double22 = bitChromosome20.getFitness();
        boolean boolean23 = bitChromosome15.equals(bitChromosome20);
        boolean boolean24 = bitChromosome3.equals(bitChromosome20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome13", (chromosome5.compareTo(chromosome13) == 0) == chromosome5.equals(chromosome13));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector14 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector14);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome15.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType17 = bitChromosome15.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome18 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome15);
        int int19 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome8.getFitness();
        java.lang.Class<?> wildcardClass10 = bitChromosome8.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome11 = bitChromosome8.copyChromosome();
        double double12 = chromosome11.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome8", (bitChromosome3.compareTo(bitChromosome8) == 0) == bitChromosome3.equals(bitChromosome8));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome7", (chromosome5.compareTo(chromosome7) == 0) == chromosome5.equals(chromosome7));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitChromosome3.getGen((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = gen6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome9.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray13, (int) (short) 10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector17.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector17.generateGen((int) (short) 0);
        bitChromosome3.setGen(gen23, (int) (short) 1);
        bitChromosome3.setFitness((double) (-1.0f));
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK) for bitChromosome3", bitChromosome3.repOK());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitChromosome11.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector16);
        int int18 = bitChromosome17.length();
        int int19 = bitChromosome11.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome17);
        boolean boolean20 = bitChromosome7.equals(bitChromosome17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and chromosome13", (bitChromosome11.compareTo(chromosome13) == 0) == bitChromosome11.equals(chromosome13));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome9 = bitVector2.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome8", (chromosome7.compareTo(bitChromosome8) == 0) == chromosome7.equals(bitChromosome8));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        chromosome4.setFitness((double) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector9.generateGen((int) (byte) 100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome13 = bitVector9.generateChromosome();
        java.lang.Class<?> wildcardClass14 = chromosome13.getClass();
        int int15 = chromosome4.compareTo(chromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome3 and bitChromosome10", (chromosome3.compareTo(bitChromosome10) == 0) == chromosome3.equals(bitChromosome10));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome2 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome2 and chromosome3", (chromosome2.compareTo(chromosome3) == 0) == chromosome2.equals(chromosome3));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome11);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome13.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome13);
        boolean boolean16 = bitChromosome7.equals(bitChromosome15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        bitChromosome7.mutateGen((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        int int8 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and chromosome7", (chromosome5.compareTo(chromosome7) == 0) == chromosome5.equals(chromosome7));
    }
}

