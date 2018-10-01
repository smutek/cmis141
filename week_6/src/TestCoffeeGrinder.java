/*
 * File: CoffeeGrinder.java
 * Author: Jimmy Smutek
 * Date: September 30, 2018
 * Purpose: This program tests the Coffee Grinder object.
 */

public class TestCoffeeGrinder {
  public static void main(String[] args) {

    System.out.println("\n*******************\n");

    // Default
    CoffeeGrinder defaultGrinder = new CoffeeGrinder();
    System.out.println("Dumping default grinder to string:\n" + defaultGrinder.toString());

    System.out.println("\n*******************\n");

    // Custom Grinder
    CoffeeGrinder customGrinder = new CoffeeGrinder(1, true, true);
    System.out.println("Dumping custom grinder to string:\n" + customGrinder.toString());

    System.out.println("\n*******************\n");

    System.out.println("Changing grind mode and turning grinder off...\n");

    customGrinder.setGrinding(false);
    System.out.println("Updated setGrinding to value false...");
    customGrinder.setSpeed(3);
    System.out.println("Updated setSpeed to value 3...");
    customGrinder.setPowerOn(false);
    System.out.println("Updated setPowerOn to value false...\n");


    System.out.println("Dumping updated custom grinder to string:\n" + customGrinder.toString());

    System.out.println("\n*******************\n");

  }
}
