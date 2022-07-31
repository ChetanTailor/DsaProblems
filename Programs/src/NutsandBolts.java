import java.util.HashMap;

public class NutsandBolts {
    public static void main(String[] args) {

        String s = "^@&*!#$%~";

        int N = 5;
        char[] nuts = {'@', '%', '$', '#','^'};
        char[] bolts = {'%', '@', '#', '$' ,'^'};

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            hashMap.put(s.charAt(i),0);
        }

        for (int i = 0; i < nuts.length ; i++){
            hashMap.replace(nuts[i],1);
        }
        for (int i = 0; i < bolts.length ; i++){
            hashMap.replace(bolts[i],2);
        }

        System.out.println(hashMap.values());


    }
}
