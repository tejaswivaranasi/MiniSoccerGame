package main;
import controller.GameListener;
import controller.MenubarListener;
import view.GameMenuBar;
import view.GamePanel;

import javax.swing.*;

public class MiniSoccerApp {

	public static void main(String[] args) {
		JFrame gameFrame = new JFrame("Mini Soccer");	// creates  a frame

		GamePanel gamePanel = new GamePanel();	// creates an object
		GameListener gameListener = new GameListener(gamePanel);	// object created
		MenubarListener menubarListener = new MenubarListener(gamePanel);	// object created
		GameMenuBar gameMenuBar = new GameMenuBar(menubarListener,gamePanel);	// object created

		gameFrame.add(gamePanel);
		gameFrame.addKeyListener(gameListener);
		gameFrame.setJMenuBar(gameMenuBar);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setSize(600, 600);
		gameFrame.setLocationRelativeTo(null);
		gameFrame.setResizable(false);
		gameFrame.setVisible(true);
	}
}
