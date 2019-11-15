package framework;

import business.Maze;


//try as in interface. Didnt work with appFrame actionPerformed() so using abstract


// public interface Command
// {
// 	public void execute();
// }

public abstract class Command {
    
	protected Model model;

    public void execute() {}
}
