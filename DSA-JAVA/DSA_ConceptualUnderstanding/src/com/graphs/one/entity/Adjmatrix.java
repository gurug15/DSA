package com.graphs.one.entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Adjmatrix {
	
	 static class Edge {
	        int dest, weight;
	        Edge(int dest, int weight) {
	            this.dest = dest;
	            this.weight = weight;
	        }
	    }
	
	 
	 public static void bfsPrinting(int v,List<List<Edge>> adjList) {
		 Queue<Integer> queue = new LinkedList<>();   //SC-- O(V)
		 boolean visitedNode[] = new boolean[v];      //SC-- O(V)
		 queue.add(0);									
		 visitedNode[0] = true;			
		 List<Integer> ans = new ArrayList<Integer>();
		 while(!queue.isEmpty()) {                  //TC --O(V+E)
			 int node = queue.poll();
			 ans.add(node);
			 for(Edge e : adjList.get(node)) {
				 if(visitedNode[e.dest]) {
					 continue;
				 }
				 
				 visitedNode[e.dest] = true;
				 queue.add(e.dest);
				 
			 }
			 
		 }
		 System.out.println("BFS Traversal:");
		    for (int node : ans) {
		        System.out.print(node + " ");
		    }
		    System.out.println();
	 }
	 
	 
	 public static void dfsPrinting(int v, List<List<Edge>> adjList) {
		 
	 }
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		//int vertices,edges;
		 int v = 5;
		    List<List<Edge>> adjList = new ArrayList<>();

		    for (int i = 0; i < v; i++) {
		        adjList.add(new ArrayList<>());
		    }

		 // Example graph: undirected
		    adjList.get(0).add(new Edge(1, 1));
		    adjList.get(0).add(new Edge(2, 1));
		    adjList.get(1).add(new Edge(0, 1));
		    adjList.get(1).add(new Edge(3, 1));
		    adjList.get(2).add(new Edge(0, 1));
		    adjList.get(2).add(new Edge(4, 1));
		    adjList.get(3).add(new Edge(1, 1));
		    adjList.get(4).add(new Edge(2, 1));


		    bfsPrinting(v, adjList);
		
//		try(Scanner sc = new Scanner(System.in)) {
//		 System.out.println("Enter vertices and edges");
//		 vertices = sc.nextInt();
//		 edges = sc.nextInt();
//		 List<List<Edge>> adjList = new ArrayList<>();
//		 
//		 for(int i=0;i<vertices;i++) {
//			adjList.add(new ArrayList<>());
//		 }
//		
//		 for(int i=0;i<edges;i++) {
//			 System.out.println("Enter v and u nodes to connect and weight with space respectively");
//			 int v = sc.nextInt();
//			 int u = sc.nextInt();
//			 int w = sc.nextInt();
//			 
//			adjList.get(v).add(new Edge(u, w));
//			adjList.get(u).add(new Edge(v, w));
//		 }
//		 
//		 
//		 for(int i=0;i<vertices;i++) {
//			 
//			 for(Edge e : adjList.get(i)) {
//				 System.out.print("|"+ i + "--" +e.dest + "->" + e.weight+ "|");
//			 }
//			 System.out.println();
//		 }
//		 
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
	}

}
