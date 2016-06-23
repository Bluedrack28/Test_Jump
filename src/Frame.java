import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class Frame extends JFrame {
	public static int stopJump;
	static Point p= new Point();
	static MouseL m = new MouseL();
	static KeyL k = new KeyL();
	public static Rectangle rec = new Rectangle(10,100,100,100);
	private static Graphique g = new Graphique();
	static Paint paint = new Paint();
	public static Bouton b = new Bouton(100,100,100,100,new Color(255,0,255));
	
	public Frame() {
	
		
		g.Bx = rec.x;
		g.By = rec.y;
		g.Bwidth = rec.width;
		g.Bheight = rec.height;
		
		
		this.setTitle("Jeu");
		this.addMouseListener(m);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.addKeyListener(k);
		this.setLocationRelativeTo(null);
		paint.drawBouton(b);
		g.paintComponent(paint);
		this.setContentPane(g);
		this.setVisible(true);
		
		Trame();

	}

	public static void Trame() {

		while (true) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.x = g.Mx;
			p.y = g.My;
			if (rec.contains(p)&& m.click == true){
				g.nbrClarck ++;
				m.click = false;
			}
			
			
			//System.out.println( g.Mx +" "+ g.My +" "+ m.click );
			//if(g.Mx >= g.Bx && g.Mx <= (g.Bx + g.Bwidth) && g.My >= g.Bx && g.My <= (g.By + g.Bheight) && m.click == true ){
				//System.out.println( g.Mx +" "+ g.My +" "+ m.click );
			//	System.out.println("CLICK !!");
			//	g.Vert = 220;
			//	g.nbrClarck ++;
			//	m.click = false;
				
			//}else{
			g.Vert = 255;
			//}
			
			
			
			if (k.up == true) {
				g.y += 10;
			}
			if (k.down == true) {
				g.y -= 10;
			}
			if (k.left == true) {
				g.x += 10;
			}
			if (k.right == true) {
				g.x -= 10;
			}
			if (k.jump == true) {
				
			}
			g.repaint();

		}
	}

}
