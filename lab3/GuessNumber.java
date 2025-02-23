import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		int number =rand.nextInt(100);
		int cnt = 1;
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		do {

			int guess = reader.nextInt();
			if (guess == -1) {
				System.out.println("Sorry, the number was " + number);
				break;
			} else if (guess == number) {
				System.out.println("Congratulations! ");
				System.out.println("You won after "+ cnt + " attempts!");
				break;
			} else {
				cnt = cnt +1;
				System.out.println("Sorry!");
				if (guess > number) {
					System.out.println("Mine is less than your guess!");
				}else{
					System.out.println("Mine is grater than your guess!");
				}
				System.out.print("Type -1 to quit or guess another:");
			}
		}while (true);

		reader.close();
	}

	
}