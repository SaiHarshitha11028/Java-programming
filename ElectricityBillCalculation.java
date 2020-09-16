import java.io.*;
import java.util.Scanner;
class ElectricityBill{
    private int consumerNo;
    private String consumerName;
    private int previousReading;
    private int currentReading;
    private String ebConnection;
    //default constructor
    public ElectricityBill(){ }
    //parameterised constructor
    public ElectricityBill(int consumerNo,String consumerName,int previousReading,int currentReading,String ebConnection){
        this.consumerNo=consumerNo;
        this.consumerName=consumerName;
        this.previousReading=previousReading;
        this.currentReading=currentReading;
        this.ebConnection=ebConnection;
    }
    //setters
    public void setConsumerNo(int consumerNo){this.consumerNo=consumerNo;}
    public void setConsumerName(String consumerName){this.consumerName=consumerName;}
    public void setPreviousReading(int previousReading){this.previousReading=previousReading;}
    public void setCurrentReading(int currentReading){this.currentReading=currentReading;}
    public void setEbConnection(String ebConnection){this.ebConnection=ebConnection;}
    //getters
    public int getConsumerNo(){return consumerNo;}
    public String getConsumerName(){return consumerName;}
    public int getPreviousReading(){return previousReading;}
    public int getCurrentReading(){return currentReading;}
    public String getEbConnection(){return ebConnection;}

    public double billAmount(){
        double unitsUsed=currentReading-previousReading;
        double amount=0.0;
        if(ebConnection=="domestic"){
            if(unitsUsed<=100){
                amount=unitsUsed*1;
            }
            else if(unitsUsed>100 && unitsUsed<=200){
                amount=unitsUsed*2.50;
            }
            else if(unitsUsed>200 && unitsUsed<=500){
                amount=unitsUsed*4;
            }
            else{
                amount=unitsUsed*6;
            }
        }
        if(ebConnection=="commercial"){
            if(unitsUsed<=100){
                amount=unitsUsed*2;
            }
            else if(unitsUsed>100 && unitsUsed<=200){
                amount=unitsUsed*4.50;
            }
            else if(unitsUsed>200 && unitsUsed<=500){
                amount=unitsUsed*6;
            }
            else{
                amount=unitsUsed*7;
            }
        }
        return amount;
        
    }
}    
public class ElectricityBillCalculation 
{
    public static void main(String args[]){
        ElectricityBill bill=new ElectricityBill();
        bill.setConsumerNo(15678);
        bill.setConsumerName("Ashok");
        bill.setPreviousReading(4321);
        bill.setCurrentReading(5781);
        bill.setEbConnection("commercial");
        System.out.println(bill.billAmount());
    }
}



