import java.util.*;
class code4{
	public static void main(String [] args){
         	Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			int ch1=64+row;
			int ch2=96+row;
			for(int j=1;j<=i;j++){
				if(i%2==0){
				
					System.out.print((char)ch1-- +" ");
				}
				else{	
					System.out.print((char)ch2-- +" ");
				}
			}
				System.out.println();
	}
	}
}
