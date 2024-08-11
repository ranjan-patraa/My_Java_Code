package collection_code.cursors.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class CuncurentSkipMap {

    public static void main(String[] args) {


        ConcurrentSkipListMap<String,String> concurrentSkipListMap = new ConcurrentSkipListMap<>(Comparator.reverseOrder());

        concurrentSkipListMap.put("key7","value1") ;

        concurrentSkipListMap.put("key2","value2") ;

        concurrentSkipListMap.put("key1","value3") ;

        concurrentSkipListMap.put("key4","value4") ;

        System.out.println(concurrentSkipListMap);


        ConcurrentSkipListMap<String, String> skipListMap3
                = new ConcurrentSkipListMap<>(Map.of("key", "value"));

        System.out.println(skipListMap3);


        ConcurrentSkipListMap<String, String> skipListMap4
                = new ConcurrentSkipListMap<>(new TreeMap<>(Map.of("key", "value")));

        System.out.println(skipListMap4);

    }
}
