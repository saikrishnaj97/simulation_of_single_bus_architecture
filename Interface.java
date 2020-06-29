package project;
import java.awt.*;

//import Proj.InputFrame;

import java.applet.*;
public class Interface extends Applet{
	
	Dimension d;
	//InputFrame f;
	Color reg=new Color(137, 186, 250);
	Color temp=new Color(102, 255, 102);
	Color green=new Color(102, 222, 116);
	Color pink=new Color(80, 212, 205);
	Color red1=new Color(252, 93, 96);
	Color red=new Color(255, 11, 23);
	Color gray=new Color(142, 142, 142);
	public void init()
	{
		//labels l=new labels();
		Color back= new Color(240,240,240);
		setBackground(back);
		setSize(1410,685);
		//setColor(Color.RED);
		/*f = new InputFrame();
		f.setSize(300, 200);
		f.setBounds(920, 150, 400, 470);
		f.setVisible(true);*/
		
		
	}
	
    
	public void paint(Graphics g)
    {
    	
		g.setColor(Color.gray);
		g.fillRect(575, 72, 73, 7);	//PC -> BUS
		g.fillRect(575, 152, 73, 7);	//MAR->bus
		g.fillRect(400, 152, 80, 7);  //MAR->memory
		g.fillRect(575, 232, 75, 7);  //MDR->bus
		g.fillRect(400, 232, 80, 7);  //MDR->memory
		g.fillRect(575, 315, 75, 7);  //Y with bus
		g.fillRect(528, 330, 7, 50);  // Y with mux
		g.fillRect(448, 345, 7, 35);// MUX const 4
		//g.fillRect(370, 395, 437, 395);	// extra
		g.fillRect(485, 410, 7, 50);	//A 
		g.fillRect(575, 430, 7,30); //vertical B
		g.fillRect(575,430,75,7);  //horizontal B
		g.fillRect(525, 540, 7, 40);  //with Z
		g.fillRect(575, 595, 75, 7);  //Z->bus
		g.fillRect(660, 585, 75, 7); //temp->bus
		g.fillRect(660, 505, 75, 7); //r2->bus
		g.fillRect(660, 425, 75, 7);  //r1->bus
		g.fillRect(660, 345, 75, 7);	 //r0->bus
		g.fillRect(660, 262, 75, 7);  //ir->bus
		g.fillRect(785, 190, 7,60 );  //ir->cu
		g.fillRect(660, 140, 75, 7); //r2->bus
		
		
		d=getSize();
		float t =3 ;
		((Graphics2D) g).getStroke();
		((Graphics2D) g).setStroke(new BasicStroke(t));
		g.drawRoundRect(10, 10,d.width-30 ,d.height-15,20,20 );
		
		t=2;
		((Graphics2D) g).getStroke();
		((Graphics2D) g).setStroke(new BasicStroke(t));
		g.drawRect(925,100,350,420);
		
		t=1;
		((Graphics2D) g).getStroke();
		((Graphics2D) g).setStroke(new BasicStroke(t));
		g.setColor(gray);
		g.fillRect(648, 40, 13, 600);//BUS
		g.setColor(red1);
		g.fillRect(480,60 , 95, 30);    //PC
		g.fillRect(735, 250, 95, 30);   //IR
		int x[]={430,540,525,445,430};  //MUX
		int y[]={380,380,410,410,380};
		int n=5;
		g.fillPolygon(x,y,n);
		g.setColor(reg);
		g.fillRect(480, 140, 95, 30);   //MAR
		g.fillRect(480, 220, 95, 30);   //MDR
		g.fillRect(250, 120, 150, 160);//RAM
		//g.setColor(red);
		int x1[]={445,520,525,530,605,575,480,445};  //ALU
		int y1[]={460,460,465,460,460,540,540,460};
		n=8;
		g.fillPolygon(x1,y1,n);
		g.fillRect(735, 90, 95, 100);   //CU
		g.setColor(pink);
		g.fillRect(480, 300, 95, 30);   //Register Y
		g.fillRect(480, 580, 95, 30);   //Register Z
		g.fillRect(735, 570, 95, 30);   //Register Temp
		g.setColor(green);
		g.fillRect(735, 490, 95, 30);   //Register R2
		g.fillRect(735, 410, 95, 30);   //Register R1
		g.fillRect(735, 330, 95, 30);   //Register R0
		
		
		
		
		g.setColor(Color.BLACK);
		g.drawRect(480,60 , 95, 30);    //PC
		g.drawRect(480, 140, 95, 30);   //MAR
		g.drawRect(480, 220, 95, 30);   //MDR
		int x2[]={430,540,525,445,430};  //MUX
		int y2[]={380,380,410,410,380};
		 n=5;
		g.drawPolygon(x2,y2,n);
		int x3[]={445,520,525,530,605,575,480,445};  //ALU
		int y3[]={460,460,465,460,460,540,540,460};
		n=8;
		g.drawPolygon(x3,y3,n);
		g.drawRect(480, 300, 95, 30);   //Register Y
		g.drawRect(480, 580, 95, 30);   //Register Z
		g.drawRect(735, 570, 95, 30);   //Register Temp
		g.drawRect(735, 490, 95, 30);   //Register R2
		g.drawRect(735, 410, 95, 30);   //Register R1
		g.drawRect(735, 330, 95, 30);   //Register R0
		g.drawRect(735, 250, 95, 30);   //IR
		g.drawRect(735, 90, 95, 100);   //CU
    }

}
