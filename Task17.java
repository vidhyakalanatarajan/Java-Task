import java.util.Scanner;
class Task17{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number");
int n=obj.nextInt();
int i;
int sum=0;
for(i=1;i <= n;i++)
{
if(n % 2 != 0){
sum += n;

}
}
System.out.println(sum);

}
}
 