/*
 * File: Week3DiscModified.java
 * Author: Caleb Smith
 * Modified by: Jimmy Smutek
 * Date: September 9, 2018
 * Purpose: This program will generate random
 * numbers x and y, where y = round(x / 2), then
 * generate random numbers from range 1-x until x
 * is chosen y times.
 */

public class WeekThreeDiscModified {
  public static void main(String[] args) {

    // Variable Definitions
    int min = 1;
    int max = 25;
    // Select a random number within range 1-25
    // @see https://stackoverflow.com/a/363732
    int selectedNumber = min + (int) (Math.random() * ((max - min) + 1));
    int loopCnt = 0;
    int numberCnt = 0;
    // Target is half of the selected number (y = round(x/2))
    int numberTarget = Math.round(selectedNumber / 2);
    int randInt = 0;
    // Trying to output challenge & response using String.format()
    // @see https://docs.oracle.com/javase/tutorial/java/data/strings.html
    // @see https://www.geeksforgeeks.org/java-string-format-examples/
    String response;
    String challenge;

    challenge =
        String.format(
            "The selected number was: %1$s\n"
                + "The program will now generate random numbers between 1 and %1$s until %2$s occurances of %1$s have been generated.",
            selectedNumber, numberTarget);

    System.out.println(challenge);

    // While loop
    while (numberCnt < numberTarget) {
      randInt = (int) (Math.random() * selectedNumber) + 1;

      // Increment counter
      loopCnt++;
      if (randInt == selectedNumber) {
        numberCnt++;
      }
    }

    response =
        String.format(
            "The program looped %1$s times before generating %2$s occurances of the selected number, %3$s.",
            loopCnt, numberCnt, selectedNumber);

    // Print Results
    System.out.println(response);
  }
}
