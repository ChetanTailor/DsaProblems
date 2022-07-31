import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();

        while(inputs-- >0){

            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a>0 && b>0){
                System.out.println("Solution");
            }
            else if(b==0){
                System.out.println("Solid");
            }
            else{
                System.out.println("Liquid");
            }
        }
    }
}
