package string_code;

public class OneStringIsRotationOfAnother {

    public static void main(String[] args) {

        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";

        if(s1.length() != s2.length()) {

            System.out.println("String is not rotation of another") ;
        }
        else {

            String s3 = s1 + s1 ;

            if(s3.contains(s2)) {

                System.out.println("s2 is rotation of s1") ;
            }else {

                System.out.println("s2 is not rotation of s1") ;
            }
        }
    }

}
