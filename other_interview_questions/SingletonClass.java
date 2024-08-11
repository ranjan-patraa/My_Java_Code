package other_interview_questions;

public class SingletonClass {

    private static SingletonClass singletonClass = null ;

    private SingletonClass() {


    }

    public static SingletonClass getInstance() {

        if(singletonClass == null) {

            singletonClass = new SingletonClass();

            // DOUBLE CHECK
           /* synchronized (SingletonClass.class) {

                if (singletonClass == null)
                singletonClass = new SingletonClass();
            }*/
        }
        return  singletonClass ;
    }
}
