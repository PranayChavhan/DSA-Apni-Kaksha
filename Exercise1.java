import java.util.Scanner;
// 1) Enter 3 numbers from the user & make a function to print their average.
// 2) Write a function to print the sum of all odd numbers from 1 to n.
// 3) Write a function which takes in 2 numbers and returns the greater of those two.
// 4) Write a function that takes in the radius as input and returns the circumference of a circle.
// 5) Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// 6) Write an infinite loop using do while condition.
7) Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.


public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        // System.out.print("Enter Second Number: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter Third Number: ");
        // int num3 = sc.nextInt();

        // Avarage(num1, num2, num3);

        // OddNumber(num1);

        // GreaterNumber(num1, num2);

        // circumference(num1);

        // elligibleORnot(num1);

        do {
            System.out.println("Infinite Loop");
        } while (num1 > 1);

    }

    public static void elligibleORnot(int age) {
        if (age >= 18) {
            System.out.println("You are elligible for vote");
        }

        else {
            System.out.println("You are not elligible for vote");
        }
    }

    public static void circumference(int r) {
        double circle = 2 * 3.14 * r;
        System.out.print(circle);
    }

    public static void GreaterNumber(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        }
        if (a < b) {
            System.out.println(b + " is greater");
        } else {
            System.out.println("equal");
        }

    }

    public static void OddNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int odd = i % 2;
            if (odd != 0) {
                System.out.println(i);
            }
        }
    }

    public static void Avarage(int a, int b, int c) {
        int avarage = (a + b + c) / 3;
        System.out.print("Avarage of three number is : " + avarage);
    }

}
