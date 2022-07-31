public class ShortestComSuperStr {
    public static void main(String[] args) {

        String s1 = "HELLO";
        String s2 = "GEEK";
        int res = shortestCommonSupersequence(s1,s2,s1.length(),s2.length());

        System.out.println(res);
    }

    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int[][] t  = new  int[m+1][n+1];

        char[] s1 = X.toCharArray();
        char[] s2 = Y.toCharArray();

        for(int i = 1 ; i < m+1 ; i++ ){
            for(int j = 1 ; j < n+1 ;j++){

                if(s1[i-1] == s2[j-1]){
                    t[i][j]  = 1 + t[i-1][j-1];
                }else{
                    t[i][j]  = Math.max ( t[i-1][j] , t[i][j-1] );
                }
            }
        }

        int i = m; int j = n;
        int rescount = 0;
        StringBuffer res = new StringBuffer();
        while(i>0 && j>0){
            if(s1[i-1]==s2[j-1]){
                res.append(s1[i - 1]);
                i--;
                j--;
                rescount++;

            }
            else {
                if( t[i][j-1] > t[i-1][j]){
                    res.append(s2[j-1]);
                    j--;
                    rescount++;
                }
                else{
                    res.append(s1[i-1]);
                    i--;
                    rescount++;
                }
            }
        }

        while(i>0){
            res.append(s1[i-1]);
            i--;
            rescount++;
        }
        while(j>0){
            res.append(s2[j-1]);
            j--;
            rescount++;
        }

         for(int q = 0 ; q < m+1 ; q++ ){
             for(int w = 0 ; w < n+1 ;w++){
                 System.out.print(t[q][w]);
             }
             System.out.println();
         }


         System.out.println(res.reverse());
         return rescount;
    }

}
