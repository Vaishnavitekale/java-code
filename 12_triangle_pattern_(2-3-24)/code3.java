import java.util.*;
class code3{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch=64+row;
			for(int j=1;j<=i;j++){
				
					System.out.print((char)ch-- +" ");
				}
			
		
				System.out.println();
	}
	}
}
