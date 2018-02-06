/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: An assignment to learn interfaces and inheritance
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: Original code (before alterations) available at https://github.com/nicomp42/IT2045Assignment04Spring2018
 */
package rocket;

import vehicle.Vehicle;

/**
 * A SpaceX passenger rocket on the launch pad
 * @author nicomp
 *
 */
public class Rocket extends Vehicle {

	/**
	 * If true, Rocket is going
	 */
	private boolean isFuseLit;

	public Rocket() {
		stop();
	}

	/**
	 * Is the Rocket moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isFuseLit;
	}
	/**
	 * Light the fuse!
	 */
	@Override
	public boolean start() {
		isFuseLit = true;
		return true;
	}
	/**
	 * Abort the launch!
	 */
	@Override
	public boolean stop() {
		isFuseLit = false;
		return true;
	}


}
