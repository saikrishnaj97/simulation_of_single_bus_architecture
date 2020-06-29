package project;
import java.awt.*;
import java.applet.*;
public class Mar extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	int flag=0;
	int x1=642;
	int y1=152;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Mar(Graphics h,String s,String o)
	{
		g=h;
		previous=s;
		op=o;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("pc"))
			mar();
	}
	public void mar()
	{
		flag=1;
		   x1=645;
			try
			{
				for(int i=x1;i>575;i-=5)
				{
					repaint(); 
				    x1-=5;
				    Thread.sleep(100);
				}
				//s=true;
				/*for(int i=1;i<10;i++){
				l.MSG("25",515, 150, 50, 20,s,new Color(137, 186, 250));
			}*/
				flag=0;
				repaint();
				Thread.sleep(2000);
				flag=1;
				x1=470;
				for(int i=x1;i>=400;i-=5)
				{
					    repaint();
					    x1-=5;
					    Thread.sleep(100);	
				}
				flag=0;
				repaint();
				   Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			new Mdr(g,"mar",op);
	}
	
	public void Paint(Graphics g)
	{
		
		if(flag==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 152, 73, 7);	//MAR ->bus
			g.fillRect(400, 152, 80, 7);	//MAR -> memory
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			
		}
		else if(flag==0)
		{
			g.setColor(gray);
			g.fillRect(575, 152, 73, 7);
			g.fillRect(400, 152, 80, 7);
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}
	
}
