package other_interview_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Write_A_Comparator_In_JavaToCompare_TwoEmployees_BasedUpon_Name_Age_Address {

    public static void main(String[] args) {


        List<EmployeeSortUsingComparator> listOfEmployee = new ArrayList<>() ;

        listOfEmployee.add(new EmployeeSortUsingComparator(101,"priyo",25,new EmployeeAddress(752106,"house123"))) ;

        listOfEmployee.add(new EmployeeSortUsingComparator(102,"mishu",23,new EmployeeAddress(751002,"cl2334"))) ;

        listOfEmployee.add(new EmployeeSortUsingComparator(103,"Kamakhya",30,new EmployeeAddress(758004,"bangalore456"))) ;

        listOfEmployee.add(new EmployeeSortUsingComparator(101,"priyanshu",22,new EmployeeAddress(754002,"hitech6732"))) ;

        System.out.println(listOfEmployee);

        System.out.println("*************************************");

        Collections.sort(listOfEmployee, new Comparator<EmployeeSortUsingComparator>() {

            @Override
            public int compare(EmployeeSortUsingComparator o1, EmployeeSortUsingComparator o2) {

                int i  = o1.getEmp_Id()-o2.getEmp_Id() ;

                if(i == 0) {

                    return  o1.getName().compareTo(o2.getName())  ;
                }
                return i;
            }
        }) ;

        System.out.println(listOfEmployee) ;

        System.out.println("***********************************");






        Collections.sort(listOfEmployee,new AddressComparator()) ;

        System.out.println("Sort Base on Addresses :- "+listOfEmployee);

        System.out.println("***************************************************************************");

        Collections.sort(listOfEmployee,new NameComparator()) ;

        System.out.println("Sort Base on EmployeeName :- "+listOfEmployee);

        System.out.println("***************************************************************************");

        Collections.sort(listOfEmployee,new AgeComparator()) ;

        System.out.println("Sort Base on EmployeeAge :- "+listOfEmployee);


    }
}

class EmployeeSortUsingComparator {

    private int emp_Id ;
    private String name ;
    private int emp_age ;
    private EmployeeAddress address ;

    public EmployeeSortUsingComparator(int emp_Id, String name, int emp_age, EmployeeAddress address) {
        this.emp_Id = emp_Id;
        this.name = name;
        this.emp_age = emp_age;
        this.address = address;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public void setAddress(EmployeeAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeSortUsingComparator{" +
                "emp_Id=" + emp_Id +
                ", name='" + name + '\'' +
                ", emp_age=" + emp_age +
                ", address=" + address +
                '}';
    }
}




// EmployeeAddress is not comparable type, so we make it comparable type which is Using in Employee Class
class EmployeeAddress implements Comparable<EmployeeAddress> {

    private int pinCode ;

    private String houseNo ;


    public EmployeeAddress(int pinCode, String houseNo) {
        this.pinCode = pinCode;
        this.houseNo = houseNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public int compareTo(EmployeeAddress obj) {

        return this.getPinCode()-obj.getPinCode() ;
      }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "pinCode=" + pinCode +
                ", houseNo='" + houseNo + '\'' +
                '}';
    }
}


// Sorting ,Compare Age,Name,Address
class AddressComparator implements Comparator<EmployeeSortUsingComparator> {

    @Override
    public int compare(EmployeeSortUsingComparator o1, EmployeeSortUsingComparator o2) {

        return o1.getAddress().compareTo(o2.getAddress()) ;
    }
}

class NameComparator implements Comparator<EmployeeSortUsingComparator> {


    @Override
    public int compare(EmployeeSortUsingComparator o1, EmployeeSortUsingComparator o2) {

        return o1.getName().compareTo(o2.getName()) ;
    }
}


class AgeComparator implements Comparator<EmployeeSortUsingComparator> {


    @Override
    public int compare(EmployeeSortUsingComparator o1, EmployeeSortUsingComparator o2) {

        return o1.getEmp_age()-o2.getEmp_age() ;
    }
}
