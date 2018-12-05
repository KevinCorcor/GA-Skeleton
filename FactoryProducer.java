/**
 * 
 */
public class FactoryProducer {

    enum Factory {
        GA_Binary, GA_Integer;
    }

    /**
     * 
     * @param choice
     * @return
     */
    public static GeneticAlgorithmFactory getFactory(Factory f){
    
        if(f == Factory.GA_Binary){
            return new GA_Binary();  
        }else         if(f == Factory.GA_Integer){
            return new GA_Integer();
        }
        return null;
    }
}