package input0utput;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {


        try {

            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            Student student = new Student(1905289016, "PriyaRanjan Patra");

            Student.age = 25;

            System.out.println(student);

            oos.writeObject(student);

            System.out.println("object serialized successfully");

        } catch (Exception e) {

             e.printStackTrace();


        }

    }
}
class Student implements Serializable {

    int rollNumber ;
    transient String name ;

    static int age ;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
