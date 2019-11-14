package framework;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Brianna: Added from Pearce's framework page Brianna (11/10): made createMenuBar(); 
 * Jacky 11/12: AppFrame should be done. Edited createMenuBar() and it should be done.
 */



/**
 * Brianna: Added from Pearce's framework page Brianna (11/10): made createMenuBar(); 
 * Jacky 11/12: AppFrame should be done. Edited createMenuBar() and it should be done.
 */



public class AppFrame extends JFrame implements ActionListener {

	private AppFactory factory;
	private Model model;
	private AppPanel panel;

	public AppFrame(AppFactory factory) {
		this.factory = factory;
		model = factory.makeModel();
		panel = factory.makePanel(model, this);
		getContentPane().add(panel);
		setJMenuBar(createMenuBar());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(factory.getTitle());
		//setSize(500, 500);
		setMinimumSize(new Dimension(500, 500));
	}

	public void display() {
		this.setVisible(true);
	}

	public void setModel(Model model) {
		this.model = model;
		panel.setModel(model);
	}

	protected JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();
		
		// Jmenu items are initialized under utilities. see makeMenu()
		JMenu fileMenu = Utilities.makeMenu("File", new String[] { "New", "Open", "Save", "Save As" , "Quit"}, this); // done
		JMenu helpMenu = Utilities.makeMenu("Help", factory.getHelp(), this); //done
		
		JMenu editMenu = Utilities.makeMenu("Edit", factory.getEditCommands(), this); //done
	
		// now add menus to bar
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(helpMenu);
		return bar;
	}


	/*
	 * When JMenu buttons are added to action listener, actionPerformed runs about() when you Click Help --> About
	 */
	
	public void actionPerformed(ActionEvent ae) {
		String cmmd = ae.getActionCommand();  
		
		if (cmmd == "Save") {
			Utilities.save(model, false);
		} else if (cmmd == "SaveAs") {
			Utilities.save(model, true);
		} else if (cmmd == "Open") {
			Model newModel = Utilities.open(model);
			setModel(newModel);
		} else if (cmmd == "New") {
			Utilities.saveChanges(model);
			setModel(factory.makeModel());
			// needed because setModel sets to true:
			model.setUnsavedChanges(false);
		} else if (cmmd == "Quit") {
			Utilities.saveChanges(model);
			System.exit(1);
		} else if (cmmd == "About") {
			Utilities.inform(factory.about());
		} else if (cmmd == "Help") {		
			Utilities.inform(factory.getHelp());
		} 
		//  I dont see content() above it is added below. unsure if its needed.
		else if(cmmd == "Contents") { Utilities.inform(factory.contents());}

		else {
			//runs the command, using Model to get command.
			//Error when clicking move command here. null pointer exception <---------------------------
			Command command = factory.makeEditCommand(model, cmmd);
			CommandProcessor.executeCmmd(command);
		}
		
		
	}
	
	
}