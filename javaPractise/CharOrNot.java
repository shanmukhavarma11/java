class CharOrNot{
public static void main(String args[]){
StringBuffer s=new StringBuffer();
String sd="!123CHaraer";
char[] d=sd.toCharArray();
for(char sd1:d){
if(Character.isAlphabetic(sd1)){
System.out.println(sd1);
}
}
}
}