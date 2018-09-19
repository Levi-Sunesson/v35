package map;

import java.io.File;

import blocks.Block;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class labyrint extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Map map = MapInterpreter.interpretMap(new File("v37/map.txt"));

		Scene scene = new Scene(map, map.getWidth(), map.getHeight());

		MapSolver solver = new MapSolver(map.getStartX(), map.getStartY());
		
		map.getChildren().add(solver);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		new AnimationTimer() {
			
			@Override
			public void handle(long now) {
				
				solver.update();
				
			}
			
		}.start();

	}

	public static void main(String[] args) {
		launch();
	}

}
