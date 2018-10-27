package hackGame;

import javax.swing.*;

import hackGame.Board;

import java.awt.*;

public class RPG extends JFrame {
	
	JLabel statusbar;
	
	public RPG() {
		statusbar = new JLabel(" 0");
		Board board = new Board(this);
        add(board);
        add(statusbar, BorderLayout.SOUTH);
        board.start();
        
        setSize(1000, 1000);
        setTitle("Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JLabel getStatusBar() {
	       return statusbar;
	   }
		

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        RPG game = new RPG();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        
    }

}
