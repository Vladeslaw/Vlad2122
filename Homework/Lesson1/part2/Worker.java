public class Worker {
	public char wonm; // worker first name
	public char wosur; // worker second name
	public char wognr; // worker gender
	private byte woag; // worker age
	public byte woxp; // expierense on current job
	private byte woaxp; // general expirieanse on previous jobs
	public short wosub // number of subordinates
	private byte wovoc // vocation days per year
	private int wosal; // monthly salary of the worker
	public boolean wosat // work saturdays
	private boolean wobhab // does a worker have bad habits (smolking, alchohol, drugs)?
	
	public goToWork(); // to go to work
	private goToHome(); // to go home
	private goToBreak(); // to take a break
	private goToAssig(); // to go to assigment
	public doReport(); //to make a report
	private goNight(); // to attend a night shift
	public moveToMeet(); // to attend a meeting
	public createMeet(); // to assign a meeting
	private getPay(); // to get a payment
	private sendEmail(); // to send an email
	private recEmail(); // to receive an email
}

