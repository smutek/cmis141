import java.util.Scanner;

/*
 * File: StateFlowersAndBirds.java
 * Author: Jimmy Smutek
 * Date: October 07, 2018
 * Purpose: This program prompts the user to enter an American state, then provides the state bird
 * and state flower for that state. The program will continue to prompt the user for states until
 * the user enters "None", at which point the program will display a summary of all user requests.
 */
public class StateFlowersAndBirds {
  public static void main(String[] args) {

    boolean programRunning = true;
    Scanner scannerIn = new Scanner(System.in);
    String userPrompt = "Enter an American state, or Enter None to exit";
    String userInput;
    String cleanInput;
    StateInformation[] userList = new StateInformation[50];
    int count = 0;

    // Greet the user
    System.out.println("Welcome, user.");

    while (programRunning) {

      // Prompt the user for input
      System.out.println(userPrompt);
      // Get user input and trim any white space
      userInput = scannerIn.nextLine();
      cleanInput = userInput.trim();

      if (!cleanInput.equalsIgnoreCase("none")) {
        // User input != "none"
        int stateIndex = StateInformation.getStateIndexByName(cleanInput);
        if(stateIndex == -1) {
          // This is not a state.
          System.out.println("'" + cleanInput + "' is not a state. Please try again.");
        } else {
          // This ia a state, try to get an object!
          userList[count] = new StateInformation(stateIndex);
          System.out.println(userList[count].getStateName() + " added.");
          count++;
        }
      } else {
        // User input = "none"
        System.out.println("You entered " + cleanInput + ".");

        for (StateInformation stateInformation : userList) {
          // @todo throws a null pointer exception at runtime w/o this conditional, why?
          if(stateInformation != null)
            System.out.println(stateInformation.getStateName());
        }

        programRunning = false;
      }
    }
    // Bye
    System.out.println("Bye, user.");
  }
}
