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

		// Calculates the answer
		Integer result = min(grid, 0);

		//If you can't crack it it out puts -1
		if (result == null)
			System.out.println(-1);
		//Else output answer
		else
			System.out.println(result);


	}
	/**
	 * Calculates the minimum number
	 * of presses for cracking the safe
	 * 
	 * @param grid The grid
	 * @param position The starting position
	 * @return
	 */
	private static Integer min(int[][] grid, int position) {

		//Base case
		if (position == Math.pow(SIZE, 2)) {
			if (isSolved(grid))
				return 0;
			else
				return null;
		}

		// Calculates row and column
		int row = position / SIZE;
		int col = position % SIZE;

		//I choose to use Integer instead of int because it can handle a NULL value
		Integer minimum = null;

		//For 1 thru 4 do...
		for (int numberOfPresses = 0; numberOfPresses < RANGE; numberOfPresses++) {

			//Press the grid at the coordinate
			press(grid, row, col, numberOfPresses);


			Integer result = min(grid, position + 1);

			//If the grid is solvable then...
			if (result != null) {

				//Add the number of presses to the result
				result += numberOfPresses;

				//Check to break out of the recursion
				if (minimum == null || result < minimum)
					minimum = result;

			}

			//Re-do the grid
			press(grid, row, col, -numberOfPresses);
		}

		//Return the minimum number of presses
		return minimum;

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