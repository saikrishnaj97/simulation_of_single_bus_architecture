package project;
import java.applet.*;
import java.awt.*;
public class Register extends Applet implements Runnable {
	String previous="yes";
	String op;
	Graphics g;
	Thread t;
	Thread t1;
	boolean secThread=false;
	boolean firThread=true;
	int f=0;
	int f1=0;
	int x1=655;
	int y1;
	int x2,y2;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public Register(Graphics h,String s,String o)
	{
		g=h;
		op=o;
		previous=s;
		t=new Thread(this);
		t1=new Thread(this);
		t.start();
	}
	public void run()
	{
		if(op.equals("MOVE"))
		{
			r0Move();
		}
		else
		{
			if(previous.equals("cu") && firThread)
			{
				firThread=false;
				System.out.println("in");
				r0();
				
				
			}

			else if(secThread)
			{
				
				r1();
				
			}
		}
		
		
	}
	public void r0()
	{
		
		t1.start();
		secThread=true;
		f=1;
		  
		x1 = 655;
		   y1  = 343;
		   
		   try{
				   for(int i=x1;i<730;i+=5)
				   {
					   repaint();
					   x1+=5;
					   Thread.sleep(100);
				   }  
				   /*s = true;
				   for(int i=1;i<10;i++){
						MSG("10",770, 340, 40, 20,s,new Color(102, 222, 116));
				   }*/
				   
				   f = 0;
				   repaint();
				   Thread.sleep(2000);
				   f = 1;
				   x1 = 730;
				   for(int i=x1;i>=655;i-=5)
				   {
					   repaint();
					   x1-=5;
					   Thread.sleep(100);
				   }
				   f=0;
				   repaint();
				   previous="";
				   //bus(y1,310);
		  }catch(InterruptedException e){}
			   f=0;
			   previous="";
			   t=null;
			   new Bus(g,"r0",345,315,op);
				//new  Bus(g,"cu",y1,340);
		 }
		   
	public void r1()
	{
		f1 = 1;
		System.out.println("Thread 2 started");
		   y2  = 345;
		   						//this is for sending data into r1
			   try{
				  
					  x2=650;
					  f1=1;
					 
						  for(int i=345;i<=420;i+=5)
						  {
							  y2+=5;
							  repaint();
							  Thread.sleep(100);
						  }
						 
						 // f1=0;
						 
				   for(int i=x2;i<730;i+=5)
				   {
					   repaint();
					   x2+=5;
					   Thread.sleep(100);
				   } 
				  /* for(int i=1;i<10;i++){
						l.MSG("20",770, 420, 40, 20,s,new Color(102, 222, 116));
				   }*/
				   f1 = 0;
				   repaint();
				   Thread.sleep(4000);
				   f1 = 1;
				   x2 = 730;
				   for(int i=x2;i>655;i-=5)
				   {
					   repaint();
					   x2-=5;
					   Thread.sleep(100);
				   }  
				   
				   f1=1;
				   /*pre1="r1";
				   bus1(420,425);*/
				  y2= 420;
				   for(int i=y2;i<425;i+=5)
					  {
						  y2+=5;
						  repaint();
						  Thread.sleep(100);
					  }
					  }catch(InterruptedException e){}
					  f1=0;
					  new Alu(g,"r1");
					  t1=null;
				   
			  
		 }	
	
	public void r0Move()
	{
		f=1;
		  
		x1 = 655;
		   y1  = 343;
		   
		   try{
				   for(int i=x1;i<730;i+=5)
				   {
					   repaint();
					   x1+=5;
					   Thread.sleep(100);
				   }  
				   /*s = true;
				   for(int i=1;i<10;i++){
						MSG("10",770, 340, 40, 20,s,new Color(102, 222, 116));
				   }*/
				   
				   f = 0;
				   repaint();
				   Thread.sleep(2000);
				   f = 1;
				   x1 = 730;
				   for(int i=x1;i>=660;i-=5)
				   {
					   repaint();
					   x1-=5;
					   Thread.sleep(100);
				   }
				   f=0;
				   
				   
		  }catch(InterruptedException e){}
			   f=0;
			   previous="";
			   t=null;
			   new Bus(g,"r0",345,425,op);
	}
	
	public void Paint(Graphics g)
	{
		
		if(f==1)
		{
			g.setColor(Color.BLACK);
			//g.drawLine(575, 75, 650, 75);
			
			g.setColor(gray);
			g.fillRect(650, 40, 10, 600);
			
			g.fillRect(660, 262, 75, 7);  //ir->bus
			g.fillRect(785, 190, 7,60 );  //ir->cu
			g.fillRect(660, 140, 75, 7);
			g.fillRect(660, 345, 75, 7);	 //r0->bus
			g.setColor(Color.GREEN);
			g.fillOval(x1, y1, 8,8 );
			g.setColor(gray);
			
			
		}
		else if(f==0)
		{
			g.setColor(gray);
			g.fillRect(575, 152, 73, 7);
			g.fillRect(400, 152, 80, 7);
			g.fillRect(785, 190, 7,60 );  //ir->cu
			g.fillRect(660, 262, 75, 7);  //ir->bus
			g.fillRect(660, 140, 75, 7);
			g.fillRect(660, 345, 75, 7);	 //r0->bus
		}
		if(f1==1)
		{
			g.setColor(gray);
			g.fillRect(660, 140, 75, 7);
			g.fillRect(660, 425, 75, 7);  //r1->bus
			g.setColor(Color.GREEN);
			g.fillOval(x2, y2, 8,8 );
			g.setColor(gray);
			
		}
		else if(f1==0)
		{
			g.fillRect(660, 140, 75, 7);
			g.fillRect(660, 425, 75, 7);  //r1->bus
		}
	}
	
	public void repaint()
	{
		Paint(g);
	}
}
