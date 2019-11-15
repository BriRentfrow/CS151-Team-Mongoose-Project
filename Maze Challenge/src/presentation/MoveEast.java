package presentation;

import business.Heading;
import business.Maze;
import framework.Command;

//Jacky 11/9: added class
//Jacky 11/13 changed the class constructor to take a Model

public class MoveEast extends Command {

	private Maze maze;

	public MoveEast(Maze maze)
	{
		super();
		this.maze = maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.EAST);	
	}
	
}
