/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: A class that inherits from Skateboard
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: N/A
 */

package skateboard;


public class Hoverboard extends Skateboard {
	private boolean isFloating;
	
	/**
	 * Hoverboard constructor
	 */
	public Hoverboard(){
		stop();
	}
	/**
	 * Start hovering
	 */
	@Override
	public boolean start() {
		isFloating = true;
		return true;
	}
	/**
	 * Stop hovering
	 */
	@Override
	public boolean stop() {
		isFloating = false;
		return true;
	}
	/**
	 * Is the hoverboard off the ground
	 */
	@Override
	public boolean isGoing() {
		return isFloating;
	}
}
