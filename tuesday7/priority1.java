class priority1 extends Thread
   {
        public static void main(String[] ars)
          {
                  one t = new one();
                  one t1 = new one();
                  one t2 = new one();
                  //displays default value of 5
                  System.out.println("pre-Thread value "+t.getPriority()); 
                  System.out.println("pre-Thread value "+t1.getPriority());
                  System.out.println("pre-Thread value "+t2.getPriority());
                  System.out.println();
                  t.setPriority(MAX_PRIORITY);
                  t1.setPriority(MIN_PRIORITY);
                  t2.setPriority(7);
                 //displays max and min values
                  System.out.println("MAX_PRIORITY "+t.getPriority());
                  System.out.println("MIN_PRIORITY "+t1.getPriority());
                  System.out.println("Post-thread value "+t2.getPriority());  
                  System.out.println();
                  //display norm values
                  t2.setPriority(NORM_PRIORITY); 
                  System.out.println("NORM_THREAD "+t2.getPriority());
                   //sum values of norm values
                   t2.setPriority(NORM_PRIORITY+3);
                   System.out.println("Sum of 3 to NORM_THREAD "+t2.getPriority());     
          }  
    }