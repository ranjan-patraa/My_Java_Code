package object_class_methos_codes;

import java.util.Objects;

public class EqualMethod {

    public static void main(String[] args) {

        StudentEqual se1 = new StudentEqual(99,"sri") ;

        StudentEqual se2 = new StudentEqual(99,"sri") ;

        StudentEqual se3 = new StudentEqual(991,"Arpita") ;

        System.out.println(se1 == se2) ; System.out.println(se1 == se3) ; System.out.println(se2 == se3) ;

        System.out.println("*********************************************");

        System.out.println(se1.equals(se2)) ; System.out.println(se1.equals(se3)) ; System.out.println(se3.equals(se2)) ;


    }
}

class StudentEqual {

    int s_id ;
    String s_name ;

    public StudentEqual(int s_id, String s_name) {

        this.s_id = s_id;
        this.s_name = s_name;
    }

    @Override
    public boolean equals(Object o) {

        if(o instanceof StudentEqual){

            StudentEqual se = (StudentEqual) o;

            return this.s_id == se.s_id && this.s_name.equals(se.s_name) ;
        }

        return  false ;
    }


}
