class WrapperExample2{
public static void main(String args[]){
Integer a= new Integer(3);//creating object and also a parameterized constructor
int i=a.intValue();//implict
int j=a;//explict
String val="123";/*while converting string to int the string must contain only va1ue not a alphabetic cama*/ 
int c=Integer.parseInt(val);
System.out.println(a+" "+i+" "+j+" "+c);
}
}
