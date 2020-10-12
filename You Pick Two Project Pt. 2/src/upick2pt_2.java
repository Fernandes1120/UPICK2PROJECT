/**
 * @author Aidan (School)
 *
 */

import java.util.Random;

public class upick2pt_2 {

	public static void main(String[] args) {

		System.out.println("This is the dice rolling machine. It rolls a virtual die and prints the results in the console");
		System.out.println("Once the dice rolling machine (DRM) has finished rolling 20 times, the program ends");
		System.out.println("");

		Random diceRoll = new Random();

		int randomNum = 0;

		for(int i = 0; i < 20; i++) {
			for(int counter=1; counter<=1; counter++) {
				randomNum = 1+diceRoll.nextInt(6);
				System.out.println(randomNum);
			}
		}
	}
}