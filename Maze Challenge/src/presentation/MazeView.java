package presentation;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

import java.awt.*;

import business.Maze;
import framework.Model;
import framework.View;

/**
 * 
 * Brianna (11/12): Added and started MazeView, just added constructors
 * Brianna (11/12): Continued working on MazeView; added methods
 *
 */

public class MazeView extends View {

	Maze TheMaze;
	int playerX;
	int playerY;
	int UNIT_SIZE = 10;
	//10x10 pixels for square size
	//20x20 grid size
	
	public MazeView() {
		Dimension d = new Dimension();
		d.setSize(400,400);
		this.setPreferredSize(d);
	}

	public MazeView(Maze maze) {
		super(maze);
		//TheMaze = maze;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Make Border
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, UNIT_SIZE, UNIT_SIZE);
		//Make a square
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, UNIT_SIZE, UNIT_SIZE);
		
		
		//g.drawRect(x, y, width, height);
		//g.setColor(Color.BLACK);
        //g.drawString("Side View" , 0, 10);
        Graphics2D gc = (Graphics2D) g;
        Rectangle2D.Double rectangle = new 
            Rectangle2D.Double(10,10.0, 25, 25);
        gc.setColor(Color.RED);
        gc.fill(rectangle);
	}
	
	//Use for loop to build a 2D Array of the paintComponent based on the ROOM_SIZE 
	public void buildMaze(int size) {
		
	}
	
}