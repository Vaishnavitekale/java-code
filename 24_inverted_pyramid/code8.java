import java.util.*;
class Code8{
	public static void main(String arg[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		int num2=0;
		for(int i=1;i<=row;i++){
		int num=i;
			for(int j=1;j<row*2;j++){
				if(j<i||(i+j)>row*2){
					System.out.print("\t");
				}
				else{
					if(j>row){
						num2--;
					System.out.print(num2+"\t");
					}
					else{
					System.out.print(num++ +"\t");
					num2=num-1;}
					
				}
			}
			
			
			System.out.println();
		}
	}
}
