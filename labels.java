package Proj;

import java.awt.*;
import java.applet.*;
public class labels extends SBA1{
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
	 Font f = new Font("Arial", Font.PLAIN, 18);
	 Font f1 = new Font("Arial", Font.PLAIN, 14);
	 
	 public labels()
	 {
		 Color back= new Color(240,240,240);
		 setBackground(back);
		 p.setFont(f);
		 setLayout(null);
		 p.setBounds(511,63,40,25);
		 add(p);
		 
		 mar.setFont(f);
		 mar.setBounds(510, 143, 50, 25);
		 add(mar);
		 
		 mdr.setFont(f);
		 mdr.setBounds(510, 223, 50, 25);
		 add(mdr);
		 
		 y.setFont(f);
		 y.setBounds(519, 303, 50, 25);
		 add(y);
		 
		 mux.setFont(f);
		 mux.setBounds(467, 383, 50, 25);
		 add(mux);
		 
		 a.setFont(f1);
		 a.setSize(10,15);
		 a.setBounds(462, 461, 50, 25);
		 add(a);
		 
		 b.setFont(f1);
		 b.setBounds(546, 461, 50, 25);
		 add(b);
		 
		 alu.setFont(f);
		 alu.setBounds(510, 488, 50, 25);
		 add(alu);
		 
		 z.setFont(f);
		 z.setBounds(519, 584, 50, 25);
		 add(z);
		 
		 temp.setFont(f);
		 temp.setBounds(759, 573, 50, 25);
		 add(temp);
		 
		 r2.setFont(f);
		 r2.setBounds(767, 493, 50, 25);
		 add(r2);
		 
		 r1.setFont(f);
		 r1.setBounds(767, 413, 50, 25);
		 add(r1);
		 
		 r0.setFont(f);
		 r0.setBounds(767, 333, 50, 25);
		 add(r0);
		 
		 ir.setFont(f);
		ir.setBounds(767, 253, 50, 25);
		 add(ir);
		 
		 in.setFont(f1);
		 in.setBounds(750, 100, 65, 20);
		 add(in);
		 
		 dec.setFont(f1);
		 dec.setBounds(740, 120, 85, 20);
		 add(dec);
		 
		 con.setFont(f1);
		 con.setBounds(740, 140, 85, 20);
		 add(con);
		 
		// callComp();
	 }
	 
	
	

}
