package blocks;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OpenBlock extends Block {

	public OpenBlock() {
		Rectangle r = new Rectangle(Block.SIZE, Block.SIZE);
		r.setFill(Color.TRANSPARENT);
		this.getChildren().add(r);
	}

	
	public void visit() {
		
		Rectangle r = (Rectangle) this.getChildren().get(0);
		
		r.setFill(Color.LIGHTGRAY);
		
	}
	
}
