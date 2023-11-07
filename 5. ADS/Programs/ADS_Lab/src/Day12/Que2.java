
package Day12;
import java.util.*;

public class Que2 {
    int v = 5;
    
    public void bfs(int arr[][],int source){
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[v];
        
        q.add(source);
        isVisited[source] = true;
        
        while (!q.isEmpty()) {            
            int node = q.poll();
            System.out.println("Visited Node: "+node);
            
            for (int index = 0; index < v; index++) {
                if (arr[node][index]==1 && isVisited[index]==false) {
                    q.add(index);
                    isVisited[index] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={
            {0,1,1,0,0},
            {1,0,0,1,1},
            {1,0,0,0,1},
            {0,1,0,0,1},
            {0,1,1,1,0}
        };
        
        Que2 obj = new Que2();
        obj.bfs(arr, 0);
    }
}
