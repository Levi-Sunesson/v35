package v36;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Uppgift10 extends Application{

	Group root = new Group();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(root, 600, 400, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Rectangle boxey = new Rectangle(60, 40);
		root.getChildren().add(boxey);
		
		scene.setOnKeyPressed(event ->{
			
			if (event.getCode() == KeyCode.A && boxey.getTranslateX() > 0) {
			
				boxey.setTranslateX(boxey.getTranslateX() - 10);
				
			}
			if (event.getCode() == KeyCode.S && boxey.getTranslateY() < scene.getHeight() - boxey.getHeight()) {
				
				boxey.setTranslateY(boxey.getTranslateY() + 10);
				
			}
			if (event.getCode() == KeyCode.D && boxey.getTranslateX() < scene.getWidth() - boxey.getWidth()) {
			
				boxey.setTranslateX(boxey.getTranslateX() + 10);
				
			}
			if (event.getCode() == KeyCode.W && boxey.getTranslateY() > 0) {
			
				boxey.setTranslateY(boxey.getTranslateY() - 10);
				
			}
			
			
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
