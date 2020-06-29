package project;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.*;

public class Labels extends Interface implements ItemListener,ActionListener{
	Label p = new Label("PC");
	 Label mar = new Label("MAR");
	 Label mdr = new Label("MDR");
	 Label y = new Label("Y");
	 Label mux = new Label("MUX");
	 Label alu = new Label("ALU");
	 Label z = new Label("Z");
	 Label temp = new Label("Temp");
	 Label r0 = new Label("R0");
	 Label r1 = new Label("R1");
	 Label r2 = new Label("R2");
	 Label ir = new Label("IR");
	 Label in = new Label("Insruction");
	 Label dec = new Label("Decoder and");
	 Label con = new Label("Control Logic");
	 Label a  = new Label("A",Label.CENTER);
	 Label b=new Label("B",Label.CENTER);
	
	 Choice mode,operation,reg1,reg2;
	 Button start;
	
	// InputFrame frame;
	 String m,o,op1,op2;
	 Label Header=new Label(" INSTRUCTIONS:-");
	 Label Mode=new Label("Mode :-");
	 Label Op=new Label(" Operation :-");
	 Label Reg1=new Label(" Reg 1 :-");
	 Label Reg2=new Label(" Reg 2 :-");
	
	 
	 Font f = new Font("Arial", Font.PLAIN, 18);
	 Font f1 = new Font("Arial", Font.PLAIN, 14);
	 Font f2 = new Font("Cambria", Font.PLAIN, 24);
	 Font f3 = new Font("Cambria", Font.PLAIN, 30);
	 Color button=new Color(40, 175, 46);
	 
	 public Labels()
	 {
		 Color back= new Color(240,240,240);
		 setBackground(back);
		 p.setFont(f);
		 setLayout(null);
		 p.setBounds(511,39,40,20);
		 add(p);
		 
		 mar.setFont(f);
		 mar.setBounds(510, 120, 50, 20);
		 add(mar);
		 
		 mdr.setFont(f);
		 mdr.setBounds(510, 200, 50, 20);
		 add(mdr);
		 
		 y.setFont(f);
		 y.setBounds(519, 279, 20, 20);
		 add(y);
		 
		 mux.setFont(f);
		 mux.setBounds(467, 360, 46, 20);
		 add(mux);
		 
		 a.setFont(f1);
		 a.setSize(10,15);
		 a.setBounds(462, 442, 20, 18);
		 add(a);
		 
		 b.setFont(f1);
		 b.setBounds(585, 442, 20, 18);
		 add(b);
		 
		 alu.setFont(f);
		 alu.setBounds(502, 490, 50, 20);
		 add(alu);
		 
		 z.setFont(f);
		 z.setBounds(535, 560, 20, 20);
		 add(z);
		 
		 temp.setFont(f);
		 temp.setBounds(759, 550, 50, 20);
		 add(temp);
		 
		 r2.setFont(f);
		 r2.setBounds(767, 470, 25, 20);
		 add(r2);
		 
		 r1.setFont(f);
		 r1.setBounds(767, 390, 25, 20);
		 add(r1);
		 
		 r0.setFont(f);
		 r0.setBounds(767, 310, 25, 20);
		 add(r0);
		 
		 ir.setFont(f);
		ir.setBounds(760, 230, 25, 20);
		 add(ir);
		 
		 in.setFont(f1);
		 in.setBounds(750, 30, 65, 20);
		 add(in);
		 
		 dec.setFont(f1);
		 dec.setBounds(740, 50, 85, 20);
		 add(dec);
		 
		 con.setFont(f1);
		 con.setBounds(740, 70, 85, 20);
		 add(con);
		 
		 Header.setFont(f3);
		 Header.setBounds(970, 125, 250, 40);
		 Header.setForeground(Color.CYAN);
		 add(Header);
		 Mode.setFont(f2);
		 Mode.setBounds(945, 200, 90, 40);
		// Mode.setForeground(Color.CYAN);
		 add(Mode);
		 Op.setFont(f2);
		 Op.setBounds(935, 260, 140, 40);
		 //Op.setForeground(Color.CYAN);
		 add(Op);
		 Reg1.setFont(f2);
		 Reg1.setBounds(935, 320, 100, 40);
		// Reg1.setForeground(Color.CYAN);
		 add(Reg1);
		 Reg2.setFont(f2);
		 Reg2.setBounds(935, 380, 100, 40);
		 //Reg2.setForeground(Color.CYAN);
		 add(Reg2);
		 mode=new Choice();
		 reg1=new Choice();
		 reg2=new Choice();
		 start=new Button("Start");
		 mode.add("a");
		 mode.add("b");
		 operation=new Choice();
		 operation.add("MOVE");
		 operation.add("ADD");
		 operation.add("SUB");
		 operation.add("MUL");
		 operation.add("DIV");
		 reg1.add("R0");
		 reg1.add("R1");
		 reg1.add("R2");
		 reg2.add("R0");
		 reg2.add("R1");
		 reg2.add("R2");
		 
		 mode.setFont(f);
		 operation.setFont(f);
		 reg1.setFont(f);
		 reg2.setFont(f);
		 start.setFont(f2);
		 mode.setBounds(1090,205,150,50);
		 operation.setBounds(1090,265,150,50);
		 start.setBounds(1090,440,120,50);
		 start.setBackground(button);
		 reg1.setBounds(1090,325,150,0);
		 reg2.setBounds(1090,385,150,20);
		 
		 add(mode);
		 add(operation);
		 add(start);
		 add(reg1);
		 add(reg2);
		 mode.addItemListener(this);
		 operation.addItemListener(this);
		 reg1.addItemListener(this);
		 //reg2.addItemListener(this);
		 start.addActionListener(this);
		 
		
		
	 }

	public void MSG(String msg,int a,int b, int c,int d,boolean n,Color e)
	{
		
		Label l=new Label(msg);
		l.setFont(f1);
		l.setBounds(a,b,c,d);
		l.setBackground(e);
		add(l);
		while(!n)
		{
			l.setVisible(false);
		}
				
				
		
		
	}
	
	

	
	public void actionPerformed(ActionEvent arg0) {
		String msg=operation.getSelectedItem();
		new PC(getGraphics(),"start",msg);
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
		
	}

}
