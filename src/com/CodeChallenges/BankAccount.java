package com.CodeChallenges;

public class BankAccount {
    public static void main(String[] args) {
    BankAccount bobsAccount = new BankAccount();//("12345", 0.00, "Bob Brown", "bob@gmail.com", "515-683222");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);
        System.out.println("Bob account balance = " + bobsAccount.getBalance());

        System.out.println(" ****** New constructor with Sub account name ******* ");
        BankAccount subsAccount = new BankAccount("Sub", "sub@email.com", "671-888-9999");
      System.out.println(subsAccount.getAccountNumber() + " name " + subsAccount.phoneNumber);


    }
    // Create a new class for a bank account
    // Create fields for the acc. number, balance, customer name, email and phone number.
    // Create getters and setters for each field
    // Create 2 additional methods
    // 1. To allow the customer to deposit funds.(This should increment the balance field)
    // 2. To allow the customer to withdraw funds.(This should deduct from the balance field).
    // but not allow the withdrawal to complete if there are insufficient funds.
    // You will want to create various code int the Main class (the on created by intellij) to confirm your code is working
    // Add some System.out.println;s in the 2 methods above as well.

    private String  accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this("67890", 0.00, "Default name", "Default email@default.com",
                " default 000-000-000"); // set as a default account if the parameter empty.
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        System.out.println("Bank account constructor called!");
        this.accountNumber = accountNumber;// or setAccountNumber(accountNumber);
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }
        public BankAccount(String customerName, String customerEmail, String phoneNumber) {
            this("",505.00 ," ", " ", "671-999-9999");
        }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("Only " + balance + " available. Withdrawal not processes");
        }else{
            balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone_number) {
        this.phoneNumber = phoneNumber;
    }
}
