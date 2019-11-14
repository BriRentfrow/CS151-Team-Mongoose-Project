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

/**
 * 
 * Jacky 11/11: Added maze view, paintComponenet() needs to be finished
 * Brianna (11/12): Worked on
 * Brianna (11/13): Continued to try and get things to paint
 * Brianna (11/14): Continued to work on methods and merging
 *
 */
public class MazeView extends View{ 
	Maze TheMaze;
    int playerX;
    int playerY;
    int UNIT_SIZE = 10;
    //10x10 pixels for square size
    //20x20 grid size

    //TODO: Get to make a grid

    /**
     * Constructor
     */
    //public MazeView(){
    //    Dimension d = new Dimension();
    //    d.setSize(400,400);
    //    this.setPreferredSize(d);
    //}

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
     * 
     **/
    
    /**
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
    **/
    
    public void paintComponenet(Graphics g) {
        super.paintComponent(g); 
        Graphics2D gc = (Graphics2D) g;

        //for loop, draw each rectangle to how you need
        Rectangle2D.Double rectangle = new Rectangle2D.Double(0, 0, UNIT_SIZE, UNIT_SIZE);

        gc.setColor(Color.GRAY);
        gc.fill(rectangle);
        gc.setColor(Color.BLACK);
        gc.draw(rectangle);

        //for loop this 
        
        for(int x = 0; x > 20; x++) {
            for(int y = 0; y > 20; y++) {
            	rectangle = new Rectangle2D.Double((x*UNIT_SIZE), (y*UNIT_SIZE), UNIT_SIZE,25);
                gc.setColor(Color.GRAY);
                gc.fill(rectangle);
                gc.setColor(Color.BLACK);
                gc.draw(rectangle);
            }
        }
        
        //end for loop
        //or can draw rectangles in the method below
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
