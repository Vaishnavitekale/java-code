import java.util.*;
class code2{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch='a';
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print("$"+" ");
				}
				else{

				System.out.print(ch++ +" ");

			}
		}
				System.out.println();
	}
	}}
