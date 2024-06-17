import java.util.*;
class code7{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
				if(j%2==0){
			
					System.out.print(ch+" ");
					ch++;
				}
				else{

				System.out.print(i +" ");

			}
		
		}
				System.out.println();
	}
	}}
