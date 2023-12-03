import java.util.Scanner;
class Task15{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("enter a number");
int num=scan.nextInt();
int ans=Integer.signum(num);
if(ans==0)
{
System.out.println("zero");
}
else if (ans >=1)
{
System.out.println("positive number");
}
else{
System.out.println("negative number");
}
}
}