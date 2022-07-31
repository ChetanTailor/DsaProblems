import java.util.Stack;

public class MinNumber {
    public static void main(String[] args) {
        String s = "000149811";
        String a = s.replace("0","");
        System.out.println(a);
    //    removeKdigits(s , 3);
    }

    static public  String removeKdigits(String S, int K) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(Integer.parseInt( String.valueOf( S.charAt(0))  )) ;
        stack.removeElement(0);

        for(int i = 1 ; i < S.length() ; i++){
            int temp = Integer.parseInt( String.valueOf( S.charAt(i))  );
            if(temp < stack.peek()){
                if(K >= 0){
                    K--;
                    stack.pop();
                }else{break;}
            }
            stack.push(temp);
        }
        return stack.toString();
    }

}
