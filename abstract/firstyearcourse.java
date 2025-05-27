package abstract;
import java.util.Scanner;
abstract class firstyearcourse{
    int totalweeks;
    abstract void printname();
    abstract void printcode();
    void printtotalweeks(){
Scanner s= new Scanner(System.in);
System.out.println("Enter total number of weeks in first year");
totalweeks= s.nextInt();
System.out.println("total weeks in first year "+ totalweeks);

    }
}