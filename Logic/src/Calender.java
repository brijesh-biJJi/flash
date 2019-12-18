
public class Calender 
{
	public static void main(String[] args) 
	{
		String wd[]={"SU","MO","TU","WE","TH","FR","SA"};
		int dd=1,mm=1,yy=1995,k=0;;
		Date d=new Date(dd,mm,yy);
		int[] days=d.noOfDays();
		int od=days[0]%7;
		String dOfWeek=wd[od]; //System.out.println(dOfWeek);
		int m=days[1];
		System.out.println("JAVA CALEDER "+mm+" "+yy);
		System.out.println();
		while(k<wd.length)
			System.out.print(wd[k++]+" ");
		System.out.println();
		int t=1;
		for(int i=0;i<6;i++){
			int p=i;
			for (int j = 0; j < 7; j++) {
				if(p==0 ){
					for(int s=0;s<od;s++,j++)
						System.out.print("   ");
					p++;
				}	
				if(t<=m && t<10)
					System.out.print(t++ +"  ");
				else if(t<=m)
					System.out.print(t++ +" ");
			}
			System.out.println();
		}
		
		
	}
}
