/**
*	File:		MatrixRedux.java
*	Author:		Jimmy Smutek
*	Date:		August 28, 2018
*	Purpose:	Remixing Steven Gordons Matrix Effect
*/

//Import statements

public class MatrixRedux
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

	    // Set a random text color
        System.out.print(GenerateMatrixTextColor());

		//I was having issues with a while loop so I used an infinite for loop
		for(int i = 0;i >= 0;i++)
		{
			//Prints the characters in array letters randomly
			System.out.print(letters[GenerateRandomNumber(0,letters.length -1)]);

			//Adjust 0 to set delay(time in ms)
			try{Thread.sleep(0);}

			//Catch to avoid the program interrupting itself.
			catch(InterruptedException e){}
		}

		// Reset
        // Turns off ANSI attributes set so far,
        // to return the console to its defaults
        System.out.print("\u001B[0m");

	}

    /**
     * Returns a random color via ANSI escape code
     * Inspired by this SO thread: https://stackoverflow.com/a/5762502
     *
     * @return String A random ANSI color
     */
	private static String GenerateMatrixTextColor()
    {
        String[] colors = {
        "\u001B[30m", // black
        "\u001B[31m", // red
        "\u001B[32m", // green
        "\u001B[33m", // yellow
        "\u001B[34m", // blue
        "\u001B[35m", // purple
        "\u001B[36m", // cyan
        "\u001B[37m", // white
        };

        return colors[GenerateRandomNumber(0,colors.length -1)];

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