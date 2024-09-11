package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		 System.out.println("What is the amount of money you start with?");
	        double startAmount = scan.nextDouble();
	        
	        // Ask for number of studios attended
	        System.out.println("What is the chance of you winning?");
	        double winChance = scan.nextDouble();

	        // Ask for average quiz grade
	        System.out.println("What amount of money would you be satisfied with?");
	        double winLimit = scan.nextDouble();
        
	        int totalPlays = 0;
			
	   
			// 2. test the loop variable
			while (startAmount > 0 && startAmount < winLimit) {
				double rand = Math.random();
				if (rand > winChance) {
					startAmount --;
					totalPlays ++;
				}
				if (rand < winChance) {
					startAmount ++;
					totalPlays ++;
					
				System.out.println("play" + totalPlays + ": Win! Current balance:" + startAmount );
				} else {
					startAmount--;
					System.out.println("play" + totalPlays + ": Loss. Current balance:"  + startAmount);
				}
				
					
				
				if (startAmount >= winLimit) {
					System.out.println("Success!");
				} else {
					System.out.println("Ruin!");
				}
				
					
			}
        

	}

}
