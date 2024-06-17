import java.io.*;
class code10{
	public static void main(String[] arg)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row : ");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++){
				int ch=64+row;
				for(int j=row;j>=i;j--){
					System.out.print((char)ch-- +" ");
				}
			
		System.out.println();
		}
	}
}
