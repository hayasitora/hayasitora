package today_2022_04_11;

public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		point p=new point();
		p.x=5; p.y=7;
		rect.setpoint(p);
		int a=rect.area(rect.getpoint());
		System.out.println("면적은"+a);
		
		point p2=new point();
		p2.x=10;
		p2.y=19;
		int b=rect.line(rect.getpoint(), p2);
		System.out.println("둘레는 "+b);
	}

}
class Rectangle{
	point p;
	
	void setpoint(point _p) {
		p=_p;
	}
	point getpoint() {
		return p;
	}
	int area(point p) {
		return p.x+p.y;
	}
	int line(point p1,point p2) {
		return Math.abs(p1.x-p2.x)*2+Math.abs(p1.y-p2.y)*2;
	}
	
}
class point{
	int x;
	int y;
	void print () {
		System.out.println("점은x="+"y="+y);
	}
}