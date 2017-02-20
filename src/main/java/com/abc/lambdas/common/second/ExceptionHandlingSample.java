package com.abc.lambdas.common.second;

import java.util.function.BiConsumer;

import static java.lang.System.out;

/**
 * Created by svshinde83 on 23/01/2017.
 */
public class ExceptionHandlingSample {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 2;

        process(someNumbers, key, wrapperOnLambda((v, k) -> out.println(v)));


    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }

    }

    private static BiConsumer<Integer, Integer> wrapperOnLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                out.println("Exception caught in wrapper lambda");
            }

        };
    }
}
