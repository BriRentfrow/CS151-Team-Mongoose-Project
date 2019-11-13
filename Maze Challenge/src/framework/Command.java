package framework;

import business.Maze;


//try as in interface
//NEED to Test: Make a model somewhere else, set a maze, and make sure that instance works
public interface Command
{
	public void execute();
}



//
//public abstract class Command {
//	
//	protected Model model;
//	protected Maze maze;
//	//or do Maze maze;  ???
//	
//	public abstract void execute();
//	
//}

