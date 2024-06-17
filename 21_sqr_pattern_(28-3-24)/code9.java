import java.util.*;
class Code9{
	public static void main(String[]  arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row: ");
		int row=sc.nextInt();
		int num=2;
		int num1=3;
		int num2=row;
		for(int i=0;i<row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){
					if(j%2==1){
						System.out.print(num*j+" ");
					}
					else{
						System.out.print(num1*j+" ");
					}
				}
				else{
					if(j%2==0){
						System.out.print(num*j+" ");
					}
					else{
						System.out.print(num1*j+" ");
					}
				}
				}
				num2++;
				
					System.out.println();
			
			
			}
			
		}
	}


			
