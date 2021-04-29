import java.awt.*;
class one
  {
       one()
            {
                   Toolkit t = Toolkit.getDefaultToolkit();
                   System.out.println("Screen resolution of "+t.getScreenResolution());     
                   Dimension d = t.getScreenSize();
                   System.out.println("Screen width is "+d.width);
                   System.out.println("Screen height is "+d.height);
             }
   }

class toolkit
  {
       public static void main(String[] args)
           {
                one obj = new one();
           }
   }