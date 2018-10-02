package map;

import java.util.ArrayList;
import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;
//Copywrite Levi Sunesson
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MapSolver {

	Map map;

	Boolean win = false;

	ArrayList<Block> visitedBlocks = new ArrayList<Block>();

	ArrayList<Circle> path = new ArrayList<Circle>();
	ArrayList<Circle> winPath = new ArrayList<Circle>();
	
	

	MapSolver(int startX, int startY, Map map){

		this.map = map;

		solve(startX, startY, 1);
		visitedBlocks.clear();
		solve(startX, startY, 2);
		solve(startX, startY, 3);
		solve(startX, startY, 4);

	}

	private void solve(int x, int y, int dir) {

		double circleSize = Block.SIZE/2;
		
		switch (dir) {
		case 1:
			x++;
			break;
		case 2:
			y--;
			break;
		case 3:
			x--;
			break;
		case 4:
			y++;
			break;
		default:
			break;
		}

		Block b = map.getBlock(x, y);

		if (visitedBlocks.contains(b)) {
			return;
		}else {


			visitedBlocks.add(b);

		}

		if (b instanceof GoalBlock) {
			
			path.add(
					new Circle(
							x*Block.SIZE+circleSize,
							y*Block.SIZE+circleSize,
							circleSize,
							Color.MEDIUMAQUAMARINE));

			win = true;																																										//levi
			return;

		}

		if (b instanceof ClosedBlock || b == null || win) return;


		path.add(
				new Circle(
						x*Block.SIZE+circleSize,
						y*Block.SIZE+circleSize,
						circleSize,
						Color.MEDIUMAQUAMARINE));

		switch (dir) {
		case 1:
			solve(x, y, 1);
			solve(x, y, 2);
			solve(x, y, 4);
			break;
		case 2:
			solve(x, y, 1);
			solve(x, y, 2);
			solve(x, y, 3);
			break;
		case 3:
			solve(x, y, 2);
			solve(x, y, 3);
			solve(x, y, 4);
			break;
		case 4:
			solve(x, y, 1);
			solve(x, y, 3);
			solve(x, y, 4);
			break;
		default:
			break;
		}

		winPath.add(new Circle(
				x*Block.SIZE+circleSize,
				y*Block.SIZE+circleSize,
				circleSize,
				Color.ORANGE));
		
		if (!win) {

			winPath.remove(winPath.get(winPath.size()-1));

		}

	}

}
