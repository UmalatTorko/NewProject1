package main.java;

import java.util.stream.Stream;

public class NewProject {
    public static void main(String[] args) {
        Stream.builder().add("helloWorld").build().forEach(System.out::println);
    }
}
