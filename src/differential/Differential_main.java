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
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
	
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
	
		System.out.println("f(x)=x^2��x="+a+"�ɂ�����������Ό덷��"+dlib.getRe());
	}
}
//h =0.000000001 8.274037099909037E-6
//h =0.00000001	6.07747097092215E-7
//h =0.0000001	5.054390328496083E-6
//���������āAh =0.00000001�̂Ƃ��ɑ��Ό덷�͍ł��������Ȃ�B
