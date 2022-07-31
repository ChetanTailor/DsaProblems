import java.util.Scanner;

class Bag {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inputs =scan.nextInt();
        while (inputs-- >0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            if(a+b+c<=d){
                System.out.println(1);
            }
            else if (a+c <= d){
                System.out.println(2);
            }
            else if (a+b <= d){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
    }
}
