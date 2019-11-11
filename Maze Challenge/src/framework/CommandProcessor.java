package framework;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/9 completed CommandProcessor
 * Brianna(11/10): Fixed issue with CommandProcessor
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
//need to make a setCommand first
//maze.setCommand(new MoveNorth(maze))

//then execute the setCommand
//maze.executeCmmd();




//
//public class CommandProcessor {
//
//	public static CommandProcessor theCommandProecessor = new CommandProcessor();
//	public static void execute(Command c)
//	{
//		c.execute();
//	}
//}
