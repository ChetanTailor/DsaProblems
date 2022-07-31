public class aboutStrings {
    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(s);
        System.out.println(s.length());

        for (int i = 0 ; i <= s.length() ; i++){
            System.out.println(s.substring(0,i));
        }

    }
}
