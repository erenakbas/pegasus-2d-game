package pegasus;

import java.awt.Dimension;
import java.awt.Graphics;




import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;















import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Karakter extends JPanel implements ActionListener,MouseListener,KeyListener {
	
	int arkaplan_x1,arkaplan_y1,arkaplan_gen1,arkaplan_yuk1;
	int arkaplan_x2,arkaplan_y2,arkaplan_gen2,arkaplan_yuk2;
	int arkaplan_x3,arkaplan_y3,arkaplan_gen3,arkaplan_yuk3;
	
	int player_x=50,player_y=280,player_gen=300,player_yuk=200;
	
	int bulut_x1,bulut_y1,bulut_gen1,bulut_yuk1;
	int bulut_x2,bulut_y2,bulut_gen2,bulut_yuk2;
	int bulut_x3,bulut_y3,bulut_gen3,bulut_yuk3;
	
	int engel_x1,engel_y1,engel_gen1,engel_yuk1;
	int engel_x2,engel_y2,engel_gen2,engel_yuk2;
	int engel_x3,engel_y3,engel_gen3,engel_yuk3;
	
	int z=0;
	
	Random r = new Random();
	Timer zaman=new Timer(25,this);
	Image arka_plan;
	Image arka_plan2;
	Image arka_plan3;
	Image bulut_1;
	Image bulut_2;
	Image bulut_3;
	Image at;
	Image engel_1;
	Image engel_2;
	Image engel_3;
	int sayac=1;
	int puan=1;
	
	
	
	
//	int artisMik=40;
	
	public Karakter(){
		
		
		super();
		
		
		addMouseListener(this);
		
		arkaplan_x1=0;
		arkaplan_y1=0;
		arkaplan_gen1=2048;
		arkaplan_yuk1=469;
		
		arkaplan_x2=arkaplan_x1+2048;
		arkaplan_y2=0;
		arkaplan_gen2=2048;
		arkaplan_yuk2=469;
		
		arkaplan_x3=arkaplan_x2+2048;
		arkaplan_y3=0;
		arkaplan_gen3=2048;
		arkaplan_yuk3=469;
		
		bulut_x1=1500;
		bulut_y1=50;
		bulut_gen1=100;
		bulut_yuk1=100;
		
		bulut_x2=bulut_x1+r.nextInt(1000)+100;
		bulut_y2=70;
		bulut_gen2=r.nextInt(100)+100;
		bulut_yuk2=r.nextInt(50)+100;
		
		bulut_x3=bulut_x2+r.nextInt(1000)+100;
		bulut_y3=80;
		bulut_gen3=r.nextInt(100)+100;
		bulut_yuk3=r.nextInt(50)+100;
		
		
	/*	try {
			asp=ImageIO.read(new FileInputStream("src/asp.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		*/
		arka_plan=Toolkit.getDefaultToolkit().getImage("src/aap.png");
		arka_plan2=Toolkit.getDefaultToolkit().getImage("src/aap2.png");
		arka_plan3=Toolkit.getDefaultToolkit().getImage("src/aap3.png");
		
		at=Toolkit.getDefaultToolkit().getImage("src/asp.gif");
		
		bulut_1=Toolkit.getDefaultToolkit().getImage("src/b1.png");
		bulut_2=Toolkit.getDefaultToolkit().getImage("src/b2.png");
		bulut_3=Toolkit.getDefaultToolkit().getImage("src/b3.png");
		engel_1=Toolkit.getDefaultToolkit().getImage("src/e1.png");
		engel_2=Toolkit.getDefaultToolkit().getImage("src/engel1.png");
		engel_3=Toolkit.getDefaultToolkit().getImage("src/engel3.png");
		
		 engel_x1=1350;
		
		 engel_x2= engel_x1+r.nextInt(800)+250;
		 engel_x3= engel_x2+r.nextInt(800)+250;	
		 engel_gen1=r.nextInt(100)+55;
		 engel_yuk1=r.nextInt(70)+55;
		 engel_y1=450- engel_yuk1;
		 engel_gen2=r.nextInt(100)+55;
		 engel_yuk2=r.nextInt(70)+55;
		 engel_y2=450- engel_yuk2;
		 engel_gen3=r.nextInt(100)+55;
		 engel_yuk3=r.nextInt(70)+55;
		 engel_y3=450- engel_yuk3;
		
		zaman.start();
		
		
		
	}

	
	public void paint(Graphics g)
	{
		
		super.paintComponent(g);
		
	
	
		  
		  
			
		/*	 g.drawRect(x, y, gen1, yuk1);
			 g.drawRect(x1, y2, gen2, yuk2);
			 g.drawRect(x2, y3, gen3, yuk3);  */
			
			// g.drawRect(player_x, player_y, player_gen, player_yuk);
		
	         g.drawImage(arka_plan, arkaplan_x1, arkaplan_y1, arkaplan_gen1, arkaplan_yuk1, null);
	         g.drawImage(arka_plan2, arkaplan_x2, arkaplan_y2, arkaplan_gen2, arkaplan_yuk2, null);
	         g.drawImage(arka_plan3, arkaplan_x3, arkaplan_y3, arkaplan_gen3, arkaplan_yuk3, null);
	         
			 g.drawImage(bulut_1, bulut_x1, bulut_y1,bulut_gen1,bulut_yuk1, null);
			 g.drawImage(bulut_2, bulut_x2, bulut_y2,bulut_gen2,bulut_yuk2, null);
			 g.drawImage(bulut_3, bulut_x3, bulut_y3,bulut_gen3,bulut_yuk3, null);
			
			 g.drawImage(engel_1, engel_x1, engel_y1, engel_gen1, engel_yuk1,null);
			 g.drawImage(engel_2, engel_x2, engel_y2, engel_gen2, engel_yuk2,null);
			 g.drawImage(engel_3, engel_x3, engel_y3,engel_gen3, engel_yuk3,null);
			 
	         g.drawImage(at, player_x, player_y, player_gen, player_yuk,null);
	       
	         
	         String yazi;
	        
	            
	             yazi=Integer.toString(puan);
	             
	             g.drawString("puan:"+yazi, 25, 25);
	             sayac++;
	             if(sayac % 10 == 0){
	            	 puan+=1;
	             }
	             
	     
			 
		// g.drawImage(zemin, player_x, player_y, zemin.getWidth(null), zemin.getHeight(null),null);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		
		Rectangle at =new Rectangle(player_x ,player_y,player_gen-70,player_yuk-50);
		Rectangle e1 =new Rectangle(engel_x1,engel_y1,engel_gen1,engel_yuk1);
		Rectangle e2 =new Rectangle(engel_x2,engel_y2,engel_gen2,engel_yuk2);
		Rectangle e3 =new Rectangle(engel_x3,engel_y3,engel_gen3,engel_yuk3);
		for(int i=0; i<=3; i++){
		if( at.intersects(e1) || at.intersects(e2) || at.intersects(e3)
			//	(player_y!=145 &&  player_x+300==x ) || (player_y!=145 && player_x+300==x1) ||(player_y!=145 && player_x+300==x2)
				){
		 
			zaman.stop();
			
			
			
					
		}
		
		else{
			
			
	
			arkaplan_x1-=2;
			arkaplan_x2-=2;
			arkaplan_x3-=2;
			bulut_x1-=1;
			bulut_x2-=1;
			bulut_x3-=1;
			engel_x1-=1;
			engel_x2-=1;
			engel_x3-=1;
			}
	
		
		//if(player_x!=500){
		//player_x+=1;
		//}
		//else{
		//player_x=500;
		//}
	
	
		
		}
		/*
		 * x,y,genislik,yukseklik
		 * 
		 * 
		 * */		
			
	
		//x-=4;
		//x1-=4;
		//x2-=4;
		if(z>0){z++;}
		
		if(z==25){
			
			
			player_y=280;
			player_x=290;
			z=0;
			
			

			
		}
		
		if(z==0){
			
			for(int j =0;j>100;j++){
			player_x-=1;
			}
			
		}
		if(engel_x3<0){
			engel_x1=1550;
			engel_x2=engel_x1+r.nextInt(1000)+100;
			engel_x3=engel_x2+r.nextInt(1000)+100;
			engel_gen1=r.nextInt(100)+55;
			engel_yuk1=r.nextInt(70)+55;
			engel_y1=450-engel_yuk1;
			engel_gen2=r.nextInt(100)+55;
			engel_yuk2=r.nextInt(70)+55;
			engel_y2=450-engel_yuk2;
			engel_gen3=r.nextInt(100)+55;
			engel_yuk3=r.nextInt(70)+55;
			engel_y3=450-engel_yuk3;
			
			
			
				
			
		
			}
		if(bulut_x3<0){
		bulut_x1=1500;
		bulut_y1=50+r.nextInt(50);
		bulut_gen1=100;
		bulut_yuk1=50;
		
		bulut_x2=bulut_x1+r.nextInt(1000)+300;
		bulut_y2=60+r.nextInt(50);
		bulut_gen2=r.nextInt(50)+100;
		bulut_yuk2=r.nextInt(20)+50;
		
		bulut_x3=bulut_x2+r.nextInt(1000)+300;
		bulut_y3=80+r.nextInt(50);
		bulut_gen3=r.nextInt(50)+100;
		bulut_yuk3=r.nextInt(20)+50;
		}
		
		
		for(int a=0;a<3;a++){
			
			if(arkaplan_x3<0){
			arkaplan_x1=0;
			arkaplan_x2=arkaplan_x1+2048;
			arkaplan_x3=arkaplan_x2+2048;
			
			
			
		
		
		}
			}
		
		repaint();
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		player_y=160;//(280-125)
	 	player_x=150;
		z=1;
		
		
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	//	y=360;
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//y=360;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		// TIKLANDIÐI SÜRE ÝÇÝNDE
	//	y=300;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// BIRAKILDIÐINDA
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player_y=160;
			z=1;
		}
		/*else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			
			player_y=player_y+30;
			player_yuk=100;
			z=1;
			
		}
		
		 if((e.getKeyCode() != KeyEvent.VK_DOWN)) {
			
			player_yuk=100;
			z=1;
			
		}*/
		
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
