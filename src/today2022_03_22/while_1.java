package today2022_03_22;
import java.util.Scanner;
public class while_1 {

	
	public static void main(String[]args) {
		//while 을 이용해서 1~10까지 수를 세는중 0을 입력받으면 입력받은 수가 몇번인가보여주고  종료하라
		//값을 받고 카운터하다가 0이면 추출
		Scanner sc= new Scanner(System.in);
		int number=0;
		System.out.println("1~10 press the number press 0=exit");
		
		int a; 			
		
		while(number<11) {
			a=sc.nextInt();
			number++;
			System.out.println("get number is ="+a);
			
			if(a==0) {
				System.out.println("i get count %d".formatted(number));
				break;
			}
		}
	}
}

