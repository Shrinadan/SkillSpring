package com.cognizant;

// 1. Create an abstract interface to allow extension without modification
interface Flyable {
    void fly();
}
// simple open for extension but closed for modification

// 2. Implement the interface for specific bird behaviors
class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow flies at medium heights.");
    }
}

class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle flies extremely high!");
    }
}

// 3. The Controller class stays closed for modification but open for new Flyable types
class BirdFlightController {
    public void makeBirdFly(Flyable bird) {
        bird.fly(); // Polymorphic call
    }
}

// Main execution class
public class OpenClosed {
    public static void main(String[] args) {
        BirdFlightController controller = new BirdFlightController();
        
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();
        
        System.out.println("Executing Open-Closed Principle -----------------");
        controller.makeBirdFly(sparrow);
        controller.makeBirdFly(eagle);
    }
}
