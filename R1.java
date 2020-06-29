package project;
import java.applet.*;
import java.awt.*;
public class R1 extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	
	int flagR1=0;
	
	int x1,y1;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public R1(Graphics h,String s,String o)
	{
		g=h;
		op=o;
		previous=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("z"))
			r1();
	}
	
	public void r1()
	{
		flagR1=1;
		x1 = 655;
		   y1  = 425;
		   				
			   try{
				   for(int i=x1;i<730;i+=5)
				   {
					   repaint();
					   x1+=5;
					   Thread.sleep(100);
				   } 
				  // s = true;
				   
				   flagR1 = 0;
				    repaint();
					Thread.sleep(1500);
					/*for(int i=1;i<10;i++){
						MSG("30",770, 500, 40, 20,s,new Color(102, 222, 116));
				   }*/
			   }catch(InterruptedException e){}
	
			   t=null;
			
	}
	
	public void Paint(Graphics g)
	{
		
		if(flagR1==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575,430,75,7);  //horizontal B	
			g.fillRect(575, 430, 7,30); //vertical B
			g.fillRect(660, 425, 75, 7);  //r1->bus
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			
			g.setColor(gray);
		}
		if(flagR1==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575,430,75,7);  //horizontal B	
			g.fillRect(575, 430, 7,30); //vertical B
			g.fillRect(660, 425, 75, 7);  //r1->bus
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}
}
