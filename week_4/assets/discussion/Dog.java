/*
 * File: Dog.java
 * Author: Cheri Longo
 * Refactored by: Jimmy Smutek
 * Date: September 15, 2018
 * Purpose: Create an instance of class dog.
 */
class Dog {
  private int num = 2;

  int paws(int i) {
    return i * 2;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "num=" + num +
        '}';
  }
}
