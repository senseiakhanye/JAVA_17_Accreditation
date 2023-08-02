public class Numbers {
  public static void main(String[] args) {
    long longNumber = 10000000; // This will be an int because L is not at the end.
    long betterNumber = 10_000_000L; // This is more readable.
    System.out.println("First number: " + longNumber + " | second number : " + betterNumber);
  }
}
