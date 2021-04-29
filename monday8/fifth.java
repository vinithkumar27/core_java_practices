import java.awt.*;
import java.awt.event.*;
class one extends Frame implements ActionListener
   {
         TextField tf;
        one()
            {
                 tf = new TextField();
                 tf.setBounds(150,50,150,20);
                 add(tf);
                 Button b = new Button("Click me");
                 b.setBounds(150,150,100,50);
                 add(b);
                 setTitle("vinith");
                 setSize(400,400);
                 setLayout(null);
                 setVisible(true);
                 b.addActionListener(this);
            }
       public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
    } 

class fifth
   {
        public static void main(String[] args)
            {
                   one obj = new one();                  
              }
   }