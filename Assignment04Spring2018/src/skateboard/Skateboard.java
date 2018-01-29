package skateboard;

/**
 * A skateboard at a skatepark, making a YouTube video
 * @author nicomp
 *
 */
public class Skateboard implements Vehicle {

	/**
	 * If true, Skateboard is going
	 */
	private boolean isRolling;

	public Skateboard Skateboard() {
		stop();
	}

	/**
	 * Is the Skateboard moving?
	 * @return True if it's moving, false otherwise
	 */
	public boolean isGoing() {
		return isRolling;
	}


}
