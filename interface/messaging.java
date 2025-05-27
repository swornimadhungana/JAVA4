package interface;
public interface messaging{
String getmessage();
void print();
String getrecipient();
default void printconnection(){
    System.out.println("Connection is suuccesful");
}
}