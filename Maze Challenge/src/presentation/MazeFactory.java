package presentation;

import java.awt.event.ActionListener;

import framework.AppFactory;
import framework.AppPanel;
import framework.Command;
import framework.Model;

public class MazeFactory implements AppFactory {

	@Override
	public Model makeModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppPanel makePanel(Model model, ActionListener listener) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getEditCommands() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Command makeEditCommand(Model model, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getHelp() {
		
		return ;
	}

	@Override
	public String about() {
		return "Maze Challenge version: 1.0 by Mongoose " + Character.toString((char) 169) + " 2019" ;
	}

}
