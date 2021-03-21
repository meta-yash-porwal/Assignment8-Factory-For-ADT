package factoryADT;

import java.util.Date;

/**
 * interface used to make shapes- Square, Rectangle, Circle, Triangle
 * whoever implements this interface
 * @author yash.porwal_metacube
 *
 */
public interface Shape {
	
	/**
	 * Enum specifying allowed shape types on screen
	 * @author yash.porwal_metacube
	 *
	 */
	public enum ShapeType {
		RECTANGLE, CIRCLE, SQUARE, TRIANGLE;
	}
	
	///// Getter Function /////
	/**
	 * abstract method to get the area of the shape
	 * @return area in double
	 */
	double getArea();
	
	/**
	 * abstract method to get the perimeter of the shape
	 * @return perimeter in double
	 */
	double getPerimeter();
	
	/**
	 * abstract method to get the origin point
	 * (x coordinate & y coordinate) of the shape
	 * @return point coordinate in point class form 
	 */
	Point getOrigin();
	
	/**
	 * abstract method to get the type of the shape
	 * Like Rectangle, Square, Circle, Triangle
	 * @return shape type in enum ShapeType format
	 */
	ShapeType getShapeType();
	
	/**
	 * abstract method to get the timestamp of the shape
	 * at which time, shape is created
	 * @return DateTime in Date class format
	 */
	Date getTimestamp();
	
	/**
	 * abstract method to get the id of a shape
	 * @return id of shape in integer
	 */
	int getId();
	
	///// Setter Function /////
	
	/**
	 * setter of shape timestamp 
	 * to time& date
	 * @param timestamp takes as Date class format
	 */
	void setTimestamp(Date timestamp);
	
	/**
	 * setter of shape id
	 * @param shapeId takes as integer Id
	 */
	void setId(int shapeId);
	
	
	
	/**
	 * checks whether the given point is enclosed in a shape or not
	 * @param point which is being checked 
	 * @return boolean value true - point enclosed & false - not enclosed
	 */
	boolean isPointEnclosed(Point point);
	
}