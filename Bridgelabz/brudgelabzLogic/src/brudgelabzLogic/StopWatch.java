package brudgelabzLogic;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long time;
		char finish=' ';
		boolean started=true;
		long start=System.currentTimeMillis();
		do
		{
			if(started)
			{
				System.out.println("Press N to stop");
				finish=sc.next().charAt(0);
				if(finish=='n')
				{
					long now=System.currentTimeMillis();
					time=now-start;
					System.out.println("Time : "+(time/1000)+" sec");
					started=false;
				}
			}
			else
			{
				System.out.println("Press Y to start");
				finish=sc.next().charAt(0);
				if(finish=='y')
				{
					start=System.currentTimeMillis();
					started=true;
					finish='c';
					continue;
				}
				
			}
			System.out.println("Press c to continue Or s to discontinue.....");
			finish=sc.next().charAt(0);
		}while(finish=='c');
		sc.close();
		System.out.println("THANK YOU");
	}

}
