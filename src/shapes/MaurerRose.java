package shapes;

import java.util.ArrayList;

/**
 * Created by Algernon on 29/03/2017.
 */
public class MaurerRose {
	private ArrayList<Point> pointsList;
	private float nVal,dVal;
	private float radius;
	
	public MaurerRose(float nVal, float dVal,int width,int height) {
		this.nVal = nVal;
		this.dVal = dVal;
		if(width > height) radius = width/4;
		else radius = height/4;
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
			r = radius*Math.sin(Math.toRadians(nVal*i));
			x = r * Math.cos(Math.toRadians(i));
			y = r * Math.sin(Math.toRadians(i));
			temp.add(new Point(x,y));
		}
		pointsList = temp;
	}
	
	public ArrayList<Point> getPointsList(){
		return pointsList;
	}
}
