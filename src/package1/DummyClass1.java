package package1;

public class DummyClass1 {

  // Method that returns the sum of two integers
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  // Method that prints a message to the console
  public void showMessage(String message) {
    System.out.println(message);
  }

  // Method that checks if a number is even or odd
  public String checkEvenOdd(int num) {
    if (num % 2 == 0) {
      return "even";
    } else {
      return "odd";
    }
  }
}
