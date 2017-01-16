public class Musinstrument {
	public char mimat; // main material from which instrument is made of
	private char mivend; // manufacturer of instrument
	private float miweig ; // instrument weight in kilograms
	public float miheig; // instrument height in meters
	public float miwid; // instrument width in meters
	public float milen; // instrument lenght in meters
	public short midb; // instrument max volume level in decebels
 	private short mikys; // number of keys in instrument
	private char mipip; // number of pipes in instrument
	private char mistr; // number of strings in instrument							
	private char miprt; // does the instrument can be moved freely by one person	
		
	public takeHold(); // to grab an instrument
	public placeHnds(); // to place hands on instrument
	public moveKns(); // to place instrument between a knees
	public doSit(); // to sit by an instrument
	public doCln(); // to clean an isntrument
	public playNot(); // to play all notes
	public playSeven(); // to play the 7 Symphony
	public doDassem(); // to disassemble an instrument
	public doAssemb(); // to assemble an instrument
	public moveHlst(); // to place an instrument into its holster
	
}

