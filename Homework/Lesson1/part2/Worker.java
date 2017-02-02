package worker;

public  class Worker {
		//attributes
	private String workerFirstName; 
	private String workerSecondName; 
	private String workerGender; 
	private int workerAge; 
	private int workerCurrentExpeirence; 
	private int workerGeneralExpeirence; 
	private int workerSubordinates; 
	private int workerVacations; 
	private int workerSalary; 
	private boolean isWorkerSaturdays; 
	private boolean isWorkerBadHabits; 
	
	//constructor
    public Worker (String name, String sname, int exp, int gexp, int age, boolean habits) {
    	workerFirstName = name;
    	workerSecondName = sname;
    	workerCurrentExpeirence = exp;
    	workerGeneralExpeirence = gexp;
    	workerAge = age;
    	isWorkerBadHabits = habits;
    	
    }
    // name getter 1
    public String getWorkerFirstName() {
    	return workerFirstName;
    }
    //name setter 1
    public void setWorkerFirstName (String workerFirstName) {
    	this.workerFirstName=workerFirstName;
    }
    //exp getter 2 
    public int getWorkerCurrentExpeirence() {
    	return workerCurrentExpeirence;
    }
    //exp setter 2
    public void setWorkerCurrentExpeirence (int workerCurrentExpeirence) {
    	this.workerCurrentExpeirence=workerCurrentExpeirence;
    }
    //gexp setter 3
    public int getWorkerGeneralExpeirence() {
    	return workerGeneralExpeirence;
    }
    //gexp setter 3
    public void setWorkerGeneralExpeirence (int workerGeneralExpeirence) {
    	this.workerGeneralExpeirence=workerGeneralExpeirence;
    }
    
    //sname setter 4
    public String getWorkerSecondName() {
    	return workerSecondName;
    }
    //sname setter 4
    public void setWorkerSecondName (String workerSecondName) {
    	this.workerSecondName=workerSecondName;
    }
    
    //age setter 5
    public int getworkerAge() {
    	return workerAge;
    }
    //age setter 5
    public void setWorkerAge (int workerAge) {
    	this.workerAge=workerAge;
    }
    
    //sat setter 6
    public boolean getIsWorkerSaturdays() {
    	return isWorkerSaturdays;
    }
    //sat setter 6
    public void setIsWorkerSaturdays (boolean isWorkerSaturdays) {
    	this.isWorkerSaturdays=isWorkerSaturdays;
    }
    
    //main method where we are creating instances of our class
    public static void main(String[] args) {
    
    Worker myInstance = new Worker("Vlad", "Shults", 1, 3, 26, false);
    Worker myInstance2 = new Worker("Sergiy", "Maksiuta", 1, 3,  35, true);
    Worker myInstance3 = new Worker("Lena", "Ford", 10, 30, 45, false);
    
    myInstance.setWorkerFirstName("Anton");
    myInstance.setWorkerCurrentExpeirence(2);
    myInstance2.setWorkerCurrentExpeirence(20); 
    myInstance2.setWorkerGeneralExpeirence(35); 
    myInstance3.setIsWorkerSaturdays(true);
    
    System.out.println("The name of the second worker is "+myInstance2.getWorkerFirstName()+" "+myInstance2.getWorkerSecondName()+","
    		+ "\n his experience is "+myInstance2.getWorkerCurrentExpeirence()+" years"+","+" \n his general expierence is "+myInstance2.workerGeneralExpeirence+" years");
    
    System.out.println("The name of the second worker is "+myInstance.getWorkerFirstName()+" "+myInstance.getWorkerSecondName()+","
    		+ "\n his experience is "+myInstance.getWorkerCurrentExpeirence()+" years"+","+" \n his general expierence is "+myInstance.workerGeneralExpeirence+" years");
    
    System.out.println("The name of the second worker is "+myInstance3.getWorkerFirstName()+" "+myInstance3.getWorkerSecondName()+","+"\n her age is " 
    		+myInstance3.workerAge+ "\n her experience is "+myInstance3.getWorkerCurrentExpeirence()+" years"+","+" \n her general expierence is "
    		+myInstance3.workerGeneralExpeirence+" years"+","+" \n works on saturdays: "+myInstance3.isWorkerSaturdays);
    
    
    }
	
}

	


//	public goToWork(); // to go to work
//	public goToHome(); // to go home
//	public goToBreak(); // to take a break
//	public goToAssig(); // to go to assigment
//	public doReport(); //to make a report
//	public goNight(); // to attend a night shift
//	public moveToMeet(); // to attend a meeting
//	public createMeet(); // to assign a meeting
//	public getPay(); // to get a payment
//	public sendEmail(); // to send an email
//	public recEmail(); // to receive an email

//what's the difference between:
//+myInstance2.getWorkerFirstName()
//and
//+myInstance2.WorkerFirstName
