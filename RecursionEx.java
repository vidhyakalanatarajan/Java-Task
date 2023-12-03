class RecursionEx{
//user defined class
public int sum(int num){
if(num==1){
return 1;
}else{
System.out.println((num-1)+num);
return sum(num-1)+num;
}
}
//pre-defined class
public static void main(String args[]){
RecursionEx obj = new RecursionEx();
System.out.println(obj.sum(4));
}
}
