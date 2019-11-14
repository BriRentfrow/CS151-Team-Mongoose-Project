package framework;

import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JPanel;

import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11 finished update method and constructor Notes: may be the same as as BrickPanel, listener
 * Jacky: appPanel is FINISHED as of 11/13.
 */


public class AppPanel extends JPanel implements Observer {
	  protected Model model;
	  protected ActionListener listener;
	  protected ArrayList<View> views;
	  
	  
	  public AppPanel(Model model, ActionListener listener)
	  {
		this.model = model;  
		this.listener = listener; 
		model.addObserver(this);
	  }
	  
	

	  //This takes all the views in the application and then called update (in view) in all of them. //DONE
	  public void update(Observable subject, Object msg) {
		  //no op 
	    //  for(View view: views)
	    //  {
	    // 	 view.update(model, view);
	    //  }
	  }
	  
	  public void setModel(Model model) {
		  //DONE
	     if (this.model != null) this.model.deleteObserver(this);
	     this.model = model;
	     if (this.model != null) this.model.addObserver(this);
	     for(View view: views) view.setModel(model);
	  }
	  
	  public void add(View view) {
		 super.add(view);
	     views.add(view);
	  }
	 
	  
	  
	  
	}