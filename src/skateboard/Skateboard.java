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
