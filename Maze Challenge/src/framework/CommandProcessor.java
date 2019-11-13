package Framework;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CommandProcessor {

    public static void execute(Command cmd) {
        cmd.execute();
    }

    public void actionPerformed(ActionEvent ae) {

        String cmd = ae.getActionCommand();
        Command command = null;

        switch (cmd) {
            case "Move North":
                command = new MoveNorth(maze);
                break;
            case "Move West":
                command = new MoveWest(maze);
                break;
            case "Move East":
                command = new MoveEast(maze);
                break;
            case "Move South":
                command = new MoveSouth(maze);
                break;
        }

        CommandProcessor.execute(command);
    }

}


