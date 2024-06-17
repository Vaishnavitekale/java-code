import java.util.*;
class code9{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=row+64;
		for(int i=1;i<=row;i++){
			int num2=1;
	
			for(int j=row;j>=i;j--){
			  if(i%2==0){		
				System.out.print((char)num-- + "  ");

			  }
			  else{			  
				System.out.print(num2++ + "  ");
			
			  }
			}

			num=row+64-i;
			System.out.println();
		}
	}
}



