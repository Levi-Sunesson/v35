package v36;

import java.util.Scanner;

public class KattisSafe {

	static Scanner sc = new Scanner(System.in);

	static final int SIZE = 3;
	static final int RANGE = 4;

	public static void main(String[] args) {

		System.out.println("");

		int[][] grid = new int[SIZE][SIZE];

		//Fills the entire grid with the numbers from the console
		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {

				grid[x][y] = sc.nextInt();

			}
		}

		press(grid, 1, 1, 1);

		isSolved(grid);
		
		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {
				System.out.print(grid[x][y]);
			}
			System.out.println("");
		}

	}
	/**
	 * This method presses the buttons
	 * accord to the rules in the assignment
	 * 
	 * @param grid The grid
	 * @param row What row is the pressed button
	 * @param col What column is the pressed button
	 * @param timesPressed Number of times the button is pressed
	 */
	private static void press(int[][] grid, int row, int col, int timesPressed) {

		//Checks the entire grid
		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {

				// If the coordinate we are looking at is the same as the pressed one then
				if (x == col || y == row) { 

					// Increase the number according to the RANGE
					grid[x][y] = (grid[x][y] + timesPressed + RANGE) % RANGE;

				}
			}
		}
	}

	/**
	 * This method checks if the grid is only filled with zeroes or not
	 * 
	 * @param grid The grid to be checked
	 * @return True if solved and false if not
	 */
	private static boolean isSolved(int[][] grid) {

		//Checks the entire grid
		for (int x = 0; x < SIZE ; x++) {
			for (int y = 0; y < SIZE; y++) {
				
				//If a coordinate is not 0 then it returns false
				if (grid[x][y] != 0)
					return false;
				
			}
		}

		//Returns true
		return true;

	}

}


/*

for (int x = 0; x < SIZE ; x++) {
for (int y = 0; y < SIZE; y++) {

}
}

 */