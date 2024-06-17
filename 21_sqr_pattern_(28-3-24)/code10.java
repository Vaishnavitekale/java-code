import java.util.*;
class Code10{
	public static void main(String[]  arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++){
		int num2=row;
		int ch=64+row;
			for(int j=1;j<=row;j++){
				if(i%2==0){
					if(j%2==1){
						System.out.print(num2+" ");
					}
					else{
						System.out.print((char)ch+" ");
					}
				}
				else{
					
						System.out.print((char)ch+" ");
				

				
				}
				num2--;
				ch--;
			}
				
					System.out.println();
			
			
			}
			
		}
	}


			
