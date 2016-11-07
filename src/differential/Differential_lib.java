package differential;

public class Differential_lib implements Differential_if{
	private double a,h;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		return (Math.pow(a+h,2)-Math.pow(a, 2))/h;
	}
	
	@Override
	public double getRe() {
		// TODO Auto-generated method stub
		return  Math.abs(getRx()-getDx())*100/getRx();
	}
}

