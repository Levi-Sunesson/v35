package map;

import java.util.ArrayList;

import blocks.Block;
import blocks.ClosedBlock;
import blocks.GoalBlock;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MapSolver {

	Map map;
	
	Boolean win = false;
	
	ArrayList<Block> visitedBlocks = new ArrayList<Block>();
	
	ArrayList<Circle> path = new ArrayList<Circle>();
	
	MapSolver(int startX, int startY, Map map){
		
		this.map = map;
		
		solve(startX, startY, 1);
		visitedBlocks.clear();
		solve(startX, startY, 2);
		solve(startX, startY, 3);
		solve(startX, startY, 4);
		
		// 1 = right
		// 2 = up
		// 3 = left
		// 4 = down
		
	}

	private void solve(int x, int y, int dir) {
		
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
		
			win = true;
			return;
	
		}
		
		if (b instanceof ClosedBlock || b == null || win) return;
		
		double circleSize = Block.SIZE/2;
		
		path.add(
				new Circle(
						x*Block.SIZE+circleSize,
						y*Block.SIZE+circleSize,
						circleSize,
						Color.CRIMSON));
		
		if (dir == 1) {
			solve(x, y, 1);
			solve(x, y, 2);
			solve(x, y, 4);

		}
		if (dir == 2) {
			solve(x, y, 1);
			solve(x, y, 2);
			solve(x, y, 3);
		}
		if (dir == 3) {
			solve(x, y, 2);
			solve(x, y, 3);
			solve(x, y, 4);
		}
		if (dir == 4) {
			solve(x, y, 1);
			solve(x, y, 3);
			solve(x, y, 4);
		}
		
		if (!win) {
			
			path.remove(path.size()-1);
			
		}
		
	}
	
}
