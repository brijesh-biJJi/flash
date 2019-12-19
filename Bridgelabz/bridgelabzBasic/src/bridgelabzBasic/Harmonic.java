package bridgelabzBasic;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int n=sc.nextInt();
		double h=harmonic(n);
		System.out.println("Nth Term "+h);
	}

	private static double harmonic(int n)
	{
		double h=0.0;
		for(int i=1;i<=n;i++)
		{
			h=1.0/i;
			System.out.println(h);
		}
		return h;
	}

}
