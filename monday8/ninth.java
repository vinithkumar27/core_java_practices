import java.awt.*;
import java.awt.event.*;
class one extends Frame implements ActionListener
   {
       TextArea t;
        Label l1,l2;
       Button b;
       one()
            {
                  setSize(400,400);
                  setLayout(null);
                  setVisible(true);
                  setTitle("vinith");
                  t = new TextArea();
                   t.setBounds(100,100,200,200);
                   add(t);
                  l1 = new Label();
                  l1.setBounds(100,50,100,20);
                   add(l1);
                  l2 = new Label();
                  l2.setBounds(200,50,100,20);
                  add(l2);
                  b = new Button("count");
                  b.setBounds(180,350,50,50);
                  add(b); 
                  b.addActionListener(this);
            }
         public void actionPerformed(ActionEvent e)
             {
              String text = t.getText();
              String words[] =text.split("\\s");
              l1.setText("Words: "+words.length);
              l2.setText("Characters: "+text.length());   
             }
    }

class ninth 
   {
        public static void main(String[] args)
            {
                   one obj = new one();
            }
   }