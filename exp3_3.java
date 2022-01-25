//3. Create a class with functions to find the frequency of a given character in a string and to reverse a given string. The functions should be invoked from the main().
import java.util.*;

public class exp3_3
{
	public static void main(String args[])
	{
        exp3_3 obj= new exp3_3();
        obj.freqrev();
        
  }

    void freqrev()
    { int len,f=0,i,flag=0;
     char a;
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj1.nextLine();
        System.out.println("Enter the character to be checked: ");
        a=obj1.next().charAt(0);
        len=str.length();
        for(i=0;i<len;i++)
        {
            if(a==str.charAt(i))
            {
                System.out.println("The character is present at position "+(i+1));
                f++ ; 
              flag=1;
            } 
        }
     if(flag==0)
        System.out.println("The character is not present");
     else 
        System.out.println("Frequency of character is "+f) ;
      
       String rev="";
        for(i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
      System.out.println("Reverse of the string is:"+rev);
    }
}
