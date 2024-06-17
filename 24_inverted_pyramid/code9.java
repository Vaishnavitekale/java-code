import java.util.*;
class Code9{
	public static void main(String arg[]){
		Scanner sc=new Scanner (System.in);
		System.out.print("enetr row: ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<row*2;j++){
				if(j<i||(i+j)>row*2){
					System.out.print("\t");
				}
				else{
					if(i%2==1){
						if(j%2==1){
					System.out.print("1"+"\t");
					}

					else{
					System.out.print("0" +"\t");
					}
					}
					else{
						if(j%2==1){
					System.out.print("0"+"\t");
					}

					else{
					System.out.print("1" +"\t");
					}
					}
					
				}
			}
			
			
			System.out.println();
		}
	}
}
