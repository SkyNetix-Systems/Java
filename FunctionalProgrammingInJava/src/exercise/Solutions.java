package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Solutions {

    public static void main(String[] args){
        Function<String, String> upCase = String::toUpperCase;
        System.out.println(upCase.apply("Akhilesh"));
        Stream.of(1, 2, 3, 4, 5).filter(n -> n%2 == 0).forEach(System.out::println);
        List<String> names = Arrays.asList("Ravi", "Akhilesh", "Ashlesha", "Ishan", "Ishika");
        names.stream().sorted().forEach(System.out::println);


    }
}
