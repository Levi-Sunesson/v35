package v35;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FibonacciTree extends Application{

	Group root = new Group();
	
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(root, 400, 400, Color.WHEAT);
		
		branch(200, 400, 200, 0);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public void branch(double x, double y, double lenth, double angle) {
		
		if (lenth > 10) {

			double newX = Math.cos(angle) * lenth;
			double newY = Math.sin(angle) * lenth;
			
			Line line = new Line(x, y, newX, y - lenth);
			root.getChildren().add(line);
			
			angle = Math.toRadians(45);
			
			lenth *= 0.67;
			
			branch(newX, newY, lenth, angle);
			branch(newX, newY, lenth, -angle);
			
		}else {
			
			return;
			
		}
			
	}
	
}