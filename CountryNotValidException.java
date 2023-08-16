//exception class for checking country

package Thursday_10_Aug;


@SuppressWarnings("serial")
public class CountryNotValidException  extends Exception {

	public CountryNotValidException(String message) {
		super(message);
	}
}
