/*import java.util.Scanner;
class Task11{
public static void Vowel_Consonant(char ch)
{
if(ch == 'e' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
System.out.println(ch +" is vowel");
else
System.out.println(ch +" is consonant");
}
public static void main(String args[]){
System.out.println("Enter a character :");
      Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
}
}*/
class Task11{
public static String isVowel(char ch)
{
String str="aeiouAEIOU";
return(str.indexOf(ch)!=-1)?"vowel":"consonant";
}
public static void main(String args[])
{
System.out.println("It is" + isVowel('r'));
}
}
