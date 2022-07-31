import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int res = 0;

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
            if((arr[i]%2)!=0){
                res++;
            }
        }
        System.out.println(res);
    }
}
