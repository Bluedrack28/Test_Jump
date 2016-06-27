import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class MethodeGraph {
	private Graphics g;
	private Point p;
	
	MethodeGraph(Graphics graphics, Point pointMouse ){
		g = graphics;
		p = pointMouse;
	}
	
	public void drawBouton(Bouton bouton){
		
		if (bouton.mouseOver(p)) {
			g.setColor(bouton.color.darker());
		}
		else{
			g.setColor(bouton.color);
		}
		g.fillRect(bouton.x, bouton.y, bouton.width, bouton.height);

	}
	public void drawBeautifulBouton(Beautiful_Bouton bouton){
		g.fillRect(bouton.x, bouton.y, bouton.width, bouton.height);
		if (bouton.mouseOver(p)){
			g.setColor(Color.white);
			
			g.drawRect(bouton.x, bouton.y, bouton.width, bouton.height);
			g.setColor(bouton.color.brighter());
		}
		else{
			g.setColor(bouton.color);
		}

		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
