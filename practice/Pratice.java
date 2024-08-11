package practice;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Pratice {


    public static void main(String[] args) {
/*

        String[] s = {"banana", "Apple", "banana", "grapes", "avocodo", "avocodo", "banana"};


      */
/*  int arr[] = {12, 34, 56, 78, 89, 90, 23, 45, 12, 50, 50};
        int b[] = {12, 24, 56, 38, 89, 91, 13, 45, 12, 50, 50};*//*

        //        List<Integer>  listInteger = Arrays.asList(a);
        List<String> listString = Arrays.asList(s);

//        String ss = "The" ;
//        String s1  = "CarRace" ;
//        String str = "Java J2EE Java JSP J2EE"  ;
//
        String car = "CarRace";
        String race = "raceCar";


       Comparator c = new Comparator<Student>() {  // (Student o1, Student o2)->o1.id-o2.id ;

           @Override
           public int compare(Student o1, Student o2) {
               return 0;
           }
       } ;

         LocalDate ld = LocalDate.now() ;

         LocalDate l = LocalDate.of(2001,8,1) ;

         System.out.println(ChronoUnit.YEARS.between(l,ld)) ;

         // empty(),of(),ofNullable()

        String s1  =  null ;

        Optional<String> o = Optional.empty() ;
        System.out.println(o) ; // Optional.empty


        Optional<String> string = Optional.ofNullable(s1) ; // non_null -> create emptyOptional Object

       // string.orElseThrow(()->new RuntimeException("put valid input")) ;

        System.out.println(string) ; // Optional.empty

        if(string.isPresent()) {

            System.out.println("value is : "+string.get()) ;
        }else {

            System.out.println("insert value") ;
        }


      //  Optional<String> o1 = Optional.of(s1) ;// cant store non_null [nullPointerException]


        // filter(), map(),forEach(),sorted(),max(),min(),sum(),avrg(),distnict()


        Stream st = Stream.of(1,2,3,4,5) ;
        Stream st1 = Stream.of(6,7,8,9,10) ;

       // Stream.concat(st,st1).forEach(System.out::print) ;

        int a[] = {1,2,3,4,5} ;

        int i = Arrays.stream(a).sum() ;
        System.out.println(i) ;

        int aaa  = Arrays.stream(a).reduce((ll,l1)->ll+l1).getAsInt() ;
        System.out.println(aaa);



        String[] arr={"Hello" ,"Hey"} ;

        for(int j = 0 ; j < arr.length ; j++) {

            if(arr[0].charAt(j) == arr[1].charAt(j)) {

                System.out.print(arr[0].charAt(j)) ;
*/


        String stri = "javA concept of the day";

       String firstRepitedCharacter = Arrays.stream(Arrays.stream(stri.split("\\s+")).filter(word->!word.isEmpty()).map(w->w.toLowerCase()).collect(Collectors.joining())
                .split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(f->f.getValue() > 1).map(Map.Entry::getKey)
               .reduce((first, second) -> second)
               .orElse(null);

        System.out.println(firstRepitedCharacter) ;


        String ss = Arrays.stream(stri.split("")).map(i -> i.toUpperCase())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();

        System.out.println(ss);

        


    }

}




































