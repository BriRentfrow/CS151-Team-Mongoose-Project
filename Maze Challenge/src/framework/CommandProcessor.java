package framework;

import business.Maze;
import presentation.MoveNorth;
import presentation.MoveSouth;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/9 completed CommandProcessor
 * Brianna(11/10): Fixed issue with CommandProcessor 
 * Jacky 11/11 tested Command Processor
 * Jacky 11/14 edited execute()
 * 
 * G: worked on command processor and pushed on 11/10
 */

public class CommandProcessor {

	//this line is used when??????
	public static CommandProcessor theCommandProcessor =  new CommandProcessor();
    
	public CommandProcessor() 
	{

    }
	public static void execute(Command cmmd) 
	{
        cmmd.execute();
    }

}




 //below: If commanprocessor used Command as an interface

// public class CommandProcessor {
	
// 	static Command slot;
	
// 	public CommandProcessor(){	
// 	}
	
// 	public static void executeCmmd(Command cmmd) {
// 		slot = cmmd;
// 		slot.execute();
// 	}

// }


//how to use:

//maze.executeCommand(new MoveNorth(maze));

