import java.util.*;
class code8{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int ch=99;
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
				if(j%2==0){
			
					System.out.print((char)ch+" ");
					ch=ch+2;
				}
				else{

				System.out.print(j +" ");

			}
		
		}
				System.out.println();
	}
	}}
