package com.CodeChallenges;

public class DigitSumChallenge {
    // Write a method with the name sumDigits that has one int param called number
    // if param is >= 10 then the method should process the number and return sum of all digits,
    // otherwise return -1 to indicate an invalid value
    // the numbers from 0-9 have 1 digit, so we don't want to process them. also,we don't want to process negative numbers,
    // so also return -1 for negative numbers
    // For example calling the method sumDigits(125) should return 8 since 1+2+5 = 8
    // Calling the method sumDigits(1) should return -1 as per requirement described above
    // Test out the solution.

    public static void main(String[] args) {
        System.out.println("The sum of digits in number = " + sumDigits(125));
    }
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 % 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5;
        while(number > 0){
            // extract the least-significant digit
            int digit = number % 10;
            // Add digit to sum;
            sum += digit;
            // Drop least-significant digit
           number /= 10; // same as number = number / 10'
        }
        return sum;

    }
}
