package functionalprogramming;

import java.io.Serializable;
import java.util.Comparator;

@FunctionalInterface
interface Predicate<T> extends Serializable,Cloneable,Comparator<T> {

    String toString();
    int hashCode();
    //Object clone();

    default int compare(){
        return 0;
    }

    static void test() {

    }

}

class SenarioBased {

    public static void main(String[] args) {

    }
}
