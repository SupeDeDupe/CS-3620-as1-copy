
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class Lumberjack extends AddonDecorator
{
    Room room;

	public Lumberjack(Room room) {
		this.room = room;
	}

	public String getDescription() {
		return room.getDescription() + ", Lumberjack";
	}

	public double cost() {
		return 15 + room.cost();
	}
	
	public double tax() {
		return this.cost() * 0.06 + room.tax();
	}
}
