public class AerialVehicle {
	public char avmod; // model of the aerial vehicle
	public short avhgh; // height of craft in meters
	public short avlen; // lenght of craft in meters
	public short avwid; // width of craft in meters
	private char avfult; // type of fuel used
	private short avmxsp; // maximal speed of the craft kilometers per hour
	private short avmxalt; // maximal possible altitude in kilometers
	private byte avpilt; // number of pilots needed for craft
	public short avpmxps; // maximal number of passengers
	private boolean avap; // does have an autopilot?

	private doFillFuel(); // to perform a fuel filling
	private checkSens(); // to check onboard sensors
	private checkRad(); // to check radio communication
	public startEngin(); // to start the engines
	public releaseBreaks(); // to release a breaks
	public goUp(); // to take off
	public goPointB(); // to fly toword some point B
	public goLand(); // to land
	public stopEngin(); // to turn off the engines
	private doMainten(); // to perform some maintenance
	}