//2. Program with functions included within the main() class to find factorial and sum of digits of the number.
import java.util.*;

public class exp3_2
{
	public static void main(String args[])
 { 
    int fat=1,i,r,n,s=0;
    Scanner obj=new Scanner(System.in);
   System.out.println("Enter digit:");
   n=obj.nextInt();
    
   for(i=1;i<=n;i++)
   {
     fat=fat*i;
   }
   System.out.println("Factorial :"+fat);  
    
 
     while(n>0)
     	{
     		r=n%10;
       	s=s+r;
       	n=n/10;
      }
     System.out.println("\nsum :"+s);
  }
}
  
  
     
