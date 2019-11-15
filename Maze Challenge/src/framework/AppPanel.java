package framework;

import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JPanel;
import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11 finished update method and constructor Notes: may be the same as as BrickPanel, listener
 * Jacky: appPanel is FINISHED as of 11/13.
 * /
 */


public class AppPanel extends JPanel implements Observer {
	  protected Model model;
	  protected ActionListener listener;
	 // protected ArrayList<View> views; 
	  
	  
	  public AppPanel(Model model, ActionListener listener)
	  {
		this.model = model;  
		//views = new ArrayList<View>();
		this.listener = listener; 
		model.addObserver(this);
	  }
	  
	

	  
	  public void update(Observable subject, Object msg) {//no op }

	  //added edited and deleted code below, instead of a list of views, we can just continue to add views in 
	    //  for(View view: views)
	    //  {
	    // 	 view.update(model, view);
		//  }
		
	//   public void add(View view) {
	// 	//  super.add(view);
	//      views.add(view);     //NULL POINTERE thrown here
	//   }
	// public ArrayList getViews() {return views;}
	  
	}
}