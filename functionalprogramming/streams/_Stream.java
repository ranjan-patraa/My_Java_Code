package functionalprogramming.streams;

import functionalprogramming.FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

import static functionalprogramming.streams._Stream.Gender.FEMALE;
import static functionalprogramming.streams._Stream.Gender.MALE;


public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new   Person("John",  MALE) ,
                new   Person("Maria", FEMALE) ,
                new  Person("Aisha", FEMALE) ,
                new  Person("Alex",  MALE) ,
                new  Person("Alice", FEMALE)

        ) ;

        boolean b  = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        System.out.println(b) ;
    }

    static class Person {

    private final String name ;
    private final _Stream.Gender gender ;

    public Person(String name, _Stream.Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String toString() {

        return name + " " + gender ;
    }
}

 enum Gender {

    MALE ,FEMALE
  }
}