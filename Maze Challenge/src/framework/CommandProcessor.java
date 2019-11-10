package framework;

// Jacky 11/9 completed CommandProcessor

public class CommandProcessor{
	
	Command slot;
	
	public CommandProcessor()
	{
		
	}
	
	public void setCommand(Command cmmd)
	{
		slot = cmmd;
	}
	
	public void executeCmmd() {
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
