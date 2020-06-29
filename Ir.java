package project;
import java.applet.*;
import java.awt.*;
public class Ir extends Applet implements Runnable{
	String previous="yes";
	String op;
	Graphics g;
	Thread t;
	int F=0;
	int x1=655;
	int y1=261;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Ir(Graphics h,String o)
	{
		g=h;
		op=o;
		
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("yes"))
			ir();
	}
	public void ir()
	{
		F=1;
		  
		try
		   {
			   for(int i=x1;i<725;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			  /* s = true;
			   
					l.MSG("25",770, 260, 40, 20,s,new Color(252, 93, 96));*/
				
			   F=0;
			   repaint();
			   Thread.sleep(2000);
			   F=1;
			   
			   x1=784;
			   y1=245;
			   for(int i=y1;i>=190;i-=5)
			   {
				   repaint();
				   y1-=5;
				   Thread.sleep(100);
			   }
			   F=0; 
			   repaint();
			   Thread.sleep(2000);
			   F=1;
			   x1=725;
			   y1=139;
			   try
			   {
				   for(int i=x1;i>650;i-=5)
				   {
					   repaint();
					   x1-=5;
					   Thread.sleep(100);
				   }
			   }catch(InterruptedException e){}
			   F=0;
			   previous="";
			   t=null;
				new  Bus(g,"cu",y1,340,op);
		   }
		   catch(InterruptedException e){}
			
	}
	
	public void Paint(Graphics g)
	{
		
		if(F==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			
			g.fillRect(660, 262, 75, 7);  //ir->bus
			g.fillRect(785, 190, 7,60 );  //ir->cu
			g.fillRect(660, 140, 75, 7);
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			g.setColor(gray);
			
		}
		else if(F==0)
		{
			g.setColor(gray);
			g.fillRect(575, 152, 73, 7);
			g.fillRect(400, 152, 80, 7);
			g.fillRect(785, 190, 7,60 );  //ir->cu
			g.fillRect(660, 262, 75, 7);  //ir->bus
			g.fillRect(660, 140, 75, 7);
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}

}
