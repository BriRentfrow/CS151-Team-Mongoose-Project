package framework;

public class CommandProcessor {
	  public static void execute(Command cmmd) { cmmd.execute(); }
	  
	  /**
	   * Not sure if this goes here
	   * 
	  public void actionPerformed(ActionEvent ae) {
		     JTextField source = (JTextField)ae.getSource();
		     String cmmd = ae.getActionCommand();
		     Command command = null;
		     try {
		        double dim = Double.valueOf(source.getText());
		        if (cmmd == "Set Height") command = new SetHeight(brick, dim);
		        else if (cmmd == "Set Width") command = new SetWidth(brick, dim);
		        else if (cmmd == "Set Length") command = new SetLength(brick, dim);
		        CommandProcessor.execute(command);
		     } catch (NumberFormatException e) {
		        // ...
		     }
		  }
	  **/
	}