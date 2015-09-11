package lessonsix;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProblemThree extends JFrame implements ActionListener{
	
	JButton b1,b2,b3,b4,b5,b6,b7;
	//main method
	public static void main(String[] args){
		ProblemThree bs=new ProblemThree();
		
	}
	//constructor
	public ProblemThree(){
		setTitle("Rainbow Color Frame");
		setSize(800,150);
		setLocation(200,200);
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton();
		b1.setPreferredSize(new Dimension(100,100));
		b2=new JButton();
		b2.setPreferredSize(new Dimension(100,100));
		b3=new JButton();
		b3.setPreferredSize(new Dimension(100,100));
		b4=new JButton();
		b4.setPreferredSize(new Dimension(100,100));
		b5=new JButton();
		b5.setPreferredSize(new Dimension(100,100));
		b6=new JButton();
		b6.setPreferredSize(new Dimension(100,100));
		b7=new JButton();
		b7.setPreferredSize(new Dimension(100,100));
		b1.setBackground(new Color(127,10,255));
		b2.setBackground(new Color(75, 0, 130));
		b3.setBackground(new Color(0, 0, 255));
		b4.setBackground(new Color(0, 255, 0));
		b5.setBackground(new Color(255, 255, 0));
		b6.setBackground(new Color(255, 127, 0));
		b7.setBackground(new Color(255, 0, 0));	
		//add components to the frame
		add(b7);
		add(b6);
		add(b5);
		add(b4);
		add(b3);
		add(b2);
		add(b1);		
		setVisible(true);
		//make the buttons to respond to user actions
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
	// source of the meaning of the rainbow colors ---->https://www.facebook.com/notes/heart-communicators-formerly-known-as-whale-communicators/the-symbolic-meaning-of-the-rainbow/411098682241407
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(null, "the seventh state of consciousness\n consciousness of the divine, spiritual awareness, inner peace and wisdom");
		}
		else if(e.getSource()==b2){
			JOptionPane.showMessageDialog(null,  "the sixth state of consciousness\n intuition, unconditional love, compassion");
		}
		else if(e.getSource()==b3){
			JOptionPane.showMessageDialog(null,"the fifth state of consciousness\n ability to verbalize, communicate, express things intelligently");
		}
		else if(e.getSource()==b4){
			JOptionPane.showMessageDialog(null,"the fourth state of consciousness\n forgiveness, ability to release resentments");
		}
		else if(e.getSource()==b5){
			JOptionPane.showMessageDialog(null,"the third state of consciousness\n  the control over emotions and personal power");
		}
		else if(e.getSource()==b6){
			JOptionPane.showMessageDialog(null,"the second state of consciousness\n the control of the energetic field and creative power");
		}
		else if(e.getSource()==b7){
			JOptionPane.showMessageDialog(null,"the first state of consciousness\n the control of the physical body");
		}
		
	}

}
