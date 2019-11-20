package com.java;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {

        // write your code here
        Greeter greeter = new Greeter();
        HelloWorldGreetingImpl helloWorldGreetingImpl = new HelloWorldGreetingImpl();
        greeter.greet(helloWorldGreetingImpl);
    }
}
