package drawing.version2;

import java.util.ArrayList;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Drawing {

	private ArrayList<Object> shapes = new ArrayList<Object>();


	public double calculateTotalArea() {
		double totalArea = 0;

		for (Object shape : shapes) {
			if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				totalArea += circle.area();
			} else if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
				totalArea += rect.area();
			} else if (shape instanceof Square) {
				Square suq = (Square) shape;
				totalArea += suq.area();
			}
		}
		return totalArea;
	}

	public void addShape(Object shape) {
			shapes.add(shape);
		}
	}
}
