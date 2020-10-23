import java.io.*;
import java.util.Scanner;
class Invoice{
        // instance variables 
        private String number;
        private String description;
        private int quantity;
        private double price;
        public Invoice(){
	}
        // parameterized constructor 
        public Invoice( String number,String description,int quantity,double price){
            this.number=number;
            this.description=description;
            this.quantity=quantity;
            this.price=price;
        }
       // Setters
       public void setNumber(String n){
		number=n;
       }
       public void setDescription(String d){
		description=d;
       }
       public void setQuantity(int q){
		quantity=q;
       }
       public void setPrice(double p){
		price=p;
       }
       // Getters
       public String getNumber(){ 
		return number;
	}
       public String getDescription(){
		return description;
	}
       public int getQuantity(){
		return quantity;
	}
       public double getPrice(){
		return price;
	}
       
       public double getInvoiceAmount(){
                double invoiceAmount = 0.0;
                if (quantity<0){
			quantity=0;
		}
                if(price<0){
			price=0.0;
		}
                invoiceAmount=quantity*price;
                return invoiceAmount;
       }
}
public class InvoiceBill{
         public static void main(String []args){
		   Scanner scan=new Scanner(System.in);
                   Invoice myInvoice=new Invoice("1","Key board",20,210.00);
                   myInvoice.setNumber("1");
                   myInvoice.setDescription("Key board");
                   myInvoice.setQuantity(20);
                   myInvoice.setPrice(210.00);
                   System.out.println(myInvoice.getInvoiceAmount());         
         }
}
