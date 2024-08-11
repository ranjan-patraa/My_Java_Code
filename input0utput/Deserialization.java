package input0utput;

import java.io.FileInputStream;
 import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("file.txt") ;

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream) ;

        Object obj = objectInputStream.readObject() ;

        System.out.println(obj) ;

        System.out.println("object deserialized") ;
    }
}
