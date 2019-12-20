package bridgelabzFunctional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Utility 
{
	PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
	BufferedReader br;
	Scanner sc=new Scanner(System.in);
	public Utility()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	public int inputInteger()
	{
		
		try
		{
			return Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException | IOException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public double inputDouble()
	{
		try
		{
			return Double.parseDouble(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		return 0.0;
	}
	
	public String inputWord()
	{
		try
		{
			return br.readLine();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		return "";
	}
	
	public int[] getRandomIntArray(int num)
	{
		Random rd=new Random();
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
			arr[i]=rd.nextInt(100);
		return arr;
	}
	
	public int[] getIntegerArray(int n)
	{
		int[] arr=new int[n];
		System.out.println("Enter the Value");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		return arr;
	}
	
	public void displayIntegerArray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
	public int[][] get2DIntegerArray()
	{
		int r,c;
		System.out.println("Enter the Row And Column");
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] ar=new int[r][c];
		
		System.out.println("Enter the Value for Row and Col");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				ar[i][j]=sc.nextInt();
		return ar;
	}
	
	public void display2DIntegerArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				pw.print(arr[i][j]+" ");
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}
	
	
	
	
	
}
