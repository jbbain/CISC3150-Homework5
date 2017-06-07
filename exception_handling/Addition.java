package exception_handling;
/***************************************************************************************************/
/*Jared Bain																			Homework #5*/
/*CISC3150																		   December 4, 2014*/
/***************************************************************************************************/

import java.util.*;

public class Addition {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		//Number inputs
		do{
			
		try{
			
			System.out.println("Enter first number: ");
			int numb1 = input.nextInt();
			
			System.out.println("Enter second number: ");
			int numb2 = input.nextInt();
			
			int sum = numb1 + numb2;
			System.out.println("The sum of those numbers are: " + sum);
			continueInput = false;
			
			
		}
		catch (InputMismatchException e){
			System.out.println("Sorry, that is not a number.....try again");
			e.printStackTrace();
			input.nextLine();
			
		}
	}
		
		while (continueInput);
		
	}
}
