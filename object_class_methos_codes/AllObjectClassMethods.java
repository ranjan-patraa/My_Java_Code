package object_class_methos_codes;

public class AllObjectClassMethods {

    public static void main(String[] args) throws  Exception {

        Cat cat  = new Cat(10) ;

        Dog dog  = new Dog(cat,20) ;

        Dog dog2  = (Dog)dog.clone() ;

        System.out.println(dog2) ;
        System.out.println(dog) ;

        dog.cat.j = 15 ;
        dog.i = 30 ;

        System.out.println(dog2) ;
        System.out.println(dog) ;
    }
}

class Cat {

    int j ;

    public Cat(int j ){

        this.j =  j ;
    }

    @Override
    public String toString() {

        return "Cat{" +
                "j=" + j +
                '}';
    }
}

class Dog implements Cloneable {

    Cat cat ;
    int i ;

    public Dog(Cat cat , int i ) {

        this.cat  = cat ;
        this.i  = i ;
    }

//    public Object clone() throws CloneNotSupportedException {
//
//        return super.clone()  ;
//    }

    public Object clone() {

        Cat c  = new Cat(cat.j) ;
        Dog d = new Dog(c,i) ;

        return d ;
    }

    public String toString() {

        return  "Dog{i="+i+"} "+cat ;
    }
}
