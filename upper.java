class upper {
public static void main(String[] args){
String str1="hello swarup good morning";
StringBuffer str2=new StringBuffer(str1);
for(int i=0;i<str1.length();i++)
     str2.setCharAt(i,Character.toUpperCase(str1.charAt(i)));
//  str2=str1.toUpperCase(atchar[i]);
System.out.println(str1);
System.out.println(str2);
}
}
