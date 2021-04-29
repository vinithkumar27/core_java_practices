import java.awt.*;
import java.awt.event.*;
class one extends Frame
   {
         Dialog d;
          one()
             {
                d = new Dialog(f,"Dialog Example",true);
                Button b = new Button("OK");      
             }
    }

class dialog 
   {
        public static void main(String[] args)
             {
                    one obj = new one();             
             }
   }