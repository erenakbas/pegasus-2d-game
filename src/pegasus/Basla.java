package pegasus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Basla  extends JPanel implements MouseListener,KeyListener,ActionListener {
	Image arka_plan;
	Image at;
	
	int player_x=50,player_y=250,player_gen=280,player_yuk=200;
	int arkaplan_x1,arkaplan_y1,arkaplan_gen1,arkaplan_yuk1;
	Timer zaman = new Timer(1,this);
	int kos=0;
	int kos_basla=0;
	public Basla(){
		super();
		arkaplan_x1=0;
		arkaplan_y1=0;
		arkaplan_gen1=2048;
		arkaplan_yuk1=469;
		
		arka_plan=Toolkit.getDefaultToolkit().getImage("src/aapp.png");
		at=Toolkit.getDefaultToolkit().getImage("src/asp.gif");
		
		
		
		
		
		
		
		zaman.start();
	}
	public void paint(Graphics g)
	{
		
		
		super.paintComponent(g);
		

		
			g.drawImage(arka_plan, arkaplan_x1, arkaplan_y1, arkaplan_gen1, arkaplan_yuk1, null);
			g.drawImage(at,player_x, player_y, player_gen,player_yuk, null);
		
		
		
			g.setFont(new Font("Algerian", Font.PLAIN, 30));
			g.setColor(Color.WHITE);
	
			g.drawString("eren's home", 930, 80);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		
		
		
			
		if(kos_basla==1){
			kos=1;
			if(kos==1){
				player_x+=10;
				player_y-=1;
			}
			
			if(player_x==700){
				kos=0;
				
			
			
			if(kos==0){
				
				
				zaman.stop();
				}
			
		}
			if(!zaman.isRunning()){
				
				Main.basla.setVisible(false);
				
				Main.pencere.setVisible(false);
				Karakter k =new Karakter();
		
				Main.pencere.add(k);
				Main.pencere.setSize(2048, 480);
				Main.pencere.setResizable(false);
				Main.pencere.setVisible(true);
				Main.pencere.addKeyListener(k);
				Main.pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
			
		}
		
			
			
		
		
	
		
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			kos_basla=1;
			
	
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	

}