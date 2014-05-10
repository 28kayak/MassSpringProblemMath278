import javax.swing.*;
import org.math.plot.*;
public class Application
{
	public static void main(String[] args)
	{
		//data need to store mass spring motion
		MassSpring sp1 = new MassSpring(1.0,10.0,2.0);
		double endPeriod = 6.00; //sec
		double currentSec = 0;//time counter
		double position = -1;
		double [] time = new double [61];
		double [] posi = new double [61];
		int index = 0;
		
		while(currentSec <= endPeriod)
		{
			position = sp1.x(currentSec);
			
			System.out.println(position);
			time[index] = currentSec;
			posi[index] = position;
			index++;
			currentSec += 0.1;
		}
		System.out.println("Walking array\n");
		for(int i = 0; i < time.length;i++)
		{
			System.out.println(time[i]);
			System.out.println(posi[i]);
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
		frame.setVisible(true);
		System.out.println("Done");
	
		
		
		
		
	}
}
