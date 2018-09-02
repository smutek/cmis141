import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WeekTwoDiscussion {

  /**
   * Prompt the user for their grade as a letter Display a message letting them know if they passed
   */
  public static void main(String[] args) throws IOException {
    // Vars
    String letterGrade;
    String systemResponse;

    // Define InputStreamReader
    InputStreamReader isReader = new InputStreamReader(System.in);
    // Send to BufferedReader
    BufferedReader stdin = new BufferedReader(isReader);

    // Prompt the user for their grade
    System.out.println("Please enter your letter grade: ");

    letterGrade = stdin.readLine();

    // Evaluate
    switch (letterGrade) {
      case "A":
      case "a":
        systemResponse = "Exceeds expectation.";
      case "B":
      case "b":
        systemResponse = "Above average score.";
      case "C":
      case "c":
        systemResponse = "Average score.";
      case "D":
      case "d":
        systemResponse = "Below average score, unsatisfactory.";
      case "E":
      case "e":
      case "F":
      case "f":
        systemResponse = "Failing score.";
      default:
        systemResponse = "Invalid entry.";

        break;
    }

    // print the response
    System.out.println(systemResponse);
  }
}
