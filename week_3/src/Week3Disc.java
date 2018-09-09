/*
 * File: Week3Disc.java
 * Author: Caleb Smith
 * Date: September 9, 2018
 * Purpose: This program will generate random
 * numbers from 1-7 until the number 7 is chosen twice
 */

public class Week3Disc {
  public static void main(String[] args) {

    // Variable Definitions
    int loopCnt = 0;
    int sevenCnt = 0;
    int randInt = 0;

    // While loop
    while (sevenCnt < 2) {
      randInt = (int) (Math.random() * 7) + 1;
      System.out.println("While loop: Random value is " + randInt);
      // Increment counter
      loopCnt++;
      if (randInt == 7) {
        sevenCnt++;
      }
    }

    // Print Results
    System.out.println("Loop count is: " + loopCnt);
    System.out.println("Number of 7's generated is: " + sevenCnt);
  }
}
