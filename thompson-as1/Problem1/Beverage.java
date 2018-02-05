
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Beverage extends AddonDecorator
{
    Room room;
 
	public Beverage(Room room) {
		this.room = room;
	}
 
	public String getDescription() {
		return room.getDescription() + ", Beverage";
	}
 
	public double cost() {
		return 700 + room.cost();
	}
	
	public double tax() {
		return this.cost() * 0.06 + room.tax();
	}
}
