package string_code;

public class PreServingThePositionOfSpace {

    public static void main(String[] args) {

        String string = "I am not a String" ;

        preServingPosition(string) ; // g ni rtS a tonmai

    }

    static void preServingPosition(String str) {

        char[] ch = str.toCharArray() ;

        char[] ch1 = new char[ch.length] ;

        for(int i  = 0 ; i < ch.length ; i++) {

            if(ch[i] == ' ') {

                ch1[i] = ' ' ;
            }
        }

        int j = ch1.length-1 ;

        for(int i = 0 ; i < ch.length ;i++) {

            if(ch[i] != ' ') {

                if(ch1[j] == ' '){

                    j-- ;
                }
                ch1[j] = ch[i] ;

                j-- ;
            }
        }

        System.out.println("preServing The position of space : "+ String.valueOf(ch1)) ;

    }
}
