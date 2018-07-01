package randoopTests.nodeterministic_new;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0ND2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = chromosome6.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector1.generateGen((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome5", (chromosome4.compareTo(chromosome5) == 0) == chromosome4.equals(chromosome5));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.lang.Class<?> wildcardClass7 = bitChromosome6.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector3.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector3.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome8 and bitChromosome9", (chromosome8.compareTo(bitChromosome9) == 0) == chromosome8.equals(bitChromosome9));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome10", (chromosome4.compareTo(bitChromosome10) == 0) == chromosome4.equals(bitChromosome10));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double7 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome6", (chromosome4.compareTo(bitChromosome6) == 0) == chromosome4.equals(bitChromosome6));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        int int7 = bitChromosome3.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        int int14 = bitChromosome13.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray17 = bitChromosome13.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector19 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen21 = bitVector19.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector23 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen25 = bitVector23.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector27 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen29 = bitVector27.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector27.generateGen(100);
        java.lang.Class<?> wildcardClass32 = gen31.getClass();
        java.lang.Class<?> wildcardClass33 = gen31.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray34 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen21, gen25, gen31 };
        bitChromosome13.setChromosomeSlice(genArray34, 1);
        boolean boolean37 = bitChromosome7.equals(bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitChromosome9.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome14", (chromosome7.compareTo(bitChromosome14) == 0) == chromosome7.equals(bitChromosome14));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome6", (chromosome4.compareTo(chromosome6) == 0) == chromosome4.equals(chromosome6));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector1.generateGen((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome3 and chromosome4", (chromosome3.compareTo(chromosome4) == 0) == chromosome3.equals(chromosome4));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome4.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome4.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome4.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(1, geneticType7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and chromosome6", (bitChromosome4.compareTo(chromosome6) == 0) == bitChromosome4.equals(chromosome6));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) 'a');
        java.lang.Class<?> wildcardClass2 = bitVector1.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome3 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitVector1.generateChromosome();
        java.lang.Class<?> wildcardClass5 = bitVector1.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome3 and chromosome4", (chromosome3.compareTo(chromosome4) == 0) == chromosome3.equals(chromosome4));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        chromosome22.setFitness(100.0d);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome15 and chromosome33", (chromosome15.compareTo(chromosome33) == 0) == chromosome15.equals(chromosome33));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        double double8 = chromosome7.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = chromosome6.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector1 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen3 = bitVector1.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector1.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector1.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen9 = bitVector1.generateGen((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and chromosome7", (chromosome6.compareTo(chromosome7) == 0) == chromosome6.equals(chromosome7));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome5.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome5.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        int int12 = bitChromosome11.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray15 = bitChromosome11.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector17 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen19 = bitVector17.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector21 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen23 = bitVector21.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector25.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen29 = bitVector25.generateGen(100);
        java.lang.Class<?> wildcardClass30 = gen29.getClass();
        java.lang.Class<?> wildcardClass31 = gen29.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray32 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen19, gen23, gen29 };
        bitChromosome11.setChromosomeSlice(genArray32, 1);
        bitChromosome5.setChromosomeSlice(genArray32, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and bitChromosome11", (bitChromosome3.compareTo(bitChromosome11) == 0) == bitChromosome3.equals(bitChromosome11));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        bitChromosome3.mutateGen((int) (byte) 1);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray19 = bitChromosome16.getChromosomeSlice((int) '4', 10);
        bitChromosome3.setChromosomeSlice(genArray19, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome15 and bitChromosome16", (chromosome15.compareTo(bitChromosome16) == 0) == chromosome15.equals(bitChromosome16));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        int int10 = bitChromosome8.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector13 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector13);
        int int15 = bitChromosome14.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome14.getChromosomeSlice(10, 0);
        bitChromosome8.setChromosomeSlice(genArray18, (int) (short) 10);
        bitChromosome3.setChromosomeSlice(genArray18, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome8", (chromosome4.compareTo(bitChromosome8) == 0) == chromosome4.equals(bitChromosome8));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome11.iterator();
        int int15 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor16 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome11", (chromosome6.compareTo(bitChromosome11) == 0) == chromosome6.equals(bitChromosome11));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome6.getGen((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome10.getChromosomeSlice(10, 0);
        bitChromosome6.setChromosomeSlice(genArray14, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        int int4 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome3.getChromosomeSlice(10, 0);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        int int9 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector12);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector16 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector16);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitChromosome17.copyChromosome();
        int int19 = bitChromosome13.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome17);
        boolean boolean20 = bitChromosome3.equals(bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome17 and chromosome18", (bitChromosome17.compareTo(chromosome18) == 0) == bitChromosome17.equals(chromosome18));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and bitChromosome6", (chromosome4.compareTo(bitChromosome6) == 0) == chromosome4.equals(bitChromosome6));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome6", (chromosome5.compareTo(bitChromosome6) == 0) == chromosome5.equals(bitChromosome6));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        int int11 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        double double12 = bitChromosome9.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.lang.Class<?> wildcardClass9 = bitVector2.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome8", (chromosome7.compareTo(bitChromosome8) == 0) == chromosome7.equals(bitChromosome8));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome7.setFitness((double) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        int int14 = bitChromosome9.length();
        boolean boolean15 = bitChromosome5.equals(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome9.copyChromosome();
        java.lang.Class<?> wildcardClass17 = bitChromosome9.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome16", (bitChromosome5.compareTo(chromosome16) == 0) == bitChromosome5.equals(chromosome16));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome18 = bitChromosome15.copyChromosome();
        int int19 = bitChromosome3.compareTo(chromosome18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome9", (chromosome5.compareTo(bitChromosome9) == 0) == chromosome5.equals(bitChromosome9));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome5 and bitChromosome7", (chromosome5.compareTo(bitChromosome7) == 0) == chromosome5.equals(bitChromosome7));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) ' ');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector8 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector8);
        int int10 = bitChromosome9.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray13 = bitChromosome9.getChromosomeSlice(10, 0);
        int int14 = bitChromosome9.length();
        boolean boolean15 = bitChromosome5.equals(bitChromosome9);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector18.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome23 = bitVector18.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = chromosome23.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType24);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor26 = bitChromosome25.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome30 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector29);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor31 = bitChromosome30.iterator();
        double double32 = bitChromosome30.getFitness();
        boolean boolean33 = bitChromosome25.equals(bitChromosome30);
        boolean boolean34 = bitChromosome9.equals(bitChromosome25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and chromosome23", (bitChromosome5.compareTo(chromosome23) == 0) == bitChromosome5.equals(chromosome23));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = bitChromosome3.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome8", (chromosome4.compareTo(chromosome8) == 0) == chromosome4.equals(chromosome8));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome11.iterator();
        int int15 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome16 = bitChromosome11.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome6", (bitChromosome3.compareTo(chromosome6) == 0) == bitChromosome3.equals(chromosome6));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen5 = bitVector3.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitVector3.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitVector3.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen12 = bitVector10.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector10.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome15 = bitVector10.generateChromosome();
        chromosome15.setFitness((double) 10L);
        int int18 = chromosome8.compareTo(chromosome15);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType19 = chromosome8.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome20 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 10, geneticType19);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(1, geneticType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome8 and bitChromosome20", (chromosome8.compareTo(bitChromosome20) == 0) == chromosome8.equals(bitChromosome20));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        bitChromosome3.setFitness((double) (short) 0);
        int int7 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        double double9 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector12 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen14 = bitVector12.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen16 = bitVector12.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome17 = bitVector12.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType18 = chromosome17.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 1, geneticType18);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor20 = bitChromosome19.iterator();
        boolean boolean21 = bitChromosome3.equals(bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and chromosome17", (bitChromosome8.compareTo(chromosome17) == 0) == bitChromosome8.equals(chromosome17));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome7.setFitness((double) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome4", (bitChromosome3.compareTo(chromosome4) == 0) == bitChromosome3.equals(chromosome4));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector7 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector7);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        bitChromosome8.setFitness((double) (short) 0);
        int int12 = bitChromosome8.length();
        int int13 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome3.copyChromosome();
        bitChromosome3.mutateGen((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome8 and chromosome14", (bitChromosome8.compareTo(chromosome14) == 0) == bitChromosome8.equals(chromosome14));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        int int6 = bitChromosome3.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome3.iterator();
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
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome27 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 10, geneticType26);
        int int28 = bitChromosome27.length();
        boolean boolean29 = bitChromosome3.equals(bitChromosome27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome15", (chromosome4.compareTo(chromosome15) == 0) == chromosome4.equals(chromosome15));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector20 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome21 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector20);
        int int22 = bitChromosome21.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray25 = bitChromosome21.getChromosomeSlice(10, 0);
        bitChromosome7.setChromosomeSlice(genArray25, (int) 'a');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome21", (bitChromosome11.compareTo(bitChromosome21) == 0) == bitChromosome11.equals(bitChromosome21));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        boolean boolean17 = bitChromosome8.equals(bitChromosome16);
        int int18 = bitChromosome16.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome8", (chromosome7.compareTo(bitChromosome8) == 0) == chromosome7.equals(bitChromosome8));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        double double7 = bitChromosome3.getFitness();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        int int13 = bitChromosome11.length();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor14 = bitChromosome11.iterator();
        int int15 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome11);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector18);
        int int20 = bitChromosome19.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray23 = bitChromosome19.getChromosomeSlice(10, 0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector25 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen27 = bitVector25.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector29 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (byte) 10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen31 = bitVector29.generateGen((int) '4');
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector33 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen35 = bitVector33.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen37 = bitVector33.generateGen(100);
        java.lang.Class<?> wildcardClass38 = gen37.getClass();
        java.lang.Class<?> wildcardClass39 = gen37.getClass();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray40 = new ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] { gen27, gen31, gen37 };
        bitChromosome19.setChromosomeSlice(genArray40, 1);
        boolean boolean43 = bitChromosome3.equals(bitChromosome19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome11", (chromosome6.compareTo(bitChromosome11) == 0) == chromosome6.equals(bitChromosome11));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome3.getGen(0);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector10 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector10);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome12 = bitChromosome11.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor13 = bitChromosome11.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome14 = bitChromosome11.copyChromosome();
        boolean boolean15 = bitChromosome3.equals(bitChromosome11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome12", (chromosome4.compareTo(chromosome12) == 0) == chromosome4.equals(chromosome12));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen(10);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen6 = bitVector2.generateGen((int) (byte) 0);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitVector2.generateChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector11 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen13 = bitVector11.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen15 = bitVector11.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 100, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector11);
        boolean boolean17 = bitChromosome8.equals(bitChromosome16);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome8.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome7 and bitChromosome16", (chromosome7.compareTo(bitChromosome16) == 0) == chromosome7.equals(bitChromosome16));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen4 = bitVector2.generateGen((int) '#');
        java.lang.Class<?> wildcardClass5 = bitVector2.getClass();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '#', (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
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
        boolean boolean34 = bitChromosome6.equals(bitChromosome10);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector37 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome38 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector37);
        int int39 = bitChromosome38.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray42 = bitChromosome38.getChromosomeSlice(10, 0);
        bitChromosome6.setChromosomeSlice(genArray42, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome10 and bitChromosome38", (bitChromosome10.compareTo(bitChromosome38) == 0) == bitChromosome10.equals(bitChromosome38));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome7", (chromosome4.compareTo(chromosome7) == 0) == chromosome4.equals(chromosome7));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector3 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector3);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome4.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor6 = bitChromosome4.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome4.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 10, geneticType7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and chromosome5", (bitChromosome4.compareTo(chromosome5) == 0) == bitChromosome4.equals(chromosome5));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome3);
        bitChromosome7.setFitness(1.0d);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome5", (bitChromosome3.compareTo(chromosome5) == 0) == bitChromosome3.equals(chromosome5));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor4 = bitChromosome3.iterator();
        int int5 = bitChromosome3.length();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome6 = bitChromosome3.copyChromosome();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector9 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector9);
        int int11 = bitChromosome10.length();
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen[] genArray14 = bitChromosome10.getChromosomeSlice(10, 0);
        bitChromosome3.setChromosomeSlice(genArray14, (int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome6 and bitChromosome10", (chromosome6.compareTo(bitChromosome10) == 0) == chromosome6.equals(bitChromosome10));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
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
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector18 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector(100);
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen20 = bitVector18.generateGen((int) '#');
        ejercicio1.es.unileon.rnag.cubiga.gen.Gen gen22 = bitVector18.generateGen(100);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome23 = bitVector18.generateChromosome();
        chromosome23.setFitness((double) 10L);
        int int26 = bitChromosome3.compareTo(chromosome23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome13 and bitChromosome15", (bitChromosome13.compareTo(bitChromosome15) == 0) == bitChromosome13.equals(bitChromosome15));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome4 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor5 = bitChromosome3.iterator();
        ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome3.getGeneticType();
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = bitChromosome3.copyChromosome();
        java.util.Iterator<ejercicio1.es.unileon.rnag.cubiga.gen.Gen> genItor8 = bitChromosome3.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome4 and chromosome7", (chromosome4.compareTo(chromosome7) == 0) == chromosome4.equals(chromosome7));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector2 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector2);
        ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector bitVector6 = new ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector((int) (short) 1);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, (ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType) bitVector6);
        ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome7.copyChromosome();
        int int9 = bitChromosome3.compareTo((ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        java.lang.Class<?> wildcardClass10 = bitChromosome7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome3 and chromosome8", (bitChromosome3.compareTo(chromosome8) == 0) == bitChromosome3.equals(chromosome8));
    }
}

