package Graph;

import java.util.ArrayList;

public class Dependencies {
    public static void main(String[] args) {

    }


    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int count = 0 ;
        for(int i = 0 ; i < V ; i++){
            for(int j = 0; j < adj.get(i).size() ; j++){
                count++;
            }
        }
        return count;
    }
}
