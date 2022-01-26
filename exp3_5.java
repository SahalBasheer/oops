//5. Write a Java program to calculate the perimeter of different shapes namely circle and rectangle using the concept of constructor overloading.

import java.util.*;

public class exp3_5
{
    public static void main(String args[])
    {
      int r,l,b;
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the radius of circle:");
        r=obj.nextInt();
        System.out.println("Enter the length and breathof rectangle:");
        l=obj.nextInt();
        b=obj.nextInt();
        exp3_5 obj1=new exp3_5(r);
        exp3_5 obj2=new exp3_5(l,b);
    }
    exp3_5(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    exp3_5(int n,int m)
    {
        int p=(n+m)*2;
        System.out.println("Perimeter  of Rectangle is:"+p);
    }
} 
