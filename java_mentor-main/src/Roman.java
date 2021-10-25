import java.util.HashMap;
import java.util.Map;

public class Roman {
    private static final class HashMapExtension extends HashMap<String, Integer> {
        private Integer put;
        {
            put("I", 1);
            put("II", 2);
            put("III", 3);
            put("IV", 4);
            put("V", 5);
            put = put("VI", 6);
            put("VII", 7);
            put("VIII", 8);
            put("IX", 9);
            put("X", 10);
        }
    }

    static Map<String, Integer> roman = new HashMapExtension();
}
