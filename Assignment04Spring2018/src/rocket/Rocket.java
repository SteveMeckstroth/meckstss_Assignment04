package rocket;

/**
 * A SpaceX passenger rocket on the launch pad
 * @author nicomp
 *
 */
public class Rocket implements Vehicle {

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


}
