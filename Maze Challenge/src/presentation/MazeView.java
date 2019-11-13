package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import framework.View;

//Jacky 11/11: Added maze view, paintComponenet() needs to be finished
public class MazeView extends View{ 
	//remember has an observer, needs update method

	// same as front view
	// draws the maze
	
	public MazeView()
	{
		Dimension d = new Dimension();
		d.setSize(150, 150); // change dimension to needs
        this.setPreferredSize(d);
	}

	public void paintComponenet(Graphics g) {
		super.paintComponent(g);

		//draw the maze, here is an example of drawing something
//		g.setColor(Color.BLACK);
//		g.drawString("Front View", 0, 10);
//
//		Graphics2D gc = (Graphics2D) g;
//		Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 20.0, model.getLength(), model.getHeight());
//		gc.setColor(Color.RED);
//		gc.fill(rectangle);
	}
}
