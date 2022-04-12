package today_2022_04_11;

public class Lotto {

	public static void main(String[] args) {
		
		
	
		latto.rendomnumber();
	}

}
class latto{
	static void rendomnumber() {
		int []num= new int [60];
		int []stack=new int [60];
		int max=0;
		int maxindex = 0;
		for(int i=0; i<60; i++) {
			num[i]=(int)(Math.random()*60)+1;
		}
		for(int i=0; i<60; i++) {
			stack[i]=0;
		}
		for(int i=0; i<60; i++) {
			for(int j=0; j<60; j++) {
				if(num[i]==j) {
					stack[j]+=1;
				}
			}
			
		}
		for(int i=0;i<60; i++) {
			if(stack[i]>max) {
				max=stack[i];
				maxindex=i;
			}
			
		}
		System.out.println(maxindex);
	}
}
