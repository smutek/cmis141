/*
 * File: WeekThreeDiscussion.java
 * Author: James Smutek
 * Date: September 9, 2018
 * Purpose: Provide a short Java code example that uses a For or While loop.
 * FizzBuzz loop - Prints the numbers from 1 to 100.
 * For multiples of three prints "Fizz" instead of the number.
 * For the multiples of five prints "Buzz".
 * For numbers which are multiples of both three and five prints "FizzBuzz".
 */
public class WeekThreeDiscussion {
  public static void main(String[] args) {
    // Start a For Loop
    for (int i = 1; i < 100; i++) {
      // Is this a multiple of 3 OR 5?
      if (i % 3 == 0 || i % 5 == 0) {
        // We have a Multiple!
        // Is this a multiple of BOTH 3 AND 5?
        if (i % 3 == 0 && i % 5 == 0) {
          // It is, print FizzBuzz
          System.out.println("FizzBuzz");
          // It's not, is it a multiple of 3?
        } else if (i % 3 == 0) {
          // Print Fizz
          System.out.println("Fizz");
          // It's not, so it must be a multiple of 5
        } else {
          // Print Buzz
          System.out.println("Buzz");
        }
        // It's not a multiple of 3 or 5
      } else {
        // Print the number
        System.out.println(i);
      }
    }
  }
}
