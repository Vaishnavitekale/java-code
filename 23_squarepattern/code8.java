import java.util.*;
class Code8{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=row;
		int ch=row+97;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){

					System.out.print((char)ch+"\t");
					
				}
				else{
					if(j%2==0){
					System.out.print((char)ch+"\t");
				}
				else{
					
					System.out.print((num*num)-1+"\t");
					
					}
		
				
			
				}
				num++;
				ch++;
			}
			
		
			System.out.println();
		
	}

	}
}
