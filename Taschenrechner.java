import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
public class Taschenrechner extends JFrame {
	
	public Taschenrechner(){
	super("Taschenrechner");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setResizable(false);
	JPanel p= new JPanel();
	JLabel l1= new JLabel("Zahl1: ");
	JLabel l2= new JLabel("Zahl2: ");
	JLabel erg= new JLabel("Ergebnis: ");
	JLabel value= new JLabel("                   ");
	JTextField t1= new JTextField(7);
	JTextField t2= new JTextField(7);
	JButton btn1= new JButton("+");
	JButton btn2= new JButton("-");
	JButton btn3= new JButton("*");
	JButton btn4= new JButton("/");
		
	p.add(l1);	
	p.add(t1);	
	p.add(l2);	
	p.add(t2);	
	p.add(btn1);	
	p.add(btn2);	
	p.add(btn3);	
	p.add(btn4);	
	p.add(erg);	
	p.add(value);	
	
	setLayout(new BorderLayout());
	add(p, BorderLayout.WEST);
	pack();
	setVisible(true);	

	btn1.addActionListener(new ActionListener(){
		@Override public void actionPerformed(ActionEvent ae){
		double e=0.0;
		try{	e= Double.parseDouble(t1.getText())+Double.parseDouble(t2.getText());}
			
		catch(NumberFormatException nfe){
				JFrame frame= new JFrame();
				JOptionPane.showMessageDialog(frame, "Eingabe überprüfen!");
			}
			value.setText(""+e);
			repaint();}
		});
		
	btn2.addActionListener(new ActionListener(){
		@Override public void actionPerformed(ActionEvent ae){
		double e=0.0;
		try{	e= Double.parseDouble(t1.getText())-Double.parseDouble(t2.getText());}
			
		catch(NumberFormatException nfe){
				JFrame frame= new JFrame();
				JOptionPane.showMessageDialog(frame, "Eingabe überprüfen!");
			}
			value.setText(""+e);
			repaint();}
		});
		
	btn3.addActionListener(new ActionListener(){
		@Override public void actionPerformed(ActionEvent ae){
		double e=0.0;
		try{	e= Double.parseDouble(t1.getText())*Double.parseDouble(t2.getText());}
			
		catch(NumberFormatException nfe){
				JFrame frame= new JFrame();
				JOptionPane.showMessageDialog(frame, "Eingabe überprüfen!");
			}
			value.setText(""+e);
			repaint();}
		});
		
	btn4.addActionListener(new ActionListener(){
		@Override public void actionPerformed(ActionEvent ae){
		double e=0.0;
		try{
			e= Double.parseDouble(t1.getText())/Double.parseDouble(t2.getText());}	
		catch(NumberFormatException nfe){
				JFrame frame= new JFrame();
				JOptionPane.showMessageDialog(frame, "Eingabe überprüfen!");
			}
			value.setText(""+e);
			repaint();}
		});
	}
	
 public static void main(String[] argv){
		SwingUtilities.invokeLater(Taschenrechner::new);
	}	
}
