package collection_code.cursors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

    public static void main(String[] args) {
        List<EmployeeE1> list = new ArrayList<>() ;
        EmployeeE1 e1=new EmployeeE1("Mahabir", 220);
        EmployeeE1 e2=new EmployeeE1("Priya", 250);
        EmployeeE1 e3=new EmployeeE1("Mahabir", 520);
        EmployeeE1 e4=new EmployeeE1("Satya", 120);
        EmployeeE1 e5=new EmployeeE1("Rashmi", 820);


        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list, new Comparator<EmployeeE1>() {
            @Override
            public int compare(EmployeeE1 o1, EmployeeE1 o2) {
                return o1.name.compareTo(o2.name) ;
            }
        });

     }

}
class EmployeeE1  {
    String name;
    double salary;

    public EmployeeE1(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }



    @Override
    public String toString() {
        return "EmployeeE1 [name=" + name + ", salary=" + salary + "]";
    }


}