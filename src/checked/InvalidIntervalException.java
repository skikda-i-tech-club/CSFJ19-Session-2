package checked;


public class InvalidIntervalException extends Exception {

  public InvalidIntervalException(int a, int b) {
    super(b + " < " + a);
  }

}
