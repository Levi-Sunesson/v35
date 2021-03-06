package map;

import java.io.File;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class labyrint extends Application {

	int count = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Map map = MapInterpreter.interpretMap(new File("v37/map.txt"));

		Scene scene = new Scene(map, map.getWidth(), map.getHeight());

		MapSolver solver = new MapSolver(map.getStartX(), map.getStartY(), map);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		new AnimationTimer(){
			
			@Override
			public void handle(long now) {

				
				if (count < solver.path.size()) {
					map.getChildren().add(solver.path.get(count));
					
				}else {
					
					System.out.println(solver.path.size());
					for (Circle c : solver.winPath) {
						
						map.getChildren().add(c);
						
					}
					this.stop();
				}
				
				count++;
				
			}
			
		}.start();

	}

	public static void main(String[] args) {
		launch();
	}

}
