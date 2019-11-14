package framework;

import java.io.Serializable;
import java.util.Observable;

abstract public class Model extends Observable implements Serializable {
	 
	  private String fileName = null;
	  private Boolean unsavedChanges = false;
	  // called by customization:
	  public void changed() {
	     unsavedChanges = true;
	     this.setChanged();
	     this.notifyObservers();
	     this.clearChanged();
	  }
	  // etc.
	public String getFileName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFileName(String fName) {
		// TODO Auto-generated method stub
		
	}
	public void setUnsavedChanges(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public boolean hasUnsavedChanges() {
		// TODO Auto-generated method stub
		return false;
	}
	}