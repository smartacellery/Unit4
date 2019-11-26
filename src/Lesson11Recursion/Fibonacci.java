package Lesson11Recursion;

public class Fibonacci {

    static long count = 0L;

    public static void main(String[] args) {
        System.out.println("The 8th fib is " + fib1(8) + "!");
        System.out.println("The 8th fib (recursive) is " + recfib(8) + "!");
        System.out.println("recfib was called a total of " + count + " times");
        System.out.println("-------------------------------------------");
        System.out.println("The 10th fib is " + fib1(10) + "!");
        System.out.println("The 10th fib (recursive) is " + recfib(10) + "!");
        System.out.println("recfib was called a total of " + count + " times");
        System.out.println("-------------------------------------------");
        System.out.println("The 5th fib is " + fib1(5) + "!");
        System.out.println("The 5th fib (recursive) is " + recfib(5) + "!");
        System.out.println("recfib was called a total of " + count + " times");

    }

    public static int recfib(int num) {
        count++;
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return recfib(num - 1) + recfib(num - 2);
        }
    }

    public static int fib1(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        int num1 = 1, num2 = 1;
        int fib = 2;
        for (int i = 3; i <= num; i++) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
        return fib;
    }

}
