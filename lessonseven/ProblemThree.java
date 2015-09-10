package lessonseven;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
		setSize(600,300);
		setResizable(false);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		JPanel p1=new JPanel(new BorderLayout());		
		JPanel p2=new JPanel(new BorderLayout());
		JPanel p3=new JPanel(new BorderLayout());		
		JPanel p4=new JPanel(new BorderLayout());
		JPanel p5=new JPanel(new BorderLayout());		
		JPanel p6=new JPanel(new BorderLayout());
		JPanel p7=new JPanel(new BorderLayout());		
		JPanel p8=new JPanel(new BorderLayout());
		JPanel p9=new JPanel(new BorderLayout());		
		add(p1);add(p2);add(p3);add(p3);add(p4);add(p5);add(p6);add(p7);add(p8);add(p9);
		lm=new JLabel("Mile:");lp=new JLabel("Pound:");	lg=new JLabel("Gallon:");	lf=new JLabel("Fahrenheit:");
		lkm=new JLabel("Kilometer:");lkg=new JLabel("Kilogram:");ll=new JLabel("Liter:");lc=new JLabel("Centigrade:");
		
		tm=new JTextField(" ",20);tp=new JTextField(" ",20);tg=new JTextField(" ",20);tf=new JTextField(" ",20);
		tkm=new JTextField(" ",20);tkg=new JTextField(" ",20);tl=new JTextField(" ",20);tc=new JTextField(" ",20);
		convert=new JButton("Convert");
		
		//mile to killometer
		p1.add(lm,"West");p1.add(tm,"East");
		p2.add(lkm,"West");p2.add(tkm,"East");
		//pound to killogram
		p3.add(lp,"West");p3.add(tp,"East");
		p4.add(lkg,"West");p4.add(tkg,"East");
		//
		p5.add(lg,"West");p5.add(tg,"East");
		p8.add(lc,"West");p8.add(tc,"East");
		//
		p6.add(ll,"West");p6.add(tl,"East");
		p7.add(lf,"West");p7.add(tf,"East");		
		//submit button 
		p9.add(convert,"Center");		
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
