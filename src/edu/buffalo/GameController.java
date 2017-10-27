package edu.buffalo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controls the game logic including user inputs and movement as well as
 * creating and placing enemies, items, and the player. Implements KeyListener
 * to handle keyboard inputs
 */
public class GameController implements KeyListener {
	private GameBoard board;
	private player player;
	private Location location;
	private RAT rat;
	private potions potion;

	/**
	 * Initializes the game by adding all the game objects to the board
	 */
	public GameController(GameBoard board) {
		this.board = board;
		init();
	}

	private void init() {
		this.player = new player(10);
		this.rat= new RAT(1);
		this.potion= new potions();
		board.addObject(player, board.randomPassableLocation());
		board.addObject(rat, board.randomPassableLocation());
		board.addObject(rat, board.randomPassableLocation());
		board.addObject(rat, board.randomPassableLocation());
		board.addObject(rat, board.randomPassableLocation());
		board.addObject(rat, board.randomPassableLocation());
		board.addObject(potion, board.randomPassableLocation());



	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.location = board.getObjectLocation(player);
		if (e.getKeyCode() == e.VK_W) {
			board.moveCreature(player, this.location.translated(0, -1));
			board.updateHUD(player);
		} else if (e.getKeyCode() == e.VK_D) {
			board.moveCreature(player, this.location.translated(1, 0));
			board.updateHUD(player);

		} else if (e.getKeyCode() == e.VK_A) {
			board.moveCreature(player, this.location.translated(-1, 0));
			board.updateHUD(player);

		} else if (e.getKeyCode() == e.VK_S) {
			board.moveCreature(player, this.location.translated(0, 1));
			board.updateHUD(player);

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
