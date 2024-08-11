package functionalprogramming.streams;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
                       .orElseGet(()->"defaultValue") ;
        Object value1 = Optional.ofNullable("Hello")
                .orElseGet(()->"defaultValue") ;

    }
}
