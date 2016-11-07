package differential;
import java.util.Scanner;
public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = ");
		double a = Double.parseDouble(scan.next());
		
		System.out.print("h = ");
		double h = Double.parseDouble(scan.next());
	
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
	
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+dlib.getDx());
	
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ª‘Š‘ÎŒë·‚Í"+dlib.getRe());
	}
}
//h =0.000000001 8.274037099909037E-6
//h =0.00000001	6.07747097092215E-7
//h =0.0000001	5.054390328496083E-6
//‚µ‚½‚ª‚Á‚ÄAh =0.00000001‚Ì‚Æ‚«‚É‘Š‘ÎŒë·‚ÍÅ‚à¬‚³‚­‚È‚éB
