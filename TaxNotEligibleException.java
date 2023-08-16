//exception class for checking employee salary


package Thursday_10_Aug;

@SuppressWarnings("serial")

public class TaxNotEligibleException extends Exception {

	
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
