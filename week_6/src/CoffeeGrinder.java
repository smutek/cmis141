/*
 * File: CoffeeGrinder.java
 * Author: Jimmy Smutek
 * Date: September 30, 2018
 * Purpose: This program creates a Coffee Grinder object.
 * Assignment: Design and implement your own simple class to represent any household item
 * of your choice (toaster, fan, hair dryer, piano ...)
 * Your class should have a constructor, one additional method and at least one member variable
 * (e.g. boolean isOn to turn the item on or off). Be sure you demonstrate your class works properly
 * by constructing an instance of it and calling your method.
 */

public class CoffeeGrinder {
  // Set variables
  private static final int ESPRESSO = 1;
  private static final int POUR_OVER = 2;
  private static final int FRENCH_PRESS = 3;
  private int speed;
  private boolean powerOn;
  private boolean isGrinding;

  /** Default (no arg) constructor. */
  public CoffeeGrinder() {
    this.speed = POUR_OVER;
    this.powerOn = false;
    this.isGrinding = false;
  }

  /**
   * Constructor Contructs an instance of the Coffee Grinder
   *
   * @param speed int
   * @param powerOn boolean
   * @param isGrinding boolean
   */
  public CoffeeGrinder(int speed, boolean powerOn, boolean isGrinding) {
    this.speed = speed;
    this.powerOn = powerOn;
    this.isGrinding = isGrinding;
  }

  /**
   * To String method for the coffee grinder
   *
   * @return String representation of object instance
   */
  @Override
  public String toString() {
    return "CoffeeGrinder{"
        + "speed="
        + speed
        + ", powerOn="
        + powerOn
        + ", isGrinding="
        + isGrinding
        + '}';
  }

  /**
   * Get Speed
   *
   * @return speed int
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * Set Speed
   *
   * @param speed int
   */
  public void setSpeed(int speed) {
    this.speed = speed;
  }

  /**
   * Is power on?
   *
   * @return boolean
   */
  public boolean isPowerOn() {
    return powerOn;
  }

  /**
   * Set poweron state
   *
   * @param powerOn boolean
   */
  public void setPowerOn(boolean powerOn) {
    this.powerOn = powerOn;
  }

  /**
   * Is the grinder grinding?
   *
   * @return boolean
   */
  public boolean isGrinding() {
    return isGrinding;
  }

  /**
   * Set the grinding state
   *
   * @param grinding boolean
   */
  public void setGrinding(boolean grinding) {
    isGrinding = grinding;
  }
}
