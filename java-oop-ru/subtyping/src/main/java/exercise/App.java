package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kv) {

        Map<String, String> map2 = new HashMap<>();
        for (Entry<String, String> s : kv.toMap().entrySet()) {
            map2.put(s.getKey(), s.getValue());
        }

        for (String s : map2.keySet()) {
            kv.unset(s);
        }

        for (Entry<String, String> s : map2.entrySet()) {
            kv.set(s.getValue(), s.getKey());
        }

    }
}
// END
