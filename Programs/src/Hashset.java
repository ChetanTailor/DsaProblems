import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        String res = "$";

        HashSet<Character> hashset = new HashSet<>();

        for (int i = 0 ; i < "jpatt".length() ; i++){
            hashset.add("japtt".charAt(i));
        }

        System.out.println(hashset);


    }
}
