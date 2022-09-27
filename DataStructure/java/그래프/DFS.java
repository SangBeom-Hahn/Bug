package HSB;
import java.util.*;

public class DFS {
	int N;
	List<Edge> graph[];
	boolean visited[];
	DFS(List<Edge> adjList[]){
		N = adjList.length;
		graph = adjList;
		visited = new boolean[N];
		for(int i = 0; i<N; i++) visited[i] = false;
		for(int i = 0; i<N; i++)
			if(!visited[i])
				dfs(i);
	}
	//�޼ҵ�
	public void dfs(int i) {
		visited[i] = true;
		System.out.print(i+"->");
		for(Edge e : graph[i]) {
			if(!visited[e.adjvertex])
				dfs(e.adjvertex);
		}
	}
}
