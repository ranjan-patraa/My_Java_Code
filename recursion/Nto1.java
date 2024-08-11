package recursion;

public class Nto1 {

    public static void main(String[] args) {

        foo(5);
    }

    static void foo(int n) {

        if(n==0){
            return;
        }

        System.out.println(n) ;

        foo(n-1) ;

        System.out.println(n) ;
    }
}
