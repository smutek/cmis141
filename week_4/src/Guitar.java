/*
 * File: Guitar.java
 * Author: James Smutek
 * Date: September 12, 2018
 * Purpose: Invokes instances of class Guitar.
 */
public class Guitar {

  /*
  numStrings
  The default value should be 6.
   */
  private int numStrings;

  /*
  guitarLength
  The default value should be 28.2
   */
  private double guitarLength;

  /*
  guitarManufacturer
  The default value should be “Gibson”.
   */
  private String guitarManufacturer;

  /*
  guitarColor
  The default value should be Color.Red.
   */
  private String guitarColor;

  /** No argument constructor */
  public Guitar() {
    numStrings = 6;
    guitarLength = 28.2;
    guitarManufacturer = "Gibson";
    guitarColor = "Color.Red";
  }

  /**
   * Constructor
   *
   * @param numStrings int Default: 6
   * @param guitarLength double Default 28.2
   * @param guitarManufacturer String Default "Gibson"
   * @param guitarColor String Default "Color.Red"
   */
  public Guitar(
      int numStrings, double guitarLength, String guitarManufacturer, String guitarColor) {
    this.numStrings = numStrings;
    this.guitarLength = guitarLength;
    this.guitarManufacturer = guitarManufacturer;
    this.guitarColor = guitarColor;
  }

  /**
   * Getter method for numStrings
   *
   * @return int
   */
  public int getNumStrings() {
    return numStrings;
  }

  /**
   * Getter method for guitarLength
   *
   * @return double
   */
  public double getGuitarLength() {
    return guitarLength;
  }

  /**
   * Getter method for guitarManufacturer
   *
   * @return String
   */
  public String getGuitarManufacturer() {
    return guitarManufacturer;
  }

  /**
   * Getter method for guitarColor
   *
   * @return String
   */
  public String getGuitarColor() {
    return guitarColor;
  }

  /**
   * Returns a string representation of 16 randomly selected musical notes of random duration
   * formatted as: [A(2), G(3), B(0.5), C(1), C(1), D(0.25), ...]. You can assume one octave in the
   * key of C where valid notes include: A, B, C, D, E, F and G and duration values are .25, .5, 1,
   * 2, and 4 representing sixteenth notes, eighth notes, quarter notes, half notes and whole notes,
   * respectively.
   *
   * @return a String of note values.
   */
  public StringBuilder playGuitar() {
    // Variables
    String[] allowedNotes = {"A", "B", "C", "D", "E", "F", "G"};
    double[] durationValues = {.25, .5, 1, 2, 4};
    int totalNotes = allowedNotes.length;
    int totalDurationValues = durationValues.length;
    int barLength = 16;
    StringBuilder song = new StringBuilder("[");

    // Add notes and durations to the song.
    for (int i = 0; i <= barLength; i++) {
      // Select a random note value.
      String noteValue = allowedNotes[(randomIndex(1, totalNotes) - 1)];
      // Select a random note duration.
      double durationValue = durationValues[(randomIndex(1, totalDurationValues) - 1)];
      // Format no0te + duration sub string.
      String note = noteValue + "(" + Double.toString(durationValue) + ")";
      // If we aren't at the end of the loop, add a comma and space.
      if (i != barLength) note += ", ";

      // Add the formatted note string to the song string.
      song.append(note);
    }

    song.append("]");

    return song;
  }

  /**
   * Generates a random integer within the specified range.
   *
   * @param min int The minimum value in the desired range.
   * @param max int The maximum value in the desired range.
   * @return int The randomly generated integer.
   */
  private int randomIndex(int min, int max) {

    return (int) (Math.random() * ((max - min) + 1)) + min;

  }

  /**
   * Displays the number of strings, length, manufacturer and color in String format.
   *
   * @return String
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
