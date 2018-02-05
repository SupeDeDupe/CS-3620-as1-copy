import javax.swing.JFrame;
/**
 * @author Sarah Thompson
 * @version Jan 31, 2018
 */
public class TomCruiseLine
{
    public static void main(String args[]) {
        
        JFrame frame = new JFrame ("Tome Cruise Line");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        TomCruiseLinePanel panel = new TomCruiseLinePanel();
        frame.getContentPane().add (panel);
        frame.pack();
        frame.setVisible(true);
	}
}
