import java.util.Scanner;
class OverLoad{
	public OverLoad(){ }
	public void num_calc(int num,char ch){
		if(ch=='s'){
			System.out.println(num*num);
		}
		else{
			System.out.println(num*num*num);
		}
	}
	public void num_calc(int a,int b,char ch){
		if(ch=='p'){
			System.out.println(a*b);
		}
		else{
			System.out.println(a+b);
		}
	}
	public void num_calc(String s1,String s2){
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}
public class ToOverLoad{
	public static void main(String args[]){
		OverLoad ol=new OverLoad();
		ol.num_calc(5,'s');
		ol.num_calc(5,6,'p');
		ol.num_calc("equal","Equal");
	}
} 