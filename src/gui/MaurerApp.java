package gui;

import controlP5.ControlEvent;
import controlP5.ControlFont;
import controlP5.ControlListener;
import controlP5.ControlP5;
import processing.core.PApplet;
import shapes.MaurerRose;
import shapes.Point;

/**
 * Created by Algernon on 30/03/2017.
 */
public class MaurerApp extends PApplet {
	
	MaurerRose rose;
	private ControlP5 ctrl;
	private int nVal = 1, dVal = 1; //default values
	
	public void setup(){
		rose = new MaurerRose(nVal,dVal);
		ctrl = new ControlP5(this);
		ctrl.setFont(new ControlFont(createFont("Arial",20)));
		ButtonListener listener = new ButtonListener();
		stroke(200);
		
		//Buttons to control N Value
		ctrl.addButton("Inc N")
				.setPosition(0,0)
				.setSize(100,75)
				.setId(1)
				.addListener(listener);
		ctrl.addButton("Dec N")
				.setPosition(0,80)
				.setSize(100,75)
				.setId(2)
				.addListener(listener);
		
		//Buttons to control D Value
		ctrl.addButton("Inc D")
				.setPosition(105,0)
				.setSize(100,75)
				.setId(3)
				.addListener(listener);
		ctrl.addButton("Dec D")
				.setPosition(105,80)
				.setSize(100,75)
				.setId(4)
				.addListener(listener);
	}
	
	private class ButtonListener implements ControlListener{
		@Override
		public void controlEvent(ControlEvent controlEvent) {
			switch (controlEvent.getId()){
				case(1): nVal++; break;
				case(2): nVal--; break;
				case(3): dVal++; break;
				case(4): dVal--; break;
			}
			nVal = constrain(nVal,1,100);
			dVal = constrain(dVal,1,100);
			rose.update(nVal,dVal);
		}
	}
	
	public void draw(){
		background(50);
		text("N value: " + nVal,0,200);
		text("D value: " + dVal,105,200);
		pushMatrix();
		translate(width/2,height/2);
		float xInit = 0;
		float yInit = 0;
		for (Point p:rose.getPointsList()) {
			line(xInit,-yInit,(float)p.x(),-(float)p.y());
			xInit=(float)p.x();
			yInit=(float)p.y();
		}
		popMatrix();
	}
	
	public void settings(){fullScreen();}
	public static void main(String[] args) {PApplet.main(MaurerApp.class.getName());}
}
