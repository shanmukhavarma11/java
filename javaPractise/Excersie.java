import java.util.*; 
class Excersie{
public static void main(String[] args){
System.out.println("Enter number to positive or negative");
Scanner sc= new Scanner(System.in);
int a= sc.nextInt(); 
if (a>=0){
System.out.println("enter number is positive");
}
else{
System.out.println("number is negative");
}
System.out.println("even or odd");
if(a%2==0){
System.out.println("Number is positive");
}
else{
System.out.println("Number is negative");
}
System.out.println("leaf year or not ");
if (((a% 4 == 0) && (a % 100!= 0)) || (a%400 == 0))
         System.out.println("Specified year is a leap year");
else
System.out.println("Specified year is not a leap year");
if((a%3==0)&&(a%5==0))
System.out.println("Divisible by 3 and 5");
else
System.out.println("not divisible by 3 and 5");
if((a>35) && (a<101)){
System.out.println("passed");
if(a>75){
System.out.println("rank 1");
}
else{
System.out.println("rank 2");
}
}
else
System.out.println("failed");
System.out.println("enter two number");
int x = sc.nextInt();
int y = sc.nextInt();
if(x==0 && y==0)
   { 
       System.out.println("points lies on origin.");
   }
   else if(y==0)
   { 
       System.out.println("points lies on y-axis.");
   }
   else if(x==0)
   { 
       System.out.println("points lies on x-axis");
   }
   else
   {
       System.out.println("The point lies neither on the x nor the y axis ");
   }
 System.out.println("max of two number");
 if (x>y){
 System.out.println("x is big");
 }
 else
 System.out.println("y is big");
 int w;
 w=((x>y)?x:y);
 System.out.println(w);
 int d;
 d = y > (a > x ? a : x) ? y : ((a > x) ? a : x);
 System.out.println("Largest Number:"+d);
 int i;
 for(i=1;i<11;i++){
 System.out.println("table "+a+"*"+i+" "+a*i);
 }
 System.out.println("square of number up to 20");
 for(int j =1;j<=20;j++){
 System.out.println(j+"="+j*j);
 }
 System.out.println("Even number");
 int sum=0;
 for(i=2;i<=a;i=i+2){
 System.out.println("even number"+i);
 sum+=i;
 }
 System.out.println("sum of even "+sum);
 double sum1=0.0;
 double k;
 System.out.println("sum for pattern 1/1 + 1/2 + 1/3+.......... + 1/n");
 for(k=1.0;k<=a;k++){
 sum1+=(1/k);
 }
 System.out.println(sum1);
 System.out.println("sum for pattern 1/1^n + 1/2^n + 1/2^n + ...... +1/2^n");
sum1=1.0;
for(k=1.0;k<=20;k++){
	
	sum1+=(1.0/Math.pow(2.0,k));
}
System.out.println(sum1);
 System.out.println("sum for 1/1! + 1/2! + 1/3! + ...... + 1/n!");
 sum=1;
 int current=1;
 for(i=1;i<=a;i++){
 current+=((Math.pow(x,i))/sum1);
 sum*=(i+1);
 }
 System.out.println("Factorial of a");
 sum=1;
 for(i=1;i<=a;i++){
 sum*=(i+1);
 }
 System.out.println(sum);
 i=a;
 int count=0;
 while((i/10)!=0){
 i=i/10;
 count+=1;
 }
 System.out.println(count+1);
}
}