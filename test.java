// SimpleCalculation.java
public class SimpleCalculation {

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // New feature to subtract two numbers
    public static int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int resultAdd = addTwoNumbers(3, 5);
        int resultSubtract = subtractTwoNumbers(5, 3);
        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSubtract);
    }
}
