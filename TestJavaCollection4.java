import java.util.*;
public class TestJavaCollection4{
public static void main(String args[]){
Stack<String>stack=new Stack<String>();
stack.push("Ayush");
stack.push("Banu");
stack.push("Pavi");
stack.push("Vidhya");
stack.push("Surya");
System.out.println("before pop");
Iterator<String>itr1=stack.iterator();
while(itr1.hasNext()){
System.out.println(itr1.next());
}
stack.pop();
System.out.println("after pop");
Iterator<String>itr=stack.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
