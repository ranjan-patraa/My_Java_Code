package object_class_methos_codes;

public class DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Hai h = new Hai(10) ;

        Hello hello = new Hello(20,h) ;

        Hello hello1 = (Hello) hello.clone();

        hello1.show() ;

        System.out.println("___________________");

        hello.show() ;

        System.out.println("___________________");

        System.out.println(hello1 == hello) ;

        hello1.y = 30 ;

        hello1.show() ;

        System.out.println("___________________");

        hello.show() ;

        System.out.println("___________________");

        hello1.hai.x = 100 ;

        hello1.show() ;

        System.out.println("___________________");

        hello.show() ;

    }
}

class Hai {

    int x ;

    Hai( int x) {

        this. x = x ;
    }
}

class Hello implements Cloneable {

    int y ;
    Hai hai ;

    public Hello(int y, Hai hai) {

        this.y = y;
        this.hai = hai;
    }

    void show() {

        System.out.println("Hello : Y =  "+ y) ;
        System.out.println("Hello : X =  "+ hai.x) ;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {

        if(this instanceof Cloneable) {
            Hai hai = new Hai(this.hai.x);
            Hello hello = new Hello(y, hai);

            return hello;

        }else

             throw new CloneNotSupportedException();

    }
}
