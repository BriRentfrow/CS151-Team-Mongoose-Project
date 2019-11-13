package presentation;

import business.Heading;
import business.Maze;
import framework.Command;

//Jacky 11/9 Completed

public class MoveNorth implements Command {

	private Maze maze;

	public MoveNorth(Maze maze)
	{
		this.maze = maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.NORTH);
		//repaint here
	}
	
}
