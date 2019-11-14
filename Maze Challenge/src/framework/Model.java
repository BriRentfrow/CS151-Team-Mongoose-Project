package Framework;
import Business.Maze;

import java.io.IOException;
import java.io.Serializable;
import java.util.Observable;
// G 
abstract public class Model extends Observable implements Serializable {
  // private field
    private String fileName = null;
    private Boolean unsavedChanges = false;
    private static final long serialVersionUID = 1L;
    // constructor takes filename
    public Model(String fileName) {
        this.fileName = fileName;
        unsavedChanges= true;
    }

    // a constructor for model
    model(){
        this(fileName"");
    }
   // setter and getter for fileName
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    // setter for unsaveschanged
    public void setUnsavedChanges(boolean flag) {

        this.unsavedChanges = flag;
    }
    public boolean hasUnsavedChanges() {
        return unsavedChanges;
    }



    // called by customization:
    public void changed() {
        unsavedChanges = true;
        this.setChanged();
        this.notifyObservers();
        this.clearChanged();
    }

}
