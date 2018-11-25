import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagram {
    static int sherlockAndAnagrams(String s) {
        int count = 0;
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
        String input = s;
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String temp = input.substring(i, j);
                List<String> tempList;
                if (temp.length() != input.length()) {
                    if (map.containsKey(temp.length())) {
                        tempList = map.get(temp.length());
                        tempList.add(temp);
                    } else {
                        map.put(temp.length(), new LinkedList<String>());
                        tempList = map.get(temp.length());
                        tempList.add(temp);
                    }
                }
                /*System.out.println(input.substring(i,j));*/
            }
        }
        //System.out.println(map);
        count = checkAnagramCountForMap(map);
        return count;
        //System.out.println(count);
    }
    private static int checkAnagramCountForMap(Map<Integer, List<String>> map) {
        int count1 = 0;
        for (List<String> list : map.values())
        {
            // System.out.println("value: " + list);
            count1 +=  checkAnagramCountForList(list);
        }
        return count1;
    }

    private static int checkAnagramCountForList(List<String> list) {
        int count2 = 0;
        for(int i= 0;i< list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(compareMap(getMap(list.get(i)),getMap(list.get(j))))
                    count2 += 1;
                //System.out.println(getStringCount(list.get(i)));
            }
        }
        return count2;
    }
    private static boolean compareMap(Map<Character,Integer> map1,Map<Character,Integer> map2){

        return map1.equals(map2);
    }
    private static Map getMap(String input) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        char[] temp = input.trim().toCharArray();

        for (int i = 0; i<input.length();i++){
            if (map.containsKey(temp[i])) {
                map.put(temp[i], map.get(temp[i]) + 1);
            } else
            {
                map.put(temp[i],1);
            }
        }
        return map;
    }

}
