import java.awt.*;
class one extends Frame
   {
      one()
         {
              Button b = new Button("Continue");
              b.setBounds(150,300,100,40);
               add(b);
              TextField tf1 = new TextField("welcome vinith");
              tf1.setBounds(100,100,150,20);
              TextField tf2 = new TextField("you are done");
              tf2.setBounds(100,200,150,20);
             add(tf1);
            add(tf2);
              setSize(400,400);
              setLayout(null);
              setVisible(true);
              setTitle("seventh.java");
         }
    }

class seventh
   {
        public static void main(String[] args)
           {
                one obj = new one();
           }
    }