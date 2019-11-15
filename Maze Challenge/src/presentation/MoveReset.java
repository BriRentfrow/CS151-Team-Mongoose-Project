package presentation;

import business.Heading;
import business.Maze;
import framework.Command;
import framework.Model;

//Jacky 11/9: added class 
//Jacky 11/13 edited constructor

public class MoveReset extends Command {

	private Maze maze;

	public MoveReset(Model maze)
	{
		this.maze = (Maze) maze;
	}

	@Override
	public void execute() {
		maze.move(Heading.RESET);
		
	}
}