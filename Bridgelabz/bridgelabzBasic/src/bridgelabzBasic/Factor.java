package bridgelabzBasic;

import java.util.*;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				if(l.contains(i))
					l.add(i);
				else
				{
					l.add(i);
					System.out.println(i);
				}
				n/=i;
			}
		}
		if(n>2)
			System.out.println(n);
		System.out.println(l);
	}

}
