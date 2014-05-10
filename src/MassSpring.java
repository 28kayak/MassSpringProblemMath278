import java.util.Scanner;
public class MassSpring
{	
	double time;
	double k;
	double initialPosition;
	double initialSpeed;
	public MassSpring(double springConst, double initPosition, double initSpeed)
	{
		Scanner scan = new Scanner(System.in);
		//int u;
		time = 0;
		k = springConst;
		initialPosition = initPosition;
		initialSpeed = initSpeed;
	}
		
	private int unitStepF(double time)
	{	
		int unitf = -1;
		
		if(time < 5)
		{
			unitf = 0;
		}
		else if(time >= 5 && time < 5.1)
		{
			unitf = 1;
		}
		else if(time >= 5.1)
		{
			unitf = 0;
		}
		else
		{
			System.out.println("bizzar");
		}
		
		return unitf;
	}
	public double x(double time)
	{
		int uni1 = unitStepF(time-5.0);
		int uni2 = unitStepF(time-5.1);
		return (k/2)*Math.pow(Math.sin(time),2.0)*uni1-(k/2)*Math.pow(Math.sin(time),2.0)*uni2
				+initialPosition*Math.cos(2*time)+(initialSpeed/2)*Math.sin(2*time);
	}
}
