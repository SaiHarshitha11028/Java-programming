import java.util.Scanner;
public class MovieMagic{
	// variables
	private int year;
	private String title;
	private float rating;
	//methods
	public MovieMagic(){
		year=0;
		title="";
		rating=0.0f;
	}
	public void accept(){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		year=scan.nextInt();
		System.out.println("enter name of the movie");
		title=scan.next();
		System.out.println("enter rating");
		rating=scan.nextFloat();
	}
	public void display(){
		System.out.print(title+" released in "+year+" is ");
		if(rating<=2.0){
			System.out.println("Flop");
		}
		else if(rating >2.0 && rating<=3.4){
			System.out.println("Semi-hit");
		}
		else if(rating>=3.5 && rating<=4.5){
			System.out.println("Hit");
		}
		else{
			if(rating>=4.6 && rating<=5.0){
				System.out.println("Super Hit");
			}
		}
	}
	public static void main(String args[]){
		MovieMagic obj=new MovieMagic();
		obj.accept();
		obj.display();
	}
}
