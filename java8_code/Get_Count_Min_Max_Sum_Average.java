package java8_code;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Get_Count_Min_Max_Sum_Average {

    public static void main(String[] args) {

        EmployeeDetails emp1 = new EmployeeDetails(101,"priyo",25,10500) ;

        EmployeeDetails emp2 = new EmployeeDetails(102,"arpita",23,15000) ;

        EmployeeDetails emp3 = new EmployeeDetails(103,"kamakhya",30,125000) ;

        EmployeeDetails emp4 = new EmployeeDetails(104,"rohit",27,25000) ;

        EmployeeDetails emp5 = new EmployeeDetails(105,"sandeep",25,13000) ;

        List<EmployeeDetails> allEmp = Arrays.asList(emp1,emp2,emp3,emp4,emp5) ;



        List<Integer> ages = allEmp.stream().map(m-> m.getAge()).sorted().collect(Collectors.toList()) ;

        List<Integer> secondAndThirdAge = ages.stream().skip(1).limit(2).collect(Collectors.toList()) ;

        System.out.println(secondAndThirdAge) ;

        System.out.println(ages) ; // sorted age

        IntSummaryStatistics summary = ages.stream().mapToInt(e-> e).summaryStatistics() ;

        System.out.println(summary.getMax()); // max age
        System.out.println(summary.getMin()); // min age

        List<String> nameList = allEmp.stream().map(e-> e.getName()).collect(Collectors.toList()) ;

        String name = nameList.stream().map(e-> e.toUpperCase()).collect(Collectors.joining(", ")) ;

        System.out.println("name is separated by specified delimiter : "+name) ;




    }
}

class EmployeeDetails {

    int emp_id ;
    String name ;
    int age;
    long salary ;

    public EmployeeDetails(int emp_id, String name, int age, long salary) {
        this.emp_id = emp_id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
