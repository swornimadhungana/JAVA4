package interface;
import java.util.Scanner;

public class sms implements messaging{

    public String getmessage(){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter message input");
return s.nextLine();
}
public String getrecipent(){
    Scanner s= new Scanner(System.in);
    System,out.println("Enter phone number");
    String number= s.nextLine();
    if (numbermatches("\\d{10}")){
        return number;
    }
    else{
        return "Invalid mobile number";
    }
}
public void print{
    String message= getmessage();
    String recipent= getrecipent();
    System.out.println("Sending SMS to-"+ recipent);
    System.out.println("Message-"+ message);
}
}