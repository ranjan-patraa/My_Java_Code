package recursion;

public class MethodCall {

    public static void main(String[] args) {

        print1(1) ;
    }

    private static void print1(int n) {

        System.out.println(n) ;

        print2(2) ;

        System.out.println(n) ;
    }

    private static void print2(int i) {

        System.out.println(i) ;

        print3(3) ;

        System.out.println(i) ;
    }

    private static void print3(int i) {

        System.out.println(i) ;

        print4(4) ;

        System.out.println(i) ;
    }

    private static void print4(int i) {

        System.out.println(i) ;

        System.out.println(i) ;
    }
}
