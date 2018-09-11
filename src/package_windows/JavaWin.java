package package_windows;
import javax.swing.*;

public class JavaWin{
	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello, World!");
		JLabel label=new JLabel("Welcome to Java!");
		JPanel panel=new JPanel();
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setBounds(0,75,400,20);
		panel.add(label);
		panel.setLayout(null);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setSize(400,300); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
