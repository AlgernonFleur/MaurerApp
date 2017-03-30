package shapes;

/**
 * Point Class used for storing coordinates of points used by shapes
 * Created by Algernon on 29/03/2017.
 */
public class Point {
	private double xVal,yVal;
	
	public Point(double xVal, double yVal) {
		this.xVal = xVal;
		this.yVal = yVal;
	}
	
	public double x() {return xVal;}
	public void sx(double xVal) {this.xVal = xVal;}
	
	public double y() {return yVal;}
	public void sy(double yVal) {this.yVal = yVal;}
}
