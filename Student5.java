//java program to overload constructors
class Student5{
int id;
String name;
int age;
//creating two argument constructor
Student5(int i,String n){
id=i;
name=n;
System.out.println(id+" "+name);
}
//creating three arg constructor
Student5(int i,String n,int a){
id=i;
name=n;
age=a;
System.out.println(id+" "+name+" "+age);
}
public void display(){
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[]){
Student5 s1 = new Student5(1,"vidhya");
Student5 s2 = new Student5(2,"banu",24);
s2.display();
}
}