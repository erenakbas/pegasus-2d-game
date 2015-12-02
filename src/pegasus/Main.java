package pegasus;

import javax.swing.JFrame;

public class Main {

	public static String[] arg;

	public static void main(String[] args) {
		
		
		//Karakter pencere = new Karakter();
		JFrame pencere=new JFrame("PEGASUS");
		Karakter k =new Karakter();
		pencere.add(k);
		
		pencere.setSize(2048, 480);
		pencere.setResizable(false);
		pencere.setVisible(true);
		pencere.addKeyListener(k);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		arg = args;
	}

}
