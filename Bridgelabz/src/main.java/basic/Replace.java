import java.util.*;

public class Replace 
{
	Scanner sc=new  Scanner(System.in);
	public static void main(String[] args) 
	{
		String str="Hello <<username>>, How are you?";
		String r=replace(str);
		System.out.println(r);
	}
	private  String replace(String str) 
	{
		System.out.println("Enter the name");
		String nm=sc.next();
		if(nm.length()<3)
			
		return null;
	}

}
