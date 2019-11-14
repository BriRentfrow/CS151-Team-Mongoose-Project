package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JPanel;

import business.Maze;
import framework.Model;
import framework.View;

//Jacky 11/11: Added maze view, paintComponenet() needs to be finished
public class MazeView extends View{ 
	//remember has an observer, needs update method

	// same as front view
	// draws the maze

	private Maze maze;
	
	public MazeView(Model model)
	{
		super(model);
		this.model = model;
		
	}

	
	//just draw the maze ez
	public void paintComponenet(Graphics g) {
		super.paintComponent(g); 
		Graphics2D gc = (Graphics2D) g;
		
		//for loop, draw each rectangle to how you need
		Rectangle2D.Double rectangle = new Rectangle2D.Double(40, 40, 25, 25);

		gc.setColor(Color.RED);
		gc.fill(rectangle);
		gc.setColor(Color.BLACK);
		gc.draw(rectangle);

		//for loop this 
	
		gc.setColor(Color.RED);
		gc.fill(rectangle);
		gc.setColor(Color.BLACK);
		gc.draw(rectangle);
		//end for loop
		//or can draw rectangles in the method below
	}
	
	
	public void update(Observable o, Object arg) {
		this.maze = (Maze) o;
		repaint();
		
	}
}
