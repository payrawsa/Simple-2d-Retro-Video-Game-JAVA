package edu.buffalo;

import javax.swing.ImageIcon;

import edu.buffalo.creatures.Creature;

public class potions extends GameObject{

	@Override
	public ImageIcon getImageIcon() {
		// TODO Auto-generated method stub
		return new ImageIcon("assets/ruby.png");
	}

	@Override
	public boolean passable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void encounterCreature(Creature creature) {
		// TODO Auto-generated method stub
creature.heal(3);
	}

}
