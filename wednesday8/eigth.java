//closeing window 
import java.awt.*;  
import java.awt.event.*;  
public class eigth extends WindowAdapter{  
    Frame f;  
    eigth(){  
        f=new Frame();  
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void windowClosing(WindowEvent e) {  
    f.dispose();  
     //System.exit(0);
}  
public static void main(String[] args) {  
    new eigth();  
}  
}  