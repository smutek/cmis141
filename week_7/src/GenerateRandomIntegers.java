/*
 * File: GenerateRandomInteger.java
 * Author: Jimmy Smutek
 * Date: October 7, 2018
 * Purpose: This program creates a simple Java application to generate X random Integer values
 * between 0 and Y, it accepts command line arguments for entry of X and Y.
 */
public class GenerateRandomIntegers {
  public static void main(String[] args) {
    // X & Y (defaults)
    int intX = 0;
    int intY = 0;
    int count = 0;

    // Pull args from CLI
    // Arg 1 at array index 0
    intX = Integer.parseInt(args[0]);
    // Arg 2 at array index 1
    intY = Integer.parseInt(args[1]);

    // Tell folks what's about to happen
    System.out.println(intX + " numbers between 0 and " + intY);

    // Loop X times
    while (count < intX) {

      // Print a random number within range 0-Y
      System.out.println((count + 1) + ": " + (int) (Math.random() * ((intY) + 1)));

      count++;
    }
  }
}
