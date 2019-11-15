package presentation;

import java.awt.GridLayout;
import java.awt.event.ActionListener;


import business.Maze;
import framework.AppPanel;
import framework.Model;
import framework.View;

public class MazePanel extends AppPanel{

	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// Jacky 11/12: added and edited constructor.
	// 
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
	
	
	public MazePanel(Model model, ActionListener listener) {
		super(model, listener);
		this.maze = (Maze) model;
		setLayout(new GridLayout (1,2)); // 1x2 grid layout
		//get Views and add mazeview to it
		
		
		ctrlView = new ControlView(maze, listener);
		this.add(ctrlView);
		mazeView = new MazeView(maze);
		this.add( mazeView);
		//maze.addObserver(ctrlView);  not needed because subclasses do addObservers

		// for (View view: views) 
		// { this.add(view);}
		
	}
}
