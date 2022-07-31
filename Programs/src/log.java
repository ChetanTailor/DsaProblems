public class log {
    public static void main(String[] args) {
        int n=16;
        float res = (float) (Math.log(n)/Math.log(2));
        int rss = (int) Math.pow(2,res);
        System.out.println(rss);

    }
}
