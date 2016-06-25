import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;


public class Bouton extends Rectangle{

	
	public Color color;
	
	Bouton(int x, int y, int Height, int Weidth, Color color){
		this.setBounds(x, y, Weidth, Height);
		this.color = color;
	}
	
	public boolean mouseOver(Point p){
		
		 if (this.contains(p)) return true;
		 else return false;

		
	}

}
