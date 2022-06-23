package org.example;

public class Main {
    public static void main(String[] args) {
        // polymorphism = 	greek word for poly-"many", morph-"form"
        //					The ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] racers = {car,bike,boat};

        for (Vehicle x : racers ) {
            x.go();

        }


    }
}