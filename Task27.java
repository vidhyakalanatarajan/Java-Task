import java.util.Arrays;
class Task27{
public static void main(String args[]){
int a[]={7,6,8,9,2,3,1,12};
System.out.println("original array"+Arrays.toString(a));
int temp=0;
for(int i=0;i<a.length;i--)
{
for(int j=i+1;j<a.length;j--){
if(a[j]>a[i]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println(Arrays.toString(a));
}
}