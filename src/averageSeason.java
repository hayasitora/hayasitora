package today2022_04_21_1;
import java.util.Scanner;
public class averageSeason {
static void line() {
	System.out.println("----------------");
}

public static void main(String[]args) {
	student s=new student("마법윤리과","22학번");
	s.myself("뷜 멜피우스", "17세", "이스테리어국 제3도시 메르피스트 영주 뷜 레미테어32-1");
	s.show();
}
}
class person{
	String name;
	String age;
	String address;
	person(){
		
	}
}
class student extends person{
	String subname;
	String SYnumber;
	double []season =new double[8];
	student(String subname,String SYnumber) {
	this.subname=subname;
	this.SYnumber=SYnumber;
	}
	void myself(String name,String age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	double average() {
		double temp=0;
		Scanner scan= new Scanner(System.in);
		for(int i=0; i<8; i++) {
			System.out.println();
			System.out.print((i+1)+"학기 학점->");
			season[i]= scan.nextDouble();
			temp=temp+season[i];
		}
		double Aver=temp/8;
		System.out.println("평균평점:"+Math.round(Aver*10)/10);
		return Aver;
	}
	void show() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+address);
		System.out.println("학과:"+subname);
		System.out.println("학번:"+SYnumber);
		averageSeason.line();
		average();
		
	}
}