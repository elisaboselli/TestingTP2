package ejercicio1.es.unileon.rnag.cubiga.operator.selection;

import ejercicio1.es.unileon.rnag.cubiga.chromosome.Chromosome;

/**
 * Abstract class that encapsulate all the selection strategies
 * @author Adrian Casimiro �lvarez
 * @author Javier de Pedro L�pez
 *
 */
public abstract class SelectionStrategy implements SelectionOperator{
	
	// METHOD //
	/**
	 * Method that do the selection from a previous chromosome list (previous generation)
	 * @param previousGeneration The previous generation
	 * @return The new generation
	 */
	public abstract Chromosome[] doSelection(Chromosome[] previousGeneration);
}
