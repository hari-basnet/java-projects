package com.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Animal animal = new Animal("Animal", 1,1,5,5);
        animal.eat();
        animal.move(20);
    
        System.out.println("--------------------------------------------------------------");
        
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long Silky");
        dog.eat();
        dog.walk();

        System.out.println("--------------------------------------------------------------");

        // vehicle class
        Prius prius = new Prius(22);
        prius.accelerate(30);
        prius.accelerate(20);
    }
}
