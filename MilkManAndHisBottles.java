import java.io.*;
import java.util.Scanner;
public class MilkManAndHisBottles{
         public static void main(String [] args) {
                 //Write your code here
                 int possible_bottles[]={1,5,7,10};
                 Scanner sc =new Scanner(System.in);
                 int num=sc.nextInt();
                 int output[]=new int[num];
                 for(int i=0;i<num;i++){
                    int milk_required=sc.nextInt();
                    int bottles=0;
                    for (int j=3;j>=0;j--){
                        int n=milk_required/possible_bottles[j];
                        milk_required -= possible_bottles[j]*n; 
                        bottles += n;    
                    }
                    output[i]=bottles;
                 }
                 for(int i=0;i<num;i++)
                    System.out.println(output[i]);
         }
}



