import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Inter {

    public static void main(String[] args) throws CloneNotSupportedException {





        List<Employee> list = List.of(

                new Employee(101,"Alexa",50000,
                                Employee.Gender.FEMALE,LocalDate.of(2015,1,2),"Lead") ,

                new Employee(911,"JoeRoot",35000,
                                Employee.Gender.MALE,LocalDate.of(2014,6,9),"developer"),

                new Employee(71,"Ben",30000,
                                Employee.Gender.MALE,LocalDate.of(2019,9,10),"Hr"),

                new Employee(109,"Mehek",70000,
                        Employee.Gender.FEMALE,LocalDate.of(2018,3,19),"Lead") ,

                new Employee(11,"Alexa",90000,
                        Employee.Gender.FEMALE,LocalDate.of(2011,7,12),"Lead")

        ) ;

         HashMap<Integer,Employee> hs = new HashMap<>() ;

        for(Employee em : list) {

            hs.put(em.geteId(),em) ;
        }
        hs.forEach((key,value)-> System.out.println(key+" "+value)) ;

        System.out.println("------------------------");

         Map<Integer,Employee> sortedMap = hs.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new)) ;

        sortedMap.forEach((key,value)-> System.out.println(key+" "+value)) ;

        List<Map.Entry<Integer,Employee>> mapList = new LinkedList<>(hs.entrySet()) ;

        Collections.sort(mapList,new Comparator<Map.Entry<Integer,Employee>>() {

            public int compare(Map.Entry<Integer,Employee> o1 , Map.Entry<Integer,Employee> o2) {

                int i = o1.getValue().getName().compareTo(o2.getValue().getName()) ;

                if(i == 0) {

                    return o1.getValue().geteId()-o2.getValue().geteId() ;
                }

                return i ;
            }
        });

        System.out.println("---------------------------");

        mapList.forEach(System.out::println) ;



        }



    }




class Employee   {

    private int eId ;
    private String name ;
    private double salary ;
    private Gender gender ;
    private LocalDate localDate ;
    private String departMeant ;

    public Employee(int eId,String name , double salary , Gender gender ,LocalDate localDate , String departMeant) {

        this.eId = eId;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.localDate = localDate;
        this.departMeant = departMeant;

    }

        public int geteId() {

            return eId ;
        }

        public void seteId(int eId) {
        this.eId = eId ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDepartMeant() {
        return departMeant;
    }

    public void setDepartMeant(String departMeant) {
        this.departMeant = departMeant;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", localDate=" + localDate +
                ", departMeant='" + departMeant + '\'' +
                '}';
    }

    enum Gender {

        MALE,FEMALE
    }
}
