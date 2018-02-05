/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public class Probe implements Observer
{
    private Gate input;
    private boolean state; 
    public Probe(Gate inp) 
    {
        input = inp;
        state = input.getState();
    } 
    
    public void show()
    {
        System.out.println(state ? "1" : "0"); 
    }
    
    public void update()
    {
        state = input.getState();
    }
}
