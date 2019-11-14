package business;

import java.util.Random;

import framework.Model;

// Jacky implemented: move and move tester
// Jacky completed Maze 11/9, edited Move() 11/11
public class Maze extends Model {

	boolean[][] mazeArray;
	public static int MAZE_SIZE = 20;

	int playerPosX;
	int playerPosY;
	int exitX;
	int exitY;


	public Maze() {
		mazeArray = new boolean[20][20];
		setExit(20);
		playerPosX = 10;
		playerPosY = 10;
	}

	public String getPlayerPos() // for testing purposes
	{
		String msg = playerPosX + " " + playerPosY;
		return msg;
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

		mze.move(Heading.NORTH);
		mze.move(Heading.NORTH);
		System.out.println(mze.getPlayerPos());
	}
}
