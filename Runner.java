

/**
 *  
 */
public class Runner {
    public static void main(String[] args) {
        
        // Creation
        //Population population = IntegerPopulation.populate();

        // need to do compon=siont here, send to ga class
        //////////////////////////////////////////////////////////////////
        GeneticAlgorithmFactory GA_BinaryFactory= FactoryProducer.getFactory(FactoryProducer.Factory.GA_Integer);
        //Population population = GA_BinaryFactory.getPopulation("BinaryPopulation");

        // GeneticAlgorithm ga = new GeneticAlgorithm(population);
        // ga.set_evaluator(GA_BinaryFactory.getEvaluator(GA_Binary.Evaluators.Length));
        // ga.set_selector(GA_BinaryFactory.getSelector(GA_Integer.Selectors.Tournament));
        // ga.set_reproducer(GA_BinaryFactory.getReproducer(GA_Binary.Reproducers.SinglePoint));
        // ga.set_mutator(GA_BinaryFactory.getMutator(GA_Binary.Mutators.RandomBitFlip));

        // int count = 0;
        // do{
        //     if (count == 3){
        //         ga.set_selector(GA_BinaryFactory.getSelector(GA_Integer.Selectors.RouletteWheel));
        //     }

        //     System.out.println("iteration " + count + ":");
        //     // Evaluation
        //     System.out.print("\t");
        //     ga.runEvaluator();
        //     // Selection
        //     System.out.print("\t");
        //     ga.runSelector();
        //     // Reproduction
        //     System.out.print("\t");
        //     ga.runReproducer();
        //     // Mutation
        //     System.out.print("\t");
        //     ga.runMutator();
        //     count++;
        // }while(count < 5);




    }
}