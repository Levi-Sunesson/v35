package v36;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Uppgift9 extends Application {

	Group root = new Group();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(root, 800, 450, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		for (int i = 0; i < 10 ; i++) {

			double radius = Math.random()*25 + 25;
			
			double x = Math.random()*(scene.getWidth() - 2 * radius) + radius;
			double y = Math.random()*(scene.getHeight() - 2 * radius) + radius;
			
			Circle cir = new Circle( x, y, radius);
			cir.setFill(Color.hsb(Math.random()*360, 1, .7, .5));
			
			root.getChildren().add(cir);
			
		}
		
		scene.setOnKeyPressed(event -> {
			
			root.getChildren().clear();
			
			for (int i = 0; i < 10 ; i++) {
				
				double radius = Math.random()*25 + 25;

				double x = Math.random()*(scene.getWidth() - 2 * radius) + radius;
				double y = Math.random()*(scene.getHeight() - 2 * radius) + radius;
				
				Circle cir = new Circle( x, y, radius);
				cir.setFill(Color.hsb(Math.random()*360, 1, .7, .5));
				
				root.getChildren().add(cir);
				
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}


// Skapa en enkel JavaFX-applikation som placerar ut 10 cirklar på olika ställen