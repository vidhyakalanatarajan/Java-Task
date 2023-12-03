class Student18 implements Clonable{
int rollno;
String name;
Student18(int rollno,String name){
this.rollno=rollno;
this.name=name;
}
public Object clone()throws CloneNotSupportedException