package project;
import java.applet.*;
import java.awt.*;
public class Y extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	
	int flagY=0;
	
	int x1=650;
	int y1=315;
	
	
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Y(Graphics h,String s,String o)
	{
		g=h;
		previous=s;
		op=o;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("r0"))
			y();
	}
	
	public void y()
	{
		x1=645;
		   flagY=1;
		  try
		  {
		   for(int i=x1;i>575;i-=5)
			{
				repaint(); 
			    x1-=5;
			    Thread.sleep(100);
			}
		   flagY=0;
		   repaint();
		   Thread.sleep(1500);
		   flagY=1;
		   x1=527;
		   y1=325;
		   for(int i=y1;i<375;i+=5)
			{
				repaint(); 
			    y1+=5;
			    Thread.sleep(100);
			}
		   flagY=0;
		   repaint();
		   Thread.sleep(1500);
		   flagY=1;
		   x1=485;
		   y1=405;
		   for(int i=y1;i<455;i+=5)
			{
				repaint(); 
			    y1+=5;
			    Thread.sleep(100);
			}
		   flagY=0;
		   repaint(20);
		   Thread.sleep(1500);
		  }catch(InterruptedException e){}
		  t=null;
	}
	
	public void Paint(Graphics g)
	{
		
		if(flagY==1)
		{
			
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 315, 75, 7);  //Y with bus
			g.fillRect(528, 330, 7, 50);  // Y with mux
			g.fillRect(485, 410, 7, 50);	//A 
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			g.setColor(gray);
		}
		
		if(flagY==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 315, 75, 7);  //Y with bus
			g.fillRect(528, 330, 7, 50);  // Y with mux
			g.fillRect(485, 410, 7, 50);	//A 
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}
	
}
