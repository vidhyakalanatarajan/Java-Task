import java.util.*;
class Testjavacollection{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>(); //creating arraylist
list.add("Ravi");  //added object in arraylist
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");
Iterator itr= list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
