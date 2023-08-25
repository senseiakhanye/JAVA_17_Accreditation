public class Casting {

  private static void solidifyUnderstandingOfFloat() {
    // This compiles
    float f = 5;
    System.out.println("f = 5 (Compiles)");

    // This one does not compile
    // float e = 5.0;
    System.out.println("float e = 5.0 (Does not compile)");
    
    // This one does compile.
    float correct = 5.0f;
    System.out.println("float correct = 5.0f (Does Compile)");
  }

  private static void solidifyUnderstandingOfLong() {
    // This compiles but is it a long or int?
    long l = 5;
    // boolean isLong = l instanceof Long;
    System.out.println("long l = 5 (Compiles)");

    long ll = 5L;
    // isLong = l instanceof Long;
    System.out.println("long ll = 5L (Compiles)");
  }

  public static void main(String[] args) {
    // All values in an expression are converted to the largest of the two.
    // byte, short, and char are converted to in.
    solidifyUnderstandingOfFloat();
    solidifyUnderstandingOfLong();
  }
}
