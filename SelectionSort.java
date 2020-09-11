


import java.io.*;
import java.util.Scanner;
public class SelectionSort
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n;
		char a[]={'a','e','x','p','o','f','t','d'};
		n=a.length;
		for(int i=0;i<n-1;i++)
		{
			char min=a[i];
			int index=i;		
			for(int j=i+1;j<n;j++)
			{
				if(Character.compare(a[i],a[j])>0){				
					min=a[j];
					index=j;	
				}
			}		
			char temp=a[i];
			a[i]=min;
			a[index]=temp;
			
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}