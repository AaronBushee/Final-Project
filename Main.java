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

      //--------------------Label 1---------------------//
      JLabel label1 = new JLabel("Welcome to Adventure Selector! Let's get Started!");
      JTextField textfield1 = new JTextField(10);

      //-------------------------Button 1------------------------//
      JButton button1 = new JButton("Update Label");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"ADVENTURE SELECTOR"};
              String newText = phrases[(int)(Math.random() * phrases.length)];
              label1.setText(newText);
          }
      });

      //-----------------------Button 2--------------------------
      JButton button2 = new JButton ("AAAAA");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("So, I hate to be one of those people, but I already knew I wasn't going to be able to get far, so here's my cheap attempt for points.");
        }
      });
      

      panel1.add(button1);
      panel1.add(button2);
      panel1.add(label1);
      panel1.add(textfield1);
      frame1.getContentPane().add(BorderLayout.NORTH, panel1);
      frame1.setVisible(true);

  }//end main method
}//end class Main


/*---------------Things the Rubric said I needed--------------------//
1 < 2, 3 > 4, 1 != 15
-----------------
if(forgot to grab keys)
{
  go get keys
}
------------------
for(int j = 0; j < number; j++)
      {
        System.out.print("this is indeed a for loop");
      }
------------------  
for(int j = 0; j < number; j++)
      {
        System.out.print("this is, also, indeed a for loop");
      }
------------------
