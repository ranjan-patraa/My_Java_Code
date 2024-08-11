package other_interview_questions;

public class ImmutableClass {

    public static void main(String[] args) throws CloneNotSupportedException   {

        StringBuffer sb = new StringBuffer("arpita") ;
       Student s = new Student(1,"pryo",sb) ;
        System.out.println(s) ;
       sb.append("lenka");
        System.out.println(s) ;




    }
}

final class Student   {

   private final int roll ;

   private final String name ;
   private final StringBuffer stringBuffer ;

   public Student(int roll , String name ,StringBuffer stringBuffer) {

       this.roll = roll  ;

       this.name = name ;

       this.stringBuffer = new StringBuffer(stringBuffer) ;

   }

   public int getRoll() {

       return roll ;
   }

   public String getName() {

       return name ;
   }

   public StringBuffer getStringBuffer() {

       return new StringBuffer(stringBuffer) ;
   }

   public String toString() {

       return roll+" "+name +" "+stringBuffer ;
   }




}