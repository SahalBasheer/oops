//6. Java program to concatenate two numbers and strings using method overloading concept.
import java.util.*;

public class exp3_6
{ 
  public static void main(String args[])
   { int n,m;
    Scanner obj=new Scanner(System.in);
     System.out.println("Enter 2 digits:");
        n=obj.nextInt();
        m=obj.nextInt();
        System.out.println("Enter 2 strings:");
        String str1=obj.next();
        String str2=obj.next();
   exp3_6 Obj1=new exp3_6();
   Obj1.con(n,m);
   Obj1.con(str1,str2);
   }
  void con(int a,int b)
  {
    String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String str3 = str1 + str2;
        int c = Integer.parseInt(str3);
   System.out.println("Concated Number=" +c);
  }
  void con(String a,String b)
   {
    String str3=a.concat(b);
    System.out.println("Concated String=" +str3);
   }
}
