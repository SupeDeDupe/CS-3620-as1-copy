
/**
 * @author Sarah Thompson
 * @version Feb 4, 2018
 */
public interface Subject
{
    public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
