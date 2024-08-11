package object_class_methos_codes;

public class Clone_Method_Shallow {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address_Shallow ad = new Address_Shallow(752106 ) ;

        Employee_Shallow es1 = new Employee_Shallow(101,"priyo",ad ) ;

        Employee_Shallow es2 = (Employee_Shallow) es1 .clone() ;

        es2.show() ;

        System.out.println("___________________");

        es1.show() ;

        System.out.println("___________________");

        System.out.println(es1 == es2) ;

        es2.id = 102 ;

        es2.show() ;

        System.out.println("___________________");

        es1.show() ;

        System.out.println("___________________");

        es2.addressShallow.pinCode = 754004 ;

        es2.show() ;

        System.out.println("___________________");

        es1.show() ;



    }
}

class Address_Shallow {

    int pinCode ;

    public Address_Shallow(int pinCode) {

        this.pinCode = pinCode;
    }
}

class Employee_Shallow implements Cloneable {

    int id ;
    String name ;

    Address_Shallow addressShallow ;

    public Employee_Shallow(int id, String name, Address_Shallow addressShallow) {
        this.id = id;
        this.name = name;
        this.addressShallow = addressShallow;
    }

    void show() {

        System.out.println("Employee : id -> " + id ) ;

        System.out.println("Employee_name :  name -> " +  name ) ;

        System.out.println("Employee_Address : pin ->  " + addressShallow.pinCode) ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
