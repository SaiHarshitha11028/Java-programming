import java.io.*;
import java.util.Scanner;
public class SelectionSortNum
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n;
		int a[]={77,22,79,123,43,34,29,67};
		n=a.length;
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