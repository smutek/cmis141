/*
Write a complete Java class that will create a 2D array of randomly generated ints with
dimensions of 5 rows and 10 columns. Print the values of each cell to a 5x10 table.
 */

/*
 * File: MultiDimensionDemo.java
 * Author: Dr. Robertson
 * Date: January 1, 2015
 * Purpose: This program demonstrates how to create
 * and populate 2D and 3D arrays in Java
 */


public class BuildTable {
  // Define constant array size
  static final int ROWS = 5;
  static final int COLUMNS = 10;
  static final int TOTALVALUES = 50;

  // Main method
  public static void main(String args[]){
    // Create array of doubles 2 D
    double[][] values = new double[ROWS][COLUMNS];
    // Assign random values
    for (int i=0; i<ROWS; i++) {
      for (int j=0; j<COLUMNS; j++) {
        values[i][j] = Double.parseDouble(String.format("%.2f",Math.random() * 10));
      }
    }

    // Print the results for each cell in a table 5x10
    for (int i=0; i<ROWS; i++) {
      for (int j=0; j<COLUMNS; j++) {
        System.out.print(values[i][j] + "\t");
      }
      System.out.println("");
    }

    // Create array of doubles 3D
    double[][][] values = new double[TOTALVALUES][ROWS][COLUMNS];
    // Assign random values
    for (int k=0; k<TOTALVALUES; k++) {
      for (int i=0; i<ROWS; i++) {
        for (int j=0; j<COLUMNS; j++) {
          values[k][i][j] = Double.parseDouble(String.format("%.2f",Math.random() * 10));
        }
      }
    }

    // Print results with Year upfront
    // Define BaseYear
    for (int k=0; k<TOTALVALUES; k++) {
      System.out.println("Year is " + (baseYear+k));
      for (int j=0; j<COLUMNS; j++) {
        for (int i=0; i<ROWS; i++) {
          System.out.print(values[k][i][j] + "\t");
        }
        System.out.println("");
      }
    }



  }



}
