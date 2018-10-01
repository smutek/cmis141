import examples.Circle2D;

public class Examples {
  public static void main(String[] args) {

    Circle2D Circle2Dexample = new Circle2D();
    Circle2Dexample.setRadius(22.5);
    Circle2Dexample.setXCenter(55.8);
    Circle2Dexample.setYCenter(22.3);

    System.out.println(Circle2Dexample.getCircumference());

  }
}
