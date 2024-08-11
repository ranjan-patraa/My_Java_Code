package java8_code;

// Given an employee list , sort employees based on their salaries in desc order and fetch top 3 salary employee

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SinarioBasedProgram {

    public static void main(String[] args) {

        Employees e5 = new Employees(110,"priyo",1200) ;

        Employees e1 = new Employees(101,"priyo",8950);

        Employees e2 = new Employees(91,"sandeep",89500);

        Employees e3 = new Employees(105,"Ashutosh",1950);

        Employees e4 = new Employees(111,"Arpita",12000);

        Employees e6 = new Employees(9,"priyo",1200) ;

        List<Employees> listOfEmployee = Arrays.asList(e1,e2,e3,e4,e5,e6) ;

        List<Employees> list = listOfEmployee.stream().sorted( Comparator.comparing(Employees::getName).thenComparingInt(Employees::geteId)).collect(Collectors.toList()) ;
        System.out.println(list);

       // [Employees{eId=111, name='Arpita', salary=12000}, Employees{eId=105, name='Ashutosh', salary=1950}, Employees{eId=9, name='priyo', salary=1200}, Employees{eId=101, name='priyo', salary=8950}, Employees{eId=110, name='priyo', salary=1200}, Employees{eId=91, name='sandeep', salary=89500}]


        /*Collections.sort(listOfEmployee, new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {

                int i = o1.getName().compareTo(o2.getName()) ;

                if(i == 0) {

                    return o1.geteId()-o2.geteId() ;
                }
                return i ;
            }
        }) ;

        System.out.println(listOfEmployee) ;
*/
// [Employees{eId=111, name='Arpita', salary=12000}, Employees{eId=105, name='Ashutosh', salary=1950}, Employees{eId=101, name='priyo', salary=8950}, Employees{eId=91, name='sandeep', salary=89500}]
// [Employees{eId=111, name='Arpita', salary=12000}, Employees{eId=105, name='Ashutosh', salary=1950}, Employees{eId=101, name='priyo', salary=8950}, Employees{eId=110, name='priyo', salary=1200}, Employees{eId=91, name='sandeep', salary=89500}]
// [Employees{eId=111, name='Arpita', salary=12000}, Employees{eId=105, name='Ashutosh', salary=1950}, Employees{eId=9, name='priyo', salary=1200}, Employees{eId=101, name='priyo', salary=8950}, Employees{eId=110, name='priyo', salary=1200}, Employees{eId=91, name='sandeep', salary=89500}]



       List<Employees> empSortedList = listOfEmployee.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary()))
               .limit(2)
               .collect(Collectors.toList()) ;

        System.out.println(empSortedList);
    }
}

class Employees {

    private int eId ;
    private String name ;
    private long salary ;

    public Employees(int eId, String name, long salary) {
        this.eId = eId;
        this.name = name;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
