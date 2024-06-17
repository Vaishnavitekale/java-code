import java.util.*;
class Code8{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. : ");
		int num=sc.nextInt();
		int num1=0;
		int count=0;
		int count2=0;
		int original=num;
		System.out.println();
			
		while(num!=0){
			num=num/10;
			count++;
		}
		int num3=original/((int)(Math.pow(10, count-1)));
		if(num3==0){
			System.out.println(original+" is  not duck number");
		}
		else {

		num=original;
		num1=0;
		while(num!=0){
			num1=num%10;
			num=num/10;
			if(num1==0){
				count2++;
			}
		}
		if(count2>0){
			System.out.println(original+" is  duck number");
		}
		else{
			System.out.println(original+" is not duck number");
		}

	}
	}
}

