package com;

public class Person {
    public static void main(String[] args) {
       Person person = new Person();
        person.setFirstName(" "); // set to empty string
        person.setLastName("");
        person.setAge(10);

        System.out.println("full name: " + person.getFullName());
        System.out.println("Is Teen :  " + person.isTeen());
       person.setFirstName("John");
       person.setAge(18);
        System.out.println("Full name : " + person.getFullName());
        System.out.println("Is teen : " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name : " + person.getFullName());
    }
    private String firstName;
    private String lastName;
    private int age =0;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge(int age) {
        // if(age < 0 || age > 100) return this.age = 0;
//        this.age = age;
        this.age = (age < 0 || age > 100) ? 0: age; // ternary operator
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen(){
//        if(age > 12 && age < 20) return true;
//        return false;
         return (age > 12 && age < 20);
    }
    public String getFullName(){
        // This solution
//        if(firstName.isEmpty() && lastName.isEmpty()) return " ";
//        if(firstName.isEmpty()) return lastName;
//        if(lastName.isEmpty()) return firstName;
//        return firstName +" "+ lastName;

        // or this solution;
//        return (firstName.isEmpty() && lastName.isEmpty()) ? " ":
//                (firstName.isEmpty()) ? lastName :
//                        (lastName.isEmpty()) ? firstName : firstName + " " + lastName; // ternary.

        // or this one
        return (lastName.isEmpty() ? firstName: (firstName.isEmpty()) ? lastName: firstName + " " + lastName);

        // or this solution
//        firstName = (firstName == null) ? "" : firstName;
//        lastName = (lastName == null) ? "" : lastName;
//        return String.join(" ", firstName, lastName).trim();
}

}