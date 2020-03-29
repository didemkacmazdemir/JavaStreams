package examples;

import beans.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        //Filter
        List<String> deneme = Arrays.asList("deneme", "kamasxs", "deklmdl");
        List<String> streamedList = deneme.stream()
                .filter(element -> !"deneme".equals(element))
                .collect(Collectors.toList());
        streamedList.forEach(System.out::println);

        //findAny
        List<Person> personList = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
        Person person = personList.stream()
                .filter(element -> "jack".equals(element.getName()))
                .findAny()
                .orElse(null);
    }
}

