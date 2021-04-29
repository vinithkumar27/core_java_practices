import java.awt.*;
class one extends Frame
  {
        one()
           {
                   MenuBar mb = new MenuBar();
                   Menu m1 = new Menu("Menu");
                   Menu m2 = new Menu("SubMenu");
                   MenuItem i1 = new MenuItem("item 1");
                   MenuItem i2 = new MenuItem("item 2");
                   MenuItem i3 = new MenuItem("item 3");
                   MenuItem i4 = new MenuItem("item 4");
                   m1.add(i1);
                   m1.add(i2);
                   m2.add(i3);
                   m2.add(i4);
                   m1.add(m2);
                   mb.add(m1);   
                   setMenuBar(mb);
                   setSize(300,300);
                   setLayout(null);
                   setVisible(true);
                   setTitle("Menubar ,submenu");               
             }
    }

class menu
   {
         public static void main(String[] args)
              {
                    one obj = new one();
              }
    }