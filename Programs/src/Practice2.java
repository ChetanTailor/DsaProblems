import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,5,5,6,6,3,3,8,5,5,4,4,1,1};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hashMap);

        for (Map.Entry<Integer,Integer> hm: hashMap.entrySet()){
            if (hm.getValue()==1){
                System.out.println(hm.getKey());
            }
        }

    }
}
