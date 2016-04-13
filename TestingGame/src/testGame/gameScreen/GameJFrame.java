package gameScreen;

import javax.swing.JFrame;

public class GameJFrame {
     private static FrameSize framesize;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framesize = new FrameSize();
		JFrame gameJframe = new JFrame ("Rain Drop Dodge Game");
		gameJframe.setSize(framesize.getWindowHeight(), framesize.getWindowWidth());
		gameJframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameJframe.setResizable(false);
		gameJframe.setVisible(true);
		

	}

}
