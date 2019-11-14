package presentation;

import framework.AppFrame;

// Jacky 11/13 added and completed Class
public class MazeRunner {

	public static void main (String[] args)
	{
		AppFrame app = new AppFrame( new MazeFactory());
		app.pack();
		app.setVisible(true);
				
	}
}
