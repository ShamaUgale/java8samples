package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(30);
        l.add(35);
        l.add(5);
        l.add(0);

        // print all the list components

        l.stream().forEach(System.out::println);

        // get all even numbers form the list using streams
        List<Integer> even = l.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("Even list is : " + even);

    }
}
