package mypkg;

public class MyCalc {
	int sum(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		System.out.println("Sum is"+calc.sum(20, 10));	

	}
}
