import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.awt.event.*;

class Demo extends JFrame implements  ActionListener
{
	private Container c;
	private JLabel title;
	private JLabel charac;
	private JLabel step;
	private JTextField cname;
	private JTextField number;
	private JButton gen;
	private JButton clr;
	private JTextArea total;
	
	public Demo()
	{
		setTitle("Pattern Generator");
      	setBounds(300, 90, 900, 600);
      	setDefaultCloseOperation(EXIT_ON_CLOSE);
      	setResizable(false);
		
		c=getContentPane();
		c.setLayout(null);

		title = new JLabel("Pattern Generator");
      	title.setFont(new Font("Arial", Font.PLAIN, 30));
      	title.setSize(300, 30);
      	title.setLocation(300, 30);
      	c.add(title);
		
		charac=new JLabel("Character");
		charac.setFont(new Font("Arial",Font.PLAIN,20));
		charac.setSize(100,20);
		charac.setLocation(100,100);
		c.add(charac);

		cname=new JTextField();
		cname.setFont(new Font("Arial",Font.PLAIN,15));
		cname.setSize(190,20);
		cname.setLocation(200,100);
		c.add(cname);
		
		step=new JLabel("Step");
		step.setFont(new Font("Arial",Font.PLAIN,20));
		step.setSize(270,20);
		step.setLocation(450,100);
		c.add(step);

		number=new JTextField();
		number.setFont(new Font("Arial",Font.PLAIN,15));
		number.setSize(190,20);
		number.setLocation(550,100);
		c.add(number);

		total = new JTextArea();
      	total.setFont(new Font("Arial", Font.PLAIN, 15));
      	total.setSize(550, 300);
      	total.setLocation(200, 175);
      	total.setLineWrap(true);
		total.setEditable(false);
      	c.add(total);

		gen = new JButton("Generate");
      	gen.setFont(new Font("Arial", Font.PLAIN, 15));
      	gen.setSize(100, 20);
      	gen.setLocation(200,500);
      	gen.addActionListener(this);
      	c.add(gen);

		clr = new JButton("Clear");
      	clr.setFont(new Font("Arial", Font.PLAIN, 15));
      	clr.setSize(100, 20);
      	clr.setLocation(400,500);
      	clr.addActionListener(this);
      	c.add(clr);

		
		
		
		setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==gen){	
			String cc=cname.getText();
			String temp=number.getText();
			int num=Integer.parseInt(temp);
			String[][] lol=new String[num][num];
			String mov="";
			for(int i=0;i<num;i++)
			{
				for(int j=0;j<=i;j++)
				{
					mov=mov+cc+" "; 
				}
				//total.setText(lol);
				//System.out.println();
				mov=mov+"\n";
			}
			total.setText(mov);
			JOptionPane.showMessageDialog(c,"Pattern Scuccessfully Generated");
		}else if(e.getSource()==clr)
		{
			String nulll="";
			cname.setText(nulll);
			number.setText(nulll);
			total.setText(nulll);
			JOptionPane.showMessageDialog(c,"Data Scuccessfully Cleared");
		}
	
		
		
	
	}
	
	
}
public class PatternGenerator{
	public static void main(String[] args)throws Exception
	{
		Demo d=new Demo();
	}
}