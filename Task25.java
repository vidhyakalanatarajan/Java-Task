import java.util.Arrays;
class Task25{
public static void main(String args[]){
int arr[]={1,2,3,3,4,4,4,5,5,6,10,12,12,46};
for(int i=0;i<arr.length-1;i++){
if(arr[i]!=arr[i+1])
System.out.println(arr[i]);
}
System.out.println(arr[arr.length-1]);
}
}