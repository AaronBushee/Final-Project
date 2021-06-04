import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame("Adventure Selector");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500,500);

    //---------------------Panel for buttons-----------------------------//
    JPanel panel1 = new JPanel(new GridLayout(2,2, 20,20));

      //--------------------Label 1---------------------
      JLabel label1 = new JLabel("aaaaaa");
      JTextField textfield1 = new JTextField(10);

      //-------------------------Button 1------------------------
      JButton button1 = new JButton("Update Label");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"Behold! The Copy and Past-inator!", "Behold! The Hot Dog Vendor Revenge-inator!", "Behold! The Blow-Itself-Up-inator!", "Behold! The Multi-Helio-Tactical-Baboon-Glom-inator!"};
              String newText = phrases[(int)(Math.random() * phrases.length)];
              label1.setText(newText);
          }
      });
      
      //-----------------------Button 2--------------------------
      JButton button2 = new JButton ("Well, what do you think?");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Perry the Platypus!?");
        }
      });
      

      panel1.add(button1);
      panel1.add(button2);
      panel1.add(label1);
      panel1.add(textfield1);



  }//end main method
}//end class Main