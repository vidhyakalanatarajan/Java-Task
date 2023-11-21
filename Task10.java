class Task10{
public static void main(String args[]){
int count,sum = 0;
for(int num = 2; num<=100; num++)
{
count = 0;
for(int i = 2; i<=num/2; i++)
{
 if(num%i==0)
{
count++;
break;
}
}
if(count==0 && num!=1)
{
System.out.println(num);
sum = sum+num;
}
}
System.out.println("The sum of 100 prime number is" +sum);
}
}