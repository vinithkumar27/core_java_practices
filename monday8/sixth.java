import java.awt.*;
import java.awt.event.*;
class one extends Frame implements ActionListener
    { 
         TextField tf,tf1;
         Label l1;
         one()
           { 
                tf = new TextField();
                 tf.setBounds(200,50,80,30);
                tf1 = new TextField();
                tf1.setBounds(200,100,80,30);
               l1 = new Label("username");
                l1.setBounds(100,50,80,30);
                Label l2 = new Label("password");
                 l2.setBounds(100,100,80,30);
                 Button b = new Button("Register");
                 b.setBounds(100,200,80,30);
                 add(b); 
                 add(tf);
                 add(l1);
                 add(l2); 
                 add(tf1);
                setTitle("vinith");
                setSize(400,400); 
                setLayout(null);
                setVisible(true);                       
           }
           public void actionPerformed(ActionEvent e) 
           {  
        try{  
                 String host=tf.getText();  
                 String ip=java.net.InetAddress.getByName(host).getHostAddress();  
                 l1.setText("IP of "+host+" is: "+ip);  
             }catch(Exception ex){System.out.println(ex);}  
    }  
    }

class sixth
   {
        public static void main(String[] args)
            {
                 one obj = new one();
             }
    }