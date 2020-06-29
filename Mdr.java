package project;
import java.applet.*;
import java.awt.*;
public class Mdr extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	int flag=0;
	int x1=397;
	int   y1=231;
	
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Mdr(Graphics h,String s,String o)
	{
		g=h;
		previous=s;
		op=o;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("mar"))
			mdr();
	}
	public void mdr()
	{
		flag=1;
		  
		try
		   {
			   for(int i=x1;i<470;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			   /*s=true;
			   
					l.MSG("add",515, 230, 50, 20,s,new Color(137, 186, 250));*/
				
			   //Thread.sleep(2000);
			   flag=0;
			   repaint();
				Thread.sleep(2000);
				flag=1;
			   x1=575;
			   for(int i=x1;i<=645;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			   flag=0;
			   if(previous=="mar")
				  new Bus(g,"pc",y1,260,op);
			   /*else if(previous=="r0")
			   {
				   previous="y";
				   new Bus(g,"",310);
			   }*/
			   previous="";
		   }
		   catch(InterruptedException e){}
			//new Bus(g,"mdr");
	}
	
	public void Paint(Graphics g)
	{
		
		if(flag==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(575, 232, 75, 7);  //MDR->bus
			g.fillRect(400, 232, 80, 7);  //MDR->memory
			g.fillRect(650, 40, 10, 600);
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			
		}
		else if(flag==0)
		{
			g.setColor(gray);
			g.fillRect(575, 232, 75, 7);  //MDR->bus
			g.fillRect(400, 232, 80, 7);  //MDR->memory
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}

}
