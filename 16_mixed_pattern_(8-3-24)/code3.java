import java.util.*;
class code3{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number: ");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			int ch=row+64;
			for(int j=1;j<=row;j++){
			  if(i%2==0){
				System.out.print(j+"  ");
		}
		else{
			System.out.print((char)ch--+ "  ");

	}}
			System.out.println();
		
}
}
}
