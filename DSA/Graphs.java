import java.util.*;
public class Graphs {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int n=s.nextInt();
        int e=s.nextInt();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++)
        {
            int u=s.nextInt();
            int v=s.nextInt();
            addedge(graph,u,v);
        }
        boolean visited[]=new boolean[n];
        print(graph);
        bfs(graph,visited,n);
        System.out.println();
        int visited1[]=new int[graph.size()];
        dfs(graph,0,visited1);
    }
    public static void addedge(ArrayList<ArrayList<Integer>> graph,int u,int v)
    {
      graph.get(u).add(v);
    }
    public static void print( ArrayList<ArrayList<Integer>> graph)
    {
        System.out.println(graph);
    }
    public static void bfs( ArrayList<ArrayList<Integer>> graph,boolean visited[],int n)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
       
        while(!q.isEmpty())
        {
            int temp=q.remove();
        if(!visited[temp])
        {
            System.out.print(temp+" ");
            visited[temp]=true;
            for(int i=0;i<graph.get(temp).size();i++)
            {
            q.add(graph.get(temp).get(i));
            }
        }
        }
    }
   
    public static void dfs( ArrayList<ArrayList<Integer>> graph,int n,int visited[])
    {
        if(visited[n]!=1)
        {
       System.out.print(n+" ");
        }
       visited[n]=1;
       for(int i=0;i<graph.get(n).size();i++)
       {
        if(visited[graph.get(n).get(i)]!=1)
        {
            dfs(graph,graph.get(n).get(i),visited);
        }
       }
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int in[]=new int[V];
        int ans[]=new int[V];
        for (int i=0;i<adj.size();i++){
            for (int j=0;j<adj.get(i).size();j++){
                in[adj.get(i).get(j)]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if (in[i]==0) q.add(i);
        }
        int k=0;
        while (!q.isEmpty()){
            int temp=q.remove();
            ans[k++]=temp;
            for (int i=0;i<adj.get(temp).size();i++){
                in[adj.get(temp).get(i)]--;
                if (in[adj.get(temp).get(i)]==0) q.add(adj.get(temp).get(i));
            }
        }
      return ans;  
    }
}