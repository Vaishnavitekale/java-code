import java.util.*;
class Code10{
	public static void main(String[] arg){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num=(row*row)-2;
		int num2=row*row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i==j){
					
					System.out.print("$\t");
				
				}
					else{
					System.out.print(num2+"\t");
					
				}
				num2=num+num2;
				num=num-2;

				}
			num2=row*(row-i);
			num=num2-2;
			System.out.println();

			
				}
			
				}		
			}
			
	
