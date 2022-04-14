package today2022_04_14;

public class tt {
	public static void main(String[]args) { 
	
		int[] a= {8,9,7,5,6,1,7,7,8,9,5};
	
		System.out.println(Test.sum(a));
}
}
class Test{
int total;

static int sum(int[] a){
	int com=0;
	for(int i=0; i<a.length;i++) {
		com=a[i]+com;
	}
	return com;
}
}
