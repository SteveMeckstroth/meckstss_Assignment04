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
