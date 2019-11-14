package presentation;

import business.Heading;
import business.Maze;
import framework.Command;
import framework.Model;

//Jacky 11/9: added class
//Jacky 11/13 changed the class constructor to take a Model
public class MoveNorth implements Command {

	private Maze maze;

	//Needs to take in a model to make AppFrame happy
	public MoveNorth(Model maze)
	{
		this.maze = (Maze) maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.NORTH);		
	}
	
}
