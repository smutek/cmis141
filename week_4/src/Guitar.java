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

  // Getter methods for all data fields.
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

  /*
  A playGuitar() method that returns a string representation of 16 randomly selected
musical notes of random duration. For example, the first part of the string returned
might look like this: [A(2), G(3), B(0.5), C(1), C(1), D(0.25), ...]. You can assume
one octave in the key of C where valid notes include A, B, C, D, E, F and G and duration
values are .25, .5, 1, 2, and 4 representing sixteenth notes, eighth notes, quarter notes,
half notes and whole notes, respectively.
   */
  private String playGuitar() {

    // array - string notes
    String[] Notes = new String[]{"A", "B", "C", "D", "E", "F", "G"};
    // array - double length
    double[] NoteLength = new double[]{.25, .5, 1, 2, 4};
    // An empty song.
    String Song = "";

    // loop 16 times
    for (int i = 1; i <= 16; i++) {
      String foo;
      // array - string song
      // select a random note
      // select a random length
      // append to song
    }

    // return song
    return Song;
  }

  /*
  A toString() method that displays the number of strings, length, manufacturer and color
  in String format
   */
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
