package framework;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;

import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11: edited updated() , constructor, and added paintComponent(). Class should be finished
 * Jacky 11/13:
 * 
 */

abstract public class View extends JComponent implements Observer {
	
	protected Model model; //all classes use this model and refer to it

	public View() {
		this(null);
	}

	public View(Model model) {
		setModel(model);
	}


	public void setModel(Model model) {

		
		if (this.model != null) {
			this.model.deleteObserver(this);
			this.model = model;
		}
		if (this.model != null) {
			this.model.addObserver(this);
			this.update(model, null); // update myself <-- uses the method update() below.
		}
	}

	
	//UPDATE IS DONE, not needed in MazeView
	public void update(Observable subject, Object msg) {	
		repaint();
	}
	//repaint() uses this.
	public void paintComponenet(Graphics g)
	{
		super.paintComponent(g);
	}
	
}