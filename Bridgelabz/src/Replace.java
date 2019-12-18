
import java.util.*;

public class Replace 
{
	static Scanner sc=new  Scanner(System.in);
	public static void main(String[] args) 
	{
		String str="Hello <<username>>, How are you?";
		String r=replace(str);
		System.out.println(r);
	}
	private static String replace(String str) 
	{
		System.out.println("Enter the name");
		String nm=sc.next();
		if(nm.length()<3)
		{
			System.out.println("Username should contain minimum 3 characters");
			return null;
		}
		String res=str.replace("<<username>>", nm);
		
		return res;
	}

}
