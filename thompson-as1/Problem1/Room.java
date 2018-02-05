
/**
 * Room
 * 
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public abstract class Room
{
    String description = "Unknown Room";
    
    public String getDescription() {
		return description;
	}
 
	public abstract double cost();
	public abstract double tax();
}
