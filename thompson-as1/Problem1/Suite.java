/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Suite extends Room
{
	public Suite() {
		description = "Suite Room";
	}
  
	public double cost() {
		return 3000;
	}
	
	public double tax() {
		return cost() * 0.16;
	}
}
