package framework;
import java.awt.event.ActionListener;
/**
 * Brianna: Added from Pearce's framework page
 * Jacky: added contents() 11/13
 */



	//AppFrame, AppPanel use this class 
public interface AppFactory {
	public Model makeModel();

	public AppPanel makePanel(Model model, ActionListener listener);

	public String[] getEditCommands();
	
	
	public String[] getHelp();

	
	public Command makeEditCommand(Model model, String type);

	public String getTitle(); 		

	
	public String about();			// About is under Help. Gives help info
	public String[] contents() ; 	// Contents is under Help. contents may have multiple strings explaining multiple strings.

	
	//public Command stringToCommand??? might be used in the future, I do not know why right now.
}