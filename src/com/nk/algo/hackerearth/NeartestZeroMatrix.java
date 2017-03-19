package com.nk.algo.hackerearth;


public class NeartestZeroMatrix {
	public static void main(String[] args) {

		int[][] mat = { { -1, 0, -1 }, { -1, -1, -1 }, { -1, 0, -1 }, { -1, -1, -1 }, { -1, -1, -1 }, { -1, -1, -1 },
				{ -1, 0, -1 }, { -1, 0, -1 }, { -1, -1, -1 }, { -1, 0, -1 }, { -1, -1, -1 }, { -1, -1, -1 },
				{ -1, -1, -1 }, { -1, 0, -1 } };

		int[][] sol = new int[mat.length][mat[0].length];
		int[][] visited = new int[mat.length][mat[0].length];

		for (int i = 0; i < sol.length; i++)
			for (int j = 0; j < sol[0].length; j++) {
				sol[i][j] = Integer.MAX_VALUE;
			}

		printMat(mat);
		check(0, 0, mat, sol, visited);
		printMat(sol);
	}

	private static void printMat(int[][] sol) {
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol[0].length; j++) {
				System.out.print(sol[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int check(int i, int j, int[][] mat, int[][] sol, int[][] visited) {

		if (i > mat.length - 1 || j > mat[0].length - 1 || i < 0 || j < 0)
			return Integer.MAX_VALUE;

		if (visited[i][j] == 1)
			return sol[i][j];

		visited[i][j] = 1;

		if (mat[i][j] == 0) {
			sol[i][j] = 0;
		}

		// Very important to check if existing one has computed
		if (sol[i][j] != Integer.MAX_VALUE)
			return sol[i][j];

		int min = min(check(i, j + 1, mat, sol, visited), check(i, j - 1, mat, sol, visited),
				check(i + 1, j, mat, sol, visited), check(i - 1, j, mat, sol, visited)) + 1;
		sol[i][j] = min > sol[i][j] ? sol[i][j] : min;
		return sol[i][j];
	}

	private static int min(int check, int check2, int check3, int check4) {

		int min1 = check < check2 ? check : check2;
		int min2 = check3 < check4 ? check3 : check4;
		return min1 < min2 ? min1 : min2;
	}
}
