/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: An assignment to learn interfaces and inheritance
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: Original code (before alterations) available at https://github.com/nicomp42/IT2045Assignment04Spring2018
 */
package bicycle;

import vehicle.Vehicle;

/**
 * A bicycle racing in the Tour de France
 * @author nicomp
 *
 */
public class Bicycle extends Vehicle {

	/**
	 * If true, bicycle is going
	 */
	private boolean isPedaling;

	public Bicycle() {
		stop();
	}

	/**
	 * Is the Bicycle moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isPedaling;
	}
	/**
	 * Start pedaling
	 */
	@Override
	public boolean start() {
		isPedaling = true;
		return true;
	}
	/**
	 * Stop pedaling
	 */
	@Override
	public boolean stop() {
		isPedaling = false;
		return true;
	}


}
