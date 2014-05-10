
public class Application
{
	public static void main(String[] args)
	{
		MassSpring sp1 = new MassSpring(1.0,10.0,2.0);
		double endPeriod = 6.00; //sec
		double currentSec = 0;//time counter
		double position = -1;
		
		
		while(currentSec <= endPeriod)
		{
			position = sp1.x(currentSec);
			currentSec += 0.1;
			System.out.println(position);
			
		}
	}
}
