package project;
import java.applet.*;
import java.awt.*;
public class Bus extends Applet implements Runnable{
	String previous;
	String op;
	Graphics g;
	Thread t;
	int flag=0;
	int x1=650;
	int y1;
	int y2;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Bus(Graphics h,String s,int x,int y,String o)
	{
		op=o;
		g=h;
		previous=s;
		y1=x;
		y2=y;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(previous.equals("pc"))
				toIr();
		else if(previous.equals("cu"))
			toR0();
		else if(previous.equals("r0") && op.equals("MOVE"))
			toR1Move();
		else if(previous.equals("r0") && (op.equals("ADD") || op.equals("SUB") || op.equals("MUL") || op.equals("DIV")))
			toY();
		else if(previous.equals("z"))
			toR1();
	}
	
	public void toIr()
	{
		flag=1;
		try{
			for(int i=y1;i<y2;i+=5)
			  {
				  y1+=5;
				  repaint();
				  Thread.sleep(100);  
			  }
			  flag=0;
			  new Ir(g,op);
			  flag=0;
				t=null;
				repaint();
				previous="";
		}
		catch(InterruptedException e){}
	}
	
	public void toY()
	{
		flag=1;
		try{
			for(int i=y1;i>y2;i-=5)
			  {
				  y1-=5;
				  repaint();
				  Thread.sleep(100);  
			  }
			  flag=0;
			  //previous="cu";
			 new Y(g,"r0",op);
			  
				t=null;
				repaint();
		}
		catch(InterruptedException e){}
	}
	public void toR0()
	{
		flag=1;
		try{
			for(int i=y1;i<y2;i+=5)
			  {
				  y1+=5;
				  repaint();
				  Thread.sleep(100);  
			  }
			  flag=0;
			  previous="cu";
			 new Register(g,"cu",op);
			  
				t=null;
				repaint();
		}
		catch(InterruptedException e){}
	}
	public void toR1()
	{
		flag=1;
		try{
		for(int i=y1;i>y2;i-=5)
		  {
			  y1-=5;
			  repaint();
			  Thread.sleep(100);
			  
		  }
		}catch(InterruptedException e){}
		  flag=0;
		  new R1(g,"z",op);
	}
	public void toR1Move()
	{
		flag=1;
		try{
		for(int i=y1;i<y2;i+=5)
		  {
			  y1+=5;
			  repaint();
			  Thread.sleep(100);
			  
		  }
		}catch(InterruptedException e){}
		  flag=0;
		  new R1(g,"z",op);
	}
	
	public void Paint(Graphics g)
	{
		
		if(flag==1)
		{
			
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 232, 75, 7);  //MDR->bus
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			
		}
		else if(flag==0)
		{
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			g.fillRect(575, 232, 75, 7);  //MDR->bus
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}

}
