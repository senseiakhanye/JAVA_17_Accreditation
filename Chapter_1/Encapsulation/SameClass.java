
public class SameClass {
  private void roar(SameClass b) {
    System.out.println("Roar");
  }

  public static void main(String[] args) {
    SameClass bear = new SameClass();
    SameClass anotherBear = new SameClass();
    bear.roar(anotherBear);
  }
}
