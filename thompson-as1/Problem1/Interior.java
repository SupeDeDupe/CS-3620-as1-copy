
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Interior extends Room
{
    public Interior() {
		description = "Interior Room";
	}
 
	public double cost() {
		return 1000;
	}
	
	public double tax() {
		return cost() * 0.16;
	}
}
