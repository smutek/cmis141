package week_2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Standard I/O Demo
 */
public class LabOneStandardIODemo {
    public static void main(String[] args) throws IOException {
        // Variables
        int favInt = 0;
        double favDouble = 0.0;
        int secondFavInt = 0;
        double secondFaveDouble = 0;
        boolean myBolean = false;
        short myShort = 0;

        // Define an InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in);
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin = new BufferedReader(isReader);

        // Prompt the user for an int
        System.out.println("Enter your favorite integer:");
        // The readLine() method reads everything entered
        // However the Integer.parseInt() method converts
        // the value to an int
        favInt = Integer.parseInt(stdin.readLine());

        // Prompt the user for an double
        System.out.println("Enter your favorite double number:");
        // Read & convert to a double
        favDouble = Double.parseDouble(stdin.readLine());

        // Print the results to verify
        System.out.println("Your favorite int is: " + favInt);
        System.out.println("Your favorite double is: " + favDouble);

        // Use the Scanner class to read & convert this time
        Scanner scannerIn = new Scanner(System.in);

        // Prompt the user for another int
        System.out.println("Enter your second favorite integer:");
        // the nextInt() method scans the next int value
        secondFavInt = scannerIn.nextInt();

        // Prompt for another double
        System.out.println("Enter your second favorite double number:");
        // Read & convert to a double
        secondFaveDouble = scannerIn.nextDouble();

        // Prompt for a bool
        System.out.println("Enter your favorite boolean value: ");
        myBolean = scannerIn.nextBoolean();

        // Prompt for a short
        System.out.println("Enter your favorite short value: ");
        myShort = scannerIn.nextShort();

        // Print results to verify
        System.out.println("Your second favorite int is: " + secondFavInt);
        System.out.println("Your second favorite double is: " + secondFaveDouble);
        System.out.println("Your favorite bool is: " + myBolean);
        System.out.println("Your favorite short value is: " + myShort);
    }
}
