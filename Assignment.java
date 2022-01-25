package com.rohan;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Input");
        int n = in.nextInt();
        //int b = in.nextInt();
       // int c = in.nextInt();


        // String res = Odd_or_Even(n);
        // System.out.println(res);

        //  String vote = Vote(n);
        //  System.out.println(vote);

        // int sum = Sum(n, b);
        // System.out.println("The Sum is " + sum);

        // circle(n);

        // boolean prime = Prime(n);
        // System.out.println(prime);

        // String result = Result(n);
        // System.out.println(result);

        // Factorial(n);

        // boolean palindrome = Palindrome(55);
        // System.out.println(palindrome);

        // Triplet(n, b, c);


        // All_Prime(n, b);

        // Primes(n, b);

        System.out.println(n_Sum(n));
    }

    // 1) PROGRAM FOR WHETHER A NUMBER IS EVEN OR ODD

    static String Odd_or_Even(int n) {
        while (n > 0) {
            if (n % 2 == 0) {
                return "Even";
            } else
                return "Odd";
        }
        return null;
    }

    // 2) PROGRAM FOR WHETHER USER IS ELIGIBLE TO GIVE VOTE OR NOT

    static String Vote(int n) {
        while (n > 0) {
            if (n >= 18) {
                return "Yes";
            } else
                return "No";
        }
        return null;
    }

    // 3) PROGRAM TO GET THE SUM OF TWO NUMBERS

    static int Sum(int n, int b) {
        return n + b;
    }

    // 4) PROGRAM FOR CIRCUMFERENCE AND AREA OF CIRCLE

    static void circle(int n) {
        int pi = 22 / 7;
        System.out.println("Circumference is " + 2 * pi * n);
        System.out.println("Area is " + pi * n * n);
    }

    // 5) PROGRAM TO PREDICT WHETHER A NUMBER IS PRIME OR NOT

    static boolean Prime(int n) {
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    // 6) PROGRAM THAT TAKES INPUT FROM USER & PRINT GRADES

    static String Result(int n) {
        String grades = null;
        if (n <= 40) grades = "FAIL";
        else {
            if (n >= 41 && n <= 50)
                grades = "DD";
            else if (n >= 51 && n <= 60)
                grades = "CD";
            else if (n >= 61 && n <= 70)
                grades = "BC";
            else if (n >= 71 && n <= 80)
                grades = "BB";
            else if (n >= 81 && n <= 90)
                grades = "AB";
            else if (n >= 91)
                grades = "AA";
        }
        return grades;
    }
    // 6) OR Factorial of N numbers.
    static void Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of the Number " + n + " is " + fact);
    }

    // 7) CHECK WHETHER A NUMBER IS PALINDROME OR NOT

    static boolean Palindrome(int k) {
        int original = k;
        int ans = 0;
        while (k > 0) {
            int rem = k % 10;
            ans = ans * 10 + rem;
            k = k / 10;

        }
        return ans == original;
    }

    // 8) CHECK WHETHER A NUMBER IS A PYTHAGOREAN TRIPLET OR NOT
    static void Triplet(int n, int b, int c) {
        int original = c * c;
        int b2 = b * b;
        int n2 = n * n;
        int ans = b2 + n2;

        if (original == ans) {
            System.out.println("They Are Pythagorean Triplet");
        } else
            System.out.println("No ");
    }

    // 9) PRINTING ALL PRIME NUMBERS WITHIN RANGE

    static void All_Prime(int n, int b){
        int i,j,flag;
        for (i = n; i <= b; i++){
            if (i == 1 || i == 0){
                continue;
            }
            flag = 1;
            for (j = 2; j <= i / 2; ++j){
                if ( i % j == 0){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                System.out.println( i );
            }
        }

    }

    // 9)or) PRINTING ALL PRIME NUMBERS WITHIN RANGE

    static void Primes(int n, int b){
        for (int i = n; i <= b; i++){
            if (isPrime(i))
            System.out.println(i);
        }
    }
    // ** CHECKING A NUMBER IS PRIME OR NOT
    static boolean isPrime(int num){
        if (num <= 2){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    // 10) PRINT SUM OF FIRST n NATURAL NUMBERS

    static int n_Sum(int n){
        int res = 0;
        for (int i = 1; i <= n; i++){
            res = res + i;
        }
        return res;
    }


}
