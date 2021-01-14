class Pascal{
public static void main(String[] args){
int a[][]=new int[20][20];
for(int i=0;i<20;i++){
for(int l=0;l<(20-i);l++){
	System.out.print(" ");
}
for(int j=0;j<i;j++){
if((j==0)||(j==i-1)){
a[i][j]=1;
}
else{
a[i][j]=a[i-1][j-1]+a[i-1][j];
}
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}