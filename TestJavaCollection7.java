import java.util.*;
public class TestJavaCollection7{
public static void main(String args[]){
//creating HashSer and adding elements
HashSet<String>set=new HashSet<String>();
set.add("yokesh");
set.add("Ganesh");
set.add("lokesh");
set.add("Ganesh");
//Traversing elements
Iterator<String>itr=set.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
