/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 03 21:34:31 GMT 2018
 */

package no_weak_and_det;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class BitChromosome_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9n/9jh930wn64s7wpbgggh1sqs00000gn/T/"); 
    java.lang.System.setProperty("user.country", "ES"); 
    java.lang.System.setProperty("user.dir", "/Users/elisa/Documents/Universidad/testing/TP2/Eclipse Workspace/TP2"); 
    java.lang.System.setProperty("user.home", "/Users/elisa"); 
    java.lang.System.setProperty("user.language", "es"); 
    java.lang.System.setProperty("user.name", "elisa"); 
    java.lang.System.setProperty("user.timezone", "America/Argentina/Cordoba"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BitChromosome_ESTest_scaffolding.class.getClassLoader() ,
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.ListVector",
      "ejercicio1.es.unileon.rnag.cubiga.gen.Gen",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.Range",
      "ejercicio1.es.unileon.rnag.cubiga.gen.BitGen",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.RangeVector",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.List",
      "ejercicio1.es.unileon.rnag.cubiga.gen.ListGen",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.RangeChromosome",
      "ejercicio1.es.unileon.rnag.cubiga.gen.RangeGen",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.ListChromosome"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BitChromosome_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.BitChromosome",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.GeneticType",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.ListVector",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.List",
      "ejercicio1.es.unileon.rnag.cubiga.gen.Gen",
      "ejercicio1.es.unileon.rnag.cubiga.gen.BitGen",
      "ejercicio1.es.unileon.rnag.cubiga.gen.ListGen",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.BitVector",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.Range",
      "ejercicio1.es.unileon.rnag.cubiga.datatypes.RangeVector",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.RangeChromosome",
      "ejercicio1.es.unileon.rnag.cubiga.gen.RangeGen",
      "ejercicio1.es.unileon.rnag.cubiga.chromosome.ListChromosome"
    );
  }
}
