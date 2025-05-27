package interface;
import java.util.Scanner;

public class email implements messaging{

public String getMessage(){
Scanner s= new Scanner(System.in);
System.out.println("Enter the message input");
return s.nextLine();
}

public String getrecipent(){
 Scanner s=new Scanner(System.in);
 System.out.println("Enter email");
 return s.nextLine();

}
public void print(){
    String message= getmessage();
    System.out.println("Your message is " + message);
    System.out.println("Your email is" + getrecipent);
    
}
}
