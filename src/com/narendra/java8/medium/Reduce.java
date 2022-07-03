package com.narendra.java8.medium;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OptionalDouble reduce = IntStream.of(input)
                .mapToDouble(x -> x).reduce((x, y) -> x + y);

        // .reduce(0, Double::sum);
        System.out.println(reduce.isPresent() ? reduce.getAsDouble() : null);

        String stringInput[] = {"Narendra", "Nani", "Chathurya", "Riya", "Gobbu", "Bobby"};


        Stream<String> stream = Arrays.stream(stringInput);
        List<String> collect = stream.sorted()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);


    }
}
