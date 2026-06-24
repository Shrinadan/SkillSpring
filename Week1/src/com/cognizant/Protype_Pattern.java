package com.cognizant;

class Emplo implements Cloneable {

    private int id;
    private String name;

    public Emplo(int id, String name) {
        System.out.println("Heavy Object Creation...");
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }
}

public class Protype_Pattern {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Emplo e1 = new Emplo(1, "Rahul");

        Emplo e2 = (Emplo) e1.clone();

        e2.setName("Amit");

        e1.display();
        e2.display();
    }
}