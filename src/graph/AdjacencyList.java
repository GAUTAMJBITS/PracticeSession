package graph;

import java.util.*;

public class AdjacencyList {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.dest=d;
            this.src = s;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 2));

        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));

        graph[6].add(new Edge(6,5));

    }

    public static void bfs(ArrayList<Edge> graph[], int V){
        Queue<Integer> q = new LinkedList<>(); //for queue data structures
        boolean[] vis = new boolean[V]; //for boolean array to check whether it is visited or not
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr);
                vis[curr] =true;
                for (int i =0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void bfsnotConnectedGraph(ArrayList<Edge> graph[], int V, boolean[] vis, int start){
        Queue<Integer> q = new LinkedList<>(); //for queue data structures
        //boolean[] vis = new boolean[V]; //for boolean array to check whether it is visited or not
        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.println(curr);
                vis[curr] =true;
                for (int i =0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr){
        System.out.println(curr);
        vis[curr] = true;
        for (int i =0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (vis[e.dest]==false){
                dfs(graph, vis, e.dest);
            }
        }
    }

    public static void allpathdfs(ArrayList<Edge> graph[], boolean vis[], String path,int curr, int target){
        if(curr == target){
            System.out.println(path);
            return;
        }
        for(int i =0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                allpathdfs(graph, vis, e.dest+path, e.dest, target);
                vis[curr]=false;
            }
        }


    }

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph);

//        bfs(graph, n);
//        System.out.println();


//        boolean[] vis = new boolean[n];
//        for (int i =0; i < n; i++){
//            if(vis[i]==false){
//                bfsnotConnectedGraph(graph, n, vis, i) ;
//            }
//        }
//        System.out.println();


        //Adjacency List
//        for (int i =0; i < graph[2].size(); i++){
//            Edge e = graph[2].get(i);
//            System.out.println(e.dest);
//        }


        boolean[] vis = new boolean[n];
//        dfs(graph, vis, 0);
        allpathdfs(graph, vis, "0",0,6);
//        System.out.println();
    }
}
