package project;
import java.applet.*;
import java.awt.*;
public class PC extends Applet implements Runnable{
	
	String previous;
	String op;
	String mode;
	Graphics g;
	Thread t;
	int flag=0;
	int x1=575;
	int y1=71;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public PC(Graphics h,String s,String o)
	{
		g=h;
		previous=s;
		op=o;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("start"))
			pc();
	}
	
	public void pc()
	{
		flag=1;
		  
		  for(int i=x1;i<650;i+=4)
			{
				try
				{
					
					repaint();
					
					x1+=4;
					
					Thread.sleep(100);	
				}
				catch(InterruptedException e){}
			}
			for(int i=y1;i<=155;i+=5)
			{
				try
				{	repaint();
					y1+=5;
					Thread.sleep(100);
					
				}
				catch(InterruptedException e){}
			}
			flag=0;
			t=null;
			new Mar(g,"pc",op);
			repaint();
	}
	
	public void Paint(Graphics g)
	{
		
		if(flag==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 72, 73, 7);
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			
		}
		if(flag==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}
	
	
}
