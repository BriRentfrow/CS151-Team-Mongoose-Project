package framework;

import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JPanel;

import business.Maze;

/**
 * Brianna: Added from Pearce's framework page
 * Jacky 11/11 finished update method and constructor Notes: may be the same as as BrickPanel, listener
 */


public class AppPanel extends JPanel implements Observer {
	  protected Model model;
	  protected ActionListener listener;
	  protected Set<View> views;
	  
	  //needs constuctor
	  public AppPanel(Model model, ActionListener listener)
	  {
		this.model = model;  
		this.listener = listener; 
	  }
	  
	  // update() may need to be edited.  Not tested yet.
	  public void update(Observable subject, Object msg) {
	     for(View view: views)
	     {
	    	 view.update(model, view);
	     }
	  }
	  public void setModel(Model model) {
		  
		  //repeated if statements? maybe its because every time you set the model, you must delete all observes and add new ones.
		  //maybe if statements just check twice just to make sure
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