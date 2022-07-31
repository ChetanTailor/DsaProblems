public class TargetSum extends Thread {
    public static void main(String[] args) {
        int[] arr = {5,6,2,9,8,3,5,4,7};
        int sum = 11;
        int found = 0;

        for (int i=0 ; i < arr.length ; i++){
            int temp = sum-arr[i];
            if (found==1){
                break;
            }
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[j]==temp){
                    System.out.println(arr[i]+"  "+arr[j]);
                    found = 1;
                    break;
                }
            }
            ;

        }

    }
}
