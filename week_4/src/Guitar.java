/*
 * File: Guitar.java
 * Author: James Smutek
 * Date: September 12, 2018
 * Purpose: Invokes instances of class Guitar.
 */

public class Guitar {

  private int numStrings;
  private double guitarLength;
  private String guitarManufacturer;
  private String guitarColor;

  public Guitar(
      int numStrings, double guitarLength, String guitarManufacturer, String guitarColor) {
    this.numStrings = numStrings;
    this.guitarLength = guitarLength;
    this.guitarManufacturer = guitarManufacturer;
    this.guitarColor = guitarColor;
  }

  public int getNumStrings() {
    return numStrings;
  }

  public double getGuitarLength() {
    return guitarLength;
  }

  public String getGuitarManufacturer() {
    return guitarManufacturer;
  }

  public String getGuitarColor() {
    return guitarColor;
  }

  // Default Constructor
  public Guitar() {
    numStrings = 6;
    guitarLength = 22.5;
    guitarManufacturer = "Gibson";
    guitarColor = "Red";
  }

  private String playGuitar() {
    return "";
  }

  public String toString() {
    return "Guitar{"
        + "numStrings="
        + numStrings
        + ", guitarLength="
        + guitarLength
        + ", guitarManufacturer='"
        + guitarManufacturer
        + '\''
        + ", guitarColor='"
        + guitarColor
        + '\''
        + '}';
  }
}
