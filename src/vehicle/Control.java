/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: An assignment to learn interfaces and inheritance
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: Original code (before alterations) available at https://github.com/nicomp42/IT2045Assignment04Spring2018
 */
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
	boolean start();
	/**
	 * Stop the vehicle
	 * @return True if it's started, false otherwise
	 */
	boolean stop();
	/**
	 * Is the vehicle going somewhere (moving)
	 * @return True if it is going, false otherwise
	 */
	boolean isGoing();

}
