public class Practice {
    public static void main(String[] args) {

        int[] arr = {213 ,124, 156, 263, 149, 6, 62};
        int i = 0;
        int days = 3;
        int op = 0;
        find(arr,days,i,op);

    }

    static int find(int[] arr, int days,int i,int op) {
        if(i==arr.length-1){
            System.out.println(op);
            return 0;
        }
        if(days==0){
            find(arr,3,i+1,op+arr[i]);
            return 0 ;
        }else{
            find(arr,days,i+1,op+arr[i]);
            find(arr,days-1,i+1,op);

            return 0;
        }
    }
}
