/*
 * File: TestDog.java
 * Author: Cheri Longo
 * Refactored by: Jimmy Smutek
 * Date: September 15, 2018
 * Purpose: Test the dog class.
 */
public class TestDog {
  public static void main(String args[]) {
    Dog obj = new Dog();
    System.out.println("There are " + obj.getNum() + " Dogs");
    System.out.println("There are " + obj.paws(4) + " Dog Paws");
    System.out.println(obj.toString());
  }
}
