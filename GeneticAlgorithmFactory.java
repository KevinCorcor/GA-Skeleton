

/**
 *
 * 
 */

public abstract class GeneticAlgorithmFactory <W extends Enum<W> & enums, 
                                               X extends Enum<X> & enums, 
                                               Y extends Enum<Y> & enums, 
                                               Z extends Enum<Z> & enums>{
    
    /**
     * 
     * @param evaluator
     * @return
     */
    abstract Evaluator getEvaluator(W evaluator);

    /**
     * 
     * @param selector
     * @return Selector subclass specified
     */
    abstract Selector getSelector(X selectors);

    /**
     * 
     * @param reproducer
     * @return
     */
    abstract Reproducer getReproducer(Y reproducer);

    /**
     * 
     * @param mutator
     * @return
     */
    abstract Mutator getMutator(Z mutator);
}