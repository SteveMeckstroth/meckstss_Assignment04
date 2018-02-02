package vehicle;
/**
 * Control the vehicle, whatever type it is
 * @author nicomp
 *
 */
public interface Control {

	/**
	 * Start the vehicle
	 * @return True if it's stopped, false otherwise
	 */
	Boolean start();
	/**
	 * Stop the vehicle
	 * @return True if it's started, false otherwise
	 */
	Boolean stop();

}
