
//exception class for checking employee name is empty or not
package Thursday_10_Aug;

public class EmployeeNameInvalidException   extends Exception{

	
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
