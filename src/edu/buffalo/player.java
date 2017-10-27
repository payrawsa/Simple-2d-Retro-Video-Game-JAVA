package edu.buffalo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import edu.buffalo.GameBoard;
import edu.buffalo.Location;
import edu.buffalo.creatures.Creature;

public class player extends Creature {
	public player(int maxHealth) {
		super(maxHealth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void takeTurn(GameBoard gameBoard, Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public ImageIcon getImageIcon() {
		// TODO Auto-generated method stub

		return new ImageIcon("assets/daeva.png");
	}

	@Override
	public void encounterCreature(Creature creature) {
		// TODO Auto-generated method stub
		
	}

	
}
