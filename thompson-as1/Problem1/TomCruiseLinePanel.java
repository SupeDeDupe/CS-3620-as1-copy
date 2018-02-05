
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 * @author Sarah Thompson
 * @version February 4, 2017
 */
public class TomCruiseLinePanel extends JPanel
{
   private JLabel addonLabel, roomLabel, headerLabel, taxesLabel, gratuityLabel, totalCostLabel;
   private JRadioButton interior, ocean, balcony, suite;
   private JCheckBox beverage, klondike, helicopter, climbing, lumberjack, scientology;
   private ButtonGroup roomButtons;
   private JButton compute;
   private JPanel panel1, panel2, panel3, panel4, panel5;
   private Room room;
   
   private double totalTaxes, gratuity, totalCost;
   
   public TomCruiseLinePanel()
   {
      
      taxesLabel = new JLabel ("");
      taxesLabel.setFont (new Font ("Helvetica", Font.PLAIN, 15));
      gratuityLabel = new JLabel ("");
      gratuityLabel.setFont (new Font ("Helvetica", Font.PLAIN, 15));
      totalCostLabel = new JLabel ("");
      totalCostLabel.setFont (new Font ("Helvetica", Font.PLAIN, 15));
      
      headerLabel = new JLabel ("Select Cruise Package");
      headerLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      roomLabel = new JLabel ("Room Selection");
      roomLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      addonLabel = new JLabel ("Add-on Packages");
      addonLabel.setFont (new Font ("Helvetica", Font.PLAIN, 22));
      roomButtons = new ButtonGroup();
      compute = new JButton("Compute");
      compute.addActionListener(new ButtonListener());
      
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();
      panel5 = new JPanel();

      interior = new JRadioButton ("Interior - $1000");
      interior.setBackground (Color.white);
      ocean = new JRadioButton ("Ocean View - $1500");
      ocean.setBackground (Color.white);
      balcony = new JRadioButton ("Balcony - $2000");
      balcony.setBackground (Color.white);
      suite = new JRadioButton ("Suite - $3000");
      suite.setBackground (Color.white);
      
      beverage = new JCheckBox ("Beverage - $700");
      beverage.setBackground (Color.white);
      klondike = new JCheckBox ("Klondike - $50");
      klondike.setBackground (Color.white);
      helicopter = new JCheckBox ("Helicopter - $200");
      helicopter.setBackground (Color.white);
      climbing = new JCheckBox ("Climbing - $60");
      climbing.setBackground (Color.white);
      lumberjack = new JCheckBox ("Lumberjack - $15");
      lumberjack.setBackground (Color.white);
      scientology = new JCheckBox ("Scientology - $500");
      scientology.setBackground (Color.white);
      
      roomButtons.add(interior);
      roomButtons.add(ocean);
      roomButtons.add(balcony);
      roomButtons.add(suite);
      
      panel1.add (headerLabel);
      panel1.setBackground (Color.white);
      panel1.setPreferredSize (new Dimension(750, 50));
      
      panel2.add (roomLabel);
      panel2.add (interior);
      panel2.add (ocean);
      panel2.add (balcony);
      panel2.add (suite);
      panel2.setBackground (Color.white);
      panel2.setPreferredSize (new Dimension(1100, 30));
      
      panel3.add (addonLabel);
      panel3.add (beverage);
      panel3.add (klondike);
      panel3.add (helicopter);
      panel3.add (climbing);
      panel3.add (lumberjack);
      panel3.add (scientology);
      panel3.setBackground (Color.white);
      panel3.setPreferredSize (new Dimension(1100, 30));
      
      
      panel4.add(compute);
      panel4.setBackground (Color.white);
      panel4.setPreferredSize (new Dimension(1100, 100));
      
      panel5.add(taxesLabel);
      panel5.add(gratuityLabel);
      panel5.add(totalCostLabel);
      panel5.setBackground (Color.white);
      panel5.setPreferredSize (new Dimension(1100, 100));
      
      add(panel1);
      add(panel2);
      add(panel3);
      add(panel4);
      add(panel5);

      setBackground (Color.white);
      setPreferredSize (new Dimension(1100, 300));
   }
   
   //*****************************************************************
   //  Represents a listener for button Compute events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed (ActionEvent event)
      {
         if (interior.isSelected())
            room = new Interior();
         else if (ocean.isSelected())
            room = new OceanView();
         else if (balcony.isSelected())
            room = new Balcony();
         else if (suite.isSelected())
            room = new Suite();
            
         if (beverage.isSelected())
            room = new Beverage(room);
         if (klondike.isSelected())
            room = new Klondike(room);
         if (helicopter.isSelected())
            room = new Helicopter(room);
         if (climbing.isSelected())
            room = new Climbing(room);
         if (lumberjack.isSelected())
            room = new Lumberjack(room);
         if (scientology.isSelected())
            room = new Scientology(room);
            
         gratuity = (room.cost()) * 0.15;
         totalCost = room.cost() + room.tax() + gratuity;
         
         taxesLabel.setText("Total taxes: " + room.tax());
         gratuityLabel.setText("Gratuity: " + gratuity);
         totalCostLabel.setText("Total taxes: " + totalCost);
      }
   }
}
