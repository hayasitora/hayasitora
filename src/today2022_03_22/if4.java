package today2022_03_22;
import java.util.Scanner;
public class if4 {

	
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		//2022year 03th 22day /
		
		int i=0;
		System.out.println("plz press the multiplication_table number");
		int j=scan.nextInt();
		
		for(i = 1; i<10; i++ ) {
			System.out.println("%d*%d=".formatted(j, i)+j*i);
			System.out.println();
			
		
		}
		
	}
}
