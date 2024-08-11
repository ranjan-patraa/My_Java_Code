package java8_code;

import java.util.Arrays;
import java.util.List;

public class Terminal_Vs_NonTerminal_operation {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"code1") ;

        Employee e2 = new Employee(2,"code2") ;

        Employee e3 = new Employee(3,"code3") ;

        Employee e4 = new Employee(4,"code4") ;

        List<Employee> empList = Arrays.asList(e1,e2,e3,e4) ;

        List<Integer> intList = Arrays.asList(1,2,3,4,5) ;

        System.out.println( intList.stream().filter(i -> i%2==0).map(e -> e+e).filter(e-> e>5).count() );




        empList.stream()
                .filter(e->e.getId()%2==0) // -> inter mediate Operation
                .map(e-> {
                    e.printName();
                    return e.getName() ; // there class level method is present when you remove terminal operation ,intermediate is lazy loading .so it not print anything

                }).forEach(System.out::println);//-> Terminal operation


    }
}

class Employee {

    private  int id ;
    private String name ;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public  void printName() {

        System.out.println("In employee class : "+name) ;
    }
}