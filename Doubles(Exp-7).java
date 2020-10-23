import java.io.*;
public class Doubles{
	public static void main(String args[]){
		int count=0;
		int num[]=new int[6];
		for(int i=0;i<6;i++)
			num[i]=0;
		for(int i=1;i<=10000;i++){
			int d1=(int)(Math.random()*6)+1;
			int d2=(int)(Math.random()*6)+1;
			if(d1==d2){
				switch(d1){
					case 1:num[0]+=1;
					case 2:num[1]+=1;
					case 3:num[2]+=1;
					case 4:num[3]+=1;
					case 5:num[4]+=1;
					case 6:num[5]+=1;
				}
			}
		}
		for(int i=0;i<6;i++){
			System.out.println("Number of times doubles are rolled for pair ("+i+") is: " +num[i]);
		}
	}
}




