package cosmicObject;

public class CosmicObject {

	private String cosmicObjectId; 
	private String cosmicObjectPrevailimgElement;
	private double cosmicObjectDiameter;
	private double cosmicObjectSquare;
	private double cosmicObjectMass;
	private double cosmicObjectSpeed;
	private double cosmicObjectDistance;
	private double cosmicObjectAge;
	private int cosmicObjectSatellites;
	private boolean isCosmicObjectObservable;

	public CosmicObject (String id, double age) {
		cosmicObjectId = id;
		cosmicObjectAge = age;
		
	}
    	  
	public CosmicObject (double diam, double squar, double mass, double speed) {
		cosmicObjectDiameter = diam;
		cosmicObjectSquare = squar;
		cosmicObjectMass = mass;
		cosmicObjectSpeed = speed;	
    }
		// getter setter for ID
	public String getCosmicObjectId() {
    	return cosmicObjectId;
    }
    
    public void setCosmicObjectId (String cosmicObjectId) {
    	this.cosmicObjectId=cosmicObjectId;
    }
	    
    // getter setter for prevailing element
    public String getCosmicObjectPrevailimgElement() {
    	return cosmicObjectPrevailimgElement;
    }
    
    public void setCosmicObjectPrevailimgElement (String cosmicObjectPrevailimgElement) {
    	this.cosmicObjectPrevailimgElement=cosmicObjectPrevailimgElement;
    }
	    
    // getter setter for diameter
    public double getCosmicObjectDiameter() {
    	return cosmicObjectDiameter;
    }
    
    public void setCosmicObjectDiameter (double cosmicObjectDiameter) {
    	this.cosmicObjectDiameter=cosmicObjectDiameter;
    }
        
    // getter setter for square
    public double getCosmicObjectSquare() {
    	return cosmicObjectSquare;
    }
    
    public void setCosmicObjectSquare (double cosmicObjectSquare) {
    	this.cosmicObjectSquare=cosmicObjectSquare;
    }
    
        // getter setter for mass
    public double getCosmicObjectMass() {
    	return cosmicObjectMass;
    }
    
    public void setCosmicObjectMass (double cosmicObjectMass) {
    	this.cosmicObjectMass=cosmicObjectMass;
    }
    
        // getter setter for speed
    public double getCosmicObjectSpeed() {
    	return cosmicObjectSpeed;
    }
    
    public void setCosmicObjectSpeed (double cosmicObjectSpeed) {
    	this.cosmicObjectSpeed=cosmicObjectSpeed;
    }
    
    public static void main(String[] args) {
        
    CosmicObject mySample = new CosmicObject("mw12s2c7", 2.1);
    CosmicObject mySample2 = new CosmicObject("an45s8c4", 0.45);
    CosmicObject mySample3 = new CosmicObject(32.4, 1340, 46504, 42);
    
    mySample.setCosmicObjectPrevailimgElement("Iridium");
    
    
    
    System.out.println("\n"+"Cosmic object ID is: "+mySample.getCosmicObjectId()+". Pprevailing chemical element: "+mySample.getCosmicObjectPrevailimgElement()+
    		". Age in millions of years: "+mySample.cosmicObjectAge);
    
    System.out.println("\n"+"Cosmic object ID is: "+mySample2.getCosmicObjectId()+". Pprevailing chemical element: "+mySample2.getCosmicObjectPrevailimgElement()+
    		". Age in millions of years: "+mySample2.cosmicObjectAge);
    
    System.out.println("\n"+"Cosmic object diameter in km is: "+mySample3.getCosmicObjectDiameter()+". Cosmic object square in square km is: "+mySample3.getCosmicObjectSquare()+
    		". Cosmic object total mass in millions of kg is: "+mySample3.getCosmicObjectMass()+". Cosmic object speed in km/hour is: "+
    		mySample3.getCosmicObjectSpeed());
    
}

}


	