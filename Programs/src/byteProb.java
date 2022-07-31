public class byteProb implements Runnable {
    public static void main(String[] args) {

        final int a = 89;
        try
        {
            int arr[]={1,2};
            arr[2]=3/0;
            System.out.println(arr[0]);
        } catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero");
        } catch(Exception e)
        {
            System.out.println("Exception");
        }
        Thread t = new Thread(new byteProb());


    }

    @Override
    public void run() {

    }
}
