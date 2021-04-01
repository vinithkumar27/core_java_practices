class one 
   {
         static int i=99;   //with static (1234)& without static(1111)
         one()
            {
                i++;
                System.out.println(i);
             }
     }

class fifth
   {
        public static void main(String[] args)
           { 
                 one obj1 = new one();
                 one obj2 = new one();
                 one obj3 = new one();
                 one obj4 = new one();  
           }
    }