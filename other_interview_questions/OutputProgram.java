package other_interview_questions;

public class OutputProgram {

    public static void main(String[] args) {

        foo(1234) ;
    }

    public static void foo(int a ) {

        System.out.println(a%10) ;

        if(a/10 != 0){  // a%10 == 0 ;

            foo(a/10) ;
        }

        System.out.println(a%10) ;
    }
}
