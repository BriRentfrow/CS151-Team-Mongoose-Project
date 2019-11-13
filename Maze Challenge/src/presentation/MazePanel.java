package presentation;

import java.awt.event.ActionListener;
import java.util.Observable;

import business.Maze;
import framework.AppPanel;

// Jacky: 11/11 Added class, Constructor, and Update Notes: Unfinished
public class MazePanel extends AppPanel{

	// private fields
	
	
	//app panel needs to be finished for this
	public MazePanel(Maze maze, ActionListener listener) {
		
		super(maze, listener);
		// add text fields, labels, and views
		
	}
	
	public void update( Observable subject, Object msg) {
		Maze maze = (Maze) model;
		
	}
}
