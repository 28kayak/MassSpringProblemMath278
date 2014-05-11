import javax.swing.*;
import org.math.plot.*;
public class Application
{
	public static void main(String[] args)
	{
		//data need to store mass spring motion
		MassSpring sp1 = new MassSpring(1.0,0,0);
		double endPeriod = 7.00; //sec
		double currentSec = -2.00;//time counter
		double position = -1;
		double [] time = new double [101];
		double [] posi = new double [101];
		int index = 0;
		
		while(currentSec <= endPeriod)
		{
			position = sp1.x(currentSec);
			
			//System.out.println(position);
			time[index] = currentSec;
			posi[index] = position;
			index++;
			currentSec += 0.1;
		}
		//double[] time1 = new double[61];
	
		System.out.println("Walking array\n");
		for(int i = 0; i < time.length;i++)
		{
			System.out.printf("%f,%f\n",time[i],posi[i]);
			//System.out.println(posi[i]);
			//time1[i] = i;
		}
		
		//data for plotting 
		//create plot panel
		Plot2DPanel plot = new Plot2DPanel();
		//def the legent (position)
		plot.addLegend("SOUTH");
		//add a line plot to the PlotPanel
		plot.addLinePlot("Motion", time, posi);
		
		//put the plot in JFrame
		JFrame frame = new JFrame("Mass Spring");
		frame.setSize(1000, 1000);
		frame.setContentPane(plot);
		frame.setVisible(true);
		System.out.println("Done");
		
		
		
		
	}
}
