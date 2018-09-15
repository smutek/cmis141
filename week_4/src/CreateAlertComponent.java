/*
 * File: CreateAlertComponent.java
 * Author: James Smutek
 * Date: September 15, 2018
 * Purpose: Create instances of Twitter Bootstrap's "Alert" Web Component
 * @see: https://getbootstrap.com/docs/4.0/components/alerts/
 */
public class CreateAlertComponent {
  // Variables
  private int modifierKey;
  private String modifier;
  private String[] modifierValues = {
    "default", "primary", "secondary", "success", "danger", "info", "warning", "light", "dark"
  };
  private String message;
  private String markup;

  /** Default Alert Component Constructor Creates a default instance of the alert component. */
  public CreateAlertComponent() {
    modifierKey = 0;
    modifier = modifierValues[modifierKey];
    message = "<p>This is the default alert type.</p>";
    markup = buildMarkup(modifier, message);
  }

  /**
   * Alert Component Constructor Creates an alert component.
   *
   * @param int modifierKey The array index of the desired component modifier.
   * @param String message The message to display in the alert component instance.
   */
  public CreateAlertComponent(int modifierKey, String message) {
    this.modifierKey = modifierKey;
    this.modifier = modifierValues[modifierKey];
    this.message = message;
    this.markup = buildMarkup(modifier, message);
  }

  /**
   * Builds the HTML markup for the alert.
   *
   * @param modifier String. The desired modifier type.
   * @param message String. The message to display in the alert.
   * @return String. The assembled HTML markup.
   */
  private String buildMarkup(String modifier, String message) {

    return "<div class=\"alert alert-"
        + modifier
        + "\" role=\"alert\">\n"
        + "   "
        + message
        + "\n"
        + "</div>";
  }

  /**
   * Getter for the assembled HTML markup.
   *
   * @return
   */
  public String getMarkup() {
    return markup;
  }
}
