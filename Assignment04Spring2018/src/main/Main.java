package main;

import bicycle.Bicycle;
import rocket.Rocket;
import skateboard.Skateboard;

/**
 * Test main for the Vehicle class and the hierarchy beneath it
 * @author nicomp
 *
 */
public class Main {
	public static void main(String[] args) {
		int testPassed = 0, testFailed = 0;

		/* Test the Rocket class */
		Rocket rocket = new Rocket();
		if (!rocket.isGoing()) {
			System.out.println("Rocket is NOT going.");
			testPassed++;
		} else {testFailed++;}

		rocket.start();

		if (rocket.isGoing()) {
			System.out.println("Rocket is going as expected.");
			testPassed++;
		} else {testFailed++;}

		/* Test the Bicycle class */
		Bicycle bicycle = new Bicycle();

		if (!bicycle.isGoing()) {
			System.out.println("Bicycle is NOT going.");
			testPassed++;
		} else {testFailed++;}

		bicycle.start();

		if (bicycle.isGoing()) {
			System.out.println("Bicycle is going as expected.");
			testPassed++;
		} else {testFailed++;}

		/* Test the Skateboard class */
		Skateboard skateboard = new Skateboard();
		if (!skateboard.isGoing()) {
			System.out.println("Skateboard is NOT going.");
			testPassed++;
		} else {testFailed++;}

		skateboard.start();

		if (skateboard.isGoing()) {
			System.out.println("Skateboard is going as expected.");
			testPassed++;
		} else {testFailed++;}

		System.out.println(testPassed + " tests passed, " + testFailed + " tests failed.");
		System.out.println((testFailed > 0) ? "SOME TESTS FAILED." : "ALL TESTS PASSED");

	}
}
