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
      JLabel label1 = new JLabel("Welcome to Adventure Selector! Let's get Started!");
      JTextField textfield1 = new JTextField(10);

      //-------------------------Button 1------------------------
      JButton button1 = new JButton("Update Label");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {""};
              String newText = phrases[(int)(Math.random() * phrases.length)];
              label1.setText(newText);
          }
      });

      //-----------------------Button 2--------------------------
      JButton button2 = new JButton ("");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("");
        }
      });
      

      panel1.add(button1);
      panel1.add(button2);
      panel1.add(label1);
      panel1.add(textfield1);

      frame1.setVisible(true);

  }//end main method
}//end class Main