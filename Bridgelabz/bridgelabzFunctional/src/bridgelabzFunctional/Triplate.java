package bridgelabzFunctional;

public class Triplate {

	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter the Value");
		int n=u.inputInteger();
		int[] arr=u.getIntegerArray(n);
		u.displayIntegerArray(arr);
		int c=0;
		for(int i=0;i<arr.length-2;i++)
		{
			for (int j = i+1; j < arr.length-1; j++) 
				{	
				for (int k = j+1; k < arr.length; k++) 
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						c++;
						System.out.println("Triplates are "+arr[i] + " " +arr[j] +" "+ arr[k]+" = "+(arr[i] + arr[j] + arr[k]));
					}
				}
			}
		}
		System.out.println("Number of Triplate "+c);
	}

}
