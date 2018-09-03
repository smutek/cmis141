/*
 * File: HomeworkOneReadWrite.java
 * Author: James Smutek
 * Date: September 1, 2018
 * Purpose: This program prompts the  user for input, does some calculations on that input,
 * and prints the output.
 */

import java.util.Scanner;

public class HomeworkOneReadWrite {

  /**
   * Prompts a user to enter student EMPLID (e.g., 12389), quiz 1 percentage score (e.g., 89.5),
   * quiz 2 percentage score (e.g., 81.2), quiz 3 percentage score (e.g., 92.5), your age in months
   * (e.g. 384) and the current temperature in degrees Celsius then displays the data entered along
   * with the average of all three quiz grades, the age in years, and the temperature in degrees F
   *
   * @param args String[].
   */
  public static void main(String[] args) {

    // Declare variables.
    int studentId;
    double quizOne;
    double quizTwo;
    double quizThree;
    int ageInMonths;
    double degreesCelsius;

    // Define a Scanner class to read & convert
    Scanner scannerIn = new Scanner(System.in);

    // Prompt for ID
    System.out.println("Please enter your student EMPLID: ");
    studentId = scannerIn.nextInt();
    // Prompt for Quiz Score 1
    System.out.println("Please enter your grade percentage for Quiz One: ");
    quizOne = scannerIn.nextDouble();
    // Prompt for Quiz Score 2
    System.out.println("Please enter your grade percentage for Quiz Two: ");
    quizTwo = scannerIn.nextDouble();
    // Prompt for Quiz Score 3
    System.out.println("Please enter your grade percentage for Quiz Three: ");
    quizThree = scannerIn.nextDouble();
    // Prompt for age in months
    System.out.println("Please enter your age in months: ");
    ageInMonths = scannerIn.nextInt();
    // Prompt for temperature in degrees Celsius.
    System.out.println("Please enter the current temperature in Celsius: ");
    degreesCelsius = scannerIn.nextDouble();

    // Begin output
    System.out.println("*** Thank you ***");

    // Output ID
    System.out.println("Student ID: " + studentId);

    // Calculate and output letter grades.
    System.out.println("Quiz 1: " + quizOne + "\u0025");
    System.out.println("Quiz 2: " + quizTwo + "\u0025");
    System.out.println("Quiz 3: " + quizThree + "\u0025");
    // Output the Quiz Average
    System.out.println("Quiz average: " + ((quizOne + quizTwo + quizThree) / 3));

    // Calculate and output age in months and years.
    System.out.println("Age in months: " + ageInMonths);
    System.out.println("Age in years: " + (ageInMonths / 12));

    // Calculate and output temperature in degrees celsius and degrees fahrenheit.
    System.out.println("Temperature in Celsius: " + degreesCelsius + " \u00B0");
    // (°C × 9/5) + 32 = °F
    System.out.println("Temperature in Fahrenheit: " + ((degreesCelsius * 9 / 5) + 32) + " \u00B0");
  }

}
