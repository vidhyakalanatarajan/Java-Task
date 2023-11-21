import java.util.Scanner;
class Task2{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a first number");
int num1 = scan.nextInt();
System.out.println("Enter a second number");
int num2 = scan.nextInt();
System.out.println("The sum of two number is: "+(num1+num2));
System.out.println("The subtract of two number is: "+(num1-num2));
System.out.println("The multiplication of two number is: "+(num1*num2));
System.out.println("The division of two number is: "+(num1/num2));
System.out.println("The modules of two number is: "+(num1%num2));
}
}