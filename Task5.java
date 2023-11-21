import java.util.Scanner;
class Task5{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter first number");
int num1 = scan.nextInt();
System.out.println("enter second number");
int num2 = scan.nextInt();
num1 = num1+num2;
num2 = num1-num2;
num1 = num1-num2;
System.out.println("swap number is: "+"num1"+" "+num1 +"num2"+" "+num2);
}
}
