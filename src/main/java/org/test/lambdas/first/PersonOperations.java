package org.test.lambdas.first;

import org.test.lambdas.common.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by svshinde83 on 23/01/2017.
 */
public class PersonOperations {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Arnold", "Schwarzenneger", 60),
                new Person("Mike", "Tyson", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Jason", "Cook", 45),
                new Person("Good", "News", 39)
        );

        // Step 1: Sort list by last name
        Comparator<Person> comparator = (Person o1, Person o2) -> o1.getLastName().compareTo(o2.getLastName());
        Collections.sort(people, comparator);

        // Step 2: Create a method that prints all elements in the list
        people.forEach(System.out::println);
        System.out.println("-------------------------");
        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Printing all persons with first name beginning with C");
        printConditionally(people, p -> p.getFirstName().startsWith("A"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Condition {
        boolean test(Person p);
    }
}
