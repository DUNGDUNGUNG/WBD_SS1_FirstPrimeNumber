package com.codegym.firstprime;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int n = 20;
        for (int j = 1; ; j++) {
            if (isPrime(j)) {
                System.out.print(j + "\t");
                count++;
            }
            if (count == n) {
                break;
            }
        }

    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
