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
