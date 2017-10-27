package edu.buffalo;

import edu.buffalo.creatures.Creature;

import javax.swing.*;

/**
 * Nothing. A placeholder GameObject to indicate the lack of an object
 */
public class Nothing extends GameObject{


    @Override
    public ImageIcon getImageIcon(){
        return new ImageIcon(new byte[0]);
    }

    @Override
    public boolean passable(){
        return true;
    }

    @Override
    public void encounterCreature(Creature creature){
        // Do nothing
    }

}
