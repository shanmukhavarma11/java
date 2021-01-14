class Alter{
public static void main(String args[]){
int number=12345;
boolean a=true;
int sum=0,alter=0;
while(number>0){
if(a){
alter=number%10;
sum+=alter;
number=number/10;
a=false;
}
else{
number=number/10;
a=true;
}
}
System.out.println(sum);
}
}