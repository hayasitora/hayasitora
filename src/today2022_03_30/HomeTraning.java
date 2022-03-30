package today2022_03_30;
import java.util.Scanner;
public class HomeTraning {
static Scanner scan=new Scanner(System.in);
public static int a,b,i,j,p;
	public static void clearconsol() {
		for(i=0; i<100;i++) {
			System.out.println();
		}
			
	}
	public static void main(String[]args) {
		HT2();	
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
		int Temp_H;
		int Temp=0;
		int temp=0;
		int Temp_V;
		for(p=0; p<a+1;p++) {	
			for(i=0; i<a; i++) {
				for(j=0; j<b; j++) {
					System.out.print("enter th\s["+i+"]line\s["+j+"]number");
					scoer[i][j]=scan.nextInt();
					Temp_H=scoer[i][j];
					Temp=Temp+Temp_H;
				}
				scoer[i]=new int[b+1];
				scoer[i][b+1]=Temp;
				Temp=0;
				Temp_V=scoer[i][p];
				temp=Temp_V+temp;
				}
			scoer=new int[a+1][];
			scoer[a+1][p]=temp;
			temp=0;
		}
		clearconsol();
		for(i=0;i<a+1;i++) {
			for(j=0;j<b+1;j++) {
				System.out.print(scoer[i][j]+"\t");
			}System.out.println();
		}
		
	}
	public static void HT2() {
		
		String chair= "椅子";
		String computer="パソコン";
		String integer="整数";
		a=0; b=0;
		System.out.println("Q1.\sChair means japanes");
		String CJP=scan.next();
		if(chair.equals(CJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(chair.equals(CJP)==false) {
			System.out.println("wrong answer. answer is 椅子");
			a++;
		}
		System.out.println("Q2.\scomputer means japanes");
		String PJP=scan.next();
		if(computer.equals(PJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(computer.equals(PJP)==false) {
			System.out.println("wrong answer. answer is パソコン");
			a++;
		}
		System.out.println("Q3.\sinteger means japanes");
		String IJP=scan.next();
		if(integer.equals(IJP)==true) {
			System.out.println("correct answer");
			a++; b++;
		}
		else if(integer.equals(IJP)==false) {
			System.out.println("wrong answer. answer is 整数");
			a++;
		}
		System.out.println("["+a+"] question the you answer["+b+"]time");
		
	}
	public static void HT3() {
		//Q4 
		String st1="television";
		String st2="mouse";
		String st3="hands";
		String st4="foot";
		
		char[] ch1=st1.toCharArray();
		char[] ch2=st2.toCharArray();
		char[] ch3=st3.toCharArray();
		char[] ch4=st4.toCharArray();
		
		System.out.println("Q1.");
		for(i=0; i<ch1.length;i++) {
			
			ch1[i]=(char)(Math.random()*ch1.length+1);
			for(j=0;j<st1.length();j++) {
				if(ch1[i]==ch1[j]) {
					i--;
					break;
				}
				
			}System.out.println(ch1[i]);	
		}
		System.out.print("의 정답을 입력하세요.");
		String answer1= scan.next();
		if(st1.equals(answer1)==true) {
			System.out.println("correat answer1");
		}
		else if(st1.equals(answer1)==false) {
			System.out.println("wrong answer1");
		}
	}
}
