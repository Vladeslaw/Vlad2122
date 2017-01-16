public class Cosmicobject{
	public char id; // full id of the cosmic object 
	private char elem; // prevailing chemical element of the cosmic object
	private float diam; // object diameter in kilometers
	private float sqr; // approximate object square in kilometers
	private float mas; // approximate object mass in millions of kilograms
	private float spd; // speed of object in realtion to observer in kilometers per hour
	public float dis; // distance from observer to object in kilometers
	public int age; // approximate age of the object in years
	public int satn; // nuber of satelites orbiting
	public boolean vis; // can be seen by observer without special equipment
	
	public doTrck(); // to do a tracking of the object
	public doFol(); // to follow an object
	public doAn(); // to do an anylyze of object
	public makeProb(); // to take a sample of object
	private doCol(); // to collect a whole object
	private doHarv(); // to harvest a material from object
	private chngTraj(); // to influence an object trajectory
	private doImp(); //  to initiate an impact onto object
	public makeStr(); // to place something on object
	private doFroz(); // to perform a frozing of the object
	private doHeat(); // to perform a heating of the object
}
