//1. Program to create a student class with name, roll no and marks of five subjects. Write functions to read and display the details.
import java.util.*;

public class exp3_1
{
 public static void main(String args[])
 {
  String n,g;
  int c,r,t=0,i,a;
  int m[]=new int[5];
  Scanner obj = new Scanner(System.in);
  System.out.print("Enter name of student: ");
  n = obj.nextLine();
  System.out.print("Enter class of student: ");
  c = obj.nextInt();
  System.out.print("Enter roll no of student: ");
  r = obj.nextInt();
  for(i=0;i<5;i++)
  {
   System.out.print("Enter marks in subject"+(i+1)+": ");
   m[i] = obj.nextInt();
   t = t + m[i] ;
  }
  a = t / 5 ;
  if (a >= 90)
      g = "A";
  else if (a >= 80)
           g = "B";
  else if (a >=70)
           g = "C";
  else if (a >= 60)
           g = "D";
  else if (a >= 50)
           g = "E";
  else if (a >= 40)
           g = "P";
  else
      g = "F";
  System.out.println("\nName = " + n);
   System.out.println("Class = " + c);
  System.out.println("Total Marks = " + t);
  System.out.println("Grade = " + g);
 }
}
 
