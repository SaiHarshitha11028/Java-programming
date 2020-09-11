import java.io.*;
import java.util.Scanner;
public class SelectionSortNum
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n;
		system.ot.println("enter the size of an array");
		n=sc.nextint();
		int a[]=new int[n];
		for(int i=o;i<n;i++)
		{
			a[i]=sc.nextint();
		}
		
		for(int i=0;i<n-1;i++)
		{
			int min=a[i];
			int index=i;		
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j]){				
					min=a[j];
					index=j;	
				}
			}		
			int temp=a[i];
			a[i]=min;
			a[index]=temp;
			
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}
