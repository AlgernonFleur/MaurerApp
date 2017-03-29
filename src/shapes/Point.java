package shapes;

/**
 * Point Class used for storing coordinates of points used by shapes
 * Created by Algernon on 29/03/2017.
 */
public class Point {
	private float x,y;
	
	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {return x;}
	public void setX(float x) {this.x = x;}
	
	public float getY() {return y;}
	public void setY(float y) {this.y = y;}
}
