import java .util.*;
class Complex
{
	double real;
	double img;
	Complex()
	{
		real = img = 0;
	}
	Complex(double r, double i)
	{
		real = r;
		img = i;
	}
	void add(Complex c1, Complex c2)
	{
		real = c1.real + c2.real;
		img = c1.img + c2.img;
		System.out.println("Addition = ("+ real + ") + (" + img +")i");
	}
	void subtract(Complex c1, Complex c2)
	{
		real = c1.real - c2.real;
		img = c1.img - c2.img;
		System.out.println("Addition = ("+ real + ") + (" + img +")i");
	}
	void multiply(Complex c1, Complex c2)
	{
		this.real = (c1.real*c2.real - c1.img*c2.img); 
		this.img = (c1.real*c2.img + c2.real*c1.img);
		System.out.println("Multiplication = ("+this.real+") + ("+this.img+")i" );
	}
}
class ComplexDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imaginary parts of first complex number:");
		double r = sc.nextDouble();
		double i = sc.nextDouble();
		Complex c1 = new Complex(r, i);
		System.out.println("Enter real and imaginary parts of second complex number:");
		r = sc.nextDouble();
		i = sc.nextDouble();
		Complex c2 = new Complex(r, i);
		Complex c3 = new Complex();
		c3.add(c1, c2);
		c3.subtract(c1, c2);
		c3.multiply(c1, c2);
	}
}
