package project;
import java.applet.*;
import java.awt.*;
public class Z extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	int flagZ=0;
	int x1=525;
	int y1=540;
	
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Z(Graphics h,String s,String o)
	{
		g=h;
		op=o;
		previous=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("alu"))
			z();
	}
	
	public void z()
	{
		 x1=525;
		   y1=538;
		   flagZ=1;
		   try
			  {
			   for(int i=y1;i<575;i+=5)
				{
					repaint(); 
				    y1+=5;
				    Thread.sleep(100);
				}
			   /*for(int i=1;i<10;i++){
					MSG("30",515, 585, 40, 25,s,new Color(80, 212, 205));
			   }*/
			   flagZ=0;
			   repaint();
			   Thread.sleep(2000);
			   flagZ=1;
			   x1=578;
			   y1=594;
			   for(int i=x1;i<650;i+=5)
				{
					repaint(); 
				    x1+=5;
				    Thread.sleep(100);
				}
			   flagZ=0;
			   repaint();
			  new Bus(g,"z",y1,425,op);
			 }catch(InterruptedException e){}
		   t=null;
	}
	
	public void Paint(Graphics g)
	{
		
		if(flagZ==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(525, 540, 7, 40);	// z with alu
			g.fillRect(575, 595, 75, 7);  //z with bus
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
				g.fillOval(x1, y1, 8,8 );
			
		}
		if(flagZ==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(525, 540, 7, 40);	// z with alu
			g.fillRect(575, 595, 75, 7);  //z with bus
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}

}
