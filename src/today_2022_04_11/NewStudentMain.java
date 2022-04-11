package today_2022_04_11;

public class NewStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newstudent[] ns=new Newstudent[3];
		
	}

}
class Newstudent{
	static String name;
	static int ban;
	static int no;
	static int music;
	static int math;
	
	
	public static void newmain() {
		school s=new school();
		name=s.scan.next();
		ban=s.scan.nextInt();
		no=s.scan.nextInt();
		music=s.scan.nextInt();
		math=s.scan.nextInt();
	}
	
	public static int gettotal(int music,int math) {
		int sum= music+math;
		return sum;
	}
	public static float getAverage(int sum,int subject) {
		float average= sum/subject;
		return average;
	}
	static int minMax(int []a) {
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				int temp= a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		a[0]=mydata.min;
		a[a.length]=mydata.max;
		
		
		return a[0];
		
	
	}	
	
}
class mydata{
	static int min;
	static int max;
}