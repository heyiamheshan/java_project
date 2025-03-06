git a// SimpleCalculation.java

public class SimpleCalculation {

    public static int addTwoNumbers(int a, int b) {      //declare a function to add two numbers
        return a + b;
    }

    public static void main(String[] args) {
        int result = addTwoNumbers(3, 5);
        System.out.println("The sum is: " + result);
    }
}
