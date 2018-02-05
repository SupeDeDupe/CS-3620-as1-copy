/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class NotGate extends Gate implements Observer
{
    private Gate input;
    
    public NotGate(Gate inp) 
    { 
        input = inp;
        this.state = !input.getState();
    }
    
    
    public void update() {
		this.state = !input.getState();
	}
}
