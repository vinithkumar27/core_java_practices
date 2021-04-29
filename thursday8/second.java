import javax.swing.*;
class one extends JFrame
    {
        one()
            {
                  setSize(300,300);
                  setLayout(null);
                  setVisible(true);
                  JLabel l = new JLabel("kiddo label");
                  l.setBounds(50,50,200,30);
                   add(l); 
             }
    }

class second
   {
        public static void main(String[] args) 
           {
                 one obj = new one();
           }
   }