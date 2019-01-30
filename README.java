import java.io.*;
import java.util.*;
class Space
{
public static void main(String args[])
	{
	int count=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the input");
	String a=input.nextLine();
	for(int i=0;i<=a.length();i++)
		{
	        if(a.charAt(i)=" ")
			{
			count++;
			}
		}
	System.out.println(count);
	}
}
			
