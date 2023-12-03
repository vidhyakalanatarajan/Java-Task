import java.util.Scanner;
class Task22{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter your name");
String str=scan.nextLine();
StringBuilder str1=new StringBuilder();
str1.append(str);
str1.reverse();
System.out.println(str1);
System.out.println(str1.length());

}
}