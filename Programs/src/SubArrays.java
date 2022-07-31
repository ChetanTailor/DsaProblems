import java.util.ArrayList;
import java.util.HashMap;

public class SubArrays {
    public static void main(String[] args) {
        int n = 5;
        int[] Arr = {10, 2, -2, -20, 10};
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(findSubArraySum(Arr,n,-10));
    }
        static int findSubArraySum(int arr[], int n, int sum)
        {
            int currsum = 0;
            int count = 0;

            HashMap<Integer,Integer> hashmap = new HashMap<>();

             for(int i = 0 ; i < n; i++){
                 currsum += arr[i];
                if(currsum==sum){
                    count++;
                }
                else if(hashmap.containsKey(currsum-sum)){
                    count += hashmap.get(currsum-sum);
                }
                hashmap.put(currsum,hashmap.getOrDefault(currsum,0)+1);
                 System.out.println(hashmap);
            }

            return count;
        }
    }