package today2022_03_23;
import java.util.Scanner;
public class arrray_2 {
//	어떻게 할것인가?
	//index에 값을 선언? 5개를 선언하여 그안에 값을 충족한다?



	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		//값을 입력하도록
		System.out.println("enter a many as you want ");
		//index 값을 입력
		int p= scan.nextInt();
	
	//index 선언
		int[] j= new int[p];
		//값을 받도록 선언
		for (int i=0; i<j.length; i++) {
			int q = i+1;
			System.out.println("input ["+q+"]time a number enter this pannel ");
			
			j[i]= scan.nextInt();
			//값이 최장선에 있을때 값을 print
			
			
			if(i==p-1) {
				for(int e=0; e<=p; e++) {
					int t= e+1;
					System.out.println("input number["+t+"]  =["+j[e]+"].");
					
					

					
				}
			}
		
			
		}
	
	}
}
