package presentation;

import java.awt.event.ActionListener;

import business.Maze;
import framework.AppFactory;
import framework.AppPanel;
import framework.Command;
import framework.Model;

public class MazeFactory implements AppFactory {

	// Jacky 11/12: completed getEditCommands(), getHelp(), about(), contents().
	
	public MazeFactory()
	{
		//done
	}
	
	
	@Override //makes maze
	public Model makeModel() {
		Model maze = new Maze();
		return maze;
	}

	@Override //makes the panel under the FileMenu
	public AppPanel makePanel(Model model, ActionListener listener) {
		
		
		if (model instanceof Maze)
		{	
			//return MazePanel()
			return new MazePanel( (Maze) model, listener);
		}
		
		return null;
	}

	@Override
	public String[] getEditCommands() {
		
		return new String[] { "North", "East", "South", "West" };
		//Under the Edit button, these strings appear.

	}
	

	@Override //convert commands to string
	public Command makeEditCommand(Model model, String type) {
		
		//needs to return type command
		Command cmmd = null;
		
		switch(type)
		{
		case "MoveNorth":
			cmmd = new MoveNorth(model);
		}
		
		return null;
	}

	
	//Not sure if needed in Maze Challenge assignment.
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String[] getHelp() {
		
		return new String[] {"About" , "Contents" };
		//After clicking help, these two string appear in the drop down menu.
	}

	@Override
	public String about() {
		return "Maze Challenge version: 1.0 by Mongoose " + Character.toString((char) 169) + " 2019" ;
		//The About info under Help.
	}

	@Override
	public String[] contents() {
		return new String[] { "Locate the escape room in the number of alloted moves" };
		//The contents infor under Help.
	}
}
