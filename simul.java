package Proj;
import java.awt.*;
import java.applet.*;

public class simul extends labels implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	boolean bus=true;
	
	int x1=575;
	int y1=70;
	int x2;
	int y2;
	 
	
	String pre="";
	String pre1="";
	int flagbus=0;
	int flagbus1=0;
	int flagmar=0;
	int flagmdr=0;
	int flagir=0;
	int flagcu=0;
	int flagr0=0;
	int flagr1=0;
	int flagr2=0;
	int flagY=0;
	int flagalu=0;
	int flagZ=0;
	;
	
	boolean SecThread=false;
	
	Thread t=null;
	Thread t1=null;
	public simul()
	{
		t= new Thread(this,"First");
		t1=new Thread(this,"Second");
		t.start();		
	}
	public void run()
	{
		if(SecThread)
			bus1(345,420);
		else
		   pc();
	}
	 public void pc()
	  {
		  flagbus=1;
		  for(int i=x1;i<=645;i+=5)
			{
				try
				{repaint();
					x1+=5;
					
					Thread.sleep(100);	
				}
				catch(InterruptedException e){}
			}
			for(int i=y1;i<150;i+=5)
			{
				try
				{repaint();
					y1+=5;
					Thread.sleep(100);	
				}
				catch(InterruptedException e){}
			}
			flagbus=0;
			mar();
	  }
	  
	  public void bus(int x,int y)
	  {
		  y1=x;
		  flagbus=1;
		  try{
		  if(pre=="cu")
		  {
			  for(int i=y1;i<y;i+=5)
			  {
				  y1+=5;
				  repaint();
				  Thread.sleep(100);  
			  }
			  flagbus=0;
			  t1.start();
			  SecThread=true;
			  r0();  
		  }
		  else if(pre=="r0")
		  {
			  for(int i=y1;i>y;i-=5)
			  {
				  y1-=5;
				  repaint();
				  Thread.sleep(100);
				  
			  }
			  flagbus=0;
			  selectY(645,575);
		  }
		  else if(pre=="z")
		  {
			  for(int i=y1;i>y;i-=5)
			  {
				  y1-=5;
				  repaint();
				  Thread.sleep(100);
				  
			  }
			  flagbus=0;
			  r2();
		  }
		  
		  }
		  catch(InterruptedException e){}
		 
	  }
	  
	  public void bus1(int x,int y)
	  {
		  y2=x;
		  x2=650;
		  flagbus1=1;
		  if(pre1=="cu")
		  {
			  try{
			  for(int i=y2;i<y;i+=5)
			  {
				  y2+=5;
				  repaint();
				  Thread.sleep(100);
			  }
			  }catch(InterruptedException e){}
			  flagbus1=0;
			  r1();
			  
		  }
		  else if(pre1=="r1")
		  {
			  try{
				  for(int i=y2;i<y;i+=5)
				  {
					  y2+=5;
					  repaint();
					  Thread.sleep(100);
				  }
				  }catch(InterruptedException e){}
				  flagbus1=0;
				  ALU(); 
		  }
	  }
	  public void mar()
	   {
		   flagmar=1;
		   x1=645;
			try
			{
				for(int i=x1;i>575;i-=5)
				{
					repaint(); 
				    x1-=5;
				    Thread.sleep(100);
				}
				flagmar=0;
				repaint();
				Thread.sleep(2000);
				flagmar=1;
				x1=470;
				for(int i=x1;i>=400;i-=5)
				{
					    repaint();
					    x1-=5;
					    Thread.sleep(100);	
				}
				flagmar=0;
				repaint();
				   Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			
			mdr();		
	   }
	   
	   public void mdr()
	   {
		   flagmdr=1;
		   x1=395;
		   y1=230;
		   try
		   {
			   for(int i=x1;i<470;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			   //Thread.sleep(2000);
			   flagmdr=0;
			   repaint();
				Thread.sleep(2000);
				flagmdr=1;
			   x1=570;
			   for(int i=x1;i<=645;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			   flagmdr=0;
			   flagbus=1;
			   for(int i=y1;i<260;i+=5)
			   {
				   repaint();
				   y1+=5;
				   Thread.sleep(100); 
			   }
			   flagbus=0;   
		   }
		   catch(InterruptedException e){}
		   ir();
	   }
	   
	   public void ir()
	   {
		   flagir=1;
		   x1=655;
		   try
		   {
			   for(int i=x1;i<725;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   }
			   //x1+=5;
			   flagir=0;
			   repaint();
			   Thread.sleep(2000);
			   flagir=1;
			   
			   x1=782;
			   y1=250;
			   for(int i=y1;i>=190;i-=5)
			   {
				   repaint();
				   y1-=5;
				   Thread.sleep(100);
			   }
			   flagir=0; 
			   repaint();
			   Thread.sleep(2000);
		   }
		   catch(InterruptedException e){}
		   cu();
	   }
	   
	   public void cu()
	   {
		   flagcu=1;
		   x1=725;
		   y1=135;
		   try
		   {
			   for(int i=x1;i>650;i-=5)
			   {
				   repaint();
				   x1-=5;
				   Thread.sleep(100);
			   }
		   }catch(InterruptedException e){}
		   flagcu=0;
		   pre="cu";
		   pre1="cu";
			  bus(y1,340);
	   }
	   
	   public void r0()
	   {
		   flagr0 = 1;					//this is for sending data into r0
		   x1 = 655;
		   y1  = 340;
		   
		   try{
				   for(int i=x1;i<730;i+=5)
				   {
					   repaint();
					   x1+=5;
					   Thread.sleep(100);
				   }  
				   flagr0 = 0;
				   repaint();
				   Thread.sleep(2000);
				   flagr0 = 1;
				   x1 = 730;
				   for(int i=x1;i>=655;i-=5)
				   {
					   repaint();
					   x1-=5;
					   Thread.sleep(100);
				   }
				   flagr0=0;
				   pre="r0";
				   bus(y1,310);
		  }catch(InterruptedException e){}
		  
	   }
   public void r1()
   {
	   flagr1 = 1;
	   x2 = 655;
	   y2  = 420;
	   							//this is for sending data into r1
		   try{
			   for(int i=x2;i<730;i+=5)
			   {
				   repaint();
				   x2+=5;
				   Thread.sleep(100);
			   } 
			   flagr1 = 0;
			   repaint();
			   Thread.sleep(3000);
			   flagr1 = 1;
			   x2 = 730;
			   for(int i=x2;i>655;i-=5)
			   {
				   repaint();
				   x2-=5;
				   Thread.sleep(100);
			   }  
			   flagr1=0;
			   pre1="r1";
			   bus1(420,425);
			   
		   }
	   catch(InterruptedException e){}
   }
   
   public void r2()
   {
	   flagr2 = 1;
	   x1 = 655;
	   y1  = 500;
	   				
		   try{
			   for(int i=x1;i<730;i+=5)
			   {
				   repaint();
				   x1+=5;
				   Thread.sleep(100);
			   } 
			   flagr2 = 0;
			    repaint();
				Thread.sleep(1500);
		   }catch(InterruptedException e){}   
   }
   
   public void selectY(int x,int y)
   {
	   x1=x;
	   flagY=1;
	  try
	  {
	   for(int i=x1;i>y;i-=5)
		{
			repaint(); 
		    x1-=5;
		    Thread.sleep(100);
		}
	   flagY=0;
	   repaint();
	   Thread.sleep(1500);
	   flagY=1;
	   x1=525;
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
	   x1=480;
	   y1=405;
	   for(int i=y1;i<460;i+=5)
		{
			repaint(); 
		    y1+=5;
		    Thread.sleep(100);
		}
	   flagY=0;
	   repaint();
	   Thread.sleep(1500);
	  }catch(InterruptedException e){}
   }
   
   public void ALU()
   {
	   flagalu=1;
	   
	   try
		  {
		   for(int i=x2;i>570;i-=5)
			{
				repaint(); 
			    x2-=5;
			    Thread.sleep(100);
			}
		   for(int i=y2;i<460;i+=5)
			{
				repaint(); 
			    y2+=5;
			    Thread.sleep(100);
			}
		   flagalu=0;
		   repaint();
		   Thread.sleep(5000);
		   t1=null;
		   z();
		 }catch(InterruptedException e){}
	   
   }
   
   public void z()
   {
	   x1=520;
	   y1=535;
	   flagZ=1;
	   try
		  {
		   for(int i=y1;i<580;i+=5)
			{
				repaint(); 
			    y1+=5;
			    Thread.sleep(100);
			}
		   flagZ=0;
		   repaint();
		   Thread.sleep(2000);
		   flagZ=1;
		   x1=570;
		   y1=590;
		   for(int i=x1;i<650;i+=5)
			{
				repaint(); 
			    x1+=5;
			    Thread.sleep(100);
			}
		   flagZ=0;
		   pre="z";
		  bus(y1,505);
		 }catch(InterruptedException e){}
   }
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.GREEN);
		if(flagbus==1)
		   g.fillOval(x1, y1, 10, 10);
		if(flagbus1==1)
			g.fillOval(x2, y2, 10, 10);
		if(flagmar==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagmdr==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagir==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagcu==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagr0==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagr2==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagr1==1)
			g.fillOval(x2, y2, 10, 10);
		if(flagY==1)
			g.fillOval(x1, y1, 10, 10);
		if(flagalu==1)
			g.fillOval(x2, y2, 10, 10);
		if(flagZ==1)
			g.fillOval(x1, y1, 10, 10);
			
			
	}
	
	
	
	
	
}
