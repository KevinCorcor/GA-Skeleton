/**
 * 
 */
public class GA_Integer extends GeneticAlgorithmFactory<EvaluatorsI,
                                                        SelectorsI,
                                                        ReproducersI,
                                                        MutatorsI> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Evaluator getEvaluator(EvaluatorsI evaluator) {
 
       if (EvaluatorsI.Rank == evaluator) {
          return new Rank();
 
       }
 
       return null;
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public Selector getSelector(SelectorsI selector) {
 
       if (SelectorsI.Tournament == selector) {
          return new Tournament();
 
       } else if (SelectorsI.Random == selector) {
          return new Random();
 
       } else if (SelectorsI.RouletteWheel == selector) {
          return new RouletteWheel();
       }
 
       return null;
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public Reproducer getReproducer(ReproducersI reproducer) {
 
       if (ReproducersI.Multiply == reproducer) {
          return new Multiply();
       }
 
       return null;
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public Mutator getMutator(MutatorsI mutator) {
 
        if (MutatorsI.Boundary == mutator) {
            return new Boundary();
        }
 
       return null;
    }
 }