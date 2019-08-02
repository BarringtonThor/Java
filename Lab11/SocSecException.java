//Barrington Thorpe
//Lab11

public class SocSecException extends Exception {

	private static final long serialVersionUID = 1L;

	public SocSecException(String error) {
		super("Invalid the social security number, " + error);
	}
}