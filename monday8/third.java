import java.awt.*;
class one extends Frame
    {
        one()
             {
                   Button b = new Button("Register");
                   b.setBounds(100,100,100,50);
                   add(b);
                   setTitle("hello world");
                   setSize(300,300);
                   setLayout(null);
                   setVisible(true);                  
             }
     }

class third
   {
          public static void main(String[] args) 
              {
                   one obj = new one();
               }
    }