package number_based_code;

public class FactorsOfNumber {

    public static void main(String[] args) {

        int aNumberIs = 20 ;

        for(int i = 1 ; i <= aNumberIs ;i++ ) {

            if(aNumberIs % i == 0) {

                System.out.print(i+"\t");
            }
        }
    }

}
