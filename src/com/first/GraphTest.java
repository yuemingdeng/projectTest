package com.first;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yuemingdeng
 * 
 */
public class GraphTest {
	private static char[] nodes = { 'A', 'B', 'C', 'D', 'E' };
	private static boolean[] flag = null;
	private static int number = 5;
	private static int[][] graph = { { -1, 5, -1, 5, 7 },
			{ -1, -1, 4, -1, -1 }, { -1, -1, -1, 8, 2 }, { -1, -1, 8, -1, 6 },
			{ -1, 3, -1, -1, -1 } };

	public static void main(String[] args) {
		GraphDfs();
		System.out.println("-------------------------------");
		BFS_Map();

	}

	public static void GraphDfs() {
		flag = new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if (false == flag[i]) {
				dfs(i);
			}
		}
	}

	public static void dfs(int i) {
		System.out.print(nodes[i] + " ");
		flag[i] = true;
		for (int j = 0; j < graph.length; j++) {
			if (false == flag[j] && graph[i][j] > 0) {
				dfs(j);
			}
		}
	}

	public static void BFS_Map() {
		flag = new boolean[number];
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < number; i++) {
			if (flag[i] == false) {
				flag[i] = true;
				System.out.print(nodes[i] + " ");
				queue.add(i);
				while (!queue.isEmpty()) {
					int k = queue.poll();
					for (int j = 0; j < number; j++) {
						if (graph[k][j] == 1 && flag[j] == false) {
							flag[j] = true;
							System.out.print(nodes[j] + " ");
							queue.add(j);
						}
					}
				}
			}
		}
	}

}
