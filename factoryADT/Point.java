package factoryADT;

/**
 * this class has getter function of x coordinate & y coordinate
 * point has x coordinate & y coordinate
 * @author yash.porwal_metacube
 *
 */
public class Point {
	double xCoordinate;
	double yCoordinate;
	

	/**
	 * default constructor of point class
	 * set x&y coordinates 
	 */
	public Point() {
		xCoordinate=0;
		yCoordinate=0;
	}
	
	
	/**
	 * parameterized constructor for point class and set to object
	 * @param xCord takes x coordinate as an double
	 * @param yCord takes y coordinate as an double
	 */
	public Point(double xCord, double yCord) {
		this.xCoordinate=xCord;
		this.yCoordinate=yCord;
	}

	///// Getter Function /////
	
	/**
	 * getter function of x coordinate
	 * @return x coordinate in double
	 */
	public double getX() {
		return xCoordinate;
	}
	
	/**
	 * getter function of y coordinate
	 * @return y coordinate in double
	 */
	public double getY() {
		return yCoordinate;
	}

}