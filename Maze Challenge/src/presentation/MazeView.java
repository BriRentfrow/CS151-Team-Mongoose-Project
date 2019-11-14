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
	
	
	/**
	 * Constructor
	 */
	public MazeView() {
		Dimension d = new Dimension();
		d.setSize(400,400);
		this.setPreferredSize(d);
	}

	/**
	 * Another constructor
	 * @param maze Maze view takes in a maze
	 */
	public MazeView(Maze maze) {
		super(maze);
		//TheMaze = maze;
	}
	
	/**
	 * Draws the maze
	 * @param g 
	 */
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Create the grid within the for loop
		for(int x = 0; x > 20; x++) {
			for(int y = 0; y > 20; y++) {
				drawSquare(g,(x*UNIT_SIZE), (y*UNIT_SIZE));
				
			}
		}
		
        Graphics2D gc = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(UNIT_SIZE,UNIT_SIZE, 25, 25);
        gc.setColor(Color.RED);
        gc.fill(rectangle);
	}
	
	public void drawSquare(Graphics gr, int x, int y) {
		
		Graphics2D g = (Graphics2D) gr;
		
		Rectangle2D.Double rectangle = new Rectangle2D.Double(UNIT_SIZE,UNIT_SIZE, 25, 25);
		//Make a square
		g.setColor(Color.GRAY);
		g.fillRect(x, y, UNIT_SIZE, UNIT_SIZE);
		
		Rectangle2D.Double borderrect = new Rectangle2D.Double(UNIT_SIZE,UNIT_SIZE, 25, 25);
		//Make Border
		g.setColor(Color.BLACK);
		g.drawRect(x, y, UNIT_SIZE, UNIT_SIZE);
		

		
	}

}