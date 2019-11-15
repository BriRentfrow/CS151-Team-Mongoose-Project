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

//Jacky's RANT: 
/*
G had to learn how to push to a rep again on 11/12, did not ask us how to push soon enough,
did not ask for help on he framework, he believed he would work on only the
 framework and would not need to help us on our code
 I put his name down for some credit that resembled the Framework that I worked on. 
 But he did not push hit framework when he worked by himself.
 I'd give him 2/10 because he would show up to the biweekly meetng. 
 But I dont know how much he tried because he did communicate with us in a timely manner.
 Brianna and I used online voice chat when we would work together, and would sent constant messages to the group chat
*/

