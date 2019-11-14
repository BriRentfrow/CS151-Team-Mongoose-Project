package framework;

import business.Maze;


//try as in interface
//I got lazy, I changed it back to an abstract class 

public interface Command
{
	public void execute();
}


//NEED to Test: Make a model somewhere else, set a maze, and make sure that instance works
//public abstract class Command
//{
//
//	protected Modely;
//	public Command
//	
//	public abstract void execute();
//}



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

