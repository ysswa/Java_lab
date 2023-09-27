class Adder{  
static void add(int a,int b){
System.out.println("value of a="+a);
System.out.println("value of b="+b);
int sum=a+b;
System.out.println("value of sum=");
}  
static void add(int a,int b,int c){
System.out.println("value of a="+a);
System.out.println("value of b="+b);
System.out.println("value of c="+c);
 int sum=a+b+c;}
//System.out.println("value of sum=");  
    }  
}
class TestOverloading3{  
public static void main(String[] args){  
Adder.add(11,11);
Adder.add(11,11,11);  
}
}     


//not executed