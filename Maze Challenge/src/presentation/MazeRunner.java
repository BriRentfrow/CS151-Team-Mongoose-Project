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

	//Jacky's RANT: G did not push in a timely manner, and the 
	//team allready completed and pushed the code that G pushed.
	// 2/10 score for teamwork because at least he showed up to biweekly in person meetings
	//did not work with team online.
}
