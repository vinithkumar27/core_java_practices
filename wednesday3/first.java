abstract class one
    {
         abstract public void task1();
         abstract public void task2();
         abstract public void task3();
         abstract public void task4();
     }

class two extends one
     {
          public void task1()
              {
                   System.out.println("Hi iam finished mytask1 work");
                   task2();
                   task3();
                   task();
               }
           public void task2()
                {
                     System.out.println("Hi iam finished mytask2 work");
                }
           public void task3()
                {
                      System.out.println("Hi vinith");
                }
           public void task()
                {
                     System.out.println("Hi bablu");
                }
         }

class first
    {
         public static void main(String[] args)
            {
                    two obj2 = new two();
                    obj2.task1();
             }
     }