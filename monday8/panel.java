import java.awt.*;
class one extends Frame
  {
     one()
        {
             Panel p= new Panel();
             p.setBounds(40,80,300,300);
             p.setBackground(Color.gray);
             Button b1 = new Button("button 1");
             Button b2 = new Button("button 2");
             b1.setBounds(50,100,100,30);
             b2.setBounds(200,100,100,30);
             b1.setBackground(Color.green);
             b2.setBackground(Color.yellow);
             p.add(b1);
             p.add(b2);
             add(b1);
             add(b2);
             add(p);
             setSize(400,400);
             setLayout(null);
             setVisible(true);          
         } 
   }

class panel
   {
        public static void main(String[] args)
            {
                  one obj = new one();
            }
   }