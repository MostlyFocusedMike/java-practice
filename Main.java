public class Main {
  public static void printName(String name) {
    // interpolation version
    System.out.println(String.format("Hello, %s!", name));
    // string format version
    System.out.printf("Hello, %s!%n", name); // the %n is a newline character
    // Concatenation version
    System.out.println("Hello, " + name + "!");
  }

    public static void printName(String firstName, String lastName) {
    // string format version
    System.out.printf("Hello, %s %s!%n", firstName, lastName);
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    printName("John Doe");
    System.out.println();
    printName("Jane", "Doe");
    System.out.println();

    int sum = add(3, 5);
    System.out.println(sum);
  }
}