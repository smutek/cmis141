/*
 * File: TestHeadPhone.java
 * Author: Jimmy Smutek
 * Date: September 30, 2018
 * Purpose: This program tests the HeadPhone class.
 */
import java.awt.Color;

public class TestHeadPhone {
  public static void main(String[] args) {
    // Instantiate test objects
    HeadPhone HeadPhoneOne = new HeadPhone();
    HeadPhone HeadPhoneTwo = new HeadPhone();
    HeadPhone HeadPhoneThree = new HeadPhone();

    // Test 1
    System.out.println("********* TEST 1 *********");
    // Default object & toString()
    System.out.println("Default object toString() = " + HeadPhoneOne.toString());

    // Test setters
    System.out.println("*** Setters ***");
    HeadPhoneOne.setVolume(1);
    HeadPhoneOne.setHeadPhoneColor(Color.RED);
    HeadPhoneOne.setHeadPhoneModel("ATH-M50X");
    HeadPhoneOne.setManufacturer("Audio Technica");
    HeadPhoneOne.setPluggedIn(true);
    System.out.println("Setters complete:\n" + HeadPhoneOne.toString());

    // Test getters
    System.out.println("*** Getters ***");
    System.out.println("getVolume() = " + HeadPhoneOne.getVolume());
    System.out.println("getHeadPhoneColor() =  " + HeadPhoneOne.getHeadPhoneColor());
    System.out.println("getHeadPhoneModel() = " + HeadPhoneOne.getHeadPhoneModel());
    System.out.println("getManufacturer() = " + HeadPhoneOne.getManufacturer());
    System.out.println("isPluggedIn() = " + HeadPhoneOne.isPluggedIn());

    // Test change volume
    System.out.println("*** changeVolume() ***");
    HeadPhoneOne.changeVolume(3);
    System.out.println("Changed volume:\n" + HeadPhoneOne.toString());

    // Test 2
    System.out.println("********* TEST 2 *********");
    // Default object & toString()
    System.out.println("Default object toString() = " + HeadPhoneTwo.toString());

    // Test setters
    System.out.println("*** Setters ***");
    HeadPhoneTwo.setVolume(3);
    HeadPhoneTwo.setHeadPhoneColor(Color.black);
    HeadPhoneTwo.setHeadPhoneModel("HD660 S Apogee");
    HeadPhoneTwo.setManufacturer("Sennheiser");
    HeadPhoneTwo.setPluggedIn(false);
    System.out.println("Setters complete:\n" + HeadPhoneTwo.toString());

    // Test getters
    System.out.println("*** Getters ***");
    System.out.println("getVolume() = " + HeadPhoneTwo.getVolume());
    System.out.println("getHeadPhoneColor() =  " + HeadPhoneTwo.getHeadPhoneColor());
    System.out.println("getHeadPhoneModel() = " + HeadPhoneTwo.getHeadPhoneModel());
    System.out.println("getManufacturer() = " + HeadPhoneTwo.getManufacturer());
    System.out.println("isPluggedIn() = " + HeadPhoneTwo.isPluggedIn());

    // Test change volume
    System.out.println("*** changeVolume() ***");
    HeadPhoneTwo.changeVolume(2);
    System.out.println("Changed volume:\n" + HeadPhoneTwo.toString());

    // Test 3
    System.out.println("********* TEST 3 *********");
    // Default object & toString()
    System.out.println("Default object toString() = " + HeadPhoneThree.toString());

    // Test setters
    System.out.println("*** Setters ***");
    HeadPhoneThree.setVolume(2);
    HeadPhoneThree.setHeadPhoneColor(Color.blue);
    HeadPhoneThree.setHeadPhoneModel("LCD-4");
    HeadPhoneThree.setManufacturer("Audeze");
    HeadPhoneThree.setPluggedIn(true);
    System.out.println("Setters complete:\n" + HeadPhoneThree.toString());

    // Test getters
    System.out.println("*** Getters ***");
    System.out.println("getVolume() = " + HeadPhoneThree.getVolume());
    System.out.println("getHeadPhoneColor() =  " + HeadPhoneThree.getHeadPhoneColor());
    System.out.println("getHeadPhoneModel() = " + HeadPhoneThree.getHeadPhoneModel());
    System.out.println("getManufacturer() = " + HeadPhoneThree.getManufacturer());
    System.out.println("isPluggedIn() = " + HeadPhoneThree.isPluggedIn());

    // Test change volume
    System.out.println("*** changeVolume() ***");
    HeadPhoneThree.changeVolume(1);
    System.out.println("Changed volume:\n" + HeadPhoneThree.toString());
  }
}
