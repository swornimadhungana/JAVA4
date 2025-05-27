package interface;

public class messagingservice{
 public static void main(String[]args){
    messaging s= new sms();
s.printconnection();
s.print();
 messaging e= new email();
 e.printconnection();
 e.print();
 }
}