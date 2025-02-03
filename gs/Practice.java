package gs;

public class Practice {



    public static void main(String[] args) {

        int no = 1900;
        if(Math.pow(10, String.valueOf(no).length()-1)==no){
            System.out.println("no is power of 10");
        }else{
            System.out.println("error");
        }
    }
}
