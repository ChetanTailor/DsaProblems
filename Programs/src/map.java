import java.util.*;

public class map {
    public static void main(String[] args) {
        String s = ":98:thgv&:52:ytyy&:101:28yt";

        String[] str = s.split("&");

      //  System.out.println(Arrays.toString(str));
        HashMap<Integer,String> hashMap = new HashMap<>();

        for(int i = 0 ; i < str.length ; i++){
            String[] temp = str[i].split(":");
            int key = Integer.parseInt(String.valueOf( temp[1] ));
            String value =  temp[2];
            hashMap.put(key,value);
        }

        System.out.println(hashMap);

    }
}
