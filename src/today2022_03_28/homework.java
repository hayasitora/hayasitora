package today2022_03_28;

public class homework {

public static void printP(int a) {
	System.out.println();
	for(int i=0; i<a; i++) {
		System.out.print("-");
	}
}
public static void main(String[]args) {

	int a=5;
	int b=5;
	int c=1;
	int stack=1;
	int[][] sum=new int [a][b];
		System.out.println("multi for");
		printP(20);
	for(int i=0; i<a; i++) {
		System.out.println();
		for(int j=0; j<b; j++) {
			sum[i][j]=stack;
			stack=c+stack;	
			System.out.print(sum[i][j]+"|");
		}
		printP(20);
	}
	
}
}
