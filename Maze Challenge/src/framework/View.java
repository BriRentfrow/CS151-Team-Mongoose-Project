package framework;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;

import business.Brick;
import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11: edited updated(), constructor, and added paintComponent(), 
 * 
 */

abstract public class View extends JComponent implements Observer {
	protected Model model;

	public View(Model model) {
		setModel(model);
	}

	public View() {
		this(null);
	}

	public void update(Observable subject, Object msg) {
		this.model = (Maze) subject;
		repaint();

	}

	// deletes observers from model, adds observers form model, and updates model.
	public void setModel(Model model) {

		
		if (this.model != null) {
			this.model.deleteObserver(this);
			this.model = model;
		}
		if (this.model != null) {
			this.model.addObserver(this);
			this.update(model, null); // update myself
		}
	}
	
	public void paintComponenet(Graphics g)
	{
		super.paintComponent(g);
	}
}