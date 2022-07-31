import java.util.*;

public class Paranthesis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
       // String str1 = "(hellow(world))";
        String str = str1.replaceAll( "[a-zA-Z]" ,"");

        System.out.println(str);

        Stack st = new Stack<>();

        int count = 0;
        for(int i = 0; i < str.length(); i++) {


            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));
 

            } else if ( !st.empty() && ((str.charAt(i) == ']' && st.peek().toString().equals("[") ) ||
                               (str.charAt(i) == '}' && st.peek().toString().equals("{")) ||
                               (str.charAt(i) == ')' && st.peek().toString().equals("(")) )) {

                st.pop();
                count++;

            } else {
                st.push(str.charAt(i));
            }
        }

        if(st.empty()) {

            System.out.println( 1+ " "+count);
        } else {
            System.out.println(0);
        }
    }
}