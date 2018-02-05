
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Helicopter extends AddonDecorator
{
    Room room;
 
	public Helicopter(Room room) {
		this.room = room;
	}

	public String getDescription() {
		return room.getDescription() + ", Helicopter";
	}

	public double cost() {
		return 200 + room.cost();
	}
	
	public double tax() {
		return this.cost() * 0.06 + room.tax();
	}
}
