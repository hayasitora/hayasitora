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
		a.RoadMovie();
		a.AdminMenuRun();
//		a.MovieListSet();
//		a.Remove_MovieAll();
//		a.Remove_Movie();
//		a.MovieListGet();
//		a.MovieListGetAll();
	}

}
//Main menu class
class Menu extends AbstractMenu{
	
	void userMenu() {
		int input=select(5, "-->");
		switch(input) {
		case 1: 
			Reservation
			break;
		case 2: 
			showReservation
			break;
		case 3: 
			cancelReservation
			break;
		case 4:
			recommendMovie
			break;
		case 5:
			Admin();
			break;
		}
	}
	
}

//Reservation Class
class Reservation{
	
}

//Seat class02
class Seats{
	void set_Seats(){
		int [][]row=new int [10][10];
	}
}

//Abstract Class
abstract class AbstractMenu extends Thread{
	String path="MLdata\\MovieList";
	ArrayList<Movie> MovieAl= new ArrayList<Movie>();
	BufferedReader Ser=new BufferedReader(new InputStreamReader(System.in));
	private int count=1;
	private final String password="MovieArea";
	
	void RoadMovie() throws IOException{
		try {
			FileReader fr=new FileReader(path+"\\data.txt");
			BufferedReader br=new BufferedReader(fr);
			String [] a=new String [3];
			String s=null;
			int is=0;
			while((s=br.readLine())!=null) {
			a=s.split(",");
			is=Integer.parseInt(a[0]);
			Movie sample_movie=new Movie(is,a[1],a[2]);
			MovieAl.add(sample_movie);
			
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println("Data is notthing");
		}
		
	}
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
				System.out.println("plese input type-Integer-");
			}
		}while(1>input||input>userchoice);
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
	
	//movie list setter fix 필요
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
		int s=0;
		for(int i=0; i<MovieAl.size();i++) {
			if(i!=(MovieAl.get(i).count)) {
				s=i+1;
				count=s;
				break;
			}
		}
		
