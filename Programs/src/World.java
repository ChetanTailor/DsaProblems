import java.util.ArrayList;

public class World {
    public static void main(String[] args) {
        String  str = "my name is chetan";
        String res = "";
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = str.length()-1 ; i >= 0 ; i-- ){
            if (str.charAt(i)==' '){
                list.add(i);
            }else{
                res = res+str.charAt(i);
            }
        }

        for (int i = res.length()-1 ; i>=0 ; i--){
            if (list.contains(i)){

                System.out.print(" ");
                System.out.print(res.charAt(i));
            }
            else{
                System.out.print(res.charAt(i));
            }
        }
        System.out.println(list);

    }
}
