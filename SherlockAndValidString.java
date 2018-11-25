import java.util.*;

public class SherlockAndValidString {

    public static void main (String[] args){
        String input = "abcdefghhgfedecbae";
        Set<Integer> set = new HashSet<>();
        Map<Character,Integer> map = new HashMap<>();
        map = fillTheMap(input,map);
       // set = generateSe(map,set);
        System.out.println(generateValuesMap(map));
        boolean result =  getResult(generateValuesMap(map));
      //  boolean result = compareSet(set);
        System.out.println(result);
        System.out.println(map);
        System.out.println(set);


        
    }

    static String isValid(String s) {

        String input = s;
        String outPut = "";
        //Set<Integer> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        map = fillTheMap(input, map);
        boolean result = getResult(generateValuesMap(map));
        //set = generateSet(map, set);
        // boolean result = compareSet(set);
        if(result){
            outPut = "YES";
        }
        else{
            outPut = "NO";
        }
        return outPut;

    }



    private static boolean getResult(Map<Integer, Integer> map2) {
        if(map2.size() == 1)
            return true;
        if (map2.size() > 2) {
            return false;
        } else {
            if (map2.values().contains(1)) {

                List<Integer> list = new ArrayList<>(map2.keySet());
                Collections.sort(list);
                if(map2.get(list.get(0)) == 1 || (list.get(1)-list.get(0) == 1) )
                    return true;

            }

        }
        return false;
    }

    private static Map<Integer, Integer> generateValuesMap(Map<Character, Integer> map) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int temp : map.values()) {
            if (map1.containsKey(temp)) {
                map1.put(temp, map1.get(temp) + 1);
            } else {
                map1.put(temp, 1);
            }

        }
        return map1;
    }

    private static Map<Character, Integer> fillTheMap(String input, Map<Character, Integer> map){
        int len = input.length();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        return map;
    }

}
