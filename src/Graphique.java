import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.peer.MouseInfoPeer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphique extends JPanel {
	public static int nbrClarck;
	public static int Mx;
	public static int My;
	public static int x = 0;
	public static int y = 200;
	public static int Bx, By, Bwidth, Bheight;
	public static int Vert = 255;
	
	
	public void paintComponent(Graphics g){
		
		
		
		
		
		boolean[][] a = new boolean[10][10];
		My = MouseInfo.getPointerInfo().getLocation().y-getLocationOnScreen().y;
		Mx = MouseInfo.getPointerInfo().getLocation().x-getLocationOnScreen().x;
		g.setColor(new Color(255, 255,255));
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		g.setColor(new Color(0,255,255));
		g.drawImage(new ImageIcon("Avatar.png").getImage() , 10, 10, 100, 100, null);
		g.fillRect(x, y, 10, 10);
		
	
		
		g.setColor(new Color(0,Vert,0));
		g.fillRect(Bx, By, Bwidth, Bheight);
		
		
		g.setFont(new Font("Courier 10 Pitch", 1, 50));
		g.drawString(Integer.toString(nbrClarck), 200, 100);
		
		g.setColor(new Color(0,0,255));
		g.fillRect(Mx, My, 10, 10);
		
		
		
	}
	
	
}
