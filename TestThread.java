class A extends Thread{
public void run(){
  for(int i=0;i<4;i++){
   try{
     Thread.sleep(1000);
    }
catch(Exception e){
System.out.println(e);
}
System.out.println("Good morning");
}
}
}
class B extends Thread{
public void run(){
  for(int i=0;i<4;i++){
   try{
     Thread.sleep(2000);
    }
catch(Exception e){
System.out.println(e);
}
System.out.println("hello");
}
}
}
class C extends Thread{
public void run(){
  for(int i=0;i<4;i++){
   try{
     Thread.sleep(3000);
    }
catch(Exception e){
System.out.println(e);
}
System.out.println("welcome");
}
}
}
class TestThread{
 public static void main(String args[]){
     A t1=new A();
     B t2=new B();
	C t3=new C();
t1.start();
	try{
     t1.join();
    }
catch(Exception e){
System.out.println(e);
}


t2.start();
	try{
     t2.join();
    }
catch(Exception e){
System.out.println(e);
}
t3.start();
}
}







