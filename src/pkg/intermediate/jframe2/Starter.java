package pkg.intermediate.jframe2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Starter {
	
	public static void main(String[] args) {

		int winWidth = 500;
		int winHeigh = 500;
		String strWinTitle = "JFrame App";
		String strBtnLabel = "Click to show new window";
		
		final JFrame newFrame = new JFrame(strWinTitle);
		
		newFrame.setSize(winWidth, winHeigh);
		newFrame.setVisible(true);
		newFrame.setLocationRelativeTo(null);								//增加这句后窗口在屏幕正中间，否则在左上角
		newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel newPanel = new JPanel();
		
		JButton newButton = new JButton(strBtnLabel);
//		newButton.addActionListener(new ActionListener());
		
		
		
		
		
	}
}
//https://blog.csdn.net/xietansheng/article/details/75948927