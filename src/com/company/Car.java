package com.company;
// Public is an access modify => private, protected,
//

import java.util.Locale;

// To state of the object = car
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // to allow main to get access to Car class we have to create method
    // Setter
    public void setModel(String model) {
         this.model = model; // to update the model
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
// Getter
    public String getModel() {

        return this.model.toLowerCase(Locale.ROOT);
    }
    public int getWheels(){
        return this.wheels;
    }

}

