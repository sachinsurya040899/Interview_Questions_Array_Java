/*

How do you find the missing number in a given integer array of 1 to 100

*/
import java.util.Scanner;
class Interview1 
{
	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		int n=sa.nextInt();
		int a[]=new int[n];
		int b[]=new int[100];
		int count=0;
		int index=0;
		int range=0;
		for(int i=0;i<a.length;i++){
			a[i]=sa.nextInt();
		}
		for(int i=0;i<=a.length;i++){
			if(i==a.length){
				range=100;
			}
			else{
				range=a[i];
			}
			for(int j=1;j<=range;j++){
				for(int z=0;z<a.length;z++){
					if(j!=a[z]){
						for(int k=0;k<b.length;k++){
							if(b[k]==j){
								count++;
							}
						}
						count++;
					}
				}
				if(count==a.length){
					b[index]=j;
					index++;
				}
				count=0;
			}
		}
		for(int i : b){
			if(i!=0){
				System.out.print(i+" ");
			}
		}
	}
}
