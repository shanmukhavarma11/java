import java.util.*;
class Pattern{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
				for(int i=1;i<n;i++){
				int k=1;
				for(int l=1;l<(n-i);l++){
					System.out.print(" ");
				}
				for(int j=1;(j<=i && j>0);){
					if((j==i) && (k==1)){
						System.out.print(j+"");
							j--;
							k=0;
										}
					else if((k==0) && (j<i)){
						System.out.print(j+"");
						j--;
											}
					else{
						System.out.print(j+"");
						j++;
							}
					}
				System.out.println();
				}
		}
}