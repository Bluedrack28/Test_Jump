import javax.swing.JFrame;

public class Frame extends JFrame {
	public static int stopJump;
	static KeyL k = new KeyL();

	private static Graphique g = new Graphique();

	public Frame() {

		this.setTitle("Jeu");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.addKeyListener(k);
		this.setLocationRelativeTo(null);
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
			
			
			System.out.println( g.Mx);
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
				System.out.println("lol");

			}
			g.repaint();

		}
	}

}
