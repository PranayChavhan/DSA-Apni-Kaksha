import java.util.Scanner;

// 1) Write a function to multiply 2 numbers.
// 2) Write a function to calculate the factorial of a number.
// 3) Write a function to calculate the product of 2 numbers.

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter SEcond number: ");
        int num2 = sc.nextInt();

        int sum = product(num1, num2);
        System.out.println(sum);

        // Add(num1, num2);

        // System.out.print("Enter Your Number: ");
        // int num = sc.nextInt();

        // factorialOfNumber(num);


    }

    public static void Add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of two number is : " + sum);
    }

    public static void factorialOfNumber(int n) {
        if (n <= 0) {
            System.out.println("INVALIED NUMBER");
        } else {
            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }

    }
    public static int product(int a, int b) {
        return a*b;
    }

}
