package today2022_04_05;
import java.util.Scanner;
public class method_homework {
	static Scanner scan =new Scanner(System.in);
public static int[] a1= {1,2,3};
public static int[] a2= {4,5,6};

	public static void main(String[]args) {
		//sum(a1);
		//sum(a2);
		//Multisum();
		//calculator();
		//random();
		//Three();
		//pow();
		//For();
		//Q5();
		//Q6();
		//Q7();
		//Q8();
		//answer();
		//Juniorreshman();
		//terminated();
		//movie();
	}
	//15~33 system
	public static int readchoice(String pop,int userchoice) {
	 int input;
	 	do {
	 		System.out.println(pop);
	 		try {
	 			input=Integer.parseInt(scan.next());
	 		}catch(Exception e) {
	 			input = -1;
	 			System.out.println("please input integer");
	 		}
	 	}while(input <1|| input>userchoice);
		return input;
	}
	public static void clearC() {
		for(int i=0; i<100; i++) {
			System.out.println();
		}
	}
	public static void lineprint(int a) {
		for(int i=0; i<a; i++) {
			System.out.print("-");
		}System.out.println();
	}
	
	public static void sum(int sum[]) {
		int temp=0;
		
		for(int i=0; i<sum.length; i++) {
			temp=sum[i]+temp;
		}
		System.out.println(temp);
	}	
	public static void Multisum() {
		int a=2;
		int b=4;
		int[][] multi=new int [a][b];
		int[][] clone=new int [a][b];
		int[][] sumPrint=new int [a][b];
		int[][] multiPrint=new int [a][b];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				multi[i][j]=((int)(Math.random()*16)+1);
				clone[i][j]=((int)(Math.random()*16)+1);
			}
		}
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				sumPrint[i][j]=multi[i][j]+clone[i][j];
				multiPrint[i][j]=multi[i][j]*clone[i][j];
				
			}
		}System.out.println("arr 1");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(multi[i][j]+"\t");
			}System.out.println();
		}lineprint(30);
		System.out.println("arr 2");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(clone[i][j]+"\t");
			}System.out.println();
		}lineprint(30);
		System.out.println("sum arr");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(sumPrint[i][j]+"\t");
			}System.out.println();
		}lineprint(30);
		System.out.println("multiplication table arr");
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(multiPrint[i][j]+"\t");
			}System.out.println();
		}lineprint(30);
	}
	
	//93~132 don't use method array 
	public static void UseSum() {
	int temp=0;
	int input=0;
	boolean UseSumLuncher=true;
	do {
		lineprint(30);
		System.out.println("you want calculator use arr enter number 0");
		System.out.println("or just print sum enter number 1");
		lineprint(30);
		System.out.println("-->");
		input=scan.nextInt();
		if(input==0) {
			System.out.println("enter arr size:");
			int Ar1=scan.nextInt();
			int[] a1=new int[Ar1];
			for(int i=0; i<Ar1; i++) {
				System.out.println("enter the arr value");
				a1[i]=scan.nextInt();
				temp=a1[i]+temp;
			}System.out.println("this value is["+temp+"]");
			UseSumLuncher=false;
		}
		if(input==1) {
			System.out.println("how much input number in the calculator ");
			int a2=scan.nextInt();
			for(int i=0; i<a2; i++) {
				System.out.println("enter the number");
				int Arrkey=scan.nextInt();
				temp=Arrkey+temp;
			}
			System.out.println("this value is["+temp+"]");
			UseSumLuncher=false;
		}
		else {
			System.out.println("please enter the number[ 0 or 1 ]");
		}
	}while(UseSumLuncher==true);
	
	}
	public static void UseMulti() {
		int temp=0;
		int input=0;
		boolean UseSumLuncher=true;
		do {
			lineprint(30);
			System.out.println("you want calculator use arr enter number 0");
			System.out.println("or just print multipl enter number 1");
			lineprint(30);
			System.out.println("-->");
			input=scan.nextInt();
			if(input==0) {
				temp=1;
				System.out.println("enter arr size:");
				int Ar1=scan.nextInt();
				int[] a1=new int[Ar1];
				for(int i=0; i<Ar1; i++) {
					System.out.println("enter the arr value");
					a1[i]=scan.nextInt();
					temp=a1[i]*temp;
				}System.out.println("this value is["+temp+"]");
				UseSumLuncher=false;
			}
			if(input==1) {
				temp=1;
				System.out.println("how much input number in the calculator ");
				int a2=scan.nextInt();
				for(int i=0; i<a2; i++) {
					System.out.println("enter the number");
					int Arrkey=scan.nextInt();
					temp=Arrkey*temp;
				}
				System.out.println("this value is["+temp+"]");
				UseSumLuncher=false;
			}
			else {
				System.out.println("please enter the number[ 0 or 1 ]");
			}
		}while(UseSumLuncher==true);
		
	}
	
	//use method array 
	public static void CalSum(int[] Cals1) {
		int temp=0;
		for(int i=0; i<Cals1.length; i++) {
			temp=Cals1[i]+temp;
		}
		
		System.out.println("sum value ["+temp+"]");
		lineprint(30);
		System.out.println("next [1]");
		int input =readchoice("-->", 1);
		
		
	}
	public static void Calmulti(int[] Calm1) {
		int temp=1;
		for(int i=0; i<Calm1.length; i++) {
			temp=Calm1[i]*temp;
		}
		System.out.println("multiplication value["+temp+"]");
		lineprint(30);
		System.out.println("next [1]");
		int input =readchoice("-->", 1);
	}
	public static void calculator() {
		boolean Crunning=true;
		int input = 0;
		do {
			clearC();
			lineprint(50);
			System.out.println("this calculator is only use sum or multipl");
			System.out.println("choice to you want a function ");
			lineprint(50);
			System.out.println("sum [1]");
			System.out.println("multipl [2]");
			System.out.println("Exit [3]");
			input=readchoice("-->", 3);
			
			if(input==1) {
				clearC();
				System.out.println("enter array size");
				int a=scan.nextInt();
				int[] Cals=new int [a];
				for(int i=0; i<a; i++) {
					System.out.print("enter sum array["+i+"] value");
					Cals[i]=scan.nextInt();
				}
				CalSum(Cals);
			}
			else if (input==2) {
				clearC();
				System.out.println("enter array size");
				int a=scan.nextInt();
				int[] Calm=new int [a];
				for(int i=0; i<a; i++) {
					System.out.print("enter sum array["+i+"] value");
					Calm[i]=scan.nextInt();
				}
				Calmulti(Calm);
			}
			else if (input==3) {
				Crunning=false;
			}
			
			lineprint(30);
		}while(Crunning==true);
		System.out.println("Exit calculator");
		lineprint(30);
	}

	//random method
	public static void random() {
	
		int[] rando=new int [3];
		rand(rando);
	}
	public static void rand(int[] rando) {
		int[] ran=new int[rando.length];
		for(int i=0; i<rando.length; i++) {
			ran[i]=((int)(Math.random()*9)+1);
			for(int j=0; j<i; j++) {
				if(ran[i]==ran[j]) 
				{
					i--;
				}
			}
		}
		for(int i=0; i<rando.length; i++) {
			System.out.println(ran[i]);
		}
		

	}

	//method Question1
	public static void Three() {
		int i=5,j=2,k;
		k=sub(i,j);
		System.out.println("k="+k+"i"+""+"j");
		
	}
	public static int sub(int i,int j) {
		return i-j;
	}

	//method Question2
	public static void pow() {
		int result;
		result=pow(3);
		System.out.println("3x3="+result);
	}
	public static int pow(int po) {
		int c;
		c=po*po;
		return c;
	}

	//method Question3
	public static void age() {
		int age=0;
		age=setAge(8);
		System.out.println("age="+age);
	}
	public static int setAge(int a) {
		return a+20;
	}

	//method Question3
	public static void For() {
		int [] star=new int [10];
		F(star);
		
		for(int i=0; i<10; i++) {
			star[i]=i+1;
		}
		F(star);
		
		for(int i=0; i<10; i++) {
			star[i]=star[i]+1;
		}
		F(star);
	}
	public static void F(int[] a) {
		lineprint(30);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	
	//method Question4 
	public static void multi() {
		int i=6,j=9;
		int result=mul(i,j);
		System.out.println(result);
	}
	public static int mul(int j,int i) {
		int mul= j*i;
		return mul;
	}

	//method Question5
	public static void Q5() {
		float result= add(3.14f,3.14f);
	}
	public static float add(float a, float b) {
		float result=a+b;
		return result;
	}

	//method Question6
	public static void Q6() {
		int[] array =new int [3];
		for(int i=0; i<3; i++) {
			array[i]=i+1;
		}
		changeArray(array);
		
	}
	public static void changeArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]+2;
		}
		printArray(arr);
	}
	public static void printArray(int []ar) {

		for(int i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

	//method Question7
	public static void Q7() {
		String student[]= {"박진수","장원우","강한솔","최진욱"};
		
		SP(student);
		
		SPJ(student,"조장");
		SPJ(student,"짱");
	}
	public static void SP(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void SPJ(String[]a, String b) {
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+"\s"+b);
		}
	}
	
	//method Question8
	public static void Q8() {
		String[] fruit= {"banana","orange","peach","starwberry","cherry"};
		
		String storeName=new String("싱싱과일가게");
		System.out.println(storeName+"에서 가장 이름이 긴 과일은:"+longword(fruit));
	}
	public static String  longword(String[] a) {
		String name=null;
		int line=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i].length()>line) {
				line=a[i].length();
				name=a[i];
			}
		}
		return name;
	}
	
	//method Question9
	public static void answer() {	
		String base="*,#,@";
		int a=3;
		AWprint(a,base);
		
	}
	public static void AWprint(int a,String b) {
		char[] spel=new char [a];
		
		for(int i=0; i<a; i++) {
			spel[i]=b.charAt(i);
		}
		System.out.println("enter the special String(*,#,@)");
		String send=scan.next();
		char[] getstr=send.toCharArray();
		System.out.println("print String:");
		for(int i=0; i<getstr.length; i++) {
			for(int j=0; j<a; j++) {
				if(getstr[i]==spel[j]) {
					System.out.print("%c".formatted(spel[j]));
				}
			}
		}
	}
	
	//training 1
	public static void  Juniorreshman() {
		System.out.println("we a told. who is best top in category this time we a sort out this");
		System.out.println("how much in class to student");
		int student=scan.nextInt();
		studentP(student);
	}
	public static void studentP(int k) {
		int b=3;
		int temp=0;
		int Htemp;
		int Wtemp;
		int Stemp;
		int Hcount=0;
		int Wcount=0;
		int Scount=0;
		int[][] student=new int [k][b];
		String[] name=new String[k];
		for(int i=0; i<k; i++) {
			clearC();
			System.out.println(i);
			System.out.println("enter name");
			name[i]=scan.next();
			for(int j=0; j<b; j++) {
				if(j==0) {
					System.out.println("enter height");
					student[i][j]=scan.nextInt();
				}
				else if(j==1)
				{
					System.out.println("enter weight");	
					student[i][j]=scan.nextInt();
					
				}
				else if(j==2) 
				{
					System.out.println("enter shoes size");			
					student[i][j]=scan.nextInt();
				}
			}
		}
		
		for(int i=0; i<b; i++) {
			for(int j=0; j<k-1;j++) {
				if(student[j][i]>student[j+1][i]) {
					temp=student[j][i];
					student[j][i]=student[j+1][i];
					student[j+1][i]=temp;
					if(i==0) {
						Hcount++;
					}
					else if(i==1) {
						Wcount++;
					}
					else if(i==2) {
						Scount++;
					}
				}
			}temp=0;
		}
		System.out.println("Height top is ["+name[Hcount]+"] :"+student[k][0]+"KG");
		System.out.println("weight top is ["+name[Wcount]+"] :"+student[k][1]+"CM");
		System.out.println("shose size top is ["+name[Scount]+"] :"+student[k][2]+"MM");
		
	}

	//training 2
	public static void terminated() {
		float pai=3.14f;
		float r=rnum();
		float h=hnum();
		float v=((pai*r)*h);
		System.out.println(v);
	}
	public static int rnum() {
		System.out.println("enter r");
		int a=scan.nextInt();
		int r=a*a;
		return r;
	}
	public static int hnum() {
		System.out.println("enter h");
		int h=scan.nextInt();
		return h;
	}
	
	//movie
	public static void movie() {
		System.out.println("can you buy seat in the cinema");
		boolean run=true;
		int a=10;
		int[] seat=new int [a];
		for(int i=0; i<a; i++) {
			seat[i]=0;
		}
		Mrun(a,seat,run);
	}
	public static void Mrun(int a,int [] seat,boolean run) {
		do {
			System.out.println("can you buy seat here");
			System.out.println();
			for(int i=0; i<a; i++) {
				System.out.print(i+":"+seat[i]+"\t");
			}
			System.out.println("where you buy?");
			System.out.println("exit -1");
			int user=scan.nextInt();
			seat[user]=1;
			if(user==-1) {
				run=false;
			}
		}while(run==true);
	}

}
