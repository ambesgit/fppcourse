package lessonsix;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProblemOne implements ActionListener{
JFrame frame; JButton submit; JLabel l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JPanel p1,p2,p3,p4,p5,p6,p7;

//main method
public static void main(String[] args){
	ProblemOne one=new ProblemOne();
}
//constructor
public ProblemOne(){	
	frame=new JFrame("Address Form");
	frame.setResizable(true);
	frame.setSize(500, 300);
	frame.setLocation(200,200);
	frame.setLayout(new FlowLayout());
	//panel creation
	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	p4=new JPanel();
	p5=new JPanel();
	p6=new JPanel();
	p1.setLayout(new BorderLayout());
	p2.setLayout(new BorderLayout());
	p3.setLayout(new BorderLayout());
	p4.setLayout(new BorderLayout());
	p5.setLayout(new BorderLayout());
	p6.setLayout(new BorderLayout());	
	
	//add panels to the frame
	frame.add(p1);frame.add(p2);frame.add(p3);frame.add(p4);frame.add(p5);frame.add(p6);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	l1=new JLabel("Name");
	t1=new JTextField("",20);	
	l2=new JLabel("Stree");
	t2=new JTextField(" ",20);	
	l3=new JLabel("City");
	t3=new JTextField(" ",20);	
	l4=new JLabel("State");	
	t4=new JTextField(" ",20);	
	l5=new JLabel("Zip");
	t5=new JTextField(" ",20);	
	submit=new JButton("Submit");
	p1.add(l1,"North");
	p1.add(t1,"South");
	p2.add(l2,"North");
	p2.add(t2,"South");
	p3.add(l3,"North");
	p3.add(t3,"South");
	p4.add(l4,"North");
	p4.add(t4,"South");
	p5.add(l5,"North");
	p5.add(t5,"South");
	p6.add(submit,"South");	
	submit.addActionListener(this);
	frame.setVisible(true);
			
}
@Override
public void actionPerformed(ActionEvent arg0) {
	System.out.println(t1.getText()+"\n"+t2.getText()+"\n"+t3.getText()+","+t4.getText()+" "+t5.getText());
	
}
}
