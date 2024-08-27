package main;

import javax.swing.JFrame;

public class GameWindow {
	private JFrame jframe;
	public GameWindow(GamePanel Gamepanel) {
		jframe= new JFrame();
		
		jframe.setSize(400,400);
		jframe.add(Gamepanel);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When cut then Program closed
	}
}
