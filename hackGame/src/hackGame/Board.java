package hackGame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import hackGame.*;
import hackGame.Board.TAdapter;

public class Board extends JPanel implements ActionListener{
	
	JLabel statusbar;
	player user;
	
	public Board(RPG parent) {
		setFocusable(true);
		statusbar =  parent.getStatusBar();
		addKeyListener(new TAdapter());
		statusbar.setText("Player hp: " + user.hp + " | Player level: " + user.level + " | Player attack: " + user.attack);
	}
	
	public void start() {
		
	}
	
	public void paint(Graphics g) {
		
	}
	
	private void moveEntityLeft() {
		
	}
	
	private void moveEntityRight() {
		
	}
	
	private void moveEntityUp() {
	
	}
	
	private void moveEntityDown() {
	
	}
	
	private void attack() {
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
    class TAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {


            int keycode = e.getKeyCode();


            switch (keycode) {
            case KeyEvent.VK_LEFT:
            	moveEntityLeft();
                break;
            }
            
        }
    }

}
