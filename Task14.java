import java.util.Scanner;
class Task14{
public static void main(String args[]){
Scanner scan =new Scanner(System.in);
System.out.println("enter a number");
int n = scan.nextInt();
int i=2;
while (i<=n/2)
{
if(n % i ==0)
{
System.out.println("not a prime");
break;
}
else{
System.out.println("prime");
}
i++;
}
}
}
