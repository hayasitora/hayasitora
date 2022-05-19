package project1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

public class Mainapp {

	public static void main(String[] args) throws IOException {
		AdminMenu a=new AdminMenu();
		a.MovieListSet();
//		a.Remove_MovieAll();
		

	}

}
//Main menu class
class Menu{
	Menu(){
		
		System.out.println("메뉴");
	}
}
//Abstract Class
abstract class AbstractMenu{
	String path="MLdata\\MovieList";
	ArrayList<Movie> MovieAl= new ArrayList<Movie>();
	BufferedReader Ser=new BufferedReader(new InputStreamReader(System.in));
	private int count=0;
	
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
	
	//movie list setter
	public void MovieListSet() throws IOException{
		//save Movie Name
		System.out.println("Enter MovieName");
		String MovieName=Ser.readLine();
		//save Movie Genre
		System.out.println("Enter MovieGenre");
		String MovieGerne=Ser.readLine();
		
		
		
		File Folder= new File(path);
		//Folder is not make Folder
		if(!Folder.exists()) {
			try {
				Folder.mkdirs();
			}catch(Exception e){
				e.printStackTrace();		
		}	
		}
		//make data.txt file
		FileOutputStream fos=new FileOutputStream(path+"\\data.txt",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		//writer Movie List
		FileWriter fw=new FileWriter(path+"\\data.txt",true);
		BufferedWriter bw=new BufferedWriter(fw); 
			
		count++;
		Movie m=new Movie(count,MovieName,MovieGerne);
		MovieAl.add(m);
		
		bw.write(+m.getMovieNumber()+","+m.getMovieName()+","+m.getMovieGenre()+"\r");
		
		bw.flush();
		bw.close();
		fw.close();
		bos.close();
		fos.close();
		
//		Map<String,String> map=new HashMap<String,String>();
//		map.put(MovieName, MovieGerne);
		
	}
	
	//Movie List Get [x]
	public void MovieListGet()throws IOException {
		clear();
		System.out.println("Pless Enter The Movie Number");
		int x=Integer.parseInt(Ser.readLine());
		System.out.println(MovieAl.get(x));
	}
	
	//Movie List Get All
	public void MovieListAll() {
		clear();
		System.out.println("MovieList");
		for(int i=0; i<MovieAl.size();i++) {
			System.out.println(MovieAl.get(i));
		}
	}
	
	public void Remove_Movie()throws IOException{
		clear();
		System.out.println("Enter Remove Number");
		int x=Integer.parseInt(Ser.readLine());
		MovieAl.remove(x);
		
		FileReader fr=new FileReader(path+"\\data.txt");
		BufferedReader br=new BufferedReader(fr);
		ArrayList<String> TemporData=new ArrayList<String>();
		String d=null;
		while((d=br.readLine())!=null) {
			TemporData.add(d);
		}
		TemporData.remove(x);
		FileWriter fw=new FileWriter(path+"\\data.txt",false);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=0; i<TemporData.size();i++) {
			bw.write(TemporData.get(i));
		}
		bw.flush();
		bw.close();
		fw.close();
	}
	public void Remove_MovieAll() {
		clear();
		MovieAl.removeAll(MovieAl);
		File file=new File(path+"\\data.txt");
		file.delete();
	}
	
}
//AdminMenu Class
class AdminMenu extends AbstractMenu{
	
}
//Reservation Class
class Reservation{
	
}
//Seat class02
class Seats{
	
}
class Movie{
	String MovieName;
	String MovieGenre;
	
	int count;
	Movie(){
		System.out.println(count+"번\s"+"영화 제목:\s"+MovieName+"장르:\s"+MovieGenre);
	}
	
	Movie(int count,String MovieName,String MovieGenre){
		this.count=count;
		this.MovieName=MovieName;
		this.MovieGenre=MovieGenre;
	
	}
	int getMovieNumber() {
		return count;
	}
	String getMovieName() {
		return MovieName;
	}
	String getMovieGenre() {
		return MovieGenre;
	}
}
