import java.lang.*;
class SuperClass1{
public void data1(){
System.out.println("it is super class data");
}
}
class  ChildClass1 extends SuperClass1{
public void data2(){
System.out.println("it is child class data");
}
}
class TestSingleInheritance{
 public static void main(String args[]){
ChildClass1 obj1=new ChildClass1();
     obj1.data1();
obj1.data2();
}
}

