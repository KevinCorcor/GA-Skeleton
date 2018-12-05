/**
 * 
 */
public class BinaryPopulation implements Population
{
	private static int numPops;
	private static Population _instance;
	
	/**
	 * 
	 */
	private BinaryPopulation()
	{
		numPops++;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Population populate()   
	{
		if(_instance==null)
		{
			// multiple threads can not access this guard simultaneously,
			// thus performance is only affected once. 
			// lazy initialisation
			synchronized (BinaryPopulation.class) 
			{ 
				System.out.println("creation()");
				if(_instance==null)
				{
					_instance = new BinaryPopulation();
				}
			}
		}
		return _instance;
	}
	// public synchronized void updatePopulation(Chromosomes [] chromosomes){
    //     this.chromosomes = chromosomes;
	// }
	

}
