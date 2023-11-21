import java.util.Scanner;
class Task9{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the seconds:");
int seconds = scan.nextInt();
int sec = seconds % 60;
int hour = second / 60;
int min = hour % 60;
hour = hour / 60;
System.out.println(hour + ":" + min+":"+second);
}
}