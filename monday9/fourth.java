//arrayList methods
import java.util.*;
class one extends
   {
         one()
            {
                     ArrayList a = new ArrayList(40);
                     a.add("uthappa");
                     a.add("faf");
                     a.add("raina");
                     a.add("raydu");
                     a.add("dhoni");
                     a.add("sam curran");
                     a.add("jadeja");
                     a.add("dj bravo");
                     a.add("shardhul");
                     a.add("moien ali");
                     a.add("chahar");

                     Iterator i =a.iterator();
                     while(i.hasNext())
                        {
                              System.out.println(""+i.next());
                        }
 
                   //add(object o),add(int index,object o)
                        System.out.println("add() method");
                        a.add("vinith");
                        a.add(0,"java");
                        System.out.println(a);
                    //remove(int index)
                        System.out.println("remove() method");
                        a.remove(1);
                        System.out.println(a);
                    //set(int index,object o)
                       System.out.println("set()");
                       a.set(1,"Tom");
                        System.out.println(a);
                     //int indexof(object o)
                        System.out.println("indexof");
                        int pos = a.indexOf("dhoni");
                        System.out.println(pos);
                     //Object get(int index)
                        System.out.println("get()");
                        System.out.println("The index of 1 is "+a.get(1));
                      //Size()
                        System.out.println("size()");
                        int sizea = a.size();
                        System.out.println("The size of a is "+sizea);
                      //Boolean contains(Object o)
                        System.out.println("contains()");
                        boolean q = a.contains("chahar");
                        boolean w = a.contains("python");
                        System.out.println(q);
                        System.out.println(w);
                      //isEmpty()
                         System.out.println("isEmpty()");
                         String js ="javascript";
                         String jd = "";
                         boolean b =js.isEmpty();
                         boolean c =jd.isEmpty();
                         System.out.println(b);
                         System.out.println(c);
                        //lastindexof()
                         System.out.println("lastindexof");
                         a.add("raina");
                         System.out.println(a);
                        int z = a.lastIndexOf("raina");
                        System.out.println("last occurance of raina is " +z);
                         //trimtosize()
                           ArrayList<String>arr = new ArrayList<String>();
                            System.out.println("trimtosize");
                            System.out.println("check before "+arr.size()); 
                            arr.add("1");
                            arr.add("2");
                            arr.add("3");
                            arr.add("4");
                            arr.add("5");
                            arr.add("6");
                            arr.trimToSize();
                            arr.ensureCapacity(10);   //extends a capacity when the list size increases
                            System.out.println("check after "+arr.size());
                          //removeRange(int,int)
                            System.out.println("before removeRange "+arr);
                            arr.removeRange(0,2);
                            System.out.println("after removeRange "+arr);
                        //clear()
                        System.out.println("clear()");
                        a.clear();
                        System.out.println(a);
             } 
    }

class fourth
   {
         public static void main(String[] ars)
            {
                    one obj = new  one();
             }
    }