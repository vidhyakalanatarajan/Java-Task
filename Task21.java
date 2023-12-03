import java.util.Scanner;
class Task21{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter your tamil mark");
int tamil=obj.nextInt();
System.out.println("enter your english mark");
int english=obj.nextInt();
System.out.println("enter your maths mark");
int maths=obj.nextInt();
System.out.println("enter your science mark");
int science=obj.nextInt();
System.out.println("enter your social mark");
int social=obj.nextInt();
int total,percentage;
total = tamil+english+maths+science+social;
System.out.println("total marks is" +total);
percentage = total/5;
System.out.println("percentage is" +percentage);
if(percentage <=100 || percentage >= 90)
{
System.out.println("grade is O");
}
else if(percentage <=80 || percentage >= 89)
{
System.out.println("grade is A");
}
else if(percentage <=70 || percentage >= 79)
{
System.out.println("grade is B");
}
else if(percentage <=60 || percentage >= 69)
{
System.out.println("grade is C");
}
else if(percentage <=50 || percentage >= 59)
{
System.out.println("grade is D");
}
else if(percentage <=40 || percentage >= 49)
{
System.out.println("grade is O");
}
else if(percentage <=39)
{
System.out.println("Better luck next time");
}
}
}