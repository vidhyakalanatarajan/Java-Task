class ArmStrong{
public static void main(String args[]){
int n=153;
int sum=0;
while(n!=0){
int temp;
temp=n%10;
n=n/10;
sum =sum+temp*temp*temp;
}
System.out.println(sum);
}
}