package pegasus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main extends JFrame implements ActionListener{
public static	JFrame pencere=new JFrame("PEGASUS");
public static	JFrame basla=new JFrame("PEGASUS");
public static	JFrame bonus=new JFrame("PEGASUS");
	
	
	
	public Main(){
		
		
		
	}



	public static void main(String[] args) {
		
		
		
		
		Basla b =new Basla();
		
		
		
		
		basla.add(b);
		basla.setSize(1800, 480);
		basla.setResizable(false);
		basla.setVisible(true);
		basla.addKeyListener(b);
		basla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
		
	
	}

}
