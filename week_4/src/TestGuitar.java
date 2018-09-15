/*
 * File: TestGuitar.java
 * Author: Jimmy Smutek
 * Date: September 14, 2018
 * Purpose: Test the Guitar class by
 * creating 3 unique instances.
 */

public class TestGuitar {
  public static void main(String[] args) {

    int[] testStrings = {0, 12, 22, 14};
    double[] testLength = {0, 22.3, 22, 9.1};
    String[] testManufacturer = {null, "Fender", "Richenbacher", "Yamaha"};
    String[] testColors = {null, "Color.Blue", "Color.Black", "Color.Green"};

    String divider = "********************************************";

    Guitar defaultGuitar = new Guitar();

    for (int index = 0; index <= 3; index++) {

      // Setup variables
      int strings = testStrings[index];
      double length = testLength[index];
      String manufacturer = testManufacturer[index];
      String color = testColors[index];

      // Print info
      System.out.println(divider);

      Guitar testGuitar = new Guitar(strings, length, manufacturer, color);

      if (index == 0) {
        testGuitar = defaultGuitar;
        System.out.println("TEST CASE: Default");
      } else {
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
