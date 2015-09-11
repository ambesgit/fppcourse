package lessonsix;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProblemTwo extends JFrame implements ActionListener{
	JButton cl,rl,rd;
	JLabel li,lo;
	JTextField ti,to;
	
	//main method
public static void main(String[] args) {
		ProblemTwo ob=new ProblemTwo();

	}
	//constructor
public ProblemTwo(){
	setLocation(200,200);
	setTitle("String Utility");
	setResizable(false);
	setSize(500,200);
	setLayout(new FlowLayout());
	JPanel p1=new JPanel(new GridLayout(6,4,1,1));
	JPanel p2=new JPanel(new GridLayout(8,4,1,1));
	cl=new JButton("Count Letters" );	
	rl=new JButton("Reverse Letters");
	rd=new JButton("Remove Duplicate");
	ti=new JTextField("",20);
	to=new JTextField("",20);
	li=new JLabel("Input");
	lo=new JLabel("Output");
	add(p1,"East");add(p2,"West");
	p2.add(li);
	p2.add(ti);
	p2.add(lo);
	p2.add(to);
	p1.add(cl);
	p1.add(rl);
	p1.add(rd);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	cl.addActionListener(this);
	rl.addActionListener(this);
	rd.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==cl){
		try{
			to.setText(" ");
			to.setText(" "+ti.getText().length());					
			
		}
		catch(Exception ec){
			
		}
	}
	else if(e.getSource()==rl){
		to.setText(" "+reverse(ti.getText(),ti.getText().length()-1));
		try{
			to.setText("");
			to.setText(" "+reverse(ti.getText(),ti.getText().length()-1));
		}
		catch(Exception ec){
			
		}
	}
	else if(e.getSource()==rd){
		to.setText(" "+removeDuplicate(ti.getText()));
		try{
			to.setText("");
			to.setText(" "+removeDuplicate(ti.getText()));
		}
		catch(Exception ec){
			
		}
		
	}
	}

private String reverse(String st,int m){
		if(m==0){
			return ""+st.charAt(0);
		}
		return st.charAt(m)+reverse(st,m-1);
	}
private String removeDuplicate(String st){
	String s="";
	int flag=0;
	if(st!=null&& st!=" "){
		s+=st.charAt(0);
	for(int i=1; i<st.length();i++){		
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)==st.charAt(i)){
				flag=1;
			}
		}
		if(flag!=1){
			s+=st.charAt(i);
			
		}
		else{
			flag=0;
		}
	}
	}
	System.out.println(s);
	return s;
}



}


