import java.util.Scanner;

// 1) Make a function to check if a number is prime or not.
// 2) Make a function to check if a given number n is even or not.
// 3) Make a function to print the table of a given number n.



public class FunctionExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        // CheckPrime(num);

        // CheckEven(num);

        table(num);


        
    }
    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("n * i = "+ n*i);
        }
    }

    public static void CheckEven(int n) {
        if (n%2==0) {
            System.out.println(n + " is even number");
        }else{
            System.out.println(n + " is odd number");
        }
    }

    public static void CheckPrime(int n) {
        int constant = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    constant++;
                }
        }
        if (constant == 2) {
            System.out.println(n + " is prime number.");
        }else{
            System.out.println(n + " is not prime number.");
        }
    }
    
}
