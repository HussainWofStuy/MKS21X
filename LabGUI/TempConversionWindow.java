import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    public static double CtoF(double n){
	return (9.0/5.0)*n+32.0;
    }
    public static double FtoC(double n){
	return (5.0/9.0)*(n-32.0);
    }
    
    private Container pane;
    private JTextField t;
    private JTextField t1;
    
    public TempConversionWindow(){
	this.setTitle("Temperature Convertor");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
	
	t = new JTextField(5);
	t1 = new JTextField(5);
	
	JButton b = new JButton("CtoF");
	b.addActionListener(this);
	b.setActionCommand("CtoF");
	
	JButton b1 = new JButton("FtoC");
	b1.addActionListener(this);
	b1.setActionCommand("FtoC");
    	
	pane.add(t);
	pane.add(b);
	pane.add(b1);
	pane.add(t1);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CtoF")){
	    t1.setText(Double.toString(CtoF(Double.parseDouble(t.getText()))));
	}
	if(event.equals("FtoC")){
	    t1.setText(Double.toString(FtoC(Double.parseDouble(t.getText()))));
	}
    }
}
