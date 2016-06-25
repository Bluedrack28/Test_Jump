import java.awt.Graphics;
import java.awt.Point;

public class MethodeGraph {
	private Graphics g;
	private Point p;
	
	MethodeGraph(Graphics graphics, Point pointMouse ){
		g = graphics;
		p = pointMouse;
	}
	
	public void drawBouton(Bouton b){
		
		if (b.mouseOver(p)) g.setColor(b.color.darker());
		else 				g.setColor(b.color);
		g.fillRect(b.x, b.y, b.width, b.height);
		
		
	}
	

}
