import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sMap = new HashMap<>();
        for (int c : ar) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        int result = 0;
        for (int c : sMap.values()) {
            result += c / 2;
        }
        return result;

    }
}
