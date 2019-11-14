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
		views = new ArrayList<View>();
		this.listener = listener; 
	  }
	  
	

	  //This takes all the views in the application and then called update (in view) in all of them. //DONE
	  public void update(Observable subject, Object msg) {
	     for(View view: views)
	     {
	    	 view.update(model, view);
	     }
	  }
	  
	  //DONE There is also setModel in view. Takes in all the views and then does setModel() (from View) on all the views.
	  public void setModel(Model model) {
		  //DONE
	     if (this.model != null) this.model.deleteObserver(this);
	     this.model = model;
	     if (this.model != null) this.model.addObserver(this);
	     for(View view: views) view.setModel(model);
	  }
	  
	//still confused on this methodt - Jacky but adding views into set of views so they can be updated? what is that relationship.
	  public void add(View view) {
		  super.add(view); //why? 
	     views.add(view);
	  }
	 
	  
	  
	  
	}