/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: An assignment to learn interfaces and inheritance
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: Original code (before alterations) available at https://github.com/nicomp42/IT2045Assignment04Spring2018
 */
package skateboard;

import vehicle.Vehicle;

/**
 * A skateboard at a skatepark, making a YouTube video
 * @author nicomp
 *
 */
public class Skateboard extends Vehicle {

	/**
	 * If true, Skateboard is going
	 */
	private boolean isRolling;
	
	/**
	 * Constructor
	 */
	public Skateboard() {
		stop();
	}

	/**
	 * Is the Skateboard moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isRolling;
	}
	/**
	 * Start rolling
	 */
	@Override
	public boolean start() {
		isRolling = true;
		return true;
	}
	/**
	 * Stop rolling
	 */
	@Override
	public boolean stop() {
		
		return true;
	}


}
