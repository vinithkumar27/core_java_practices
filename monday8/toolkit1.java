import java.awt.*;
import java.awt.event.*;
class one extends Frame
   {
       one()
           {
                 Button b = new Button("beep"); 
                 b.setBounds(100,100,50,50);
                 add(b);
                 setSize(300,300);
                 setLayout(null);
                 setVisible(true);
                 b.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent a)
                           {
                                   Toolkit.getDefaultToolkit().beep();
                            }                        
                      }   );
            }
    }

class toolkit1
   {
        public static void main(String[] args)
            {
                  one obj = new one(); 
            }
   }