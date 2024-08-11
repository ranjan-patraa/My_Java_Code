package java8_code;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class RealTimeJava8Program {

    public static void main(String[] args) {


        List<RealEmployees> employeeList = new ArrayList<RealEmployees>();

        employeeList.add(new RealEmployees(111, "Jiya Brein", 32, "Female", "HR", "2011", 25000.0));
        employeeList.add(new RealEmployees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", "2015", 13500.0));
        employeeList.add(new RealEmployees(133, "Martin Theron", 29, "Male", "Infrastructure", "2012", 18000.0));
        employeeList.add(new RealEmployees(144, "Murali Gowda", 28, "Male", "Product Development", "2014", 32500.0));
        employeeList.add(new RealEmployees(155, "Nima Roy", 27, "Female", "HR", "2013", 22700.0));
        employeeList.add(new RealEmployees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", "2016", 10500.0));
        employeeList.add(new RealEmployees(177, "Manu Sharma", 35, "Male", "Account And Finance", "2010", 27000.0));
        employeeList.add(new RealEmployees(188, "Wang Liu", 31, "Male", "Product Development", "2015", 34500.0));
        employeeList.add(new RealEmployees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", "2016", 11500.0));
        employeeList.add(new RealEmployees(200, "Jaden Dough", 38, "Male", "Security And Transport", "2015", 11000.5));
        employeeList.add(new RealEmployees(211, "Jasna Kaur", 27, "Female", "Infrastructure", "2014", 15700.0));
        employeeList.add(new RealEmployees(222, "Nitin Joshi", 25, "Male", "Product Development", "2016", 28200.0));
        employeeList.add(new RealEmployees(233, "Jyothi Reddy", 27, "Female", "Account And Finance", "2013", 21300.0));
        employeeList.add(new RealEmployees(244, "Nicolus Den", 24, "Male", "Sales And Marketing", "2017", 10700.5));
        employeeList.add(new RealEmployees(255, "Ali Baig", 23, "Male", "Infrastructure", "2018", 12700.0));
        employeeList.add(new RealEmployees(266, "Sanvi Pandey", 26, "Female", "Product Development", "2015", 28900.0));
        employeeList.add(new RealEmployees(277, "Anuj Chettiar", 31, "Male", "Product Development", "2012", 35700.0));

    // java8 operations



        //employeeList.stream().filter(e->e.getSalary() < 50000 && Period.between(e.getYearOfJoining(), LocalDate.now()))

        //find out the count of male and female employees present in the organization ..

         Map<String,Long> countOfFemaleAndMale = employeeList.stream()
                .collect(Collectors.groupingBy(RealEmployees::getGender,Collectors.counting())) ;

        System.out.println(countOfFemaleAndMale) ;   //  {Male=11, Female=6}




        System.out.println("----------------------");

        //print the name of all the departments in the organization

        employeeList.stream().map(RealEmployees::getDepartment).distinct().forEach(System.out::println);

        // HR
        // Sales And Marketing
        // Infrastructure
        // Product Development
        // Security And Transport
        // Account And Finance

        System.out.println("----------------------");


        //find the average age of male and female
        Map<String,Double> averageAge = employeeList.stream()
                .collect(Collectors.groupingBy(RealEmployees::getGender,Collectors.averagingInt(RealEmployees::getAge))) ;

         
        System.out.println(averageAge) ;  //  {Male=30.181818181818183, Female=27.166666666666668}


        System.out.println("----------------------");



        //Get the names of employees who joined after 2015

        List<String> re =  employeeList.stream().filter(e->e.getYearOfJoining().equals("2015"))
                         .map(RealEmployees::getName).collect(Collectors.toList()) ;

        System.out.println(re) ;  //  [Paul Niksui, Wang Liu, Jaden Dough, Sanvi Pandey]


        System.out.println("----------------------");




        //Count the number of employees of each department
       Map<String,Long> noOfEmployeeInEachDepartment = employeeList.stream()
                                      .collect(Collectors.groupingBy(RealEmployees::getDepartment,Collectors.counting())) ;

       System.out.println(noOfEmployeeInEachDepartment); // {Product Development=5, Security And Transport=2, Sales And Marketing=3, Infrastructure=3, HR=2, Account And Finance=2}



        System.out.println("----------------------");

        //Find out the average salary of each department

        Map<String,Double> averageSalaryOfEachDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(RealEmployees::getDepartment,Collectors.averagingDouble(RealEmployees::getSalary))) ;

        System.out.println(averageSalaryOfEachDepartment) ;

        //  {Product Development=31960.0, Security And Transport=10750.25,
        //  Sales And Marketing=11900.166666666666, Infrastructure=15466.666666666666, HR=23850.0, Account And Finance=24150.0}


        System.out.println("----------------------");




        //find out the oldest employee
        RealEmployees oldEmployeeAge = employeeList.stream().max(Comparator.comparingInt(RealEmployees::getAge)).orElse(null) ;

        System.out.println("ageOfOldEmployee "+oldEmployeeAge.getAge());
        String oldEmployeeName = oldEmployeeAge.getName() ;
        System.out.println(oldEmployeeName+" oldEmployeeOfCompany") ;
        String departmentOfOldEmployee = oldEmployeeAge.getDepartment() ;
        System.out.println(departmentOfOldEmployee+" oldEmployeeDepartment") ;

        // ageOfOldEmployee : 43
        // Iqbal Hussain : oldEmployeeOfCompany
        // Security And Transport : oldEmployeeDepartment

        System.out.println("----------------------");




        //Find out the average and total salary
         DoubleSummaryStatistics empSalary = employeeList.stream().collect(Collectors.summarizingDouble(RealEmployees::getSalary)) ;
        System.out.println("AverageSalary: "+empSalary.getAverage());
        System.out.println("TotalSalary : "+empSalary.getSum());

//        AverageSalary: 21141.235294117647
//        TotalSalary : 359401.0

        System.out.println("-------------------------------------") ;





        // List down the employee for each department
        Map<String,List<RealEmployees>> empList = employeeList.stream().collect(Collectors.groupingBy(RealEmployees::getDepartment));


        Set<Map.Entry<String,List<RealEmployees>>> entrySet=empList.entrySet();

        for(Map.Entry<String,List<RealEmployees>> emp : entrySet){
        System.out.println("Employees In: "+emp.getKey()) ;

            System.out.println("-------------------------");

            List<RealEmployees> list = emp.getValue();
            for (RealEmployees list1 : list) {

                System.out.println(list1.getName()) ;
            }

        }

        /* Employees In: Product Development
        -------------------------
        Murali Gowda
        Wang Liu
        Nitin Joshi
        Sanvi Pandey
        Anuj Chettiar*/

        /*Employees In: Security And Transport
        -------------------------
        Iqbal Hussain
        Jaden Dough*/

        /*Employees In: Sales And Marketing
        -------------------------
        Paul Niksui
        Amelia Zoe
        Nicolus Den*/

        /*Employees In: Infrastructure
        -------------------------
        Martin Theron
        Jasna Kaur
        Ali Baig*/

        /*Employees In: HR
        -------------------------
        Jiya Brein
        Nima Roy

        Employees In: Account And Finance
        -------------------------
Manu    Sharma
Jyot    Jyothi Reddy */

        System.out.println("-----------------------------------");





        // find out experienced employees in the organization

        RealEmployees experiencedEmployee = employeeList.stream().sorted(Comparator.comparing(RealEmployees::getYearOfJoining)).findFirst().get() ;
        System.out.println(experiencedEmployee.getId()) ;
        System.out.println(experiencedEmployee.getName());
        System.out.println(experiencedEmployee.getAge());
        System.out.println(experiencedEmployee.getSalary());

        // 177
        // Manu Sharma
        // 35
        // 27000.0


        System.out.println("-----------------------------------");
        // FIND NTH EMPLOYEE SALARY

        List<RealEmployees> sorted  = employeeList.stream().sorted(Comparator.comparing(RealEmployees::getSalary).reversed()).skip(2).limit(1).collect(Collectors.toList()) ;

        for(RealEmployees so : sorted) {

            System.out.println(so) ; // RealEmployees{id=144, name='Murali Gowda', age=28, gender='Male', department='Product Development', yearOfJoining='2014', salary=32500.0}


        }
    }






}

class RealEmployees {

    private int id ;
    private String name ;
    private int age ;
   private String gender ;
   private String department ;
    private String yearOfJoining ;
    private double salary ;

    public RealEmployees(int id, String name, int age, String gender, String department, String yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getYearOfJoining() {
        return yearOfJoining ;
    }

    public void setYearOfJoining(String yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "RealEmployees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                ", salary=" + salary +
                '}';
    }
}