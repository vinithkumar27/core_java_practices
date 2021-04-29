import java.awt.*;
import java.awt.event.*;
class one 
   {
          one()
              {
                    Frame f = new Frame();
                     PopupMenu pm = new PopupMenu("edit");
                    MenuItem cut = new MenuItem("cut");
                    cut.setActionCommand("cut");
                    MenuItem copy = new MenuItem("copy");
                    copy.setActionCommand("copy");
                    MenuItem paste = new MenuItem("paste");
                    paste.setActionCommand("paste");
                    pm.add(cut);
                    pm.add(copy);
                    pm.add(paste);
                    f.add(pm);
                    f.addMouseListener(new MouseAdapter()
                      {
                             public void mouseClicked(MouseEvent e)
                                {
                                       pm.show(f,e.getX(),e.getY());
                                }
                       }
                       );
                    f.setSize(300,300); 
                    f.setLayout(null);
                    f.setVisible(true);
                    f.setTitle("popup");
              }
    }

class popup
  {
       public static void main(String[] args)
           {
                one obj = new one();
           }
   }