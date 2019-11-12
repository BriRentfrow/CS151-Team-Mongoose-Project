package presentation;

import java.awt.event.ActionListener;

import business.Maze;
import framework.AppPanel;

public class MazePanel extends AppPanel{

	// private fields
	
	public MazePanel(Maze maze, ActionListener listener) {
		super(maze, listener);
		// add text fields, labels, and views
		
	}
	
	public void update( Observable subject, Object msg) {
		Maze maze = (Maze) model;
		
	}
}
