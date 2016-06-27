import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;


public class Bouton extends Rectangle{

	public boolean clickB;
	public Color color;
	
	Bouton(int x, int y, int Height, int Weidth, Color color){
		this.setBounds(x, y, Weidth, Height);
		this.color = color;
		
	}
	
	public boolean mouseOver(Point p){
		
		 if (this.contains(p)) return true;
		 else return false;

		
	}
	public boolean isClick(Point p,MouseL mouse){
		if(this.contains(p) && mouse.click)return true;
		else{
			return false;
		}
	}
	
	
	

}
