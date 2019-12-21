package brudgelabzLogic;

import java.util.*;

public class CouponNumber 
{
	static Random rd=new Random();
	static int mCount=0;
	static Scanner sc=new Scanner(System.in);
	static List<Integer> l=new ArrayList<>();
	public static void main(String[] args) 
	{
		System.out.println("enter the n coupon number");
		int totalCoupon=sc.nextInt();
		
		System.out.println("Total count : "+generateCoupon(totalCoupon));
		System.out.println("The distinct "+totalCoupon+" coupon numbers are : "+l);
	}
	private static int generateCoupon(int tc) 
	{
		while(l.size()!=tc)
		{
			int rn=generateRandomNumber();
			if(l.contains(rn))
				mCount++;
			else{
				mCount++;
				l.add(rn);
			}
		}
		return mCount;
	}
	private static int generateRandomNumber() 
	{
		int rn=rd.nextInt(5)+1;
		return rn;
	}

}
