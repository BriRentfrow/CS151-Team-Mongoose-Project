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


}


//how to use:

//maze.executeCommand(new MoveNorth(maze));

