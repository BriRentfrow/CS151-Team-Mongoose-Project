//package framework;
//
//
//import business.Heading;
//import business.Maze;
//import framework.Command;
//import framework.Model;
//
//
////When trying to move this class to presentation, there are bugs, but when left in framework, there are no bugs.
//public abstract class Move extends Command {
//
//	
//	public Move(Maze maze) {
//		
//			this.model = (Model) maze; 
//			//im having troble understanding how to link move commands to maze.
//			//this could be it.
//		}
//	
//	@Override
//	public abstract void execute();
//	//end of Move class
//}
//
//class MoveNorth extends Move{
//	public MoveNorth(Maze maze) {
//		super(maze);
//	}
//	
//	public void execute() {
//		maze.move(Heading.NORTH);
//	}
//}
//class MoveEast extends Move {
//	
//	public MoveEast(Maze maze) {
//		super(maze);
//	}
//	
//	public void execute() {
//		maze.move(Heading.EAST);
//	}
//}
//
//class MoveSouth extends Move {
//	
//	public MoveSouth(Maze maze) {
//		super(maze);
//	}
//	
//	public void execute() {
//		maze.move(Heading.SOUTH);
//	}
//}
//
//class MoveWest extends Move {
//	
//	public MoveWest(Maze maze) {
//		super(maze);
//	}
//	
//	public void execute() {
//		maze.move(Heading.WEST);
//	}
//}