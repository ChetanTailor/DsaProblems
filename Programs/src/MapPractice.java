import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        String s = "aA";
        String stones = "adfjAAjkd";

        HashMap<Character,Integer> hashMap = new HashMap();
        for (int i = 0 ; i < s.length() ; i++){
            hashMap.put(s.charAt(i), 1);
        }

        for (int i = 0 ; i < stones.length() ; i++){
            if (hashMap.containsKey(stones.charAt(i))){
                System.out.println(stones.charAt(i));
            }
        }
    }
}
