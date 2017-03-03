/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class graph {
    int v;
    int e;
    LinkedList<Integer>[] adjlist;
    boolean cycle = false;
    graph(int v){
        this.v = v;
        this.e = 0;
        adjlist = new LinkedList[this.v];
        for(int i = 0; i < this.v; i++) {
            adjlist[i] = new LinkedList<Integer>();
        }
    }
    public void addedge(int v, int w) {
        adjlist[v].add(w);
        adjlist[w].add(v);
        this.e++;
    }
    public boolean iscycle() {
        boolean[] visited = new boolean[this.v];
        for(int i = 0; i < this.v; i++) {
            this.cycle = dfs(visited, i, -1);
        }
        return this.cycle;
    }
    public boolean dfs(boolean[] visited, int v, int p) {
        visited[v] = true;
        for(int w : adjlist[v]){
            if(!visited[w])
                dfs(visited, w, v);
            else{
                if(p > -1 && w != p)
                    this.cycle = true;
            }
        }
        return this.cycle;
    }
}
class cycles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		graph g = new graph(4);
		g.addedge(0,1);
		//g.addedge(0,3);
		//g.addedge(1,2);
		g.addedge(2,3);
		//g.addedge(3,4);
		System.out.println(g.iscycle());
		
	}
}
