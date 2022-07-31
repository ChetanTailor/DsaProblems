import java.util.Scanner;

class AND {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();

        while (inputs-- > 0) {
            int n = scan.nextInt();

            int result = (int)(Math.log(n) / Math.log(2));
            int k = (int) Math.pow(2,result);

            int x = k/2;
            int y = n-k+1;

            if (x>y){
                System.out.println(x);
            }else{
                System.out.println(y);
            }
        }
    }
}
