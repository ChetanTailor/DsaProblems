package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class ShortestDistance
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minStep(n));
        }
    }
}

class Solution{
    static int minStep(int n){
        int e = 0;
        while(n!=1)
        {
            if(n%3==0)
            {
                n=n/3;
            }
            else
            {
                n=n-1;
            }
            e++;
        }
        return e;
    }
}
