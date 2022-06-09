package project1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class Mainapp {

	public static void main(String[] args) throws IOException {
		Menu menu=new Menu();
		menu.userMenu();
//		menu.deleteFile();
	}

}
//Main menu class
class Menu extends AbstractMenu{
	boolean userbool=true;
	Reservation rv=new Reservation();
	void userMenu() throws NumberFormatException, IOException {
		while(userbool==true) {
			
			clear();
			line30();
			System.out.println("UserMenu");
			line30();
			System.out.println("[1]--setReservation");
			System.out.println("[2]--showTicket");
			System.out.println("[3]--CancleTicket");
			System.out.println("[4]--Recoomend_Movie");
			System.out.println("[5]--AdminMenu");
			System.out.println("[6]--Exit");
			int input=select(6, "-->");
			
			switch(input) {
			case 1: 
				clear();
				rv.setReservation();
				delay();
				break;
			case 2: 
				clear();
				rv.showTicket();
				delay();
				break;
			case 3: 
				clear();
				rv.CancleTicket();
				delay();
				break;
			case 4:
				clear();
				recommend();
				delay();
				break;
			case 5:
				clear();
				Admin();
				userbool=false;
				break;
				
			case 6:
				clear();
				System.out.println("EXIT");
				userbool=false;
				break;
			}
		}
	}
	
}

//Reservation Class
class Reservation extends AbstractMenu{
	Timestamp ts=new Timestamp(System.currentTimeMillis());
	
	
	Seats st=new Seats();
	String setStamp() throws IOException{
		int a=ts.getYear();
		int b=ts.getMonth();
		int c=ts.getDay();
		int d=ts.getHours();
		int e=ts.getMinutes();
		int f=ts.getSeconds();
		
		String Ra=Integer.toString(a);
		String Rb=Integer.toString(b);
		String Rc=Integer.toString(c);
		String Rd=Integer.toString(d);
		String Re=Integer.toString(e);
		String Rf=Integer.toString(f);
		
		String realtime=Ra+Rb+Rc+Rd+Re+Rf;
		return realtime;
	}
	void setReservation() throws NumberFormatException, IOException {
			MovieListGetAll();
			try {
			if(canReservation==true) {
			System.out.println("select movie");
			int input=Integer.parseInt(Ser.readLine());
			st.mn=MovieAl.get(input-1).MovieName;
			clear();
			st.ReservationSeat();
		
	 		FileWriter fw=new FileWriter(path+"\\Reservation.txt",StandardCharsets.UTF_8,true);
			BufferedWriter bw=new BufferedWriter(fw);
			String result=setStamp()+"-"+st.mn+"-"+st.userA+"-"+Integer.toString(st.b);
			System.out.println("Ticket:"+result);
			bw.write(result+"\r");
			bw.flush();
			bw.close();
			fw.close();
			}
			canReservation=true;
			}catch(IOException e) {
				System.out.println("none Movie");
			}
	}
	void showTicket() throws IOException {
			try {
			FileReader fr=new FileReader(path+"\\Reservation.txt",StandardCharsets.UTF_8);
			BufferedReader br=new BufferedReader(fr);
			String str;
			line30();
			while((str=br.readLine())!=null) {
				System.out.println(str+"\r");
			}
			line30();
			br.close();
			fr.close();
			}catch(FileNotFoundException f) {
				System.out.println("none File");
			}
		}
	void CancleTicket() throws IOException {
		try {
			FileReader fr=new FileReader(path+"\\Reservation.txt",StandardCharsets.UTF_8);
			BufferedReader br=new BufferedReader(fr);
		
			showTicket();
			System.out.println("what do you want cancle tikect");
			System.out.print("code-->");
			String code=Ser.readLine();
			System.out.print("movie_Name-->");
			String MN=Ser.readLine();
			System.out.println("row-->");
			String a=Ser.readLine();
			char ro=a.charAt(0);
			System.out.println("line-->");
			int lin=Integer.parseInt(Ser.readLine());
			String player=code+"-"+MN+"-"+ro+"-"+lin;
			st.cancleSeats(MN, ro, lin);
			String str;
			String [] ae;
			
			int range=0;
			while((br.readLine())!=null) {
				range++;
			}
			int k=0;
			ae=new String[range];
			while((str=br.readLine())!=null) {
				ae[k]=str;
				k++;
			}
			br.close();
			fr.close();
			
			FileWriter fw=new FileWriter(path+"\\Reservation.txt",StandardCharsets.UTF_8);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<ae.length; i++) {
				if(player.equals(ae[k])) {
					
				}else {
					bw.write(ae[k]+"\r");
				}
			}
			bw.flush();
			bw.close();
			fw.close();
		}catch(FileNotFoundException e) {
			System.out.println("none File");
		}
	}
}

