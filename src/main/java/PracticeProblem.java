import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		Scanner scanner=new Scanner(System.in);
		System.out.print( "");
		double a=scanner.nextDouble();
		System.out.println(((int)a)+3);


		//Write question 1 code here
	}

	public static void q2() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("");
		String a=scanner.nextLine();
		
		double b=Double.parseDouble(a+"4");
		System.out.println(b+2);
		//Write question 2 code here
	}

	public static void q3() {
		Scanner scanner=new Scanner(System.in);
		System.out.print("");
		double b=scanner.nextDouble();
		System.out.println(b*b*3.14);

		//Write question 3 code here
	}

	public static void q4() {
		Scanner scanner=new Scanner(System.in);
        System.out.print("");
        double a=scanner.nextDouble();
		double b =a*12;
		double c=Math.floor(b);
		System.out.println(c);



		//Write question 4 code here
	}

}
