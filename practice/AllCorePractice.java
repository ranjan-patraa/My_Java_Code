package practice;


import java.util.*;

public class AllCorePractice {

    public static void main(String[] args) throws CloneNotSupportedException   {


        ArrayList<Student> studentsList = new ArrayList<>() ;

        studentsList.add(new Student(101,"Priyo",new Address(712106,"npr567"))) ;
         studentsList.add(new Student(11,"Priyo",new Address(721006,"konark143")));
        studentsList.add(new Student(111,"Roshan",new Address(740042,"bbsr124")) );

        Collections.sort( studentsList , new Comparator<Student>() {

            public int compare(Student s,Student s1) {

                int i = s.getName().compareTo(s1.getName()) ;

                if(i==0){

                    return s.getRoll()-s1.getRoll() ;
                }

                return i ;
            }

        }) ;

        studentsList.stream().forEach(e-> System.out.println(e)) ;



        Collections.sort(studentsList,new AddressCompare()) ;

        System.out.println(studentsList);


    }
}

    class Student     {

   private   int roll ;
   private   String name ;
   private   Address address ;



   public Student(int roll , String name , Address address) {

       this.roll = roll ;
       this.name = name ;
       this.address = address ;
   }

   public void setRoll() {

       this.roll = roll ;
   }

   public int getRoll() {

       return roll ;
   }

        public void setName() {

            this.name = name ;
        }

        public String getName() {

            return name ;
        }

        public void setAddress() {

            this.address = address ;
        }

        public Address getAddress() {

            return address ;
        }





        public String toString() {

       return roll+" " + name+" "+address ;
        }
    }

class Address     {

   private int pin ;

   private  String plot ;

   public Address(int pin,String plot) {

       this.pin = pin ;
       this.plot = plot ;
    }

    public int getPin() {

       return pin ;
    }





    public String toString() {

       return pin+" "+plot ;
    }





}

class PinCompare implements Comparator<Address> {

    public int compare(Address o1,  Address o2) {

        return o1.getPin()-o2.getPin() ;
    }
}

class AddressCompare implements Comparator<Student> {

    public int compare(Student s1 , Student s2 ) {

        return  s1.getAddress().getPin()-s2.getAddress().getPin() ;
    }
}