package main.java;

import java.util.stream.Stream;

public class NewProject {
    public static void main(String[] args) {
        Stream.builder().add("hello").add("world").build().forEach(System.out::println);
    }
}
