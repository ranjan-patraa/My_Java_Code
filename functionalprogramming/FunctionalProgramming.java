package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functionalprogramming.FunctionalProgramming.Gender.FEMALE;
import static functionalprogramming.FunctionalProgramming.Gender.MALE;

public class FunctionalProgramming {

    public static void main(String[] args) {

        List<Person> people = List.of(

                new Person("John",  MALE) ,
                new Person("Maria", FEMALE) ,
                new Person("Aisha", FEMALE) ,
                new Person("Alex",  MALE) ,
                new Person("Alice", FEMALE)

        ) ;

        // imperativeApproach

        List<Person> females  = new ArrayList<>() ;

        for(Person person : people) {

            if(FEMALE.equals(person.gender)){

                females.add(person) ;
            }
        }

        for(Person female : females) {

            System.out.println(female) ;
        }


        System.out.println("-----------------------------------");
        System.out.println("Declarative Approach") ;
        // Declarative Approach

        people.stream()
                .filter(person->FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println) ;
    }

    static class Person {

        private final String name ;
        private final Gender gender ;

        public Person(String name, Gender gender) {
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
