class FirstAndLast{
public static void main(String args[]){
int a=2345;
int last=a%10;
a=a/10;
while(true){
if((a>0) &&(a<10)){
System.out.println(a);
break;
}
a=a/10;
}
System.out.println(last);
}
}