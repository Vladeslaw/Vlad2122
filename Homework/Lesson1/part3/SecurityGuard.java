public class SecurityGuard extends Worker {
	public char grdrnk; // rank of the guard
	private boolean grdmil; // had a military training?
	public boolean grdgun; // armed with a gun?
	
	private doGuard(); // to guard a perimeter
	private doPatrool(); // to take a patrool within perimeter
}