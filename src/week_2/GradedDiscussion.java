package week_2;

/*
 * File: UMUCweek2disc
 * Author: Jordan Drabek
 * Date: 30 AUG 2018
 */

import java.io.*;
import java.util.Scanner;

//Intializing program
public class GradedDiscussion {

    public static void main(String[] arg) throws IOException {

//Variable definition

        double dollarSpent;
        boolean clubMember = true;

//User Input

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("How much do all these items cost? ");
        // dollarSpent = double.parseDouble(stdin.readLine());
        // corrected
        dollarSpent = Double.parseDouble(stdin.readLine());

//Program function

        if ((dollarSpent <= 100) && clubMember) {
            System.out.println("You have been given free shipping and 5% off your order!");
            dollarSpent = dollarSpent * .95;
            System.out.println("Your new total is: " + dollarSpent);
        } else if (clubMember) {
            System.out.println("Thank you for being a member, please have 5% off your order!");
            dollarSpent = dollarSpent * .95;
            System.out.println("Your new total before shipping is: " + dollarSpent);
        } else {
            System.out.println("Your total before shipping is: " + dollarSpent);
        }

    }
}