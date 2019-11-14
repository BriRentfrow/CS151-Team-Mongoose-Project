package presentation;

import business.Heading;
import business.Maze;
import framework.Command;
import framework.Model;

//Jacky 11/9: added class
//Jacky 11/13 changed the class constructor to take a Model
public class MoveWest implements Command {

	private Maze maze;

	public MoveWest(Model maze)
	{
		this.maze = (Maze) maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.WEST);
		
	}
	
}
