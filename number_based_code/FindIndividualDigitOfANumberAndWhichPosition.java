package number_based_code;

public class FindIndividualDigitOfANumberAndWhichPosition {

    public static void main(String[] args) {


        int a = 1234;

        int r ; int position = 0 ; int temp=a ;

        while (temp != 0) {

           r = temp%10 ;
           position = position*10 + r ;
           temp = temp/10 ;
            System.out.println("position of "+ r +" is " +position);
        }
    }
}