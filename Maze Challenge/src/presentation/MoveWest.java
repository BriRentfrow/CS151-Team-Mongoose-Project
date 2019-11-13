package presentation;

import business.Heading;
import business.Maze;
import framework.Command;

//Jacky 11/9 Completed

public class MoveWest implements Command {

	private Maze maze;

	public MoveWest(Maze maze)
	{
		this.maze = maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.WEST);
		//repaint here
	}
	
}
