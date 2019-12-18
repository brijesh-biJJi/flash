
public class Date 
{
	int dd,mm,yy;
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int dd, int mm, int yy) 
	{
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
		if(yy%400==0 || yy%4==0 && yy%100!=0)
			month[2]=29;
	}
	
	public int[] noOfDays() 
	{
		int a[]={0,0};
		int y=yy-1;
		int day=y*365;
		day =day + y/400 + y/4 - y/100;
		for (int i = 0; i < mm; i++) {
			day +=month[i];
		}
		day +=dd;
		a[0]=day;
		a[1]=month[mm];
		return a;
	}

}
