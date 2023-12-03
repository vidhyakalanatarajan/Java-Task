import java.util.Scanner;
class Task13{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
     System.out.println("enter a number");
     int n = scan.nextInt();
     System.out.println(palindrome(n));
  }
   static String palindrome(int n){ 
    int num = n;
    int reverse = 0;
    while(n!=0){
    reverse *= 10;
    reverse += n % 10;
    n /= 10;
    }
    return(num==reverse)?"palindrome" : "not a palindrome";
    }
}