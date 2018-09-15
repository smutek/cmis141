/*
 * File: TestGuitar.java
 * Author: Jimmy Smutek
 * Date: September 14, 2018
 * Purpose: Test the Guitar class by
 * creating 3 unique instances.
 */

public class TestGuitar {
  public static void main(String[] args) {

    /* Variables */

    // Store params in arrays in order to run tests in a loop.
    int[] testStrings = {0, 5, 12, 21};
    double[] testLength = {0, 26, 25.4, 42};
    String[] testManufacturer = {null, "Ibanez", "Rickenbacker", "Maharaja"};
    String[] testColors = {null, "Color.White", "Color.Black", "Color.Blue"};

    String divider = "********************************************";
    /*
    Initialize default.
    @todo- Question for prof:
    I want to run my tests, including the default, by passing parameters through a loop.
    Passing 0 and null values, for example "NoArgConstructor(int 0,String null)" does not work
    to call the default constructor. I also cannot conditionally instantiate the object (L46)
    because the object reference is scoped to the conditional check (right?)
    So the best I could think of was to instantiate the default here, then overwrite the
    object reference created on the first loop with the default object created here.
    It seems inefficient though.
    */
    Guitar defaultGuitar = new Guitar();

    // Looping - Run 4 tests, default + 3 unique.
    for (int index = 0; index <= 3; index++) {

      // Set up variables
      int strings = testStrings[index];
      double length = testLength[index];
      String manufacturer = testManufacturer[index];
      String color = testColors[index];

      System.out.println(divider);

      // Instantiate the object.
      Guitar testGuitar = new Guitar(strings, length, manufacturer, color);

      // If this is the first loop -
      if (index == 0) {
        // Use the default guitar object instead.
        // @todo- Is there a way to do this without instantiating the previous object?
        testGuitar = defaultGuitar;
        System.out.println("TEST CASE: Default");
      } else {
        // Otherwise, carry on.
        System.out.println("TEST CASE: " + index);
      }

      System.out.println(divider);

      // Output Results

      // Strings
      System.out.println("Method: getNumStrings()");
      System.out.println("Output: " + testGuitar.getNumStrings());
      System.out.println();
      // Length
      System.out.println("Method: getGuitarLength()");
      System.out.println("Output: " + testGuitar.getGuitarLength());
      System.out.println();
      // Manufacturer
      System.out.println("Method: getGuitarManufacturer()");
      System.out.println("Output: " + testGuitar.getGuitarManufacturer());
      System.out.println();
      // Color
      System.out.println("Method: getGuitarColor()");
      System.out.println("Output: " + testGuitar.getGuitarColor());
      System.out.println();
      // Play Guitar
      System.out.println("Method: playGuitar()");
      System.out.println("Output: " + testGuitar.playGuitar());
      System.out.println();
      // To String
      System.out.println("Method: toString()");
      System.out.println("Output: " + testGuitar.toString());
      System.out.println();
    }
  }
}
