package com.abc.lambdas.common.first;

/**
 * Created by svshinde83 on 23/01/2017.
 */
public class TypeInferenceExample {

    public static void main(String[] args) {
        printLambda(String::length);

    }


    public static void printLambda(StringLengthLambda l) {
        System.out.print(l.getLength("Get me length of this String"));
    }


    interface StringLengthLambda {
        int getLength(String s);
    }

}
