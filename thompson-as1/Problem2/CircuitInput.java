import java.util.*;
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class CircuitInput extends Gate implements Subject 
{
    private ArrayList<Observer> observers;
    
    public CircuitInput(boolean initstate) 
    {
        this.state = initstate;
    }
    
    public void setValue(boolean newstate)
    {
        this.state = newstate;
        this.notifyObservers();
    }
    
    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
	    for (Observer observer : observers) {
			observer.update();
		}
	}
}
