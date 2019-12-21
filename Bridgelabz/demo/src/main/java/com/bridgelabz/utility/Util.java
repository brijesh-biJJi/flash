package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Util 
{
	//static BufferedReader br;
	static Scanner sc=new Scanner(System.in);
	
	public static int inputInteger()
	{
		
		try
		{
			return sc.nextInt();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
	
	public static double inputDouble()
	{
		
		try
		{
			return sc.nextDouble();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
