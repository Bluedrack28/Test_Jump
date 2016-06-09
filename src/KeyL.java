import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class KeyL implements KeyListener{
	public static boolean up = false;
	public static boolean down = false;
	public static boolean right = false;
	public static boolean left = false;
	public static boolean jump = false;
	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyChar()=='w'){
			this.down = true;
		}
		if (e.getKeyChar()=='s'){
			this.up = true;
		}
		if (e.getKeyChar()=='a'){
			this.right = true;
		}
		if (e.getKeyChar()=='d'){
			this.left = true;
		}
		if(e.getKeyChar()==' '){
			this.jump = true;
			
		}
	
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyChar()== 'w'){
			this.down = false;
		}
		if (e.getKeyChar()=='s'){
			this.up = false;
		}
		if (e.getKeyChar()== 'a'){
			this.right = false;
		}
		if (e.getKeyChar()=='d'){
			this.left = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
