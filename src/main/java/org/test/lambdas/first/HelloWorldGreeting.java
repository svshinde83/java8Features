package org.test.lambdas.first;

/**
 * Created by svshinde83 on 22/01/2017.
 */
public class HelloWorldGreeting implements Greeting {

    @Override
    public void perform() {
        System.out.print("Hello world!");

    }

}