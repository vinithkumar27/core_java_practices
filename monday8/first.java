import java.awt.*;
import java.awt.event.*;
class one extends Frame implements ActionListener,MouseListener,MouseMotionListener,ItemListener,KeyListener
   {
       TextField t1;
       TextField t2;
       Label l1,l2,l3,l4,l5;
       Button b1;
       Checkbox c1,c2,c3;
       TextArea a1;
       one()
           {
                 setSize(600,500);
                 setVisible(true);
                 setLayout(null);
                 setTitle("first.java");
                 setBackground(Color.yellow);
                 CheckboxGroup cbg = new CheckboxGroup(); 
                 Panel p = new Panel(new GridLayout(2,2));
                 l1 = new Label("player name");
                 l2 = new Label("jersey number");
                 l3 = new Label();
                 l4 = new Label();
                 l5 = new Label();
                 l5.setBounds(20,80,100,20);
                 a1 = new TextArea(); 
                l4.setAlignment(Label.RIGHT);
                l4.setSize(370,100);
                 add(l4);
                 l4.setBounds(370,220,150,50);
                 l3.setBounds(20,40,100,20);
                 add(l3);
                  t1 = new TextField();
                  t2 = new TextField();
                  c1 = new Checkbox("batsman",cbg,false);
                  c1.setBounds(370,160,100,10);
                  add(c1);
                  c2 = new Checkbox("bowler",cbg,false);
                  c2.setBounds(370,180,100,10); 
                  add(c2);
                  c3 = new Checkbox("wicket-keeper",cbg,true);
                  c3.setBounds(370,200,100,10);
                  add(c3);
                 p.add(l1);
                 p.add(t1);
                 p.add(l2);
                 p.add(t2);
                 add(p);
                 p.setBounds(150,160,200,60);
                 b1 = new Button("Register");
                 add(b1);
                 b1.setBounds(180,250,150,30); 
                 b1.addActionListener(this);
                 addMouseListener(this);
                 addMouseMotionListener(this);
                 c1.addItemListener(this);
                 c2.addItemListener(this);
                 c3.addItemListener(this);
            }
       
        public void actionPerformed(ActionEvent d)
          {
              String name ="dhoni"; 
               if(t1.getText().equals("dhoni"))
                  {
                       System.out.println("hi mr."+name);
                  }       
               else 
                   {
                         System.out.println("enter your correct name");
                    } 
                if(t2.getText().equals("7"))
                    {
                          System.out.println("Welcome to CSK mr."+name); 
                    }
                 else
                   {
                          System.out.println("please enter correct jersey number");
                    }
           }

        public void mouseEntered(MouseEvent d)
           {
                  setBackground(Color.blue);
            }
        public void mouseExited(MouseEvent d)
            {
                  setBackground(Color.yellow);
             } 
         public void mouseReleased(MouseEvent d)
             {
                        setBackground(Color.yellow);
              }
         public void mousePressed(MouseEvent d)
              {
                       setBackground(Color.blue);
               }
          public void mouseClicked(MouseEvent e)
               {
                     Graphics g=getGraphics();  
                     g.setColor(Color.white);  
                     g.fillOval(e.getX(),e.getY(),30,30);  
               }
           public void mouseDragged(MouseEvent q)
              {
                     l3.setText("X= "+q.getX()+"  Y= "+q.getY());
                     Graphics g = getGraphics();
                     g.setColor(Color.yellow);
                     g.fillOval(q.getX(),q.getY(),20,20);
                        
               }
           public void mouseMoved(MouseEvent g)
               {
                     
                     l3.setText("X= "+g.getX()+" Y= "+g.getY());
               }
           public void itemStateChanged(ItemEvent w)
              {
 
               }
          public void keyPressed(KeyEvent a)
             {
 
              } 
           public void keyReleased(KeyEvent b)
              {
 
               }
           public void keyTyped(KeyEvent c)
               {
                    t1.setText("typed");
               }
    }

class first
   {
          public static void main(String[] args)
              {
                      one obj = new one();
              }
    }