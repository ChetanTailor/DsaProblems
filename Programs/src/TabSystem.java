import java.util.Arrays;
import java.util.Scanner;

public class TabSystem {
    public static void main(String[] args) {
        int k = 7;
        int[] arr = new int[]{3,5,2,4,1};

        int newk = k % arr.length;
        int temp = arr[newk];

        for (int i = newk ; i>0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
