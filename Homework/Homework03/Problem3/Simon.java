import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Simon {



	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		String guess;
		String pattern = "";
		String[] colors = {"R","G","B","Y"};


		int n = 3;

		while (n > 0) {
			System.out.print("\033[H\033[2J");
			System.out.flush();

			Random random = new Random();
			int number = random.nextInt(3);
			String newPattern = pattern + colors[number];
			pattern = newPattern;
			//Temp print
			System.out.print(pattern);
			Thread.sleep(3000);

			System.out.print("\033[H\033[2J");
			System.out.flush();

			guess = input.nextLine();

			System.out.print("\033[H\033[2J");
			System.out.flush();
			Thread.sleep(1000);

			if(guess.equals(pattern)) {
				continue;
			} else {
				break;
			}
		}

		//System.out.println("Your score was: " + score);

		System.out.println("Do you want to play again?");

	}
}