//		FileReader fr=new FileReader(path+"\\data.txt");
//		BufferedReader br= new BufferedReader(fr);
//
//		while(br.readLine()!=null) {
//			count++;
//		}
//		br.close();
//		fr.close();
		
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
		try {
			System.out.println("Pless Enter The Movie Number");
			int x=Integer.parseInt(Ser.readLine());
			x=x-1;
			Movie a=new Movie(MovieAl.get(x).count,MovieAl.get(x).MovieName,MovieAl.get(x).MovieGenre);
			a.getname();
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("None movie");
		}
	}
	
	//Movie List Get All
	public void MovieListGetAll() {
		clear();
		try {
			System.out.println("MovieList");
			line30();
			for(int i=0; i<MovieAl.size();i++) {
			MovieAl.get(i).getname();
			}
			line30();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("None Movie");
		}
	}
	//Movie remove
	public void Remove_Movie()throws IOException{
		clear();
		try {
			MovieListGetAll();
			System.out.println("Enter Remove Number");
			int x=Integer.parseInt(Ser.readLine());
			MovieAl.remove(x-1);
			
			FileReader fr=new FileReader(path+"\\data.txt");
			BufferedReader br=new BufferedReader(fr);
			ArrayList<String> TemporData=new ArrayList<String>();
			String d=null;
			while((d=br.readLine())!=null) {
				TemporData.add(d);
			}
			//이렇게 지우면 랭크 겹침 for문으로 겹친거 없는숫자를 입력해서 넣어야함
			
			TemporData.remove(x-1);
			br.close();
			fr.close();
			FileWriter fw=new FileWriter(path+"\\data.txt",false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<TemporData.size();i++) {
				bw.write(TemporData.get(i)+"\r");
				
			}
			bw.flush();
			bw.close();
			fw.close();
		}catch(Exception e) {
			System.out.println("Delect Movie is none");
		}
	}
	public void Remove_MovieAll() throws IOException {
		clear();
		try {
			MovieAl.removeAll(MovieAl);
			
			FileReader fr=new FileReader(path+"\\data.txt");
			BufferedReader br=new BufferedReader(fr);
			int e=0;
			while(br.readLine()!=null) {
				e++;
			}	
			br.close();
			fr.close();
			FileWriter fw=new FileWriter(path+"\\data.txt",false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<e;i++) {
				bw.write("");
			}
			bw.flush();
			bw.close();
			fw.close();
			System.out.println("data all clear");
	//		if(DF.exists()) {
	//			DF.delete();
	//			if(DF.exists()) {
	//				System.gc();
	//				DF.delete();
	//				if(DF.exists()) {
	//					System.gc();
	//					System.runFinalization();
	//					DF.delete();
	//					if(DF.exists()) {
	//						System.out.println("delete to failed"); 
	//					}
	//					else {
	//						System.out.println("deleted File");
	//					}
	//				}
	//			}
	//		}
		}catch(Exception e) {
			System.out.println("Delect Movie is none");
		}
	}
		
	public void recommend() {
		clear();
		line30();
		System.out.println("Genre Recommend");
		System.out.println("what are you want genre");
		line30();
		System.out.println("1--> 액션");
		System.out.println("2--> 코미디");
		System.out.println("3--> 공포");
		System.out.println("4--> SF");
		System.out.println("5--> 스릴러");
		System.out.println("6--> 판타지");
		System.out.println("7--> 로맨스");
		System.out.println("8--> 음악");
		System.out.println("9--> 뮤지컬");
		System.out.println("10--> 범죄");
		System.out.println("11--> 스포츠");
		line30();
		int input=select(11, "-->");
		String genre=null;
		int range=0;
		int [] Random = null;
		switch(input) {
			case 1:
				genre="액션";
				break;
			case 2:
				genre="코미디";
				break;
			case 3:
				genre="공포";
				break;
			case 4:
				genre="SF";
				break;
			case 5:
				genre="스릴러";
				break;
			case 6:
				genre="판타지";
				break;
			case 7:
				genre="로맨스";
				break;
			case 8:
				genre="음악";
				break;
			case 9:
				genre="뮤지컬";
				break;
			case 10:
				genre="범죄";
				break;
			case 11:
				genre="스포츠";
				break;
		}
		try {
			for(int i=0; i<MovieAl.size(); i++) {
				if(genre.equals(MovieAl.get(i).MovieGenre)) {
					range+=1;
					Random=new int [range];
					Random[range]=i;
				}
			}
			int ran=((int) Math.random()*range)+1;
			ran=Random[ran];
			MovieAl.get(ran).getname();
		}catch(Exception e){
			System.out.println("ERRER");
		}
	}
	
	public void delay() {
		line30();
		System.out.println("close be 5 second ");
		line30();
		for(int i=0; i<5; i++) {
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void Admin() throws IOException {
		System.out.println("plese put in password");
		System.out.print("-->");
		String PW=Ser.readLine();
		if(PW.equals(password)) {
			AdminMenu am=new AdminMenu();
			am.AdminMenuRun();
		}
		else {
			System.out.println("password is worng");
		}
	}
}
//AdminMenu Class
class AdminMenu extends AbstractMenu{

	//Admin menu run
	void AdminMenuRun() throws IOException{
		boolean Runner=true;
		while(Runner==true){
			
		
		clear();
		System.out.println("Admin Menu");
		line30();
		
		System.out.println("1--> Set Movie");
		System.out.println("2--> Get Movie");
		System.out.println("3--> Movie List All");
		System.out.println("4--> Delect Movie");
		System.out.println("5--> Delect Movie List");
		System.out.println("6--> Back UserMenu");
		int input=select(6, "-->");
		switch(input) {
		case 1: 
			MovieListSet();
			delay();
			break;
		case 2:
			MovieListGet();
			delay();
			break;
		case 3:
			MovieListGetAll();
			delay();
			break;
		case 4:
			Remove_Movie();
			delay();
			break;
		case 5:
			Remove_MovieAll();
			delay();
			break;
		case 6:
			//user menu();
			Runner=false;
			break;
		}
		}
	}
	
}

class Movie{
	String MovieName;
	String MovieGenre;
	
	int count;
	
	Movie(int count,String MovieName,String MovieGenre){
		this.count=count;
		this.MovieName=MovieName;
		this.MovieGenre=MovieGenre;
	
	}
	void getname(){
		System.out.println(count+"번\s"+"제목:"+MovieName+"\s 장르:"+MovieGenre);
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
