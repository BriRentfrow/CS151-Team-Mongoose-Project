package Framework;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class AppPanel extends JPanel implements Observer {

    protected Model model;
    protected ActionListener listener;
    protected Set<View> views;

    public void update(Observable subject, Object msg) {
        // override in a subclass if desired
    }

    public void setModel(Model model) {
        if (this.model != null) {
            this.model.deleteObserver(this);
        }

        this.model = model;

        if (this.model != null) {
            this.model.addObserver(this);
        }

        for (View view : views) {
            view.setModel(model);
        }
    }

    public void add(View view) {
        super.add(view);
        views.add(view);
    }
}
