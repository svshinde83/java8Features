package org.lambdas.common.second;

/**
 * Created by svshinde83 on 23/01/2017.
 */
public class ClosuresSample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        doProcess(a, iThArgument -> System.out.println(iThArgument + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
