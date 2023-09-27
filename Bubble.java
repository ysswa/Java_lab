import java.lang.*;
import java.util.*;
class Bubble{
public static void main(String args[ ]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[20];
int size,i,j;
System.out.println("enter array size");
//size=sizeof(arr)/sizeof(arr[0]);
size=sc.nextInt();
System.out.println("enter elements");
for(i=0;i<size;i++)
{
arr[i]=sc.nextInt();

}
int temp;
for(i=0;i<size-1;i++){
for(j=0;j<size-i-1;j++){
if(arr[j]>arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
        }
    }
}
for(i=0;i<size;i++){
System.out.println(" "+arr[i]);
      } 
   }
}