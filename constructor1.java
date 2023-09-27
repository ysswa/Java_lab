import java.util.*;
class constructor1{
constructor1(){                                //default constructor
System.out.println("contructor invokes automatically");
System.out.println("constuctor has same as class name");
}

constructor1(int arr[],int n){                      //parameterized constructor
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}
}
public static void main(String[] args){
//int arr[]={2,4,5,7,8,9};
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of elements could be entered");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter  elements ");
for(int i=0;i<n;i++){
 arr[i]=sc.nextInt();
}

constructor1 s1=new constructor1();
constructor1 s2=new constructor1(arr,n);

}
}