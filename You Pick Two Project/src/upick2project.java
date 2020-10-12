import java.util.Scanner;
import java.util.Random;

public class upick2project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the very generic game of...Guess the Number!");
		
		Scanner difficultyChoice = new Scanner(System.in);
		
		System.out.println("Select parameters below. 1 = 1-15, 2 = 1-25, and 3 = 1-50");
		
		String choice = difficultyChoice.nextLine();
		
		int selection = 0;
		
		do {
			if(choice.equals("1")){
				selection = 1;

			} else if(choice.equals("2")) {
				selection = 2;

			} else if(choice.equals("3")) {
				selection = 3;
			}
			if(selection == 0) {
				System.out.println("Invalid entry. Please try again. Remember* 1 for 1-25, 2 for 1-50, and 3 for 1-100");
				choice = difficultyChoice.nextLine();
			}
			
			
		} while(selection ==0);
		
		Random computerNumber = new Random();

		int randomNum = 0;

		if(selection == 1){

			for(int counter=1; counter<=1; counter++) {
				randomNum = 1+computerNumber.nextInt(15);
				System.out.println("The computer has chosen a number 1-15. You have 3 guesses. If your third guess is incorrect, you lose.");
			}
		}


		if(selection == 2){

			for(int counter=1; counter<=1; counter++) {
				randomNum = 1+computerNumber.nextInt(25);
				System.out.println("The computer has chosen a number 1-25. You have 3 guesses. If your third guess is incorrect, you lose.");
			}
		}


		if(selection == 3){

			for(int counter=1; counter<=1; counter++) {
				randomNum = 1+computerNumber.nextInt(50);
				System.out.println("The computer has chosen a number 1-50. You have 3 guesses. If your third guess is incorrect, you lose.");
			}
		}

		int guessTotal = 0;

		Random RandomNum = computerNumber;                            

		Scanner playerGuess1 = new Scanner(System.in);

		System.out.println("Please enter your first guess on the line below: ");

		int guess1 = playerGuess1.nextInt();

		if(guess1 == randomNum) {
			System.out.println("Correct, you guessed the right number on your first try!");
			System.exit(0);
		}
		
		if(guess1 != randomNum) {
			guessTotal = 1;
			System.out.println("The number you guessed is incorrect (guesses remaining = 2)");
			if(guess1 > randomNum) {
				System.out.println("The number you guessed was greater than the computer's number");
			}else
			{
				if(guess1 < randomNum) {
					System.out.println("The number you guessed was less than the computer's number");

				}
			}

		}

		Scanner playerGuess2 = new Scanner(System.in);
		System.out.println("												");

		System.out.println("Please enter your second guess on the line below: ");

		int guess2 = playerGuess2.nextInt();

		if(guess2 == randomNum) {
			System.out.println("Correct, you guessed the right number on your second try!");
			System.exit(0);
		}

		if(guess2 != randomNum) {
			guessTotal = 2;
			System.out.println("The number you guessed is incorrect (guesses remaining = 1)");
			if(guess2 > randomNum) {
				System.out.println("The number you guessed was greater than the computer's number");
			} else {
				if(guess2 < randomNum) {
					System.out.println("The number you guessed was less than the computer's number");

				}
			}
		}

		Scanner playerGuess3 = new Scanner(System.in);
		System.out.println("												");

		System.out.println("Please enter your third guess on the line below: ");

		int guess3 = playerGuess3.nextInt();

		if(guess3 == randomNum) {
			System.out.println("Correct, you guessed the right number on your third try!");
		}

		if(guess3 != randomNum) {
			guessTotal = 3;
			System.out.println("The number you guessed is incorrect (guesses remaining = 0) Game over!");
			/*if(guess3 > randomNum) {
				System.out.println("The number you guessed was greater than the computer's number");
			} else {
				if(guess3 < randomNum) {
					System.out.println("The number you guessed was less than the computer's number");

				}
				*/
			}
			System.out.println("									");
			System.out.println("The correct number was " + randomNum);
		}

	}
//}

