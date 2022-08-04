package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {

    public LinkedList<Integer> adj[];
    Graph(int v){
        adj = new LinkedList[v];
        for (int i = 0 ; i < v ; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int source,int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter vertices and edges");
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        Graph graph = new Graph(v);
        System.out.println("enter "+e+" edges");
        for (int i = 0 ; i < e ; i++){
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.addEdge(source,destination);
        }

//        int res = graph.BFS(0,3);
        boolean res = graph.stackdfs(0,1);
        System.out.println("Possible "+res);
    }

    public int BFS(int source,int destination){

        //setup
        boolean[] visited = new boolean[adj.length] ;
        Queue<Integer> queue = new LinkedList<>() ;
        int[] parent = new int[adj.length];

        //init
        parent[source] = -1;
        queue.add(source);
        visited[source] = true;

        //execute
        while (!queue.isEmpty()){
            int curr = queue.poll();
            if (curr==destination) break;
            for (int neighbour: adj[curr]){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    parent[neighbour] = curr;
                    visited[neighbour]=true;
                }
            }
        }

        //print with the help of parent arr
        int curr  = destination;
        int mindistance = 0;
        while(parent[curr]!=-1){
            System.out.print(curr+" -> ");
            curr = parent[curr];
            mindistance++;
        }
        return mindistance;
    }

    public boolean dfs(int source, int destination){
        boolean[] visted = new boolean[adj.length];
        visted[source] = true;
        return DFS(source,destination,visted);
    }
    public boolean DFS(int source,int destination,boolean[] vis){

        if (source==destination) return true;

        for (int neighbour : adj[source]){
            if (!vis[neighbour]){
                vis[neighbour] = true;
                boolean isConnected = DFS(source,destination,vis);
                if (isConnected){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean stackdfs(int source,int destination){
        boolean[] visited = new boolean[adj.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while (!stack.isEmpty()){
            int curr = stack.pop();

            if (curr==destination) return true;

            for (int nightbour: adj[curr]){
                if (!visited[nightbour]){
                    visited[nightbour] = true;
                    stack.push(nightbour);
                }
            }
        }
        return false;
    }
}
