package project;
import java.applet.*;
import java.awt.*;
public class Alu extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	int flag2=0;
	int flag1=0;
	int flag=0;
	int x1=650;
	int y1=430;
	int y2=430;
	int x2=575;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Alu(Graphics h,String s)
	{
		g=h;
		previous=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("r1"))
			alu();
	}
	
	public void alu()
	{
		this.flag=1;this.flag1=1;
		 try{ 
		  for(int i=75;i>=0;i-=5)
			{
				try
				{
					
					repaint();
					
					x1-=5;
					
					Thread.sleep(100);	
				}
				catch(InterruptedException e){}
			}this.flag1=0;this.flag2=1;
			for(int i=0;i<30;i+=3)
			{
				try
				{	repaint();
					y2+=3;
					Thread.sleep(100);
					
				}
				catch(InterruptedException e){}
			}
			this.flag=0;
			t=null;
			this.flag2=0;
			repaint();
			Thread.sleep(8000);
	}catch(InterruptedException e){}
		new Z(g,"alu",op);	
			
	}
	
	public void Paint(Graphics g)
	{
		
		if(this.flag==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575,430,75,7);  //horizontal B	
			g.fillRect(575, 430, 7,30); //vertical B
			g.setColor(Color.GREEN);
			if(this.flag1==1)
			{	g.fillOval(x1, y1, 8,8 );}
			if(this.flag2==1)
			{	g.fillOval(x2, y2, 8,8 );}
			g.setColor(gray);
		}
		if(this.flag==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575,430,75,7);  //horizontal B	
			g.fillRect(575, 430, 7,30); //vertical B
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}

}
