/**
 * Assignment 04
 * @author Stephen Meckstroth
 * Description: An assignment to learn interfaces and inheritance
 * Due Date: Feb 6, 2018
 * Course: IT2045 Section 001
 * email: meckstss@mail.uc.edu
 * Citations: Original code (before alterations) available at https://github.com/nicomp42/IT2045Assignment04Spring2018
 */
package airplane;

import vehicle.Vehicle;
/**
 * A flying machine that carries people through the air
 * @author Steve Meckstroth
 *
 */
public class Airplane extends Vehicle {
	private boolean inTheAir = false;
	/**
	 * Constructor
	 */
	public Airplane(){
		stop();
	}
	
	/**
	 * Airplane is considered started when it is in the air
	 */
	@Override
	public boolean start() {
		inTheAir = true;
		return inTheAir;
	}
	
	/**
	 * Airplane is no longer in the air, but report success for the action
	 */
	@Override
	public boolean stop() {
		inTheAir = false;
		return true;
	}
	
	/**
	 * Report true if inTheAir, false otherwise
	 */
	@Override
	public boolean isGoing() {
		
		return inTheAir;
	}

}
