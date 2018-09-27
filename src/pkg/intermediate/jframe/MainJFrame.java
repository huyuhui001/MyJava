package pkg.intermediate.jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MainJFrame extends JFrame {
	public static void main(String[] args) throws InterruptedException {
		MainJFrame newWindow = new MainJFrame();
		Draw newBall = new Draw();
		Keyboard newKeyboard = new Keyboard();
		
		while(true) {
//			newWindow.add(newBall);
//			newBall.moveBall();
			newWindow.add(newKeyboard);
			newWindow.repaint();
			Thread.sleep(2);
		}
	}
	
	public MainJFrame() {	
		this.setTitle("Game Title Here");
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Draw extends JPanel {
	int x = 0;
	int y = 0;
	int x_inc = 0;
	int y_inc = 0;
	
	void moveBall() {
		if(x + x_inc > getWidth() - 20) {
			x_inc = -1;
		}
		
		if( x + x_inc < 0) {
			x_inc = 1;
		}
		
		if(y + y_inc > getHeight() - 20) {
			y_inc = -1;
		}
		
		if(y + y_inc < 0) {
			y_inc = 1;
		}
		
		x += x_inc;
		y += y_inc;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.fillOval(x, y, 20, 20);
		g2d.drawString("ball", x, y);
	}
}




class Keyboard extends JPanel {
	public Keyboard() {
		KeyListener myListener = new MyKeyListener(this);
		addKeyListener(myListener);
		setFocusable(true);
	}
}




class MyKeyListener implements KeyListener {
	String str1 = "";
	private Keyboard myKB;
		
	MyKeyListener (Keyboard myKB) {
		this.myKB = myKB;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		str1 = KeyEvent.getKeyText(e.getKeyCode());
//		myKB.repaint();
		System.out.println("Pressed Key is: "+KeyEvent.getKeyText(e.getKeyCode()));
	}
 
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released Key is:  " + KeyEvent.getKeyText(e.getKeyCode()));	
	}
}

