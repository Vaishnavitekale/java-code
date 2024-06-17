import java.io.*;
class code9{
	public static void main(String[] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row=Integer.parseInt(br.readLine());
	
		for(int i=1;i<=row;i++){
			int num=i;
				for(int j=row;j>=i;j--){
					System.out.print(num++ +" ");
				}
			
		System.out.println();
		}
	}
}
