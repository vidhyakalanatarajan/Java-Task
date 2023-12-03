//Let us another example for default constructor
//which displays the default values
import java.util.Scanner; 
class Student3{
//method to display the value of id and name

public void display(){
Scanner scan = new Scanner(System.in);
System.out.println("enter your id");
int id=scan.nextInt();
System.out.println("enter your name");
String name=scan.next();
System.out.println(id+" "+name);
}
public static void main(String args[]){
//creating objects
Student3 s1 = new Student3(); 
Student3 s2 =new Student3();
//displaying vaalues to the object
s1.display();
s1.display();
}
}		