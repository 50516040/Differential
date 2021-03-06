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
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
	
		System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
	
		System.out.println("f(x)=x^2のx="+a+"における微分相対誤差は"+dlib.getRe());
	}
}
//h =0.000000001 8.274037099909037E-6
//h =0.00000001	6.07747097092215E-7
//h =0.0000001	5.054390328496083E-6
//したがって、h =0.00000001のときに相対誤差は最も小さくなる。
