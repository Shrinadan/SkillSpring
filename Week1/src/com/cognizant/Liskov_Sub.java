package com.cognizant;


class Bird {
    public void fly() {
        System.out.println("Flying high!");
    }
}

class Parrot extends Bird {}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Violation: Throwing an unexpected exception breaks the contract
        throw new UnsupportedOperationException("Ostriches cannot fly!");
    }
}

public class Liskov_Sub {
    // This method expects ANY Bird to be able to fly
    public static void makeBirdFly(Bird bird) {
        bird.fly(); 
    }

    public static void main(String[] args) {
        Bird sparrow = new Parrot();
        makeBirdFly(sparrow); // Works: Prints "Flying high!"

        Bird ostrich = new Ostrich();
        makeBirdFly(ostrich); // Crashes: Throws UnsupportedOperationException
    }
}