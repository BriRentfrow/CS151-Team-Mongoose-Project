package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JPanel;

import business.Maze;
import framework.Model;
import framework.View;

//Jacky 11/11: Added maze view, paintComponenet() needs to be finished
//Jacky 11/13: update() was added.
//Jacky/Brianna (11/13): New paintComponent Made
//Collaboration (11/14): Fix paintComponent
//Brianna (11/14): Minor tweaks to paintComponent
public class MazeView extends View {
    // remember has an observer, needs update method
    // draws the maze
    private static final long serialVersionUID = 1L;

    private Maze maze;
    private final int VIEW_SIZE = 200;
    private int UNIT_SIZE;

    public MazeView(Model model) {
        super(model);
        this.maze = (Maze) model;
        this.UNIT_SIZE = VIEW_SIZE / maze.MAZE_SIZE;
        this.setMinimumSize(new Dimension(VIEW_SIZE, VIEW_SIZE));
    }

    public void paintComponent(Graphics g) {

        Graphics2D gc = (Graphics2D) g;
        super.paintComponent(g);
        Rectangle2D.Double rectangle;

        // Create the grid within the for loop
        for (int x = 0; x < maze.MAZE_SIZE; x++) {
            for (int y = 0; y < maze.MAZE_SIZE; y++) {

                rectangle = new Rectangle2D.Double(x *UNIT_SIZE, y*UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
                gc.setColor(Color.DARK_GRAY);
                gc.fill(rectangle);
                gc.setColor(Color.BLACK);
                gc.draw(rectangle);

            }
        }

        //draw the player
        Ellipse2D.Double player = new Ellipse2D.Double(maze.getPlayerX() *UNIT_SIZE , maze.getPlayerY() *UNIT_SIZE, UNIT_SIZE, UNIT_SIZE);
        gc.setColor(Color.BLUE);
        gc.fill(player);
        gc.setColor(Color.white);
        gc.draw(player);

    }

}
