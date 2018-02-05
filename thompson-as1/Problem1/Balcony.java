
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Balcony extends Room
{
    public Balcony() {
		description = "Balcony Room";
	}
 
	public double cost() {
		return 2000;
	}
	
	public double tax() {
		return cost() * 0.16;
	}
}
