
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class OceanView extends Room
{
    public OceanView() {
		description = "Ocean View Room";
	}
 
	public double cost() {
		return 1500;
	}
	
	public double tax() {
		return cost() * 0.16;
	}
}
