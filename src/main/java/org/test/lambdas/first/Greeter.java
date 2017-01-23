package org.test.lambdas.first;

/**
 * Created by svshinde83 on 22/01/2017.
 */
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();


        Greeting lambdaGreeting = () -> System.out.println("Lambda Greeting!");

        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("inner class greeting !!");
            }
        };

        greeter.greet(new HelloWorldGreeting());
        System.out.println();
        greeter.greet(() -> System.out.println("Passed comment String argument"));
        greeter.greet(innerClassGreeting);
        greeter.greet(lambdaGreeting);

    }
}
