package framework;

import business.Maze;
import presentation.MoveNorth;
import presentation.MoveSouth;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/9 completed CommandProcessor
 * Brianna(11/10): Fixed issue with CommandProcessor 
 * Jacky 11/11 tested Command Processor
 */

public class CommandProcessor {
	
	static Command slot;
	
	public CommandProcessor(){	
	}
	
	public static void executeCmmd(Command cmmd) {
		slot = cmmd;
		slot.execute();
	}

	//tests move method.
	public static void main(String[] args) {
		//CommandProcessor cp = new CommandProcessor();
		Maze maze = new Maze();
		
		//where a super class is expected, a subclass is accepted. So MoveNorth accepts Maze 
		MoveNorth up = new MoveNorth(maze); 
		
		System.out.println(maze.getPlayerPos());
		CommandProcessor.executeCmmd(up);
		System.out.println(maze.getPlayerPos());
		CommandProcessor.executeCmmd(up);
		System.out.println(maze.getPlayerPos());
		
		CommandProcessor.executeCmmd(new MoveNorth(maze));
		System.out.println(maze.getPlayerPos());
		// this line only works if static is removed: static Command
		// cp.CommandProcessor.executeCmmd(newMoveSouth(maze));
		// it works!!!
	}
}


//how to use:

//maze.executeCommand(new MoveNorth(maze));

