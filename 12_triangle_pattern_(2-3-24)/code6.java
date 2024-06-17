import java.util.*;
class code6{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		char ch='A';
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(ch+" ");
				}
				else{

				System.out.print(j +" ");

			}
			ch++;
		}
				System.out.println();
	}
	}}
