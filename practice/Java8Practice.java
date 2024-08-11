package practice;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Practice {

    public static void main(String[] args) {

        Employee e1 = new Employee(6498,"developer","PriyoRanjan",60000.0
                                  ,LocalDate.of(2020,11,02)
                                   ,new Address(752106,"npr612")) ;

        Employee e2 = new Employee(101,"Hr","ArpitaLenka",40000.0
                                    ,LocalDate.of(2021,1,03)
                                     ,new Address(760044,"rourkela33")) ;

        Employee e3 = new Employee(128,"Sels","Sandeep Sahoo",50000.0
                                   ,LocalDate.of(2015,10,10)
                                   ,new Address(751001,"bbsr612")) ;

        Employee e4 = new Employee(333,"developer","GyanaRanjan",80000.0
                                   ,LocalDate.of(2014,6,02)
                                   ,new Address(754006,"csk6")) ;

        Employee e5 = new Employee(001,"Manager" ,"Kamakhya Parida",160000.0
                                    ,LocalDate.of(2012,5,12)
                                    ,new Address(780056,"us234")) ;

        List<Employee> employeeList = List.of(e1,e2,e3,e4,e5) ;

         LocalDate fiveYearAgo = LocalDate.now().minusYears(5) ;


        List<Employee> bonusList =
                                    employeeList.stream()
                .filter(e-> (e.getDateOfJoining() .isBefore(fiveYearAgo) ) && (e.getEmployeeSalary() < 50000))
                .map(map->{

                    map.setEmployeeSalary(map.getEmployeeSalary()+10000);

                    return map ;
                }).collect(Collectors.toList()) ;

        System.out.println(bonusList) ;

    }
}

class Employee {

    private int employeeId ;
    private String departMnt ;
    private String employeeName ;
    private Double employeeSalary ;
    private LocalDate dateOfJoining ;
    private Address employeeAddress ;

    public Employee(int employeeId,String departMnt,String employeeName ,Double employeeSalary,LocalDate dateOfJoining ,Address employeeAddress ) {

        this.employeeId = employeeId ;
        this.departMnt =departMnt ;
        this.employeeName = employeeName ;
        this.employeeSalary = employeeSalary ;
        this.dateOfJoining = dateOfJoining ;
        this.employeeAddress = employeeAddress ;
    }

    public void setEmployeeId(int id) {

        this.employeeId = employeeId ;
    }
    public int getEmployeeId() {

        return employeeId ;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getDepartMnt() {
        return departMnt;
    }

    public void setDepartMnt(String departMnt) {
        this.departMnt = departMnt;
    }

    public String toString() {

        return    "employeeId :  " +employeeId + " \n employeeName : "+employeeName +
                 " \nemployeeSalary : "+employeeSalary +" \nemployeeAddress : "+employeeAddress
                + " \ndateOfJoining: "+ dateOfJoining ;
    }


}

class AddressOfEmployee {

    private int pin ;
    private String houseNo ;

    public AddressOfEmployee(int pin ,String houseNo) {

        this.pin= pin ;
        this.houseNo = houseNo ;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "AddressOfEmployee{" +
                "pin=" + pin +
                ", houseNo='" + houseNo + '\'' +
                '}';
    }
}
