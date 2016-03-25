package pegasus;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Bonus extends JPanel implements KeyListener,ActionListener {
	
	int player_x=450,player_y=450,player_gen=280,player_yuk=200;
	int bitti=0;
	Image at;
	Image sv;
	Image ates;
	Image canavar1;
	Image canavar2;
	Image canavar3;
	Image ejderha1;
	Image ejderha2;
	int hasar=0;
	Image arka_plan;
	int arkaplan_x1,arkaplan_y1,arkaplan_gen1,arkaplan_yuk1;
	int sv_x=1140,sv_y=0,sv_gen=220,sv_yuk=180;
	int canavar_x1,canavar_y1,canavar_gen1,canavar_yuk1;
	int canavar_x2,canavar_y2,canavar_gen2,canavar_yuk2;
	int canavar_x3,canavar_y3,canavar_gen3,canavar_yuk3;
	int ejder_x1,ejder_y1,ejder_gen1,ejder_yuk1;
	int ejder_x2,ejder_y2,ejder_gen2,ejder_yuk2;
	int ates_x,ates_y,ates_gen,ates_yuk;
	int w=0;
	Timer zaman = new Timer(15,this);
	Random r = new Random();

	public Bonus(){
		super();
		arkaplan_x1=0;
		arkaplan_y1=0;
		arkaplan_gen1=2048;
		arkaplan_yuk1=1024;
		
		ates_x=-111100;
		ates_y=160;
		ates_gen=60;
		ates_yuk=60;
		
		 canavar_x1=-450;
		 canavar_y1=r.nextInt(250)+10;
		 canavar_gen1=280;
		 canavar_yuk1=200;
		 
		 
		 canavar_x2=canavar_x1-r.nextInt(500);
		 canavar_y2=r.nextInt(100)+250;
		 canavar_gen2=280;
		 canavar_yuk2=200;
		 
		 canavar_x3=canavar_x2-r.nextInt(500);
		 canavar_y3=r.nextInt(100)+500;
		 canavar_gen3=280;
		 canavar_yuk3=200;
		 
		 ejder_x1=sv_x-sv_gen;
		 ejder_y1=sv_y;
		 ejder_gen1=sv_gen;
		 ejder_yuk1=sv_yuk;
		 
		 ejder_x2=sv_x;
		 ejder_y2=sv_y+sv_gen-75;
		 ejder_gen2=sv_gen;
		 ejder_yuk2=sv_yuk;
		 
		
		zaman.start();
		at=Toolkit.getDefaultToolkit().getImage("src/asp3.gif");
		sv=Toolkit.getDefaultToolkit().getImage("src/sv1.png");
		canavar1=Toolkit.getDefaultToolkit().getImage("src/canavar.gif");
		canavar2=Toolkit.getDefaultToolkit().getImage("src/canavar.gif");
		canavar3=Toolkit.getDefaultToolkit().getImage("src/canavar.gif");
		ejderha1=Toolkit.getDefaultToolkit().getImage("src/ejderha.png");
		ejderha2=Toolkit.getDefaultToolkit().getImage("src/ejderha.png");
		ates=Toolkit.getDefaultToolkit().getImage("src/ates.png");
		arka_plan=Toolkit.getDefaultToolkit().getImage("src/aapp3.jpg");
	}
	
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		// g.drawImage(at,player_x, player_y, player_gen,player_yuk, null);
		 g.drawImage(arka_plan, arkaplan_x1, arkaplan_y1, arkaplan_gen1, arkaplan_yuk1, null);
		 g.drawImage(at,player_x, player_y, player_gen,player_yuk, null);
		 g.drawImage(sv, sv_x, sv_y, sv_gen,sv_yuk,null);
		 g.drawImage(canavar1, canavar_x1, canavar_y1, canavar_gen1,canavar_yuk1,null);
		 g.drawImage(canavar2, canavar_x2, canavar_y2, canavar_gen2,canavar_yuk2,null);
		 g.drawImage(canavar3, canavar_x3, canavar_y3, canavar_gen3,canavar_yuk3,null);
		 g.drawImage(ejderha1, ejder_x1, ejder_y1-25, ejder_gen1, ejder_yuk1, null);
		 g.drawImage(ejderha2, ejder_x2, ejder_y2-25, ejder_gen2, ejder_yuk2, null);
		 g.drawImage(ates, ates_x, ates_y, ates_gen, ates_yuk, null);
		

	        if(bitti==1){
	          

	        	
	        	
	        	g.setFont(new Font("Algerian", Font.PLAIN, 50));
	        	g.drawString("KAZANDINIZ", 150, 350);
	           
	        }
	        if(bitti==2){
	          

	        	
	        	
	        	g.setFont(new Font("Algerian", Font.PLAIN, 50));
	        	g.drawString("KAYBETTINIZ", 150, 350);
	           
	        }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Rectangle c1 = new Rectangle(canavar_x1+50,canavar_y1-50,canavar_gen1-90,canavar_yuk1-50);
		Rectangle c2= new Rectangle(canavar_x2+50,canavar_y2-50,canavar_gen2-90,canavar_yuk2-50);
		Rectangle c3 = new Rectangle(canavar_x3+50,canavar_y3-50,canavar_gen3-90,canavar_yuk3-50);
		Rectangle at = new Rectangle(player_x+25,player_y-20,player_gen-50,player_yuk-50);
		Rectangle sv = new Rectangle(sv_x+50,sv_y-50,sv_gen-50,sv_yuk-50);
		Rectangle ejder1 = new Rectangle(ejder_x1, ejder_y1, ejder_gen1, ejder_yuk1);
		Rectangle ejder2 = new Rectangle(ejder_x2, ejder_y2, ejder_gen2, ejder_yuk2);
		Rectangle ates = new Rectangle(ates_x,ates_y,ates_gen,ates_yuk-20);
		for (int i=0;i<=5;i++){
		if(c1.intersects(at)||c2.intersects(at)||c3.intersects(at)||ejder1.intersects(at)||ejder2.intersects(at)){
			zaman.stop();
			
			bitti=2;
			
			
		}
		else{
			
			canavar_x1+=1;
			canavar_x2+=1;
			canavar_x3+=1;
			
			if(ates_x>0){
				ates_x+=5;
				}
			
		}
		}
		
		if(at.intersects(sv)){
			
			bitti=1;
			zaman.stop();
			
			
			
		}
	
		if(ejder1.intersects(ates)){
			ejder_x1=2000;
			
			
			
		}
		
		if(  ejder2.intersects(ates)) {ejder_x2=2000;}
	
		if(canavar_x3>1200){
			
			 canavar_x1=-450;
			 canavar_y1=r.nextInt(300)+10;
			 canavar_gen1=280;
			 canavar_yuk1=200;
			 
			 
			 canavar_x2=canavar_x1-r.nextInt(500);
			 canavar_y2=r.nextInt(300)+300;
			 canavar_gen2=280;
			 canavar_yuk2=200;
			 
			 canavar_x3=canavar_x2-r.nextInt(500);
			 canavar_y3=r.nextInt(300)+600;
			 canavar_gen3=280;
			 canavar_yuk3=200;
			
		}
		
		if(w>0){w++;}
		
		if(w==28){
			
			
			ates_x=-111100;
			w=0;
			
			
			
		}
		
		repaint();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	
		if(e.getKeyCode() == KeyEvent.VK_UP){
			
			player_y-=20;
			if(player_y<0){
				player_y=1000;
			}
			
			
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN){
			
			player_y+=20;
			if(player_y>600){
				player_y=0;
			}
			
			
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	
			player_x+=20;
			if(player_x>1200){
				player_x=0;
			}
			
	
}
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
	
			player_x-=20;
			if(player_x<0){
				player_x=1200;
			}
			
	
}
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			Main.bonus.setVisible(false);
			Main.pencere.setVisible(true);
		}
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE)
		{

			
	

		if(ates_x<0)
		{
			ates_x=player_x+player_gen;
			ates_y=player_y;
			
			try {
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/ases.wav").getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }
			w=1;
		}
	
		
		
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
