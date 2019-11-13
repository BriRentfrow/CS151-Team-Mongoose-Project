package presentation;

import business.Heading;
import business.Maze;
import framework.Command;

//Jacky 11/9 Completed

public class MoveSouth implements Command {

	private Maze maze;

	public MoveSouth(Maze maze)
	{
		this.maze = maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.SOUTH);
		//repaint here
	}
	
}
