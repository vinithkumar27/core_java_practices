import java.awt.*;
class one extends Frame 
   {
       Choice c;
        Label l;
        Button b;
        one() 
            {
                 b= new Button("Show");
                 b.setBounds(120,250,50,30);
                 add(b);
                 c = new Choice();
                 setSize(300,300);
                 setLayout(null);
                 setVisible(true);
                 setTitle("vinith");
                 c.setBounds(100,100,80,80);
                 c.add("fruits"); 
                 c.add("orange"); 
                 c.add("grapes");
                 c.add("watermelon");
                 c.add("apple");
                 c.add("pineapple");
                 add(c);
             }
   }

class eleventh 
   {
        public static void main(String[] arg)
            { 
                  one obj = new one();
            }
   }