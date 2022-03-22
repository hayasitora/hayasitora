package today2022_03_22;

public class multiplication_All {
	
	public static void main(String[]args) {
		
		//get multiplication all 2~9
		
		int i,j= 0;
				for(j=2; j<10; j++) {
					System.out.println("%d단이에요".formatted(j));
					System.out.println();
					
					for (i=1; i<10; i++) {
						
						if(i>0)
						System.out.println("%d*%d=".formatted(j,i)+j*i);
						
					}
					
				}
		
		
	}

}
