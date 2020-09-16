import java.io.*;
import java.util.Scanner;
class Book{
    private String bookName;
    private int isbnNo;
    private String author;
    private String publisher;
    
    public Book(){ }
    
    public Book(String bookName,int isbnNo,String author,String publisher){
        this.bookName=bookName;
        this.isbnNo=isbnNo;
        this.author=author;
        this.publisher=publisher;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setIsbnNo(int isbnNo){
        this.isbnNo=isbnNo;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getBookName(){
        return bookName;
    }
    public int getIsbnNo(){
        return isbnNo;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getBookInfo(){
        String k="The Name of the Book is "+bookName+".Its ISBN number is "+isbnNo+"The Author of the Book is "+author+"Its Publisher is "+publisher+".";
        return k; 
        
    }
}
public class BookDetails{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book BookTest[]=new Book[30];
        for(int i=0;i<30;i++){
            String name=sc.next();
            int num=sc.nextInt();
            String author=sc.next();
            String producer=sc.next();
            BookTest[i]=new Book(name,num,author,producer);
            System.out.println(BookTest[i].getBookInfo());
        }    
    
    }
}









