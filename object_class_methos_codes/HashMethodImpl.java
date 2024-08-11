package object_class_methos_codes;

import java.util.Objects;

public class HashMethodImpl {

    public static void main(String[] args) {

        Employee em1 = new Employee("priyo",99,7388379) ;

        Employee em2 = new Employee("mishu",98,7748494) ;

        Employee em3 = new Employee("manisha",96,783829) ;

        Employee em4 = new Employee("honey",94,787393983) ;

        Employee em5 = null ;

       /*

       System.out.println(em5) ; // null ,

        when not override toString method ; jvm invoke toString method automatically for which reference variable hold address of object,

        System.out.println(em1) ; // fullyqualifiedclassnem@hexadecimalOfhashcode
*/

       // (when override toString it print the content of object)  System.out.println(em1) ;

        System.out.println(em1.hashCode()) ;

        System.out.println(em2.hashCode());

        System.out.println(em3.hashCode());

        System.out.println(em4.hashCode());

        System.out.println(em5.hashCode());





    }
}

class Employee {

    String name ;
    int id ;
    long phone ;

    public Employee(String name, int id, long phone) {

        this.name = name;
        this.id = id;
        this.phone = phone;
    }



    @Override
    public int hashCode() {

     //  return Objects.hash(id, phone);

    return (int) (phone|id);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                '}';
    }
}