/**
 * 
 */
public class GeneticAlgorithm {

    private Population population;
    private Evaluator evaluator;
    private Selector selector;
    private Reproducer reproducer;
    private Mutator mutator;

    /**
     * 
     * @param population
     */
    public GeneticAlgorithm(Population population) {
        this.population = population;
    }

    /**
     * 
     * @param reproducer
     */
    public void set_reproducer(Reproducer reproducer) {
        this.reproducer = reproducer;
    }

    /**
     * 
     * @param mutator
     */
    public void set_mutator(Mutator mutator) {
        this.mutator = mutator;
    }

    /**
     * 
     * @param selector
     */
    public void set_selector(Selector selector) {
        this.selector = selector;
    }

    /**
     * 
     * @param evaluator
     */
    public void set_evaluator(Evaluator evaluator) {
        this.evaluator = evaluator;
    }

    /**
     * Runs the set selector for the specified Genetic Algorithm
     */
    public void runSelector() {
        if (selector != null){
            this.selector.select();
        }
        else{
            System.out.println("No selector has been set");
        }
        
    }

    /**
     * 
     */
    public void runEvaluator() {
        this.evaluator.evaluate();
    }

    /**
     * 
     */
    public void runMutator() {
        this.mutator.mutate();
    }
    
    /**
     * 
     */
    public void runReproducer() {
        this.reproducer.reproduce();
    }
}