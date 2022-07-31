import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,6,4,0,-1};

        int left = 0;
        int right = 0;

        for (int i = 1 ; i < arr.length ; i++){
            right += arr[i];
        }
        System.out.println(left+"       "+right);
        int i = 0 ;
        while(i < arr.length-1){
            left += arr[i];
            i++;
            right -= arr[i];
            System.out.println("left is : "+left+"\n"+"right is :"+right);
            if (left==right){
                System.out.println("found at index "+i);
                break;
            }
        }

    }
}
