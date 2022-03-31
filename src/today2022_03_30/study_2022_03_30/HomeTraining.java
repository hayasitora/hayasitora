package study_2022_03_30;
import java.util.Scanner;
public class HomeTraining {
	static Scanner scan=new Scanner(System.in);
	public static int a,b,i,j,p;
	
	public static void clearconsol() {
		for(i=0; i<100;i++) {
			System.out.println();
		}
			
	}
	public static void main(String[]args) {
		HT5();	
	}
	//
		
	//HT1 report run in the switch
	public static void HT1() {

		//return to value Horizontal,vertical
	
		System.out.println("enter th Vertical ");
		a=scan.nextInt();
		System.out.println("enter th Horizontal");
		b=scan.nextInt();		
		int[][]scoer =new int [a][b];
		int c=a+1;
		int d=b+1;
		int[][]scanscoer=new int [c][d];
		int Temp_H;
		int Temp=0;
		int temp=0;
		int alltemp=0;
		int Temp_V;
		for(i=0; i<a; i++) {
			
			for(j=0; j<b; j++) {
				System.out.print("enter th\s["+i+"]line\s["+j+"]number:");
				scoer[i][j]=scan.nextInt();
			}
		}
		for(p=0; p<a;p++) {	
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					scanscoer[i][j]=scoer[i][j];
					Temp_H=scoer[i][j];
					Temp=Temp+Temp_H;
					
					
				}
				scanscoer[i][b]=Temp;
				
				Temp=0;
				
				Temp_V=scoer[i][p];
				temp=Temp_V+temp;
				
				}
			scanscoer[a][p]=temp;
			temp=0;
			alltemp=scanscoer[p][b]+alltemp;
		}scanscoer[a][b]=alltemp;
		clearconsol();
		for(i=0;i<c;i++) {
			for(j=0;j<d;j++) {
				System.out.print(scanscoer[i][j]+"\t");
			}System.out.println();
		}
		
	}
	public static void HT2() {
		
		String chair= "의자";
		String computer="컴퓨터";
		String integer="정수";
		a=0; b=0;
		System.out.println("Q1.\sChair means japanes");
		String CJP=scan.next();
		if(chair.equals(CJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(chair.equals(CJP)==false) {
			System.out.println("wrong answer. answer is 의자");
			a++;
		}
		System.out.println("Q2.\scomputer means japanes");
		String PJP=scan.next();
		if(computer.equals(PJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(computer.equals(PJP)==false) {
			System.out.println("wrong answer. answer is 컴퓨터");
			a++;
		}
		System.out.println("Q3.\sinteger means japanes");
		String IJP=scan.next();
		if(integer.equals(IJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(integer.equals(IJP)==false) {
			System.out.println("wrong answer. answer is 정수");
			a++;
		}
		System.out.println("["+a+"] question the you answer["+b+"]time");
		
	}
	public static void HT3() {	//Q4 
		String st1="television";
		String st2="mouse";
		String st3="hands";
		String st4="foot";
		int stack;
		char[] ch1=st1.toCharArray();
		char[] ch2=st2.toCharArray();
		char[] ch3=st3.toCharArray();
		char[] ch4=st4.toCharArray();
		
		int[] array=new int [ch1.length];
		for(i=0; i<ch1.length;i++) {
			array[i]=(int)(Math.random()*ch1.length);
			for(j=0; j<i;j++) {
				if(array[i]==array[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Q1.\s");
		for(i=0;i<ch1.length; i++) {
			System.out.print(ch1[array[i]]);
		}
		
		System.out.print("의 정답을 적어라.");
		
		String answer1= scan.next();
		if(st1.equals(answer1)==true) {
			System.out.println("correat answer");
		}
		else if(st1.equals(answer1)==false) {
			System.out.println("wrong answer");
		}
		
		int[] array2=new int [ch2.length];
		for(i=0; i<ch2.length;i++) {
			array2[i]=(int)(Math.random()*ch2.length);
			for(j=0; j<i;j++) {
				if(array2[i]==array2[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Q2.\s");
		for(i=0;i<ch2.length; i++) {
			System.out.print(ch2[array2[i]]);
		}
		
		System.out.print("의 정답을 적어라.");
		
		String answer2= scan.next();
		if(st2.equals(answer2)==true) {
			System.out.println("correat answer");
		}
		else if(st2.equals(answer2)==false) {
			System.out.println("wrong answer");
		}
		
		int[] array3=new int [ch3.length];
		for(i=0; i<ch3.length;i++) {
			array3[i]=(int)(Math.random()*ch3.length);
			for(j=0; j<i;j++) {
				if(array3[i]==array3[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Q3.\s");
		for(i=0;i<ch3.length; i++) {
			System.out.print(ch3[array3[i]]);
		}
		
		System.out.print("의 정답을 적어라.");
		
		String answer3= scan.next();
		if(st3.equals(answer3)==true) {
			System.out.println("correat answer");
		}
		else if(st3.equals(answer3)==false) {
			System.out.println("wrong answer");
		}
		
		int[] array4=new int [ch4.length];
		for(i=0; i<ch4.length;i++) {
			array4[i]=(int)(Math.random()*ch4.length);
			for(j=0; j<i;j++) {
				if(array4[i]==array4[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Q4.\s");
		for(i=0;i<ch4.length; i++) {
			System.out.print(ch4[array4[i]]);
		}
		
		System.out.print("의 정답을 적어라.");
		
		String answer4= scan.next();
		if(st4.equals(answer4)==true) {
			System.out.println("correat answer");
		}
		else if(st4.equals(answer4)==false) {
			System.out.println("wrong answer");
		}
	}
	public static void HT4() { //bingo
		boolean start_game=true;
		System.out.println("play bingo! 5x5");
		a=5;
		b=a;
		int playerchoicex;
		int playerchoicey;
		int count=a*b;
		int goal=0;
		int temp;
		int Rcount=count;
		String player;
		boolean[][]bingo=new boolean[a][b];
		for(i=0; i<a;i++){
			for(j=0;j<b;j++) {
				bingo[i][j]=false;
			}
		}
		
		do {
			System.out.println("bingo:"+goal);
			goal=0;
			System.out.println("last chances"+count+"/"+Rcount);
			
			System.out.println("bingo cheack enter the x coordinates0~4");
			playerchoicex=scan.nextInt();
			System.out.println("bingo cheack enter the y coordinates0~4");
			playerchoicey=scan.nextInt();
			
			bingo[playerchoicex][playerchoicey]=true;
			//x
			
			if(bingo[0][0]==true&&bingo[0][1]==true&&bingo[0][2]==true&&bingo[0][3]==true&&bingo[0][4]==true) {
				goal++;
			}
			if(bingo[1][0]==true&&bingo[1][1]==true&&bingo[1][2]==true&&bingo[1][3]==true&&bingo[1][4]==true) {
				goal++;
			}
			if(bingo[2][0]==true&&bingo[2][1]==true&&bingo[2][2]==true&&bingo[2][3]==true&&bingo[2][4]==true) {
				goal++;
			}
			if(bingo[3][0]==true&&bingo[3][1]==true&&bingo[3][2]==true&&bingo[3][3]==true&&bingo[3][4]==true) {
				goal++;
			}
			if(bingo[4][0]==true&&bingo[4][1]==true&&bingo[4][2]==true&&bingo[4][3]==true&&bingo[4][4]==true) {
				goal++;
			}
			//y
			if(bingo[0][0]==true&&bingo[1][0]==true&&bingo[2][0]==true&&bingo[3][0]==true&&bingo[4][0]==true) {
				goal++;
			}
			if(bingo[0][1]==true&&bingo[1][1]==true&&bingo[2][1]==true&&bingo[3][1]==true&&bingo[4][1]==true) {
				goal++;
			}
			if(bingo[0][2]==true&&bingo[1][2]==true&&bingo[2][2]==true&&bingo[3][2]==true&&bingo[4][2]==true) {
				goal++;
			}
			if(bingo[0][3]==true&&bingo[1][3]==true&&bingo[2][3]==true&&bingo[3][3]==true&&bingo[4][3]==true) {
				goal++;
			}
			if(bingo[0][4]==true&&bingo[1][4]==true&&bingo[2][4]==true&&bingo[3][4]==true&&bingo[4][4]==true) {
				goal++;
			}
			//cross
			if(bingo[0][0]==true&&bingo[1][1]==true&&bingo[2][2]==true&&bingo[3][3]==true&&bingo[4][4]==true) {
				goal++;
			}
			if(bingo[0][4]==true&&bingo[1][3]==true&&bingo[2][2]==true&&bingo[3][1]==true&&bingo[4][0]==true) {
				goal++;
			}
			
			Rcount--;
			if(goal>=a) {
				start_game=false;
			}
			if(Rcount==0) {
				start_game=false;
			}
			
			
			clearconsol();
		}while(start_game==true);
		System.out.println("bingo clear!");
					
	}
	public static void HT5() {
		int [] a= {22,57,11,32,91,68,70};
		int [] t=new int[a.length];
		
		for(i=0;i<7;i++) {
			int temp=a[i];
			t[i]=a[a.length-i-1];
			a[i]=temp;
			System.out.print(t[i]+",");
		}
	
		
	}
	public static void HT6() {
		int []a= {22,57,11,32,91,68,70};
		
	}
}
