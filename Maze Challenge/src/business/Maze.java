package business;

import java.util.Random;

import framework.Model;

// Jacky implemented: move and move tester
// Jacky completed Maze 11/9, edited Move() 11/13 added RESET in move.
public class Maze extends Model {

	boolean[][] mazeArray;
	public static int MAZE_SIZE = 20;

	int playerPosX;
	int playerPosY;
	int exitX;
	int exitY;
	int numMoves;


	public Maze() {
		mazeArray = new boolean[20][20];
		setExit(20);
		playerPosX = 10;
		playerPosY = 10;
		numMoves = 100;
		
	}

	public String getPlayerPos() // for testing purposes
	{
		String msg = playerPosX + " " + playerPosY;
		return msg;
	}
	
	public int getNumMoves()
	{
		return numMoves;
	}

	public void setExit(int mazeSize) {
		Random rand = new Random();
		exitX = rand.nextInt(mazeSize);
		exitY = rand.nextInt(mazeSize);
		mazeArray[exitY][exitX] = true;
	}

	public void move(Heading direction) {
		switch (direction) {

		case NORTH:
			if (playerPosY > 0) {
				playerPosY -= 1;
			}
			this.changed();
			break;

		case SOUTH:
			if (playerPosY < 19) {
				playerPosY += 1;
			}
			this.changed();
			break;
		case EAST:
			if (playerPosX < 19) {
				playerPosX += 1;
			}
			this.changed();
			break;
		case WEST:
			if (playerPosX > 0) {
				playerPosY -= 1;
			}
			this.changed();
			break;
			
		case RESET:
			playerPosX = 10;
			playerPosY = 10;
			this.changed();
			break;
		default:
			break;
		}

	}

	public int distanceToExit() // pythagorean theorem
	{
		int x = playerPosX - exitX;
		x = x * x;
		int y = playerPosY - exitY;
		y = y * y;

		double function = Math.sqrt(x + y);
		double rounded = Math.round(function); // decimal is .0
		return (int) rounded;
	}

	//tests move method.
	public static void main(String[] args) {
		Maze mze = new Maze();
		System.out.println(mze.getPlayerPos());

<<<<<<< HEAD
		mze.move(Heading.NORTH);
		mze.move(Heading.NORTH);
		System.out.println(mze.getPlayerPos());
	}
=======


>>>>>>> parent of d1147e2... Merge branch 'master' of https://bitbucket.org/BriannaRentfrow/cs151mongoose
}
