import java.io.*;
import java.util.Scanner;
public class BinarySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int position;
        char letter;
        System.out.println("enter first letter of the word in Upper case");
        letter=sc.next().charAt(0);
        position=binarySearch(a,a.length,letter);
        if(position==-1){System.out.println("letter not  found");}
        else{
            System.out.println("Letter is found at"+position);
        }
    }
    public static int binarySearch(char b[],int n,char key){
        int lb=0,ub=n-1,mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(b[mid]==key){return mid;}
            else{
                if(b[mid]<key){
                    lb=mid+1;
                }    
                else{
                    ub=mid-1;
                }
            }
        }
        return -1;
    }
}


