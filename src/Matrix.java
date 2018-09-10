/**
*	File:		Matrix.java
*	Author:		Steven Gordon
*	Date:		August 28, 2018
*	Purpose:	Simulate the matrix effect on the screen
*/

//Import statements
import java.lang.Object;
import java.lang.Math;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Matrix
{
	public static void main(String[] args)
	{
		//Storing the characters to rain down the screen.
		String[] letters = {	"A","B","C","D","E","F","G","H","I","J",			 								"K","L","M","N","O","P","Q","R","S","T",
					"U","V","W","X","Y","Z",
					"a","b","c","d","e","f","g","h","i","j",
					"k","l","m","n","o","p","q","r","s","t",
					"u","v","w","x","y","z","1","2","3","4",
					"5","6","7","8","9","0","`","~","!","@",
					"#","$","%","^","&","*","(",")","-","_",
					"=","+","                             ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","    ",
					" ","  ","   ","     ","       ","     "
				   };
		//Function call that prints the above characters.
		MatrixCode(letters);


	}


	/*
	* This function takes in an array of type String and references it as letters.
	* All characters that are in this string are than chosen at random and pushed to the
	* cmd line. Speed can be adjusted with the "try{Thread.slee(0);}" line. You replace '0'
	* with how long you want the program to pause before each letter in milliseconds.
	*/
	public static void MatrixCode(String[] letters)
	{
		//I was having issues with a while loop so I used an infinite for loop
		for(int i = 0;i >= 0;i++)
		{
      // Prints the characters in array letters randomly
      System.out.print(
          "\u001B[33m" + letters[GenerateRandomNumber(0, letters.length - 1)] + "\u001B[0m");

			//Adjust 0 to set delay(time in ms)
			try{Thread.sleep(0);}

			//Catch to avoid the program interrupting itself.
			catch(InterruptedException e){}
		}
	}


	/*
	* This function returns a random number between a given minimum(min) and a maximum(max).
	*/
	public static int GenerateRandomNumber(int min, int max)
	{
		//Error checking to make sure our minimum is not more than our maximum.
		if(min > max){
			System.exit(0);
		}
		//Casting our return statement as an integer.
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}