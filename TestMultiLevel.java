import java.lang.*;
class Bank{
public void data1(){
System.out.println("in banks your money safe");
System.out.println("banks provides loans");
}
}
class iciciBank extends Bank{
public void data2(){
System.out.println("industrial credited investment corporation of india");
}
}
class Sbi extends iciciBank{
public void data3(){
System.out.println("sbi abrivates state bank of india");
System.out.println("sbi provides more security to yur money");
}
}
class TestMUltiLevel{
public static void main(String[] args){
Sbi s=new Sbi();
//s.data1();
//s.data2();
s.data3();
}
}
