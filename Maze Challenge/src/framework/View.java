package framework;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;

import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11: edited updated() , constructor, and added paintComponent(). Class should be finished
 * Collaborated 11/14: edited constructor()
 * 
 */

abstract public class View extends JComponent implements Observer {
	
	protected Model model; //all classes use this model and refer to it

	public View(Model model) {
		this.model = model;
		model.addObserver(this); //model is listening for any changes in View
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