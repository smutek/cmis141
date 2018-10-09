/*
 * File: StateInformation.java
 * Author: Jimmy Smutek
 * Date: October 07, 2018
 * Purpose: Creates "State Information" objects.
 */
public class StateInformation {
  private String stateName;
  private String stateBird;
  private String stateFlower;
  private int stateIndex;
  private static final int STATE = 0;
  private static final int FLOWER = 1;
  private static final int BIRD = 2;
  // List of states, birds, flowers
  // @see https://codereview.stackexchange.com/q/106052
  // Format is: State, Bird, Flower.
  public static final String[][] ALL_STATES = {
    {"Alabama", "Camelia", "Northern Flicker"},
    {"Alaska", "Forget-me-not", "Willow Ptarmigan"},
    {"Arizona", "Saguaro Cactus Blossom", "Cactus Wren"},
    {"Arkansas", "Apple Blossom", "Northern Mockingbird"},
    {"California", "California Poppy", "California Quail"},
    {"Colorado", "Rocky Mountian Columbine", "Lark Bunting"},
    {"Connecticut", "Mountain Laurel ", "American Robin"},
    {"Delaware", "Peach Blossom", "Delaware Blue Hen"},
    {"Florida", "Orange Blossom", "Northern Mockingbird"},
    {"Georgia", "Cherokee Rose", "Brown Thrasher"},
    {"Hawaii", "Hawaiian Hibiscus", "Nä“nä“ or Hawaiian Goose"},
    {"Idaho", "Syringa, Mock Orange", "Mountain Bluebird"},
    {"Illinois", "Violet", "Northern Cardinal"},
    {"Indiana", "Peony ", "Northern Cardinal"},
    {"Iowa", "Wild Prairie Rose", "Eastern Goldfinch"},
    {"Kansas", "Sunflower", "Western Meadowlark"},
    {"Kentucky", "Goldenrod", "Northern Cardinal"},
    {"Louisiana", "Magnolia", "Brown Pelican"},
    {"Maine", "White Pine Cone and Tassel", "Black-capped Chickadee"},
    {"Maryland", "Black-eyed Susan", "Baltimore Oriole"},
    {"Massachusetts", "Mayflower", "Black-capped Chickadee"},
    {"Michigan", "Apple Blossom", "American Robin"},
    {"Minnesota", "Flower:pink and White Lady's Slipper", "Common Loon"},
    {"Mississippi", "Magnolia", "Northern Mockingbird"},
    {"Missouri", "Hawthorn", "Eastern Bluebird"},
    {"Montana", "Bitterroot", "Western Meadowlark"},
    {"Nebraska", "Goldenrod", "Western Meadowlark"},
    {"Nevada", "Sagebrush", "Mountain Bluebird"},
    {"New Hampshire ", "Purple Lilac", "Purple Finch"},
    {"New Jersey", "Violet", "Eastern Goldfinch"},
    {"New Mexico", "Yucca Flower", "Roadrunner"},
    {"New York", "Rose", "Eastern Bluebird"},
    {"North Carolina", "Flowering Dogwood", "Northern Cardinal "},
    {"North Dakota", "Wild Prairie Rose ", "Western Meadowlark"},
    {"Ohio", "Carlet Carnation", "Northern Cardinal"},
    {"Oklahoma", "Oklahoma Rose ", "Scissor-tailed Flycatcher"},
    {"Oregon", "Oregon Grape ", "Western Meadowlark"},
    {"Pennsylvania", "Mountain Laurel", "Ruffed Grouse"},
    {"Rhode Island", "Violet", "Rhode Island Red"},
    {"South Carolina", "Yellow Jessamine ", "Carolina Wren"},
    {"South Dakota", "Pasque Flower ", "Ring-necked Pheasant"},
    {"Tennessee", "Iris", "Northern Mockingbird"},
    {"Texas", "Bluebonnet Sp.", "Northern Mockingbird"},
    {"Utah", "Sego Lily", "California Gull "},
    {"Vermont", "Red Clover", "Hermit Thrush"},
    {"Virginia", "American Dogwood", "Northern Cardinal"},
    {"Washington", "Coast Rhododendron", "Willow Goldfinch "},
    {"West Virginia", "Rhododendron", "Northern Cardinal"},
    {"Wisconsin", "Wood Violet", "American Robin"},
    {"Wyoming", "Indian Paintbrush", "Western Meadowlark"}
  };

  // No Arg Constructor
  public StateInformation() {
    this.stateIndex = 19; // Maryland
    this.stateName = ALL_STATES[stateIndex][STATE];
    this.stateBird = ALL_STATES[stateIndex][BIRD];
    this.stateFlower = ALL_STATES[stateIndex][FLOWER];
  }

  // Constructor
  public StateInformation(int stateIndex) {
    this.stateIndex = stateIndex;
    this.stateName = ALL_STATES[stateIndex][STATE];
    this.stateBird = ALL_STATES[stateIndex][BIRD];
    this.stateFlower = ALL_STATES[stateIndex][FLOWER];
  }

  /**
   * Gets the ALL_STATES array index for a given state name
   *
   * @param String stateName the name of the state
   * @return int array index
   */
  public static int getStateIndexByName(String stateName) {
    int x = -1;
    for (int i = 0; i < ALL_STATES.length; i++) {
      if (ALL_STATES[i][0].equalsIgnoreCase(stateName)) x = i;
    }
    return x;
  }

  /**
   * Formats and prints info for a given State Object
   *
   * @param StateInformation stateObject The StateInfo object to be formatted.
   * @return String Formatted information about the state.
   */
  public String printStateInfo(StateInformation stateObject) {
    String stateName = stateObject.getStateName();
    String stateBird = stateObject.getStateBird();
    String stateFlower = stateObject.getStateFlower();

    return stateName + "\nState Bird: " + stateBird + "\nState Flower: " + stateFlower;
  }

  /**
   * Gets the state name
   *
   * @return String
   */
  public String getStateName() {
    return stateName;
  }

  /**
   * Gets the state bird
   *
   * @return String
   */
  public String getStateBird() {
    return stateBird;
  }

  /**
   * Gets the state flower
   *
   * @return String
   */
  public String getStateFlower() {
    return stateFlower;
  }

  /**
   * Gets the array index for the state
   *
   * @return int
   */
  public int getStateIndex() {
    return stateIndex;
  }

  /**
   * Gets the ALL_States constant
   *
   * @return String
   */
  // @todo You probably don't need this.
  public static String[][] getAllStates() {
    return ALL_STATES;
  }

  /**
   * Set the index for a state object.
   *
   * @param int stateIndex
   */
  public void setStateIndex(int stateIndex) {
    this.stateIndex = stateIndex;
  }

  /**
   * To String Method
   *
   * @return String
   */
  @Override
  public String toString() {
    return "StateInformation{"
        + "stateName='"
        + stateName
        + '\''
        + ", stateBird='"
        + stateBird
        + '\''
        + ", stateFlower='"
        + stateFlower
        + '\''
        + ", stateIndex="
        + stateIndex
        + '}';
  }
}
