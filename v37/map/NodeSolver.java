package map;

import java.util.ArrayList;
//Copywrite Levi Sunesson
import javafx.scene.shape.Circle;

public class NodeSolver {

	Map map;

	Boolean win = false;

	ArrayList<Circle> path = new ArrayList<Circle>();

	NodeSolver(int startX, int startY, Map map){

		this.map = map;

		nodeFinder(this.map);
		
	}

	private void nodeFinder(Map map) {

		Node n;

	}

	private void solve() {

	}
}