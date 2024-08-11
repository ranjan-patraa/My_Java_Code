package other_interview_questions.sinario;

import java.util.*;
import java.util.stream.Collectors;

public class Doctor {
    public static void main(String[] args) {

        DoctorImpl doctor1 = new DoctorImpl(101,"Dr.Priyo",100000,
                             new Address(752106,"chfu7488",3)) ;

        DoctorImpl doctor2 = new DoctorImpl(902,"Dr.Rohit",110000,
                              new Address(740004,"abjh78",2)) ;

        DoctorImpl doctor3 = new DoctorImpl(111,"Dr.Sandeep",90000,
                               new Address(758004,"jsdbcjd89",2)) ;

        DoctorImpl doctor4 = new DoctorImpl(333,"Dr.Kamakhya",300000,
                             new Address( 647299,"C2l2334",6)) ;


        List<DoctorImpl> doctorList =   Arrays.asList(doctor1,doctor2,doctor3,doctor4) ;

       // List<Long> sortSalary = doctorList.stream().map(e-> e.getSalary()).sorted().collect(Collectors.toList()) ;

       // System.out.println("sortSalary: " +sortSalary) ;

        List<DoctorImpl> sortSalary = doctorList.stream().sorted(Comparator.comparingLong(DoctorImpl::getSalary)).collect(Collectors.toList()) ;

        System.out.println(sortSalary) ;

        Collections.reverse(sortSalary) ;

        System.out.println(sortSalary) ;

        List<DoctorImpl> descOrder = sortSalary.stream().sorted(((o1, o2) -> Math.toIntExact(o2.getSalary() - o1.getSalary()))).collect(Collectors.toList());

        System.out.println(descOrder) ;
    }



}

class DoctorImpl {

    int d_id ;
    String doctor_Name ;
    long salary ;
    Address address;

    public DoctorImpl(int d_id, String doctor_Name, long salary, Address address) {
        this.d_id = d_id;
        this.doctor_Name = doctor_Name;
        this.salary = salary;
        this.address = address;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getDoctor_Name() {
        return doctor_Name;
    }

    public void setDoctor_Name(String doctor_Name) {
        this.doctor_Name = doctor_Name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DoctorImpl{" +
                "d_id=" + d_id +
                ", doctor_Name='" + doctor_Name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}

class Address {

    int pinCode ;

    String houseNo ;

    int floreNo ;

    public Address(int pinCode, String houseNo, int floreNo) {
        this.pinCode = pinCode;
        this.houseNo = houseNo;
        this.floreNo = floreNo;
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

    public int getFloreNo() {
        return floreNo;
    }

    public void setFloreNo(int floreNo) {
        this.floreNo = floreNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", houseNo='" + houseNo + '\'' +
                ", floreNo=" + floreNo +
                '}';
    }
}
