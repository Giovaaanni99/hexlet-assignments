package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage kv) {

        Map<String, String> map2 = new HashMap<>();
        for (Entry<String, String> st : kv.toMap().entrySet()) {
            map2.put(st.getKey(), st.getValue());
        }

        for (String st : map2.keySet()) {
            kv.unset(st);
        }

        for (Entry<String, String> st : map2.entrySet()) {
            kv.set(st.getValue(), st.getKey());
        }

    }
}
// END
