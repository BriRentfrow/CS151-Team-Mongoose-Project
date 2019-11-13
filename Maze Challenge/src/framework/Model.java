package Framework;
import Business.Maze;

import java.io.IOException;
import java.io.Serializable;
import java.util.Observable;

public class Model extends Observable implements Serializable {


    private String fileName = null;
    private Boolean unsavedChanges = false;
    private static final long serialVersionUID = 1L;

    // constructor
    public Model(String fileName) {
        this.fileName = fileName;
        unsavedChanges = false;
    }

    // called by customization:
    public void changed() {
        unsavedChanges = true;
        this.setChanged();
        this.notifyObservers();
        this.clearChanged();
    }

    public boolean hasUnsavedChanges() {
        return unsavedChanges;
    }

    public void setUnsavedChanges(Boolean unsavedChanges) {
        this.unsavedChanges = unsavedChanges;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Model{" +
                "fileName='" + fileName + '\'' +
                '}';
    }

}
