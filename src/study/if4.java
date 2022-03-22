package study;
import java.util.Scanner;
public class if4 {

	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//2022year 03th 22day
		
		int i=0;
		System.out.println("받고싶은 구구단 을 입력해주세요");
		int j=scan.nextInt();
		
		for(i = 1; i<10; i++ ) {
			System.out.println(j*i);
			System.out.println();
			
		
		}
		
	}
}
