import java.util.ArrayList;

public class cutomPractice {
    public static void main(String[] args) {
        int[][] sales = new int[][]{{1,326,25,4}, {1,648,100,6},{2,478,50,7},{3,654,20,6}};
        ArrayList<Mydata> list = new ArrayList<>();

        for (int i = 0 ; i < 4 ; i++){
            list.add(new Mydata(sales[i][2]*sales[i][3],sales[i][0]));
        }
        System.out.println(list.get(2).highestSales);
    }
}


class Mydata {
    int highestSales;
    int id;
    Mydata(int highestSales,int id){
        this.highestSales = highestSales;
        this.id = id;
    }
}
