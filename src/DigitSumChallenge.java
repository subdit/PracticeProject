public class DigitSumChallenge {
    public static void main(StringString[] args){
//        int i = 0;
//        do {
//            System.out.println("Print i : " + i);
//            i++;
//        } while (i < 6);


//        sumDigits(125);
        System.out.println("The sum of the digits 125 in the number is = " + sumDigits(225));
        System.out.println("The sum of the digits 125 in the number is = " + sumDigits(-125));
        System.out.println("The sum of the digits 125 in the number is = " + sumDigits(4));
        System.out.println("The sum of the digits 125 in the number is = " + sumDigits(327823));
        System.out.println("The sum of the digits 125 in the number is = " + sumDigits(10));

        // Write a method with the name sumDigits that has one int param called number
        // if param is >= 10 then the method should process the number and return sum of all digits,
        // otherwise return -1 to indicate an invalid value
        // the numbers from 0-9 have 1 digit, so we don't want to process them. also,we don't want ot process negative numbers,
        // so also return -1 for negative numbers
        // For example calling the method sumDigits(125) should return 8 since 1+2+5 = 8
        // Calling the method sumDigits(1) should return -1 as per requirement described above
        // Test out the solution.

    }

        private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 10){ // pay attention to the condition loop
           int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

}