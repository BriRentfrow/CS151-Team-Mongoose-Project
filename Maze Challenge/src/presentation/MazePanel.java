package presentation;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JComponent;
import javax.swing.JPanel;

import business.Maze;
import framework.AppPanel;
import framework.Model;
import framework.View;

public class MazePanel extends AppPanel{

	
	// Jacky 11/12: added and edited constructor.  
	// 
	private Maze maze;
	private ControlView ctrlView;
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
		// add text fields, labels, and views
		this.maze = (Maze) model;
		//get Views and add mazeview to it
		views.add(new MazeView(model));
		
		ctrlView = new ControlView(maze, listener);
		setLayout(new GridLayout (1,2)); // 1x2 grid layout

		maze.addObserver(ctrlView);
		this.add(ctrlView);
		
		for (View view: views) 
		{ this.add(view);}
		
	}
}
