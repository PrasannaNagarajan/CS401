package Lab3;

import java.util.Scanner;
import java.util.Random;
public class Diceroll {

	public static void main(String[] args) {
		
		//creating objects
		Random randomNumber = new Random();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			//Asking for user input
			System.out.println("\nEnter The Amount You Want To Roll");
			
			int rollAmount = input.nextInt();
			
			rollDice(rollAmount, randomNumber);
			
			//Asking if user wants to continue
			System.out.println("Would you like to continue???\ny\n");
			
			String question = input.next();
			
			if(question.equals("y")) {
				continue;
			} else {
				System.out.println("\nSee You Later! :)");
				break;
			}
		}
		
	}
	
	public static void rollDice(int num, Random rand) {
		
		//possible outcome counters
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		int eleven = 0;
		int twelve = 0;
		
		//rolled num variables
		int rNum1 = 0;
		int rNum2 = 0;
		
		//Rolling dice entered amount of times
		for(int i = 0; i < num; i++) {
			rNum1 = rand.nextInt(6) + 1;
			rNum2 = rand.nextInt(6) + 1;
			
			int total = rNum1 + rNum2;
			
			switch(total) {
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
				case 7:
					seven++;
					break;
				case 8:
					eight++;
					break;
				case 9:
					nine++;
					break;
				case 10:
					ten++;
					break;
				case 11:
					eleven++;
					break;
				case 12:
					twelve++;
					break;
			}
		}
		
		//printing results
		System.out.println("\nHERE ARE THE RESULTS!");
		System.out.println("2       " + two + "/" + num + "While the expected value was 1/36");
		System.out.println("3       " + three + "/" + num + "While the expected value was 2/36");
		System.out.println("4       " + four + "/" + num + "While the expected value was 3/36");
		System.out.println("5       " + five + "/" + num + "While the expected value was 4/36");
		System.out.println("6       " + six + "/" + num + "While the expected value was 5/36");
		System.out.println("7       " + seven + "/" + num + "While the expected value was 6/36");
		System.out.println("8       " + eight + "/" + num + "While the expected value was 5/36");
		System.out.println("9       " + nine + "/" + num + "While the expected value was 4/36");
		System.out.println("10      " + ten + "/" + num + "While the expected value was 3/36");
		System.out.println("11      " + eleven + "/" + num + "While the expected value was 2/36");
		System.out.println("12      " + twelve + "/" + num + "While the expected value was 1/36");
		System.out.println("\n");
	}
	
}

