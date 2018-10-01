/*
 * File: HeadPhone.java
 * Author: Jimmy Smutek
 * Date: September 30, 2018
 * Purpose: Create a HeadPhone Object, satisfy requirements for HW 6.
 */

import java.awt.Color;

public class HeadPhone {
  // Denotes headphone volume
  private static final int LOW = 1;
  private static final int MEDIUM = 2;
  private static final int HIGH = 2;

  private int volume;
  private boolean pluggedIn;
  private String manufacturer;
  private Color headPhoneColor;
  private String headPhoneModel;

  /** Default Constructor */
  public HeadPhone() {
    volume = MEDIUM;
    pluggedIn = false;
    manufacturer = "";
    headPhoneColor = Color.BLACK;
    headPhoneModel = "";
  }

  /**
   * toString
   *
   * @return String representation of object instance
   */
  @Override
  public String toString() {
    return "HeadPhone{"
        + "volume="
        + volume
        + ", pluggedIn="
        + pluggedIn
        + ", manufacturer='"
        + manufacturer
        + '\''
        + ", headPhoneColor="
        + headPhoneColor
        + ", headPhoneModel='"
        + headPhoneModel
        + '\''
        + '}';
  }

  /**
   * Change the volume field of the HeadPhone object.
   *
   * @param newVolume int 1-3
   */
  public void changeVolume(int newVolume) {
    this.setVolume(newVolume);
  }

  // Getter & Setter Methods for all data fields

  /**
   * Get Volume
   *
   * @return volume int
   */
  public int getVolume() {
    return volume;
  }

  /**
   * setVolume
   *
   * @param volume int
   */
  public void setVolume(int volume) {
    this.volume = volume;
  }

  /**
   * is plugged in
   *
   * @return boolean
   */
  public boolean isPluggedIn() {
    return pluggedIn;
  }

  /**
   * set plugged in
   *
   * @param pluggedIn boolean
   */
  public void setPluggedIn(boolean pluggedIn) {
    this.pluggedIn = pluggedIn;
  }

  /**
   * get manufacturer
   *
   * @return manufacturer String
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * set manufacturer
   *
   * @param manufacturer String
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * get headphone color
   *
   * @return Color object
   */
  public Color getHeadPhoneColor() {
    return headPhoneColor;
  }

  /**
   * setHeadphone Color
   *
   * @param headPhoneColor Color
   */
  public void setHeadPhoneColor(Color headPhoneColor) {
    this.headPhoneColor = headPhoneColor;
  }

  /**
   * Get headphone model
   *
   * @return headphone model String
   */
  public String getHeadPhoneModel() {
    return headPhoneModel;
  }

  /**
   * Set headphone model
   *
   * @param headPhoneModel String
   */
  public void setHeadPhoneModel(String headPhoneModel) {
    this.headPhoneModel = headPhoneModel;
  }
}
