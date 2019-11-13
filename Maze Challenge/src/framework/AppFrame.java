package Framework;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame implements ActionListener {

    private AppFactory factory;
    private Model model;
    private AppPanel panel;

    public AppFrame(AppFactory factory) {
        this.factory = factory;
        this.model = factory.makeModel();
        this.panel = factory.makePanel(model, this);

        getContentPane().add(panel);

        setJMenuBar(createMenuBar());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(factory.getTitle());
        setSize(500, 500);
    }

    protected JMenuBar createMenuBar() {

        JMenuBar bar = new JMenuBar();

        // add file, edit, and help menus
        JMenu fileMenu = new JMenu("File");// ...
        JMenu editMenu;
        JMenu helpMenu = new JMenu("Help");// ...

        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Save"));
        fileMenu.add(new JMenuItem("SaveAs"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Quit"));

        helpMenu.add(new JMenuItem("About"));
        helpMenu.add(new JMenuItem("Help"));

        editMenu = Utilities.makeMenu("File", factory.getEditCommands(), this);

        // now add menus to bar
        fileMenu.add(bar);
        editMenu.add(bar);
        helpMenu.add(bar);

        return bar;
    }

    public void actionPerformed(ActionEvent ae) {

        String cmd = ae.getActionCommand();

        switch (cmd) {
            case "Save":
                Utilities.save(model, false);
                break;
            case "SaveAs":
                Utilities.save(model, true);
                break;
            case "Open":
                Model newModel = Utilities.open(model);
                setModel(newModel);
                break;
            case "New":
                Utilities.saveChanges(model);
                setModel(factory.makeModel());
                // needed because setModel sets to true:
                model.setUnsavedChanges(false);
                break;
            case "Quit":
                Utilities.saveChanges(model);
                System.exit(1);
            case "About":
                Utilities.inform(factory.about());
                break;
            case "Help":
                Utilities.inform(factory.getHelp());
                break;
            default:
                Command command = factory.makeEditCommand(model, cmd);
                CommandProcessor.execute(command);
                break;
        }
    }

    public void display() {
        this.setVisible(true);
    }

    public void setModel(Model model) {
        this.model = model;
        panel.setModel(model);
    }

}