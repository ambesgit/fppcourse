package lessonsix;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class ExtraCredit extends JFrame{
	JTextField tfn,tln,tst,tci,tse,tco;
	JRadioButton rml,rfm;
	JTextArea tar;
	JCheckBox mrn, aft, eve;
	JLabel lfn,lln,lst,lgn,lci,lse,lco,lme,ldp,lss;
	JComboBox cmb;
	JButton sub;
	String[] combobox={"course 1","course 2","course 3","course 4","course 5"};
	ExtraCredit(){
		setTitle("the");
		setSize(1000,800);
		setResizable(true);
			 
		setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jpcontainer=new JPanel(new GridLayout(8,1));
		JPanel jpc=new JPanel(new GridLayout(6,5));
		JPanel jpr=new JPanel(new GridLayout(2,4));
		JPanel jpb=new JPanel(new FlowLayout());
		JPanel jpm=new JPanel(new FlowLayout());
		JPanel jps=new JPanel(new FlowLayout());
		JPanel jph=new JPanel(new FlowLayout());
	
		add(jpcontainer);
		
		
		jpcontainer.add(jph);
		jpcontainer.add(jpc);
		jpcontainer.add(jpr);
		jpcontainer.add(jpb);
		jpcontainer.add(jpm);
		jpcontainer.add(jps);
		
		ButtonGroup bg=new ButtonGroup();	
		lfn=new JLabel("FirstName");tfn=new JTextField("",20);
		lln=new JLabel("LastName");tln=new JTextField("",20);
		lst=new JLabel("Street");tst=new JTextField("",20);
		lci=new JLabel("City");tci=new JTextField("",20);
		lse=new JLabel("State");tse=new JTextField("",20);
		lco=new JLabel("Country");tco=new JTextField("",20);
		lgn=new JLabel("Gender");	
		lss=new JLabel("Suitable session");
		lme=new JLabel("message");
		rml=new JRadioButton("Male");
		rfm=new JRadioButton("Fmale");
		ldp=new JLabel("Select Course");		
		cmb=new JComboBox(combobox);
		mrn=new JCheckBox("Morning");
		aft=new JCheckBox("Afternoon");
		eve=new JCheckBox("Evening");
		ButtonGroup cg=new ButtonGroup();
		cg.add(mrn);cg.add(aft); cg.add(eve);
		tar=new JTextArea(5,30);
		sub=new JButton("submit");
		bg.add(rfm);bg.add(rml);
		
		jph.add(new JLabel("          Welcome to Maharishi University of Management   Online class registration form"));
		
		jpc.add(lfn);jpc.add(tfn);
		jpc.add(lln);jpc.add(tln);
		jpc.add(lst);jpc.add(tst);
		jpc.add(lci);jpc.add(tci);
		jpc.add(lse);jpc.add(tse);
		jpc.add(lco);jpc.add(tco);
		jpr.add(lgn);jpr.add(rml); jpr.add(rfm);jpr.add(new JLabel());
		jpr.add(lss);jpr.add(mrn); jpr.add(aft);jpr.add(eve);
		jpb.add(ldp); jpb.add(cmb);
		jpm.add(lme);jpm.add(tar);
		jps.add(sub);
		sub.addActionListener(ad ->{
		
			JOptionPane.showMessageDialog(null,checkFields());
		});
		
		
	}
	public static void main(String[] args){
		ExtraCredit ec=new ExtraCredit();
		ec.setVisible(true);
	}
	public String checkFields(){
		if(tfn.getText().length()<=0 ||tln.getText().length()<=0||
				tst.getText().length()<=0||tci.getText().length()<=0||
				tse.getText().length()<=0||tco.getText().length()<=0||
				tar.getText().length()<=0){
			return "All fields must be field";
			
		}
		if(rml.isSelected()==false && rfm.isSelected()==false){
			return "You have to select your gender";
		}
		if(cmb.getSelectedItem().toString()=="" ||cmb.getSelectedItem().toString().equals(null)){
			return "you need to choose your course";
		}
		if(mrn.isSelected()==false && aft.isSelected()==false&& eve.isSelected()==false){
			return "choose your suitable session";
		}
		return "Successfully Registered";
	}
}
