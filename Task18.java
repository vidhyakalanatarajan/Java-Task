import java.util.Scanner;
class Task18{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter first number");
int n1=obj.nextInt();
System.out.println("enter second number");
int n2=obj.nextInt();
System.out.println("enter your choice");
int n3=obj.nextInt();
int sum;
switch(n3){
case 1:
sum=n1+n2;
System.out.println("first number+second number ="+sum);
break;
case 2:
sum=n1-n2;
System.out.println("first number-second number ="+sum);
break;
case 3:
sum=n1/n2;
System.out.println("first number/second number ="+sum);
break;
case 4:
sum=n1*n2;
System.out.println("first number*second number ="+sum);
break;
case 5:
sum=n1%n2;
System.out.println("first number%second number ="+sum);
break;
default:
System.out.println("enter a choice between 1 to 5");
}
}
}