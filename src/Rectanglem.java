package today2022_04_21_1;

public class Rectanglem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square s=new Square(5, 7);
		s.area();
		s.high(8);
		s.volume();
	}

}
class Rectangle{
	int x;
	int z;
	
	int area;
	Rectangle(){
		
	}
	
	int area(){
		area=x*z;
		
	return area;
	}
}
class Square extends Rectangle{
	int y;
	int volume;
	int high(int y) {
		this.y=y;
	return y;
	}
	Square(int x,int z){
		this.x= x;
		this.z= z;
		}

	int volume() {
	 volume=area*y;
	 System.out.println(volume);
	return volume;
	}
	
}