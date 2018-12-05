/**
 * 
 */

public class GA_Binary extends GeneticAlgorithmFactory <EvaluatorsB, 
                                                        SelectorsB,
                                                        ReproducersB,
                                                        MutatorsB> {

   /**
    * {@inheritDoc}
    */
   @Override
   public Evaluator getEvaluator(EvaluatorsB evaluator) {

      if (EvaluatorsB.Length == evaluator) {
         return new Length();

      } else if (EvaluatorsB.Ratio == evaluator) {
         return new Ratio();
      }

      return null;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Selector getSelector(SelectorsB selector) {

      if (SelectorsB.Tournament == selector) {
         return new Tournament();

      } else if (SelectorsB.Random == selector) {
         return new Random();

      } else if (SelectorsB.RouletteWheel == selector) {
         return new RouletteWheel();
      }

      return null;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Reproducer getReproducer(ReproducersB reproducer) {

      if (ReproducersB.TwoPoint == reproducer) {
         return new TwoPoint();

      } else if (ReproducersB.SinglePoint == reproducer) {
         return new SinglePoint();

      } else if (ReproducersB.UniformPoint == reproducer) {
         return new UniformPoint();
      }

      return null;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Mutator getMutator(MutatorsB mutator) {

      if (MutatorsB.RandomBitFlip == mutator) {
         return new RandomBitFlip();
      }

      return null;
    }
}