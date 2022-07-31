import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        while (input-- > 0) {
            String[] strings = br.readLine().split(" ");
            String str = strings[0];
            String d = strings[1];
            System.out.println(isMin(Integer.parseInt(str),Integer.parseInt(d)));
        }
    }
    static int isMin(int n, int d){
        int newN = n, rem , count =0, c = 0;
        while(newN>0){
            rem = newN % 10;
            newN = newN /10;
            c++;
            if(rem == d){
                newN = (int) (newN*Math.pow(10,c)+(rem+1)*Math.pow(10,c-1));
                count = newN -n;
                c = 0;
            }
        }
        return count;
    }
}
