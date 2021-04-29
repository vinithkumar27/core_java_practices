import java.awt.*;
import java.awt.event.*;
class one extends Frame 
    {
        one() 
            {
                    Label label = new Label();
                    label.setBounds(80,80,200,30);
                    add(label);
                    setSize(400,400);
                    setLayout(null);
                    setVisible(true);
                    Scrollbar sb = new Scrollbar();
                    sb.setBounds(150,150,60,100);
                    add(sb);
                     sb.addAdjustmentListener(new AdjustmentListener() 
                       {  
                                public void adjustmentValueChanged(AdjustmentEvent e)
                                    {  
                                         label.setText("Vertical Scrollbar value is:"+ sb.getValue());  
                                     }  
                        }  );
             }
    }

class scroll
   {
         public static void main(String[] args)
            {
                one obj = new one();
             }
    }