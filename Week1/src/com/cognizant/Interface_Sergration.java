package com.cognizant;

interface Switchable {
    void turnOn();
    void turnOff();
}

interface LightControl {
    void adjustBrightness();
}

interface VideoRecordable {
    void recordVideo();
}

class SmartBulb implements Switchable, LightControl {
    public void turnOn() { 
        System.out.println("SmartBulb: Bulb on ho gaya hai."); 
    }
    public void turnOff() { 
        System.out.println("SmartBulb: Bulb off ho gaya hai."); 
    }
    public void adjustBrightness() { 
        System.out.println("SmartBulb: Brightness 50% kar di gayi hai."); 
    }
}

class SmartCamera implements Switchable, VideoRecordable {
    public void turnOn() { 
        System.out.println("SmartCamera: Camera on ho gaya hai."); 
    }
    public void turnOff() { 
        System.out.println("SmartCamera: Camera off ho gaya hai."); 
    }
    public void recordVideo() { 
        System.out.println("SmartCamera: Video recording shuru ho gayi hai."); 
    }
}

public class Interface_Sergration {
    public static void main(String[] args) {
        System.out.println("--- Testing Smart Bulb ---");
        SmartBulb myBulb = new SmartBulb();
        myBulb.turnOn();
        myBulb.adjustBrightness();
        myBulb.turnOff();

        System.out.println("\n--- Testing Smart Camera ---");
        SmartCamera myCamera = new SmartCamera();
        myCamera.turnOn();
        myCamera.recordVideo();
        myCamera.turnOff();
        
        // Yahan bulb ke paas recordVideo() ka koi faltu method nahi hai, 
        // isliye compile time par hi code bilkul safe hai!
    }
}