package com.CodeChallenges;


// Create a new class called VipCustomer
// it should have 3 fields name, credit limit, and email address
// create 3 constructors
// 1st. constructor empty should call the constructor with 3 parameters with default values
// 2nd. constructor should pass on the 2 values it receives and add a default value for the 3rd param.
// 3rd. constructor only for this using code generation of intellij as setters won't be needed
// test and confirm it works.


import java.sql.SQLOutput;

public class VipCustomer {
    public static void main(String[] args) {
        System.out.println(" ***** person 1 ****");
    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        System.out.println(" ***** person 2 ****");
     VipCustomer person2 = new VipCustomer("Sub", 25000);
        System.out.println("Vip customer name =  " + person2.getName());
        System.out.println("credit limit = "+ person2.getCreditLimit());

        System.out.println(" ***** person 3 ****");
        VipCustomer person3 = new VipCustomer("Bob", 10500, "bob@email.com");
        System.out.println("Vip customer name =  " + person3.getName());
        System.out.println("credit limit = " + person3.getCreditLimit());
        System.out.println("Customer email address = " + person3.getEmailAddress());
    }
    private String name;
    private double creditLimit;
    private String emailAddress;

    // 1st constructor set as default value
    public VipCustomer(){
        this("Default name", 100000, "Default emailAddress"  );
    }
    // 2nd constructor set only 2 params
    public VipCustomer(String name, double creditLimit) {
       this(name, creditLimit, "unknown email@gmail.com");
    }
    // 3rd constructor set 3 params
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
