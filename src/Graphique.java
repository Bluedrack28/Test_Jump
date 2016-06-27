import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.peer.MouseInfoPeer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphique extends JPanel{
	
	public int nbrClark = 1;
	public int Mx;
	public int My;
	public int x = 0;
	public int y = 200;
	public Point p = new Point();
	public int Bx, By, Bwidth, Bheight;
	public int Vert = 255;
	public Bouton b = new Bouton(110,100,100,100,new Color(255,0,255));
	public Bouton bouton2 = new Bouton(210,100,100,100,new Color(0,0,255));
	public Beautiful_Bouton boutonB = new Beautiful_Bouton(100, 200, 100, 100, new Color(0,0,129));

	public Graphique(){
		
	}
	
	
	
	public void paintComponent(Graphics g){
		
		
		p.y = MouseInfo.getPointerInfo().getLocation().y-getLocationOnScreen().y;
		p.x = MouseInfo.getPointerInfo().getLocation().x-getLocationOnScreen().x;
		
		MethodeGraph mg = new MethodeGraph(g,p);
		
		g.setColor(new Color(255, 255,255));
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(new Color(0,255,255));
		g.drawImage(new ImageIcon("Avatar.png").getImage() , 10, 10, 100, 100, null);
		g.fillRect(x, y, 10, 10);
		
		mg.drawBouton(b);
		mg.drawBouton(bouton2);
		mg.drawBeautifulBouton(boutonB);
		g.setColor(new Color(0,Vert,0));
		g.fillRect(Bx, By, Bwidth, Bheight);
		
		
		g.setFont(new Font("Courier 10 Pitch", 1, 50));
		g.drawString(Integer.toString(this.nbrClark), 200, 100);
		
		g.setColor(new Color(0,0,255));
		g.fillRect(p.x, p.y, 10, 10);
		
		
		
	}
	
	
}
