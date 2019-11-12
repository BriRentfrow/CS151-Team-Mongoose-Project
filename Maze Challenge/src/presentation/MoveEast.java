package presentation;

import business.Heading;
import business.Maze;
import framework.Command;
public class MoveEast implements Command {

	private Maze maze;

	public MoveEast(Maze maze)
	{
		this.maze = maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.EAST);
		
	}
	
}