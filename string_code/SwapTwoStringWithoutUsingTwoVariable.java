package string_code;

public class SwapTwoStringWithoutUsingTwoVariable {

    public static void main(String[] args) {

        String str = "java" ;
        String str1 = "j2ee" ;

        swapTwoStringWithoutUsingThirdVariable(str,str1);
    }

    public static void swapTwoStringWithoutUsingThirdVariable(String str1 ,String str2) {

        System.out.println(str1+" : before swap : "+str2) ;

        str1 = str1 + str2 ;

        str2 = str1.substring(0,str1.length()-str2.length()) ;

        str1 = str1.substring(str2.length()) ;

        System.out.println(str1+" :after swap: "+str2);

    }
}
