package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // create a new data type call porsche.
        Car bmw = new Car();
        // value before getModel method.
        // System.out.println("Model is " + holden.getModel());
        porsche.setModel("911");
        porsche.setWheels(5);

         System.out.println("The Car Model is: " + porsche.getModel());
        System.out.println("The number of wheel is:  " + porsche.getWheels());




        // write your code here
        // Create a for statement using of numbers from 1 to 1000 inclusive
        // Sum all the numbers tha can be divided with both 3 and 5
        // for those number that met the above conditions. print out the
        // Break-out the loop once you find 5 numbers that met the above conditions
        // After breaking out the loop print the sum of the numbers that met the above conditions


        int count = 0;
        int sum = 0;
        for(int i = 1; i < 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;
                System.out.println("Found the number = " + i);
            }
            if(count == 10) {
                break;
            }
        }
        System.out.println("sum of the numbers = " + sum);
    }
}
