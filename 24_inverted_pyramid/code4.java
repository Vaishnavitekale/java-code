import java.util.*;
class Code4{
	public static void main(String arg[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
		int num=1;
			for(int j=1;j<row*2;j++){
				if(j<i||(i+j)>row*2){
					System.out.print("\t");
				}
				else{
					System.out.print(num+"\t");
					num++;
					
				}
			}
			
			System.out.println();
		}
	}
}
