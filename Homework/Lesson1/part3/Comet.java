public class Comet extends CosmicObject {
	public int ctail; // comet tail lenght in kilometers
	private int corb; // period of comet full orbital cycle in years
	private float iceth; // thikness of the comet's ice in kilometers 
	
	private measureAppr(); // to predict a possibility of approach
	private measureColl(); // to count time until comet could collapse
}

