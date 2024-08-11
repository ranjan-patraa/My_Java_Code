package functionalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // without predicate

        System.out.println(phoneNumberValidate("917008189084")) ; // true
        System.out.println(phoneNumberValidate("797883982")) ; // false


        // with  predicate

        System.out.println(phoneNoValidPredicate.test("917008189084"));
        System.out.println(phoneNoValidPredicate.test("797883982"));

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10) ;

         // Collection (I) :-  stream() ;

         //l.stream().filter((i)->i>5 && i%2==0).forEach(s-> System.out.println(s)) ;



    }

    // Predicate
    static Predicate<String> phoneNoValidPredicate = (phoneNumber) ->
                             phoneNumber.startsWith("91") && phoneNumber.length() == 12 ;

    // normal function
    static boolean phoneNumberValidate(String phoneNumber) {


        return phoneNumber.startsWith("91") && phoneNumber.length() == 12 ;


    }
}
