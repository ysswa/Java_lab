class Adder{
static int add(int a,int b){
return a+b;
}
static int add(int a,int b,int c){
return a+b+c;
}
public static void main(String[] args){
Adder ad1;
//=new add(11,11);
int sum=ad1.add(11,11);
//Adder ad2=new add(11,11,11);

System.out.println(sum);
//System.out.println(ad2.add(11,11,11));
}
}