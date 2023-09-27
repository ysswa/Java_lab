import java.util.*;
class Example1{
Example1(int a,int b){
System.out.println("the value of the first variable a= "+a);
System.out.println("the value of the second variable b= "+b);
int sum=a+b;
System.out.println("the value of the first variable a= "+sum);
}
Example1(){

int sum=20;
System.out.println("the value of the first variable a= "+sum);
}
}
class TestCase2{
public static void main(String args[]){
int a=20,b=5;
Example1 ex1=new Exmple1();
Example1 ex2=new Exmple1(a,b);
}
}



