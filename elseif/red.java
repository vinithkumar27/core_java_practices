import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class red {
  private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          if(N%=1)
          {
              System.out.println("Weired");
          }
          elseif(N%=0&&2<=N<=5)
          {
              System.out.println("Not Weired");
          }
          elseif(N%=0&&6<=N<=20)
          {
              System.out.println("Weired");
          }
          elseif((N%=0 && N>=20))
          {
              System.out.println("Not Weired");
          }
          else
           {
               System.out.println("Not defined");   
           }
        scanner.close();
    }
}
