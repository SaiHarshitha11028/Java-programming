import java.io.*;
import java.util.Scanner;
public class SpiralMatrix{
         public static void main(String []args){
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
                  int [][]matrix = new int[n][n];
                  int num=1;
                  int fr=0,lr=0,fc=n-1,lc=n-1;
                  while(num<=n*n){
                      for(int i=fr;i<=fc;i++){
                          matrix[fr][i]=num;
                          num++;
                      }
                      for(int i=fr+1;i<=lc;i++){
                          matrix[i][fc]=num;
                          num++;
                      }
                      for(int i=lc-1;i>=lr;i--){
                          matrix[lc][i]=num;
                          num++;
                      }
                      for(int i=lc-1;i>=fr+1;i--){
                          matrix[i][lr]=num;
                          num++;
                      }
                      fr+=1;
                      lr+=1;
                      fc-=1;
                      lc-=1;                    
                 }             
                 for(int i=0;i<n;i++) {
                      for(int j=0;j<n;j++) {
                          System.out.print(String.valueOf(matrix[i][j] +"\t"));
                      }
                      System.out.println();
                 }
       }
}