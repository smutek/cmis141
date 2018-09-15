/*
 * File: TestCreateAlertComponent.java
 * Author: James Smutek
 * Date: September 15, 2018
 * Purpose: Test CreateAlertComponent
 */
public class TestCreateAlertComponent {
  public static void main(String[] args) {
    System.out.println();
    // Default
    CreateAlertComponent alert = new CreateAlertComponent();
    System.out.println(alert.getMarkup());
    System.out.println();

    // Primary
    String messagePrimary = "<p>This is the primary alert type.</p>";
    CreateAlertComponent alertPrimary = new CreateAlertComponent(1, messagePrimary);
    System.out.println(alertPrimary.getMarkup());
    System.out.println();
  }
}
