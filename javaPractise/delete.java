import java.util.Arrays;
class Delete{
public static void main(String args[]){
String s=new String("Delete Char a bc");
int a=s.indexOf("t");
System.out.println(s.substring(0,a)+s.substring(a+1));
System.out.println(s.substring(0,a));
System.out.println(s.charAt(8));
System.out.println("Number of words and character in a string");
int j=0,k=0;
int character=0,words=0;
String[] as=s.split(" ");
for(String d:as){
if(d.length()==1){
	character++;
}
else{
	words++;
}
}
System.out.println(words+" "+character);
System.out.println(" reverse a string ");
String sd="";
for(int i=0;i<s.length();i++){
	sd=s.charAt(i)+sd;
}
System.out.println(sd);
System.out.println("upper case");
for(String f:as){
	System.out.println(f.substring(0,1).toUpperCase()+f.substring(1));
}
System.out.println("Length of the array");
s="Hello world ";
char[] name=s.toCharArray();
int length1=0;
for(char g:name){length1++;}
System.out.println(length1+" working "+name.length);
char temp;
  for (int i = 0; i < name.length; i++) 
        {
            for ( j = i + 1; j < name.length; j++) { 
                if (name[i]>name[j]) 
                {
                    temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
	System.out.println(name);
Arrays.sort(name);
System.out.println(name);
}

}
