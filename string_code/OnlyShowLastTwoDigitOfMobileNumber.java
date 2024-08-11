package string_code;

public class OnlyShowLastTwoDigitOfMobileNumber {

    public static void main(String[] args) {

        String m_number = "07008189084" ;

        String regex = m_number.replaceAll(".(?=.{2})" ,"#") ;

        System.out.println(regex);

    }
}
