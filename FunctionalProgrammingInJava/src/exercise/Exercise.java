package exercise;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise {

    public static void main(String[] args){
        Predicate<String> p = String::isEmpty;
        String str1 = "";
        String str2 = "Hello";

        System.out.println(p.test(str1));

        Printable<String> stringPrinter = System.out::println;
        Printable<Integer> intPrinter = System.out::println;
        stringPrinter.print("Hello");
        intPrinter.print(123);

        // a) Using Retrivable interface and lambda
        Retrivable<Integer> retriever = () -> 77;
        System.out.println("Using Retrivable: " + retriever.retrive());

        // b) Using built-in Supplier interface and lambda
        Supplier<Integer> supplier = () -> 77;
        System.out.println("Using Supplier: " + supplier.get());

        // a) Using a lambda with custom Evaluate interface
        Evaluate<Integer> isNegative = (n) -> n < 0;
        System.out.println("Evaluate(-1): " + isNegative.test(-1)); // true
        System.out.println("Evaluate(+1): " + isNegative.test(1));  // false

        // b) Using built-in Predicate
        Predicate<Integer> isNegativePred = (n) -> n < 0;
        System.out.println("Predicate(-1): " + isNegativePred.test(-1)); // true
        System.out.println("Predicate(+1): " + isNegativePred.test(1));  // false

        System.out.println();

        // c) Generic check() method usage

        // Check if a number is even
        System.out.println("Is 4 even? " + check(4, n -> n % 2 == 0)); // true
        System.out.println("Is 7 even? " + check(7, n -> n % 2 == 0)); // false

        // Check if a string starts with "Mr."
        System.out.println("Starts with Mr.? " + check("Mr. Joe Bloggs", s -> s.startsWith("Mr."))); // true
        System.out.println("Starts with Mr.? " + check("Ms. Ann Bloggs", s -> s.startsWith("Mr."))); // false

        // Check if a person is an adult (age >= 18)
        Person mike = new Person("Mike", 33, 1.8);
        Person ann = new Person("Ann", 13, 1.4);

        System.out.println("Is Mike an adult? " + check(mike, person -> person.age >= 18)); // true
        System.out.println("Is Ann an adult? " + check(ann, person -> person.age >= 18));   // false
    }

    // c) Generic check method
    public static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }

    static record  Person(String name, int age, double height){}
}
