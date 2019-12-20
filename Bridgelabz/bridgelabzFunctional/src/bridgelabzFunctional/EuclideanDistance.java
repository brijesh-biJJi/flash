package bridgelabzFunctional;

public class EuclideanDistance 
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		double x,y;
		System.out.println("Enter the value for X and Y");
		x=u.inputDouble();
		y=u.inputDouble();
		double distance=findDistance(x,y);
		System.out.println("Distance = "+distance);
	}

	private static double findDistance(double x, double y)
	{
		double d=sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;
	}

	private static double sqrt(double d) 
	{
		double temp;
		double sq=d/2.0;
		do
		{
			temp=sq;
			sq=(temp+(d/temp))/2;
		}while(temp-sq!=0);
		
		return sq;
	}
}
