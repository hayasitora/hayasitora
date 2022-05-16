package project_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
	

	}

}
// Main menu class
class Menu{
	Menu(){
		
		System.out.println("메뉴");
	}
}
// Abstract Class
abstract class AbstractMenu{
	ArrayList<Movie> MovieAl= new ArrayList<Movie>();
	//get value method
	public int select(int userchoice,String pup) {
		BufferedReader Ser=new BufferedReader(new InputStreamReader(System.in));
		int input=0;
		do {
			System.out.print(pup);
			try {
				input=Integer.parseInt(Ser.readLine());
			}catch(Exception e){
				input=-1;
				e.printStackTrace();
			}
		}while(0<input||input>userchoice);
		return input;
	}
	//clear console method
	public void clear() {
		int t=0;
		while(t<100) {
			System.out.println();
			t++;
		}
	}
	//created line method
	public void line30() {
		for(int i=0; i<30; i++) {
			System.out.print("--");
		}
		System.out.println();
	}
	
}
// AdminMenu Class
class AdminMenu extends AbstractMenu{
	
}
//Reservation Class
class Reservation{
	
}
// Seat class02
class Seats{
	
}
class Movie{
	String MovieName;
	String MovieGenre;
	Movie(){
		
	}
	Movie(String MovieName,String MovieGenre){
		this.MovieName=MovieName;
		this.MovieGenre=MovieGenre;
	}
}