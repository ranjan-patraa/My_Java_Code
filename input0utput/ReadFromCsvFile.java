package input0utput;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromCsvFile {

    public static void main(String[] args) {

        String path = "abc.txt" ;

        String line = "" ;

        try {
            BufferedReader  bf  = new BufferedReader(new FileReader(path)) ;

            while((line= bf.readLine()) != null) {

                String value[] = line.split(",") ;

                System.out.println("firstName: "+value[0]);
            }

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        }

        catch (IOException e) {

            throw new RuntimeException(e) ;
        }
    }
}
