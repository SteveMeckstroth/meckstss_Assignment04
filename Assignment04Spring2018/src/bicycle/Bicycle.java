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


}
