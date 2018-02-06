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
	public Boolean isGoing() {
		return isRolling;
	}

	@Override
	public Boolean start() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean stop() {
		// TODO Auto-generated method stub
		return null;
	}


}
