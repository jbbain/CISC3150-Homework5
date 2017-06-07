/***************************************************************************************************/
/*Jared Bain																			Homework #5*/
/*CISC3150																		   December 4, 2014*/
/***************************************************************************************************/


package file_io_homework;

import java.io.*;
import java.util.Scanner;

public class Rankings {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("c://BabyNameRanking.txt");
		Scanner input = new Scanner(file);
		int line = input.nextInt();
		//File newFile = new File ("c://Users/JBain/Documents/CISC 3150/newFile.txt");
		//newFile.createNewFile();
		PrintWriter output = new PrintWriter(file);
		 //output.print();
		while(line < 6)
		{
			String boyName = input.next();
			int boyAmount = input.nextInt();
			String girlName = input.next();
			int girlAmount = input.nextInt();
			
			
			output.print(boyName);
			output.print(boyAmount);
			output.println(girlName);
			output.print(girlAmount);
		}
		

	}

}


//I was unable to figure out how to read and create a new file properly
