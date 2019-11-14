package presentation;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;

import business.Maze;
import framework.AppPanel;

public class MazePanel extends AppPanel{

	
	// Jacky 11/12: added constructor and private variables.Constructor still needs to be worked on.  
	//The notes below are notes on what to work on. Sorry if its unclear. - Jacky
	private Maze maze;
	private ControlView ctrlView;
	private MazeView mazeView;
	
	/*private MazeControlPanel controlPanel;
		can make that and then have update method and update all 
		set a panel
		I believe also notifyObservers when action is done. Otherwise, where do we use notifyObservers?
		
	
	Then when building MazeFactory theMakeModel()
	 add the controlpanel on the left
	 add the mazeView on the right and shove that into a panel. 
	 
	*/
	
	
	public MazePanel(Maze maze, ActionListener listener) {
		super(maze, listener);
		// add text fields, labels, and views
		this.maze = maze;
		mazeView = new MazeView(maze);
		ctrlView = new ControlView(maze, listener);
		setLayout(new GridLayout (1,2)); // 1x2 grid layout
		maze.addObserver(ctrlView);
		add(mazeView);
		add(ctrlView);
		
	}
}
