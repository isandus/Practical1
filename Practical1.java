import java.util.Random;
import java.util.Scanner;

public class Practical1 {

	public static void main(String[] args) {

		// Creating random.
		Random random = new Random();
		int[] randomNumbers = new int[500];
		// Generating.
		for(int i = 0; i < 500; i++) {
			
			randomNumbers[i] = random.nextInt(1000);
			
		}
		// Sorting numbers..
		for(int i = 0; i < randomNumbers.length; i++) {
			
			for(int j = 0; j < randomNumbers.length - i - 1; j++) {
				
				if(randomNumbers[j] > randomNumbers[j + 1]) {
					
					int swap = randomNumbers[j];
					randomNumbers[j] = randomNumbers[j + 1];
					randomNumbers[j + 1] = swap;
					
				}
				
			}
			
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter nth: ");
		int nth = scan.nextInt();
		if(nth > 0 && nth <= randomNumbers.length) {
			
			System.out.println("Nth Smallest Number: " + randomNumbers[nth - 1]);
			
		} else {
			
			System.out.println("Nth should be between 1 and 500.");
			
		}
		scan.close();
		
	}

}
