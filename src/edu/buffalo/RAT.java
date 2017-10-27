package edu.buffalo;

import javax.swing.ImageIcon;

import edu.buffalo.creatures.Creature;

public class RAT extends Creature {

	public RAT(int maxHealth) {
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
		return new ImageIcon("assets/grey_rat.png");
	}

	@Override
	public void encounterCreature(Creature creature) {
		// TODO Auto-generated method stubt
		creature.hurt(1);	
	}

}
