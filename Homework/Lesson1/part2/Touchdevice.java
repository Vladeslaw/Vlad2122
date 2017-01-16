public class Touchdevice {
	public char tdven; // vendor of the device
	public char tdmod; // model of the device
	private int tdweig; // device weight in grams
	private short tdheig; // device height in milimiters
	private short tdwid; // device width in milimiters 
	private short tdlen; // device lenght in milimiters
	public char tdcol; // device color
	public float tdscrdiag; // screen diagonale lenght in inches
	public int tdmem; // device memory in megabytes
	public byte tdprocc; // number of processor cores within device
	private float tdprocf; // frequency of device's CPU
	public boolean tdcam; // availability of camers
	public boolean tdmemc; // availability of memory card
	
	public makeOn(); // to turn on the device
	public makeOff(); // to turn off the device 
	public makeLock(); // to set device on lock
	public makeUnlock(); // to unlock the device
	private setBrt(); // to set a brightness of a device
	private setVol(); // to set a device speakers volume 
	public setClk(); // to set a clock in the device 
	public runVid(); // to play a video on the device
	public runAud(); //to play an audio on the device
	private recVoic(); // to record a voice onto device
	public conWifi(); // to connect to some wifi
	public writeTxt(); // to write some text on device
}

