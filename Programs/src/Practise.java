public class Practise {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,8,5,8,4,5,8,5};

        int res = 0;
        for (int i = 0 ; i < arr.length ; i++){
            res = res^arr[i];
            System.out.println(res);
        }


    }
}
