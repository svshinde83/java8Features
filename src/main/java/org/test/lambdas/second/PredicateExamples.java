package org.test.lambdas.second;

import org.test.lambdas.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by svshinde83 on 23/01/2017.
 */
public class PredicateExamples {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        performConditionally(people, p -> true, System.out::println);

        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Printing all persons with last name beginning with C");
        performConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println);

        System.out.println("Printing all persons with first name beginning with C");

        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        people.stream().filter(p -> predicate.test(p)).forEach(consumer::accept);
    }

}


