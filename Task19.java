import java.util.Scanner;
class Task19{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter the number");
int n=obj.nextInt();
int n1=0,n2=1,n3 = 0;

System.out.print(n1 + " ");
System.out.print(n2 + " ");

for(int i=0;i<n;i++){
n3=n1+n2;

System.out.print(n3 + " ");
n1 = n2;

n2 = n3;


}
}
}

