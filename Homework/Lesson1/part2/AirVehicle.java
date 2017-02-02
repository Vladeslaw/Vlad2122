package airVehicle;

public class AirVehicle {

	private String airVehicleModel;
	private double airVehicleHeight;
	private double airVehicleLength;
	private double airVehicleWidth;
	private String airVehicleFuelType;
	private int airVehicleMaxSpeed;
	private int airVehicleMaxAltitude;
	private int airVehicleNumberOfPilots;
	private int airVehicleMaxPassaengersNumber;
	private boolean isAirVehicleAutopilot; 
	
	public AirVehicle(String model, double height, double length, double width,  boolean ap) {
		
	airVehicleModel = model;
	airVehicleHeight = height;
	airVehicleLength = length;
	airVehicleWidth = width;
	isAirVehicleAutopilot = ap;
	}
	
	// air vehicle model getter and setter
    public String getAirVehicleModel() {
    	return airVehicleModel;
    }
    public void setAirVehicleModel (String airVehicleModel) {
    	this.airVehicleModel=airVehicleModel;
}

	// air vehicle height getter and setter
    public double getAirVehicleHeight() {
    	return airVehicleHeight;
    }
    public void setAirVehicleHeight (double airVehicleHeight) {
    	this.airVehicleHeight=airVehicleHeight;
}

	// air vehicle length getter and setter
    public double getAirVehicleLength() {
    	return airVehicleLength;
    }
    public void setAirVehicleLength (double airVehicleLength) {
    	this.airVehicleLength=airVehicleLength;
}

	// air vehicle width getter and setter
    public double getAirVehicleWidth() {
    	return airVehicleWidth;
    }
    public void setAirVehicleWidth (double airVehicleWidth) {
    	this.airVehicleWidth=airVehicleWidth;
}

	// air vehicle autopilot getter and setter
    public boolean getIsAirVehicleAutopilot() {
    	return isAirVehicleAutopilot;
    }
    public void setIsAirVehicleAutopilot (boolean isAirVehicleAutopilot) {
    	this.isAirVehicleAutopilot=isAirVehicleAutopilot;
}

	// air vehicle number of pilots getter and setter
    public int getAirVehicleNumberOfPilots () {
    	return airVehicleNumberOfPilots;
    }
    public void setAirVehicleNumberOfPilots(int airVehicleNumberOfPilots) {
    	this.airVehicleNumberOfPilots=airVehicleNumberOfPilots;
}


public static void main(String[] args) {
    
    AirVehicle myVehicle = new AirVehicle("C-130", 5.5, 30.2, 35, true);
    AirVehicle myVehicle2 = new AirVehicle("OV-22", 4.6, 14.5, 18, false);
    AirVehicle myVehicle3 = new AirVehicle("FN-11", 3.2, 9.1, 12.7, true);
    
    myVehicle.setAirVehicleNumberOfPilots(3);
	myVehicle2.setAirVehicleNumberOfPilots(2);
	myVehicle2.setAirVehicleModel("OV-23");
	myVehicle3.setIsAirVehicleAutopilot(true);
	
 
    
    System.out.println("Air vehicle model: "+myVehicle.getAirVehicleModel()+"; its height, length  and width are: "+
    		myVehicle.getAirVehicleHeight()+"x"+myVehicle.getAirVehicleLength()+"x"+myVehicle.getAirVehicleLength()+" meters"+
    		"; number of needed pilots: "+myVehicle.getAirVehicleNumberOfPilots()+"; autopilot available: "+myVehicle.getIsAirVehicleAutopilot());
    
    System.out.println("Air vehicle model: "+myVehicle2.getAirVehicleModel()+"; its height, length  and width are: "+
    		myVehicle2.getAirVehicleHeight()+"x"+myVehicle2.getAirVehicleLength()+"x"+myVehicle2.getAirVehicleLength()+" meters"+
    		"; number of needed pilots: "+myVehicle2.getAirVehicleNumberOfPilots()+"; autopilot available: "+myVehicle2.getIsAirVehicleAutopilot());
    
    System.out.println("Air vehicle model: "+myVehicle3.getAirVehicleModel()+"; its height, length  and width are: "+
    		myVehicle3.getAirVehicleHeight()+"x"+myVehicle3.getAirVehicleLength()+"x"+myVehicle3.getAirVehicleLength()+" meters"+
    		"; number of needed pilots: "+myVehicle3.getAirVehicleNumberOfPilots()+"; autopilot available: "+myVehicle3.getIsAirVehicleAutopilot());

	}

}