//Seat class02

class Seats extends AbstractMenu{
	int a=0;
	String mn;
	char userA;
	int b;
	char [][]show=new char[11][11];
	void RoadSeat()throws IOException {
		try {
		System.out.println("input the movie name");
		this.mn=Ser.readLine();
		FileReader fr=new FileReader(path+"\\"+mn+"seat.txt",StandardCharsets.UTF_8);
		BufferedReader br=new BufferedReader(fr);
		String Line;
		int C=1;
		while( (Line=br.readLine())!=null) {
			for(int i=0; i<10; i++) {
				show[C][i+1]=Line.charAt(i);
			}C++;
		}
		
		br.close();
		fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("none Seat");
		}
	}
	void RoadSeat2()throws IOException{
		try {
			FileReader fr=new FileReader(path+"\\"+mn+"seat.txt",StandardCharsets.UTF_8);
			BufferedReader br=new BufferedReader(fr);
			String Line;
			int C=1;
			while( (Line=br.readLine())!=null) {
				for(int i=0; i<10; i++) {
					show[C][i+1]=Line.charAt(i);
				}C++;
			}
			
			br.close();
			fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("File None");
		}
		}
	void cancleSeats(String MN,char a,int b) throws IOException {
		try {
		String str;
		FileReader fr=new FileReader(path+"\\"+MN+"seat.txt",StandardCharsets.UTF_8);
		BufferedReader br=new BufferedReader(fr);
		for(int i=1; i<show.length;i++) {
			str=br.readLine();
			
			for(int j=1; j<show.length; j++) {
				show[i][j]=str.charAt(j);
			}
		}
		br.close();
		fr.close();

		
		FileWriter fw=new FileWriter(path+"\\"+MN+"seat.txt",StandardCharsets.UTF_8,false);
		BufferedWriter bw=new BufferedWriter(fw);	
		int sel=0;
		String d=Character.toString(a);
		while(d.equals("A"+sel)) {
			sel++;
		}
		sel++;
		show[sel][b]='O';
		for(int i=0; i<show.length; i++) {
			for(int j=0; j<show.length; j++) {
				bw.write(show[i][j]);
			}bw.write("\r");
		}
		bw.flush();
		
		bw.close();
		fw.close();
		}catch(FileNotFoundException e) {
			System.out.println("none seat");
		}
				
				
	}
	void set_Seats() throws IOException{		
			FileOutputStream fos=new FileOutputStream(path+"\\"+mn+"seat.txt",false);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			FileWriter fw=new FileWriter(path+"\\"+mn+"seat.txt",false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=1; i<11;i++) {
				show[0][i]=(char)('0'+i-1);
				show[i][0]=(char)('A'+i-1);
			}
			for(int i=1; i<11; i++) {
				for(int j=1; j<11; j++) {			
					show[i][j]='O';	
					bw.write(show[i][j]);
				}bw.write("\r");
			}
			bw.flush();	
			bw.close();
			fw.close();
			bos.close();
			fos.close();	
	}
	
	void ReservationSeat() throws IOException{
		try {
			RoadSeat2();
			for(int i=1; i<11;i++) {
				show[0][i]=(char)('0'+i-1);
				show[i][0]=(char)('A'+i-1);
			}
		}catch(IOException e) {
			set_Seats();
		}
			System.out.println("where you seat in the Room");
			line40();
			showSeat();
			line40();
			FileOutputStream fos=new FileOutputStream(path+"\\"+mn+"seat.txt",false);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			FileWriter fw=new FileWriter(path+"\\"+mn+"seat.txt",StandardCharsets.UTF_8,false);
			BufferedWriter bw=new BufferedWriter(fw);
			
			char[]c=new char[10];
			for(int i=0; i<c.length; i++) {
				c[i]=(char)('A'+i);
			}
			boolean k=true;
			while(k==true) {
			
			System.out.println("select Row");
			String a=Ser.readLine();
			userA=a.charAt(0);
				if('A'<=userA&&'J'>=userA) {
					k=false;
				}else {
					System.out.println("input Capital A~J");
				}
			}
			k=true;
			while(k==true) {
			System.out.println("select Line");
			 b=Integer.parseInt(Ser.readLine());
			 if(b<10&&b>-1) {
				 k=false;
			 }
			 else {
				 System.out.println("input number 0~9");
			 }
			}
			 int row = 0;
			char L;
			for(int i=1; i<show.length; i++) {
				 L= (char) ('A'+i-1);
				if(userA==L) {
				row=i;
				break;
				}
			}
			show[row][b]='X';
			for(int i=1; i<show.length; i++) {
				for(int j=1; j<show.length; j++) {
					bw.write(show[i][j]);
				}bw.write("\r");
			}
			bw.flush();
			
			bw.close();
			fw.close();
			bos.close();
			fos.close();
		
	}
	void showSeat() throws IOException {
		RoadSeat2();
		for(int i=0; i<show.length;i++) {
			for(int j=0; j<show.length; j++) {
				System.out.print("|"+show[i][j]+"\s");
			}System.out.println("\r");
		}
	}
	
}

