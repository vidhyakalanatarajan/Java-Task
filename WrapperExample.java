class WrapperExample1{
public static void main(String args[]){
int a=20;
Integer i=Integer.valueOf(a);//wrapper class oda instance variable this is implicit a oda value vanthu i la irukum
Integer j=a;//explicit
System.out.println(a+" "+i+" "+j);
}
}