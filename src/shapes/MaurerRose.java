package shapes;

import java.util.ArrayList;

/**
 * Created by Algernon on 29/03/2017.
 */
public class MaurerRose {
	private ArrayList<Point> pointsList;
	private float nVal,dVal;
	
	public MaurerRose() {
		this.nVal = 0;
		this.dVal = 0;
	}
	
	public void update(float nVal,float dVal) {
		if (this.nVal != nVal || this.dVal != dVal) {
			this.nVal = nVal;
			this.dVal = dVal;
			updatePoints();
		}
	}
	
	private void updatePoints(){
	
	}
}
