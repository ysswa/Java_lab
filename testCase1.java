import java.util.*;
class example1{
public static void sum(int a,int b){
System.out.println("the value of the first variable a= "+a);
System.out.println("the value of the second variable b= "+b);
int sum=a+b;
System.out.println("the value of the sum= "+sum);
}
public static void sum(double a,double b){
System.out.println("the value of the first variable a= "+a);
System.out.println("the value of the second variable b= "+b);
double sum=a+b;
System.out.println("the value of the sum= "+sum);
}
}
class testCase1{
public static void main(String args[]){
example1 exe;

System.out.println(exe.sum(2,8));
System.out.println(exe.sum(5.7,3.3));
}
}



 