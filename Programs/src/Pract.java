import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pract {
    static HashMap<Integer,Integer> hashMap;

    public static void main(String[] args) {
        int[][] sales = new int[][]{{1,326,25,4}, {1,648,100,6},{2,478,50,7},{2,478,50,7},{2,478,50,7},{3,654,20,6},{4,654,2000,6}};
        hashMap = new HashMap<>();
        int[] arr = new int[3];

        for (int i=0; i< sales.length; i++){
                int temp = sales[i][0];
                int totalVal = 0 ;
                for(int j = 0 ; j < sales.length ; j++){
                    if (sales[j][0]==temp){
                        totalVal += sales[j][2]*sales[j][3];
                      //  System.out.println(totalVal);
                    }
                }
                hashMap.put(temp ,totalVal);
        }

        System.out.println(hashMap);
        for (int i = 0 ; i < 3 ; i++){
            arr[i] = getMax();
        }
      //  System.out.println(hashMap);
        System.out.println(Arrays.toString(arr));
    }

    private static int getMax() {
        int max = Integer.MIN_VALUE;
        int id = 0;
        for (Map.Entry<Integer,Integer> i : hashMap.entrySet()){
            if (i.getValue() > max ){
                max = i.getValue();
                id = i.getKey();
            }
        }
       // int indexOfmax = hashMap.get();
        hashMap.remove(id);
        return id;
    }
}
