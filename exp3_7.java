//7. Java program to create a class employee with details such as empno,name and phone number. Read details of at least 5employees and print

import java.util.*; 

public class exp3_7
 { 
  public static void main(String args[])
   {
    int e[]=new int[5];
    String n[]=new String[5];
    String p[]=new String[5];
    Scanner obj=new Scanner(System.in);
    for(int i=0;i<5;i++)
    { 
      System.out.println("Details of employee "+(i+1));
      System.out.println("Enter the employee number:");
      e[i]=obj.nextInt();
      System.out.println("Enter the employee Name:");
      n[i]=obj.next();
      System.out.println("Enter the employee's phone number:");
      p[i]=obj.next();
    }
    
    
      for(int i=0;i<5;i++)
    { 
      System.out.println("Details of employee "+(i+1)+"    Employee number:"+e[i]+"    Name:"+n[i]+ "     phone number:"+p[i]);  
    }

   }
}
