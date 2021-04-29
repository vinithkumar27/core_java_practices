import java.awt.*;
import java.awt.event.*;
class one extends Frame extends ItemListener
   {
      Checkbox cb1,cb2;
        one()
           {
               setSize(400,400); 
               setLayout(null);
               setVisible(true);
               setTitle("tenth.java");
              cb1 = new Checkbox("c++");
              cb2 = new Checkbox("java");
              Label l = new Label();
              l.setBounds(50,50,200,20);
              add(l);
                cb1.setBounds(100,100,100,30);
                cb2.setBounds(100,200,100,30);
               add(cb1);
               add(cb2);
              cb1.addItemListener(this);
              cb2.addItemListener(this);
           } 
         public void itemStateChanged(ItemEvent t)
            {
                l.setText("c++ Checkbox "+ (e.getStateChange()==1?"checked":"unchecked")); 
            }
    }

class tenth
   {
       public static void main(String[] arsg)
         {
                   one obj = new one();     
          }
    }