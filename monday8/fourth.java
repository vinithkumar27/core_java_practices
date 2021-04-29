import java.awt.*;
class one extends Frame
   {
       one()
           {
                 Frame f = new Frame();
                 Button b = new Button("button1"); 
                 b.setBounds(200,200,60,20);
                 add(b);
                 setSize(400,400);
                 setLayout(null);
                 setVisible(true);
                 setTitle("kiddo");
           }
    }

class fourth
   { 
        public static void main(String[] args)
           {
                  one obj = new one();
            }
   }