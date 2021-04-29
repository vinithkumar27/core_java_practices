import javax.swing.*;
import java.awt.event.*;
class one extends JFrame implements ActionListener
   { 
   JButton b;
       one()
          {
               b = new JButton(new ImageIcon("C:\\java1.ico"));
               b.setBounds(100,100,100,40);
               add(b);
               setSize(300,300);
               setLayout(null);
               setVisible(true);
               b.addActionListener(this);
          }
        public void actionPerformed(ActionEvent e)
           {
                if(e.getActionCommand().equals("press"))
                    {
                           dispose();
                     }
               
            }
   }

class first
  {
       public static void main(String[] args)
           {
                one obj = new one(); 
           }
   }