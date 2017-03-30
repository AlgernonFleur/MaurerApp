package shapes;

import java.util.ArrayList;

/**
 * Created by Algernon on 29/03/2017.
 */
public class MaurerRose {
	private ArrayList<Point> pointsList;
	private float nVal,dVal;
	
	public MaurerRose(float nVal, float dVal) {
		this.nVal = nVal;
		this.dVal = dVal;
		updatePoints();
	}
	
	public void update(float nVal, float dVal) {
		if (this.nVal != nVal || this.dVal != dVal) {
			this.nVal = nVal;
			this.dVal = dVal;
			updatePoints();
		}
	}
	
	private void updatePoints(){
		ArrayList<Point> temp = new ArrayList<>();
		double r,x,y;
		for(int i=0;i<360*dVal;i+=dVal){
			r = 100*Math.sin(Math.toRadians(nVal*i));
			x = r * Math.cos(Math.toRadians(i));
			y = r * Math.sin(Math.toRadians(i));
			temp.add(new Point(x,y));
		}
		pointsList = temp;
	}
	
	private ArrayList<Point> getPointsList(){
		return pointsList;
	}
}
