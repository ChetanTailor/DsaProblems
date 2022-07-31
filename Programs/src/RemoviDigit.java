import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoviDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        while (input-- > 0) {
            String[] strings = br.readLine().split(" ");
            String str = strings[0];
            String d = strings[1];

            if (d.equals("0")) {
                int i = 0;
                while (i < str.length()) {
                    if (str.charAt(i) == '0') {
                        break;
                    }
                    i++;
                }
                String res = str.substring(0, i);
                while (i < str.length()) {
                    res += "1";
                    i++;
                }
                int ans = Integer.parseInt(res) - Integer.parseInt(str);
                System.out.println(ans);
            }
            else if (d.equals("9")) {
                if (str.charAt(0)=='9'){
                    int i=0;
                    String res = "1";
                    while (i < str.length()) {
                        res += "0";
                        i++;
                    }
                    int ans = Integer.parseInt(res) - Integer.parseInt(str);
                    System.out.println(ans);
                    break;
                }
                int i = 0;

                //where is 9
                while (i < str.length()) {
                    if (str.charAt(i) == '9') {
                        break;
                    }
                    i++;
                }

                if (str.charAt(i - 1) == '8' || str.charAt(i - 1) == '9') {
                    //due
                } else {
                    String res = str.substring(0, i-1);
                    int i1 = Integer.parseInt(String.valueOf(str.charAt(i-1)));
                    i1++;
                    res += String.valueOf(i1);
                    while (i < str.length()) {
                        res += "0";
                        i++;
                    }
                    int ans = Integer.parseInt(res) - Integer.parseInt(str);
                    System.out.println(ans);
                }

            }
            else{
                int i=0;
                while (i < str.length()) {
                    if (str.charAt(i) == d.charAt(0)) {
                        break;
                    }

                    i++;
                }
                if (i==str.length()){
                    System.out.println(0);break;
                }
                String res = str.substring(0, i);
                int i1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                i1++;
                res += String.valueOf(i1);
                while (i < str.length()-1) {
                    res += "0";
                    i++;
                }
                int ans = Integer.parseInt(res) - Integer.parseInt(str);
                System.out.println(ans);
            }

        }
    }
}
