import java.io.*;
import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int a[];
		n=sc.nextInt();
		a=new int[n];
		System.out.print("enter elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		quickSort(a,0,n-1);
		System.out.println("After Sorting");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	public static void quickSort(int a[],int left,int right) {
		int keypos,l,u,temp;
		l=left;
		u=right;
		keypos=left;
		while(left!=right)
		{
			while(a[right]>=a[keypos] &&left!=right) 
				right--;
			if(left!=right) {
				temp=a[keypos];
				a[keypos]=a[right];
				a[right]=temp;
				keypos=right;
			}
			while(a[left]<=a[keypos] &&left!=right )                   
				left++;
			if(left!=right) {
				temp=a[keypos];
				a[keypos]=a[left];
				a[left]=temp;
				keypos=left;
			}
		}
		if(l<keypos)
			quickSort(a,l,keypos-1);
		if(u>keypos)
			quickSort(a,keypos+1,u);
	}
}
