import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame extends JFrame {
	
	
	int stopJump;
	//Point p= new Point();
	MouseL m = new MouseL();
	KeyL k = new KeyL();
	Rectangle rec = new Rectangle(10,100,100,100);
	Graphique g = new Graphique();
	
	public Frame() {
	
		
		g.Bx = rec.x;
		g.By = rec.y;
		g.Bwidth = rec.width;
		g.Bheight = rec.height;
		
		this.setIconImage(new ImageIcon("Avatar.png").getImage());
		this.setTitle("Jeu");
		this.addMouseListener(m);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.addKeyListener(k);
		this.setLocationRelativeTo(null);
		
		//paint.drawBouton(b);
		//g.paintComponent(paint);
		
		this.setContentPane(g);
		this.setVisible(true);
		
		Trame();

	}

	public void Trame() {

		while (true) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//g.p.x = g.Mx;
			//g.p.y = g.My;
			if (rec.contains(g.p)&& m.click == true){
				System.out.println("yool");
				g.nbrClark ++;
				m.click = false;
			}
			if (g.b.contains(g.p)&& m.click){
				g.nbrClark += 5;
				m.click= false;
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
