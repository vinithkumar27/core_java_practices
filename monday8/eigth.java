import java.awt.*;
import java.awt.event.*;
class one extends Frame implements ActionListener
    {
           TextField tf1 ;
            TextField tf2 ;
            TextField tf3 ;
             Button b1;
             Button b2;
             Label l;
        one()
           {
                  l = new Label("Addition and Subtraction of two numbers");
                  l.setBounds(100,30,150,30); 
                  add(l);
                  tf1 = new TextField(); 
                  tf1.setBounds(100,50,150,30);
                  add(tf1);
                  tf2 = new TextField();
                  tf2.setBounds(100,100,150,30);
                  add(tf2); 
                 tf3 = new TextField(); 
                  tf3.setBounds(100,150,150,30);
                  add(tf3);
                  b1 = new Button("+");
                  b2 = new Button("-");
                  b1.setBounds(100,200,50,50);
                  b2.setBounds(200,200,50,50);
                  add(b1);
                  add(b2);  
                  b1.addActionListener(this);
                  b2.addActionListener(this);
                 setSize(400,400);
                 setLayout(null);
                 setVisible(true);
                 setTitle("eigth.java");
            }
       public void actionPerformed(ActionEvent e)
           {
               String s1 = tf1.getText();
               String s2 = tf2.getText();
               int a = Integer.parseInt(s1); 
               int b = Integer.parseInt(s2);
               int c = 0;
               if(e.getSource()==b1)
                  {
                       c=a+b;
                  }
                else if(e.getSource()==b2)
                   {
                       c=a-b;
                    }
                 String result = String.valueOf(c);
                 tf3.setText(result);
           }
    }

class eigth
   {
        public static void main(String[] args)
           {
              one obj = new one();
           }
   }