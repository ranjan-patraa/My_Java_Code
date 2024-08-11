package string_code;

//Write a java program to print even length word in a String
public class EvenWordOfString {

    public static void main(String[] args) {

        String str = "Hello World hii EveryOne" ;

        for(String s : str.split(" ")) {

            if(s.length() % 2 == 0) {

                System.out.println(s) ;
            }
        }
    }
}
