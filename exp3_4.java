//4. Write a Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.

import java.util.*;

public class exp3_4
{
    public static void main(String args[])
    { 
        int r,l,b;
        double h,x;
        Scanner obj = new Scanner(System.in);
        exp3_4 obj1=new exp3_4();
        System.out.println("Enter the radius of circle:");
        r=obj.nextInt();
        System.out.println("Enter the length and breathof rectangle:");
        l=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Enter the heigth and base of triangle:");
        h=obj.nextInt();
        x=obj.nextInt();
        obj1.area(r);
        obj1.area(l,b);
        obj1.area(h,x);
    }
    void area(int a)
    {
        System.out.println("Area of circle is:"+(3.14*a*a));
    }
    void area(int n,int m)
    {
        System.out.println("Area of Rectangle is:"+(n*m));
    }
    void area(double c,double d)
    {
        System.out.println("Area of triangle is:"+(c*d/2));
    }
}
  
