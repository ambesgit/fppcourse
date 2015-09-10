package lessonseven;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProblemThree extends JFrame{
	JButton convert;
	JLabel lm,lp,lg,lf,lkm,lkg,ll,lc;
	JTextField tm,tp,tg,tf,tkm,tkg,tl,tc;
	ProblemThree(){
		setTitle("Metric Conversion Assitant");
		setSize(700,300);
		setResizable(false);
		setLocation(100,100);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JPanel p1=new JPanel(new GridLayout(8,2));		
		JPanel p2=new JPanel(new GridLayout(8,2));
		JPanel p3=new JPanel(new BorderLayout());	
		add(p1);add(p2);add(p3);
		lm=new JLabel("Mile:");lp=new JLabel("Pound:");	lg=new JLabel("Gallon:");	lf=new JLabel("Fahrenheit:");
		lkm=new JLabel("Kilometer:");lkg=new JLabel("Kilogram:");ll=new JLabel("Liter:");lc=new JLabel("Centigrade:");
		
		tm=new JTextField(" ",20);tp=new JTextField(" ",20);tg=new JTextField(" ",20);tf=new JTextField(" ",20);
		tkm=new JTextField(" ",20);tkg=new JTextField(" ",20);tl=new JTextField(" ",20);tc=new JTextField(" ",20);
		convert=new JButton("Convert");	
		p1.add(lm);
		p1.add(tm);
		p1.add(lp);
		p1.add(tp);
		p1.add(lg);
		p1.add(tg);
		p1.add(lf);
		p1.add(tf);
		p2.add(lkm);		
		p2.add(tkm);		
		p2.add(lkg);
		p2.add(tkg);	
		p2.add(ll);
		p2.add(tl);
		p2.add(lc);
		p2.add(tc);		
		p3.add(convert);		
		setVisible(true);
		convert.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				tkm.setText(" ");
				tkg.setText(" ");
				tkg.setText(" ");
				tc.setText(" ");
				try{
				tkm.setText(" "+(Double.parseDouble(tm.getText())*1.609));
				}
				catch(Exception e){}
				try{
				tkg.setText(" "+(Double.parseDouble(tp.getText())*.45359));
				}
				catch(Exception e){}
				try{
				tl.setText(" "+(Double.parseDouble(tg.getText())*3.785));
				}
				catch(Exception e){}
				try{
				tc.setText(" "+((Double.parseDouble(tf.getText())-32)*5/9));
				}
				catch(Exception e){
					
				}
				
			}
			
		});
	}
}
