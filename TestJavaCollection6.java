import java.util.*;
public class TestJavaCollection6{
public static void main(String args[]){
//creating dequeue and adding elements
Deque<String>deque=new ArrayDeque<String>();
deque.add("bala");
deque.add("simbu");
deque.add("arun");
//Traversing elements
for(String str:deque){
System.out.println(str);
}
}
}