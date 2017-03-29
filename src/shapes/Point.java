package shapes;

/**
 * Point Class used for storing coordinates of points used by shapes
 * Created by Algernon on 29/03/2017.
 */
public class Point {
	private float xVal,yVal;
	
	public Point(float xVal, float yVal) {
		this.xVal = xVal;
		this.yVal = yVal;
	}
	
	public float x() {return xVal;}
	public void sx(float xVal) {this.xVal = xVal;}
	
	public float y() {return yVal;}
	public void sy(float yVal) {this.yVal = yVal;}
}
