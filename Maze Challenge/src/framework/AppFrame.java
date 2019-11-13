package framework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Brianna: Added from Pearce's framework page Brianna (11/10): Added Menus to
 * JMenuBar
 * 
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
		setSize(500, 500);
	}

	public void display() {
		this.setVisible(true);
	}

	// not fully understood, may need to be fixed.
	public void setModel(Model model) {
		this.model = model;
	}

	protected JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();
		// add file, edit, and help menus
		// TODO: Make sure these additions work
		JMenu fileMenu = new JMenu(); // JMenu fileMenu = new JMenu("File");
		Utilities.makeMenu("File", factory.getEditCommands(), this);
		JMenu helpMenu = new JMenu();
		Utilities.makeMenu("Help", factory.getHelp(), this);
		JMenu editMenu = new JMenu();
		Utilities.makeMenu("Edit", factory.getEditCommands(), this);
		// now add menus to bar
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(helpMenu);
		return bar;
	}

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
		} else {
			Command command = factory.makeEditCommand(model, cmmd);
			CommandProcessor.executeCmmd(command);
		}
	}

	public static JMenu makeMenu(String name, String[] items, ActionListener handler) {
		JMenu result = new JMenu(name);
		for (int i = 0; i < items.length; i++) {
			JMenuItem item = new JMenuItem(items[i]);
			item.addActionListener(handler);
			result.add(item);
		}
		return result;
	}

}