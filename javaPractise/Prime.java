class Prime{
public static void main(String args[]){
int first100=0;
boolean a =true;
for(int i=1;i>0;i++)
{
int count=0;
for(int j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if ((count==2) && (first100<=100) &&(a)){
System.out.println(i);
first100++;
a=false;
}
else if((count==2) && (a==false)){

a=true;
first100++;
}
else if(first100>100){
	break;
}
}
}
}