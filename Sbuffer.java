import java.util.*;
class Sbuffer{
public static void main(String[] args){
String str1,str2,str3;
Scanner sc=new Scanner(System.in);
System.out.println("enter strings");
str1=sc.nextLine();
str2=sc.nextLine();
str3=sc.nextLine();
System.out.println("before doing operation");
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);
System.out.println("after doing operation");
StringBuffer sb1=new StringBuffer(str1);
sb1.delete(0,3);
System.out.println(sb1);
}
}