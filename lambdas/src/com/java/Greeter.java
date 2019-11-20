package com.java;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {

        // write your code here
        Greeter greeter = new Greeter();

        Greeting helloWorldGreetingImpl = new HelloWorldGreetingImpl();  // created a new class
        Greeting myLambdaGreeting = () -> System.out.println("Hello world");  // just creating a function

        myLambdaGreeting.perform();
    }
}

