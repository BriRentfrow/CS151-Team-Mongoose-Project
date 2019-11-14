package Framework;
import Business.Maze;


public  abstract class Command {

    protected Model model;

    public Command(Model model)  {
        this.model = model;
    }

    abstract public void execute();

}


