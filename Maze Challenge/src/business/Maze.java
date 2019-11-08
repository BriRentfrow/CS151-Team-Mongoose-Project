package business;

import framework.Model;

public class Maze extends Model{
   private  int movesLeft = 20;
   private  int exitRow;
   private  int exitCol;
   private  int playerRow;
   private   int playerCol;
   public static int SIZE = 20;



    public int distanceToExit() //theorem
    {
        //get player position
        //get exit position
        //drop decimal value
        int x = playerPosX - exitX;
        x = xx;
        int y = playerPosY - exitY;
        y = yy;
        double function = Math.sqrt(x + y);
        double rounded = Math.round(function); //decimal is .0
        return (int) rounded;
    }

    public int distanceToExit() //pothagreum theorem
    {
        //get player position
        //get exit position
        //drop decimal value
        int x = playerPosX - exitX;
        x = xx;
        int y = playerPosY - exitY;
        y = yy;
        double function = Math.sqrt(x + y);
        double rounded = Math.round(function); //decimal is .0
        return (int) rounded;

}


 public class enum Heading{

}
