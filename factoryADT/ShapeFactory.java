package factoryADT;

import java.util.List;

import factoryADT.Shape.*;

/**
 * 
 * @author yash.porwal_metacube
 *
 */
public class ShapeFactory {
	
	/**
	 * Method to instantiate object of a particular shape type
	 * @param shapeType - type of shape
	 * @param point - points 
	 * @param list for storing parameters
     * @return object
     */
	public static Shape createShape(String shapeType, Point point,
			List<Double> list) {
		Shape shape = null;
		
		switch(ShapeType.valueOf(shapeType)) {
			case RECTANGLE :
				shape = new Rectangle(point, list);
				break;
				
			case CIRCLE :
				shape = new Circle(point,list);
				break;
			
			case SQUARE :
				shape = new Square(point,list);
				break;
				
			case TRIANGLE :
				shape = new Triangle(point,list);
				break;
			
			default : break;
		}
		return shape;
	}

}