//Abstract Class
abstract class AbstractMenu extends Thread{
	String path="MLdata\\MovieList";
	ArrayList<Movie> MovieAl= new ArrayList<Movie>();
	BufferedReader Ser=new BufferedReader(new InputStreamReader(System.in));
	boolean canReservation=true;
	private int count=1;
	private final String password="MovieArea";
	
	void RoadMovie() throws IOException{
		try {
			FileReader fr=new FileReader(path+"\\data.txt",StandardCharsets.UTF_8);
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
			canReservation=false;
		}
		
	}
	void resetMovie() {
		MovieAl.removeAll(MovieAl);
	}
	//get value method
	public int select(int userchoice,String pup) {
		BufferedReader Ser=new BufferedReader(new InputStreamReader(System.in));
		int input=0;
		do {
			System.out.print(pup);
			try {
				input=Integer.parseInt(Ser.readLine());
				if(input<1||input>userchoice) {
					System.out.println("bounds");
				}
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
	public void line40() {
		for(int i=0; i<40; i++) {
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
		FileWriter fw=new FileWriter(path+"\\data.txt",StandardCharsets.UTF_8,true);
		BufferedWriter bw=new BufferedWriter(fw); 
		
		FileReader fr=new FileReader(path+"\\data.txt");
		BufferedReader br= new BufferedReader(fr);

		while(br.readLine()!=null) {
			count++;
		}
		br.close();
		fr.close();
		
		Movie m=new Movie(count,MovieName,MovieGerne);
		MovieAl.add(m);
		
		bw.write(+m.getMovieNumber()+","+m.getMovieName()+","+m.getMovieGenre()+"\r");
		
		bw.flush();
		
		bw.close();
		fw.close();
		bos.close();
		fos.close();
		count=1;
		
	}
	
	//Movie List Get [x]
	public void MovieListGet()throws IOException {
			resetMovie();
			RoadMovie();
			try {
			System.out.println("Pless Enter The Movie Number");
			int x=Integer.parseInt(Ser.readLine());
			x=x-1;
			Movie a=new Movie(MovieAl.get(x).count,MovieAl.get(x).MovieName,MovieAl.get(x).MovieGenre);
			a.getname();
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("none movie");
			}
	}
	
	//Movie List Get All
	public void MovieListGetAll() throws IOException {
		try {
			resetMovie();
			RoadMovie();
			if(canReservation==true) {
			System.out.println("MovieList");
			line30();
			for(int i=0; i<MovieAl.size();i++) {
			MovieAl.get(i).getname();
			}
			line30();
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("None Movie");
			
		}
	}
	//Movie remove
	@SuppressWarnings("unlikely-arg-type")
	public void Remove_Movie()throws IOException{
			MovieListGetAll();
			System.out.println("Enter Remove Number");
			int x=Integer.parseInt(Ser.readLine());
			String mona=MovieAl.get(x-1).MovieName;
			Seats seat=new Seats();
			seat.mn=mona;
//			seat.set_Seats();
			File f=new File(path+"\\"+mona+"seat.txt");
			f.delete();
			try {
			FileReader ar=new FileReader(path+"\\Reservation.txt",StandardCharsets.UTF_8);
			BufferedReader aor=new BufferedReader(ar);
			String ae;
			ArrayList<String> as=new ArrayList<String>();
			while((ae=aor.readLine())!=null) {
				String [] es=ae.split("-");
				if(es[0].equals(x-1)) {
					
				}else{
					as.add(ae);
				}
			}
			aor.close();
			ar.close();
			

			FileWriter aw=new FileWriter(path+"\\Reservation.txt",StandardCharsets.UTF_8,false);
			BufferedWriter aow=new BufferedWriter(aw);
			
			for(int i=0; i<as.size(); i++) {
				aow.write(as.get(i));
			}
			
			
			aow.flush();
			aow.close();
			aw.close();
			}catch(IOException e) {
				System.out.println("This movie None Ticket");
			}
			MovieAl.remove(x-1);
			
			FileReader fr=new FileReader(path+"\\data.txt",StandardCharsets.UTF_8);
			BufferedReader br=new BufferedReader(fr);
			ArrayList<String> TemporData=new ArrayList<String>();
			String d=null;
			String [] a=new String [3];
			count=1;
			while((d=br.readLine())!=null) {
				a=d.split(",");
				if(mona==a[1]) {
				}else {
					TemporData.add(count+","+a[1]+","+a[2]);
					count++;
				}
			}
			TemporData.remove(x-1);
			br.close();
			fr.close();
			FileWriter fw=new FileWriter(path+"\\data.txt",StandardCharsets.UTF_8,false);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0; i<TemporData.size();i++) {
				bw.write(TemporData.get(i)+"\r");
				
			}
			bw.flush();
			bw.close();
			fw.close();
		
	}
	public void Remove_MovieAll() throws IOException {
	
		try {
			resetMovie();
			deleteFile();
		}catch(Exception e) {
			System.out.println("File none");
		}
	}
		
	public void deleteFile() throws FileNotFoundException {
		File Fr=new File(path+"\\");
		File[] FileList=Fr.listFiles();
		if(FileList.length>0) {
			for(int i=0; i<FileList.length; i++) {
				File a=new File(FileList[i].toString());
				a.delete();
			}
		}else {
			System.out.println("File is none");
		}
		
	}
	public void recommend() throws IOException {
		resetMovie();
		RoadMovie();
		line30();
		System.out.println("Genre Recommend");
		line30();
		System.out.print(" 액션");
		System.out.print(" 코미디");
		System.out.print(" 공포");
		System.out.println(" SF");
		System.out.print(" 스릴러");
		System.out.print(" 판타지");
		System.out.print(" 로맨스");
		System.out.println(" 음악");
		System.out.print(" 뮤지컬");
		System.out.print(" 범죄");
		System.out.println(" 스포츠");
		
		line30();
		System.out.println("what are you want genre");
		String genre=Ser.readLine();
		int range=0;
//		try {
			for(int i=0; i<MovieAl.size(); i++) {
				if(genre.equals(MovieAl.get(i).MovieGenre)) {
					range++;
				}
			}
			int [] Random = new int [range];
			range=0;
			for(int i=0; i<MovieAl.size(); i++) {
				if(genre.equals(MovieAl.get(i).getMovieGenre())){
					Random[range]=i;
					range++;
				}
			}
			
			
			int ran=((int) Math.random()*range);
			ran=Random[ran];
			System.out.println(ran);
			MovieAl.get(ran).getname();
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Movie is nonthing");
//		}
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
			Menu m=new Menu();
			m.userMenu();
		}
	}
}
//AdminMenu Class
class AdminMenu extends AbstractMenu{

	//Admin menu run
	void AdminMenuRun() throws IOException{
		boolean Runner=true;
		while(Runner==true){
			
		Menu menu=new Menu();
		
		clear();
		System.out.println("Admin Menu");
		line30();
		
		System.out.println("[1]--> Set Movie");
		System.out.println("[2]--> Get Movie");
		System.out.println("[3]--> Movie List All");
		System.out.println("[4]--> Delect Movie");
		System.out.println("[5]--> Delect Movie List");
		System.out.println("[6]--> Back UserMenu");
		System.out.println("[7]--> EXIT");
		int input=select(7, "-->");
		switch(input) {
		case 1: 
			clear();
			MovieListSet();
			delay();
			break;
		case 2:
			clear();
			MovieListGet();
			delay();
			break;
		case 3:
			clear();
			MovieListGetAll();
			delay();
			break;
		case 4:
			clear();
			Remove_Movie();
			delay();
			break;
		case 5:
			clear();
			Remove_MovieAll();
			delay();
			break;
		case 6:
			clear();
			Runner=false;
			menu.userMenu();
			break;
		case 7:
			clear();
			Runner=false;
			System.out.println("EXIT");
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
