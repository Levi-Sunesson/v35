package v36;

import java.util.Scanner;

public class KattisSafe {

	static Scanner sc = new Scanner(System.in);

	static final int SIZE = 3;
	static final int RANGE = 4;

	public static void main(String[] args) {

		System.out.println("");

		int[][] grid = new int[SIZE][SIZE];

		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {

				grid[x][y] = sc.nextInt();

			}
		}

		System.out.println("win");

	}

	static void press(int[][] grid, int row, int col, int timespressed) {


		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {
				
				if (x == col || y == row) {
					
				}
				
			}
		}

	}

}


/*

for (int x = 0; x < SIZE ; x++) {
for (int y = 0; y < SIZE; y++) {

}
}

 */